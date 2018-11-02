//$(function(){

	var toastHtml = '';
	toastHtml += '<div id="toast" style="display:none;">';
	toastHtml += '	<div class="weui-mask_transparent"></div>';
	toastHtml += '	<div class="weui-toast">';
	toastHtml += '		<i class="weui-icon-success-no-circle weui-icon_toast"></i>';
	toastHtml += '		<p class="weui-toast__content">已完成</p>';
	toastHtml += '	</div>';
	toastHtml += '</div>';

	toastHtml += '<div id="loadingToast" style="display:none;">';
	toastHtml += '	<div class="weui-mask_transparent"></div>';
	toastHtml += '	<div class="weui-toast">';
	toastHtml += '		<i class="weui-loading weui-icon_toast"></i>';
	toastHtml += '		<p class="weui-toast__content">数据加载中</p>';
	toastHtml += '	</div>';
	toastHtml += '</div>';
	$('body').append( toastHtml );

	var $loadingToast = $('#loadingToast'),$toast = $('#toast');

	function showToast(){
		if ($toast.css('display') != 'none') return;

		$toast.fadeIn(100);
		setTimeout(function () {
			$toast.fadeOut(100);
		}, 2000);
	}
	function showLoading(){
		if ($loadingToast.css('display') != 'none') return;

		$loadingToast.fadeIn(100);
	};
	function hideLoading(){
		if ($loadingToast.css('display') == 'none') return;
		setTimeout(function () {
			$loadingToast.fadeOut(100);
		}, 300);
	};

	var ajaxUrl, data;

$(function(){
	$('#submitBtn').click(function(){
		var $form = $(this).closest('form');
		ajaxUrl = $form.attr('action');
		data = $form.serialize();
		postDataFun( ajaxUrl,data );
		showLoading();
	})
})
	function postDataFun( ajaxUrl,data ){
		var type = ajaxUrl.split('/')[2];
		$.ajax({
			url: ajaxUrl,
			type: 'post',
			data: data,
			dataType: 'json',
			success: function(json){
				if( json.success ){
					if( type == 'base' || type == 'phy' ){
						hideLoading();
						showToast();
						return false;
					}else{
						window.location.href = '/cfd/static/report_result.html?type=' + type;
						//showResult();
					}
				}else{
					alert( json.message );
				}
			}
		})
	}

	//var title = ['','','','','','','GAD-7焦虑症筛查量表','AD8认知障碍自评表','PHQ-9抑郁症筛查量表',]
	showResult();
	function showResult( isResult,type ){
		isResult = typeof isResult == 'undefined' ? false : true; 

		if( !isResult ){
			return false;
		}

		var type = getQueryString("type") || type;
		var getUrl = '/cfd/'+ type +'/get';
		$.ajax({
			url: getUrl,
			type: 'post',
			data: data,
			dataType: 'json',
			success: function(json){
				if( json.success ){
					//hideLoading();
					//$('.page').hide();
					//$('body').append( reportHtml );
					//window.scrollTo(0,0);
					if( isResult && typeof json.data.resultMsg != 'undefined' ){	//结果页
						$('#resultTitle').html( json.data.resultTitle )
						var resultMsg = json.data.resultMsg.replace('/\n','</br>');
						console.log( resultMsg );
						$('#resultCont').html( resultMsg )
					}else{
						setDataHandle( json.data );
					}
				}else{
					alert( json.message );
				}
			}
		})
	}

	function setDataHandle( data ){
		var $form = $('form');

		//data = {"measuringFrequency":5,"bloodSugar1":1,}

		$.each(data,function(key,val){
			var $curInput = $form.find('[name='+ key +']');
			var inputType = $curInput.attr('type');

			if( inputType == 'text' || inputType == 'number' ){
				$curInput.val( val );
			}else if( inputType == 'radio' ){
				$form.find('[name='+ key +'][value='+ val +']').prop('checked','checked');
			}else if( inputType == 'checkbox' ){
				for (var i = 0; i < val.length; i++) {
					$form.find('[name='+ key +'][value='+ val[i] +']').prop('checked','checked');
				}
			}
		})
		
	}

	/* 获取url里的参数 */
	function getQueryString( name ){
		var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
		var r = window.location.search.substr(1).match(reg);
		if(r!=null) return unescape(r[2]); return null;
	}
//})

$(function(){

	
	$('#yaowu input[type=checkbox],#hasSick input[type=checkbox]').click(function(){
		var $self = $(this),$curItem = $self.closest('.weui-cell'),$curItemInput = $curItem.next();
		if( $self.is(':checked') ){
			$curItemInput.css('display','flex');
		}else{
			$curItemInput.hide();
			$curItemInput.find('input[type=text]').val('');
		}
	})

})

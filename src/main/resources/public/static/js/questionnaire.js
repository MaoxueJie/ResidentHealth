$(function(){
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
	$('#submitBtn').click(function(){
		var $form = $(this).closest('form');
		ajaxUrl = $form.attr('action');
		data = $form.serialize();
		postDataFun( ajaxUrl,data );
		showLoading();
	})
	function postDataFun( ajaxUrl,data ){
		$.ajax({
			url: ajaxUrl,
			type: 'post',
			data: data,
			dataType: 'json',
			success: function(json){
				if( json.success ){
					if( ajaxUrl.indexOf('psy') == -1 ){
						hideLoading();
						showToast();
					}else{
						showResult();
					}
				}else{
					alert('提交失败了 T_T');
				}
			}
		})
	}

	var title = ['','','','','','','GAD-7焦虑症筛查量表','AD8认知障碍自评表','PHQ-9抑郁症筛查量表',]

	function showResult(){
		var n = ajaxUrl.replace(/[^0-9]/ig,"") - 1;
		var reportHtml = '';
		reportHtml += '<div class="evaluation_result">';
		reportHtml += '	<div class="result_banner">'+ title[n] +'</div>';
		reportHtml += '	<article class="weui-article">';
		reportHtml += '		<h1>测评结果：18分</h1>';
		reportHtml += '		<section>';
		reportHtml += '			<p>离开的身份极乐世界法律是法律上看对方拉开距离电视剧分类肯定是减肥圆顶加进塑料袋附近了间谍欧伟伦伸了加压接我诶我就佛教的快乐来了为的是方式的非官方过热而防冻防守对方。</p>';
		reportHtml += '			<p>离开的身份极乐世界法律是法律上看对方拉开距离电视剧分类肯定是减肥圆顶加进塑料袋附近了间谍欧伟伦伸了加压接我诶我就佛教的快乐来了为的是方式的非官方过热而防冻防守对方。</p>';
		reportHtml += '			<p>离开的身份极乐世界法律是法律上看对方拉开距离电视剧分类肯定是减肥圆顶加进塑料袋附近了间谍欧伟伦伸了加压接我诶我就佛教的快乐来了为的是方式的非官方过热而防冻防守对方。</p>';
		reportHtml += '		</section>';
		reportHtml += '	</article>';
		reportHtml += '	<div class="align_center">';
		reportHtml += '		<a class="weui-btn btn-primary" href="javascript:;">保存结果</a>';
		reportHtml += '	</div>';
		reportHtml += '</div>';

		var getUrl = ajaxUrl.replace('add','get');
		$.ajax({
			url: ajaxUrl,
			type: 'post',
			data: data,
			dataType: 'json',
			success: function(json){
				if( json.success ){
					hideLoading();
					$('.page').hide();
					$('body').append( reportHtml );
					window.scrollTo(0,0);
				}else{
					alert( json.message );
				}
			}
		})
	}
})



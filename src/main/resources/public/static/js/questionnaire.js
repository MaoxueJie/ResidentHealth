
$(function(){
	var ajaxUrl, data;
	$('#submitBtn').click(function(){
		var $form = $(this).closest('form');
		ajaxUrl = $form.attr('action');
		data = $form.serialize();
		postDataFun( ajaxUrl,data );
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
						alert('提交成功~');
					}else{
						showResult();
					}
				}else{
					alert('提交失败了 T_T');
				}
			}
		})
	}

	var reportHtml = '';
	reportHtml += '<div class="evaluation_result">';
	reportHtml += '	<div class="result_banner">';
	reportHtml += '		认知障碍测评';
	reportHtml += '	</div>';
	reportHtml += '	<article class="weui-article">';
	reportHtml += '		<h1>测评结果：山东龙口就是</h1>';
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

	function showResult(){
		var getUrl = ajaxUrl.replace('add','get');
		$.ajax({
			url: ajaxUrl,
			type: 'post',
			data: data,
			dataType: 'json',
			success: function(json){
				if( json.success ){
					$('.page').hide();
					$('body').append( reportHtml );
				}else{
					alert('获取数据失败！');
				}
			}
		})
	}
})



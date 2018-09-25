
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
				if( json.code == 0 ){
					alert('提交成功~');
				}else{
					alert('提交失败了 T_T');
				}
			}
		})
	}
})



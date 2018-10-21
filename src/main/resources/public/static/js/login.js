
var CFD = CFD || {};
$(document).ready(function(){
	CFD.login = {
		pass:{tel:false,pwd:false},
		init: function(){
			this.bindEvent();
		},
		bindEvent: function(){
			var that = this;
			//校验注册登录
			$('#mobile').blur(function(event) {
				that.checkTel(null,$(this));
			});
			$('.btn_vcode').click(function(){
				if( $(this).hasClass('enable') ){
					var telInput = $(this).closest('.row').prev().find('[name="mobile"]')
					that.checkTel(that.getVcode,telInput);
				}
			})
			$('#loginBtn').click(function(event) {
				if( $('#mobile').val() == '' ){
					$('#mobile').focus();
					return false;
				}else{
					that.checkTel( null,$('#mobile') );
					if( !that.pass.tel ){
						return false;
					}
				}
				that.login();
			});
		},
		getVcode: function(vcodeBtn){
			var that = this,tel = $.trim( vcodeBtn.closest('.panel_content').find('[name="mobile"]').val() );
			$.ajax({
				url: '/cfd/send',
				type: 'post',
				data: {'mobile':tel},
				dataType: 'json',
				success: function(json){
					var data = json.data;
					if( json.success ){
						vcodeBtn.attr("disabled", true);
						var i = 60;
						vcodeBtn.val(i + ' s');
						var timer = setInterval(function () {
							i--;
							vcodeBtn.val(i + ' s');
							if (i <= 0) {
								clearInterval(timer);
								vcodeBtn.attr("disabled", false).val('获取验证码');
							}
						}, 1000);
					/*}else if( json.code == 1010 ){
						CFD.login.showError(vcodeBtn.prev(),json.msg);*/
					}else{
						var vcodeInput = vcodeBtn.prev();
						CFD.login.showError(vcodeInput,'验证码发送失败,请稍后重试');
					}
				}
			})
		},
		checkTel: function(callback,tel){
			var that = this, reg = /^1\d{10}$/;
			$('.btn_vcode').removeClass('enable');
			if( $.trim( tel.val() ) == '' ){
				that.showError(tel,'请填写手机号码');
				return false;
			}
			if( !reg.test(tel.val()) ){
				that.showError(tel,'手机号码格式不正确');
				return false;
			}
			if( typeof callback == 'function' ){
				callback( tel.closest('.panel_content').find('.btn_vcode') );
			}
			$('.btn_vcode').addClass('enable');
		},
		login: function(){
			var that = this,tel = $.trim( $('#mobile').val() ),vcode = $('#vcode').val();
			$.ajax({
				url: '/cfd/login',
				type: 'post',
				data: {'mobile':tel,'verificationCode':vcode},
				dataType: 'json',
				success: function(json){
					if( json.success ){
						window.location.href = '/cfd/static/' + that.getQueryString('state') + '.html';
					}else{
						that.showError( '',json.msg );
					}
				}
			})
		},
		showError: function( obj,msg ){
			if( obj != '' ){
				obj.addClass('error');
				obj.closest('.row').removeClass('pass');
			}
			$('.errortip').text(msg)
		},
		getQueryString: function( name ){	/* 获取url里的参数 */
			var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
			var r = window.location.search.substr(1).match(reg);
			if(r!=null) return unescape(r[2]); return null;
		}
	}
	CFD.login.init();
})
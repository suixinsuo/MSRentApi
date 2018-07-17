package com.dpp.rent.app.api.service.user;

import java.util.List;

import com.dpp.rent.app.api.domain.User;
import com.dpp.rent.app.api.model.request.LoginForm;
import com.dpp.rent.app.api.model.request.QuickLoginForm;
import com.dpp.rent.app.api.model.request.RegisterForm;
import com.dpp.rent.app.api.model.response.LoginResponse;

/**
 * className:UserService.java
 * description: 用户业务处理接口
 * date: 2018年6月23日
 * author:jpg
 */
public interface UserService {
	
	/**
	 * description: 常规登录方式，用户+密码
	 * retrun_type:void
	 * date: 2018年6月23日
	 * author:jpg
	 */
	LoginResponse userLogin(LoginForm loginForm);
	
	/**
	 * description: 快捷登录，手机号+验证码
	 * retrun_type:LoginResponse
	 * date: 2018年6月24日
	 * author:jpg
	 */
	LoginResponse quickLogin(QuickLoginForm quickLoginForm);

	/**
	 * description: 用户注册
//	 * retrun_type:void
	 * date: 2018年6月24日
	 * author:jpg
	 */
	void register(RegisterForm registerForm);
	
	/**
	 * description: 发送短信，包含注册，登录，修改密码
	 * retrun_type:void
	 * date: 2018年6月24日
	 * author:jpg
	 */
	void sendUserSmsCode(String id, String sendType);
	
	/**
	 * description: 修改密码
	 * retrun_type:void
	 * date: 2018年6月30日
	 * author:jpg
	 */
	void modifyUserPwd(RegisterForm registerForm);
	
}

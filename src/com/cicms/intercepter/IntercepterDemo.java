package com.cicms.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/*
 * 2019年9月24日 @CH
 */
public class IntercepterDemo implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception {
		// url : http://localhost:8080/SSM_Study03/blogList.form
		// uri : /blogList.form
		String requestURI = req.getRequestURI();
		if (!requestURI.contains("/login.action")) {
			String name = (String) req.getSession().getAttribute("USER_NAME");
			if (null == name) {
				res.sendRedirect(req.getContextPath() + "/login.action");
				return false;
			}
		}
		return true;
	}

}

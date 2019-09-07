package com.ldcc.jungonara.common.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/*
 * Logger 인터셉터 클래스 
 */
public class LoggerInterceptor extends HandlerInterceptorAdapter {
	
	/*
	 * Log4j 객체 생
	 */
	private Log log =  LogFactory.getLog(LoggerInterceptor.class);
	
	
	/*
	 * 컨트롤러 호출 전 실행되는 전처리기
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if (log.isDebugEnabled())
		{
			log.debug("============================ START ============================");
		}
		
		return super.preHandle(request, response, handler);
	}
	
	/*
	 * 컨트롤러 호출 후 실행되는 후처리
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		if (log.isDebugEnabled())
		{
			log.debug("============================ END ============================");
		}
		
		super.postHandle(request, response, handler, modelAndView);
	}

}

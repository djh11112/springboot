package com.djh.test.peizhi;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
 
@Component
@WebFilter(urlPatterns = "/djh", filterName = "djh")
public class TestFilter implements Filter {
	private String errorPage;//跳转的错误信息页面
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("过滤器初始化");
	}
 
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println(((HttpServletRequest) servletRequest).getRequestURI());
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		HttpServletRequest request = (HttpServletRequest)servletRequest ;
		if(!"/login".equals(((HttpServletRequest) servletRequest).getRequestURI())){
			try {
				request.getRequestDispatcher("/error111").forward(request, response);
				return;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		filterChain.doFilter(servletRequest, servletResponse);
	}
 
	@Override
	public void destroy() {
		System.out.println("过滤器销毁了");
	}

}
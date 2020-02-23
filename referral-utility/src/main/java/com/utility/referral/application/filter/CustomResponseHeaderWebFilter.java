package com.utility.referral.application.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;


@WebFilter("/*")
@Component
public class CustomResponseHeaderWebFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse httpServletResponse = (HttpServletResponse)response;
		httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,PATCH, PUT, DELETE, OPTIONS");
		httpServletResponse.setHeader("Access-Control-Allow-Headers", "Origin,Content-Type,X-Auth-Token");
		chain.doFilter(request, response);

	}

}

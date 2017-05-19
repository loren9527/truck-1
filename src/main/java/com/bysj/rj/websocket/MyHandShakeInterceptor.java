package com.bysj.rj.websocket;

import org.apache.log4j.Logger;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;

/**
 *@function：实现获取上传的参数，然后设置到socke 的session中
 *@parameter:
 *@return：
 *@date：2016-9-10 上午11:15:03
 *@author:Administrator
 *@notice:
 */
public class MyHandShakeInterceptor extends HttpSessionHandshakeInterceptor {
	
	
	protected static final Logger LOG = Logger.getLogger(MyHandShakeInterceptor.class);
	@Override
	public boolean beforeHandshake(ServerHttpRequest request,
								   ServerHttpResponse response, WebSocketHandler wsHandler,
								   Map<String, Object> attributes) throws Exception {
		System.out.println("Before Handshake");
		return super.beforeHandshake(request, response, wsHandler, attributes);
	}

	@Override
	public void afterHandshake(ServerHttpRequest request,
							   ServerHttpResponse response, WebSocketHandler wsHandler,
							   Exception ex) {
		System.out.println("After Handshake");
		super.afterHandshake(request, response, wsHandler, ex);
	}


}

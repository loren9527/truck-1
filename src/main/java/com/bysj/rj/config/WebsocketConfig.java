package com.bysj.rj.config;

import com.bysj.rj.websocket.MyHandShakeInterceptor;
import com.bysj.rj.websocket.WebsocketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * WebScoket配置处理器
 * @author he
 * @Date 2016年03月15日 下午1:15:09
 */

@Configuration
@EnableWebSocket
public class WebsocketConfig implements WebSocketConfigurer {

	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(myHandler(), "/websocket/chat").addInterceptors(new MyHandShakeInterceptor());
	}
	@Bean
    public WebsocketHandler myHandler() {
        return new WebsocketHandler();
    }

}

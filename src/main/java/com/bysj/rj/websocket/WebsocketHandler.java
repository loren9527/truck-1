package com.bysj.rj.websocket;

import com.alibaba.fastjson.JSON;
import com.bysj.rj.entity.Message;
import com.sun.javafx.collections.MappingChange;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @function：socket处理器
 * @date：2016-9-27 上午09:48:31
 * @author:He.
 * @notice：
 */
public class WebsocketHandler extends TextWebSocketHandler{

    private List<WebSocketSession> socketSessionlist=new ArrayList<WebSocketSession>();

    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        TextMessage returnMessage = new TextMessage(message.getPayload()+" received at server");
        session.sendMessage(returnMessage);
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        socketSessionlist.add(session);
    }

    public void sendMessages(String msg ){
        TextMessage returnMessage = new TextMessage(msg);
        for (WebSocketSession session : socketSessionlist){
            try {
               // session.setTextMessageSizeLimit(130);
                if(session.isOpen()){
                    session.sendMessage(returnMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}

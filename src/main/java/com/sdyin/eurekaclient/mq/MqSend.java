package com.sdyin.eurekaclient.mq;


import com.sdyin.eurekaclient.constant.MqConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 发送mq
 */
@Component
@Slf4j
public class MqSend {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public String send(){
        String context = "简单消息发送";
        log.info("简单消息发送时间："+new Date());
        amqpTemplate.convertAndSend(MqConstant.QUEUE_NAME, context);

        return "发送成功";
    }

}

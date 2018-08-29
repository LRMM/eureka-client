package com.sdyin.eurekaclient.mq;


import com.sdyin.eurekaclient.constant.MqConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class MqReceive {

    @RabbitListener(queues = MqConstant.QUEUE_NAME)
    public void rec(String s){

        System.out.println("接收消息:"+s);
        System.out.println("时间:"+ new Date());
    }
}

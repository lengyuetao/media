package com.tao.utils.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;


/**
 * Created by zhangantao on 2017/5/8.
 */
public class RedisMessageListener implements MessageListener {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;


    public void onMessage(Message message, byte[] pattern) {
        RedisSerializer<?> serializer=redisTemplate.getValueSerializer();
        Object channel=serializer.deserialize(message.getBody());
        Object body=serializer.deserialize(message.getBody());

        System.out.println("主题："+channel);
        System.out.println("消息内容："+String.valueOf(body));
    }

    public RedisTemplate<String,Object> getRedisTemplate(){
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


}

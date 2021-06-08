/*
package com.example.Kafkademo.service;

import com.example.Kafkademo.model.Greetings;
import com.example.Kafkademo.stream.AccountUpdateBroadcastUsEast;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AccountListener {

    @StreamListener(AccountUpdateBroadcastUsEast.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        log.info("Received greetings: {}", greetings);
    }
}
*/

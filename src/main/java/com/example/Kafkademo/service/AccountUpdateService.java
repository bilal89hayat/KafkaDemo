package com.example.Kafkademo.service;

import com.example.Kafkademo.model.Greetings;
import com.example.Kafkademo.stream.AccountUpdateBroadcastUsEast;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.binding.BinderAwareChannelResolver;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class AccountUpdateService {

    private AccountUpdateBroadcastUsEast accountUpdateBroadcastUsEast;

    public AccountUpdateService(AccountUpdateBroadcastUsEast accountUpdateBroadcastUsEast) {
        this.accountUpdateBroadcastUsEast = accountUpdateBroadcastUsEast;
    }

    public void updateAccount(Greetings greetings){

        MessageChannel channel = accountUpdateBroadcastUsEast.outboundGreetings();
        log.info("sending==========");
        channel.send(MessageBuilder.withPayload(greetings).setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());

    }
}

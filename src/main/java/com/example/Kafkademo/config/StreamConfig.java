package com.example.Kafkademo.config;

import com.example.Kafkademo.stream.AccountUpdateBroadcastUsEast;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(AccountUpdateBroadcastUsEast.class)
public class StreamConfig {
}

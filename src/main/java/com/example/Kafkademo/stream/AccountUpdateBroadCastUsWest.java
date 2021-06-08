package com.example.Kafkademo.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface AccountUpdateBroadCastUsWest {

   // String INPUT = "us-west-1-in";
    String OUTPUT = "us-west-1-out";

    /*@Input(INPUT)
    SubscribableChannel inboundGreetings();
*/
    @Output(OUTPUT)
    MessageChannel outboundGreetings();
}

package com.example.Kafkademo.controller;


import com.example.Kafkademo.model.Greetings;
import com.example.Kafkademo.service.AccountUpdateService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private AccountUpdateService accountUpdateService;

    public KafkaController(AccountUpdateService accountUpdateService) {
        this.accountUpdateService = accountUpdateService;
    }


    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") String message) {
        Greetings greetings = Greetings.builder()
                .message(message)
                .timestamp(System.currentTimeMillis())
                .build();

        accountUpdateService.updateAccount(greetings);
    }
}

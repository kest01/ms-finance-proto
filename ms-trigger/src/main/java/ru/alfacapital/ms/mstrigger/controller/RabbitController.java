package ru.alfacapital.ms.mstrigger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.alfacapital.ms.mstrigger.service.messaging.MQSendService;

/**
 * Created by KKharitonov on 23.01.18.
 */
@Slf4j
@RestController
public class RabbitController {

    private final MQSendService mqSendService;

    public RabbitController(MQSendService mqSendService) {
        this.mqSendService = mqSendService;
    }

    @GetMapping("/test/send-to-mq")
    private String sendMessageToMQ(@RequestParam String message) {
        log.info("SEND MESSAGE TO MQ: {}", message);
        mqSendService.sendTestMessage(message);
        return "OK: " + message;
    }
}

package ru.alfacapital.ms.mstrigger.service.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import ru.alfacapital.ms.mstrigger.model.TestBean;

/**
 * Created by KKharitonov on 23.01.18.
 */
@Slf4j
@Service
@EnableBinding(TestSender.class)
public class MQSendService {

    private final TestSender testSender;

    public MQSendService(TestSender testSender) {
        this.testSender = testSender;
    }

    public void sendTestMessage(String message) {
        testSender.testMessages().send(
                MessageBuilder
                        .withPayload(new TestBean(message))
                        .build()
        );
    }
}

package ru.alfacapital.ms.mstrigger.service.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by KKharitonov on 23.01.18.
 */
public interface TestSender {

    String TEST_CHANNEL = "test-messages";

    @Output(TEST_CHANNEL)
    MessageChannel testMessages();

}

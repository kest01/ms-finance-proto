package ru.alfacapital.ms.autogen.handler;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by KKharitonov on 23.01.18.
 */
public interface TestSink {

    String TEST_CHANNEL = "test-messages";

    @Input(TEST_CHANNEL)
    SubscribableChannel testMessages();
}

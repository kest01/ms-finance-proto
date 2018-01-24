package ru.alfacapital.ms.autogen.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import ru.alfacapital.ms.autogen.model.TestBean;

/**
 * Created by KKharitonov on 23.01.18.
 */
@Slf4j
@EnableBinding(TestSink.class)
public class TestHandler {


    @StreamListener(TestSink.TEST_CHANNEL)
    public void handle(TestBean bean) {
        log.info("RECEIVED MESSAGE: {}", bean);
    }
}

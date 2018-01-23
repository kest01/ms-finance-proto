package ru.alfacapital.ms.mstrigger.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import ru.alfacapital.ms.mstrigger.service.messaging.TestSender;

/**
 * Created by KKharitonov on 23.01.18.
 */
@Configuration
@EnableBinding(TestSender.class)
public class Messaging {
}

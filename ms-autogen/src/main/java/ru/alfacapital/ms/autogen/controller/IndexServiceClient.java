package ru.alfacapital.ms.autogen.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.alfacapital.ms.etrader.external.ETraderService;
import ru.alfacapital.ms.etrader.external.model.TradeIndex;

import java.util.List;

/**
 * Created by KKharitonov on 25.01.18.
 */
@FeignClient(name = "index-service", url = "${alfacapital.ms.index-service-url}")
public interface IndexServiceClient extends ETraderService {

    @Override
    @GetMapping
    List<TradeIndex> getAllIndexes();

    @Override
    @GetMapping("/{key}")
    TradeIndex getIndexByKey(@PathVariable("key") String key);
}

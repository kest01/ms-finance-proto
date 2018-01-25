package ru.alfacapital.ms.autogen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alfacapital.ms.etrader.external.model.TradeIndex;

import java.util.List;

/**
 * Created by KKharitonov on 25.01.18.
 */
@RestController
@RequestMapping("/index")
public class IndexProxyController {

    private final IndexServiceClient indexServiceClient;

    public IndexProxyController(IndexServiceClient indexServiceClient) {
        this.indexServiceClient = indexServiceClient;
    }

    @RequestMapping
    public List<TradeIndex> getAllIndexes() {
        return indexServiceClient.getAllIndexes();
    }

    @GetMapping("/{key}")
    public TradeIndex getIndexByKey(@PathVariable String key) {
        return indexServiceClient.getIndexByKey(key);
    }
}

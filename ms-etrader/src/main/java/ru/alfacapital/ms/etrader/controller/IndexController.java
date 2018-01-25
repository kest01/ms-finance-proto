package ru.alfacapital.ms.etrader.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alfacapital.ms.etrader.external.ETraderService;
import ru.alfacapital.ms.etrader.external.model.TradeIndex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by KKharitonov on 25.01.18.
 */
@RestController
@RequestMapping("/index")
public class IndexController implements ETraderService {

    private static final Map<String, TradeIndex> indexMap = new HashMap<String, TradeIndex>() {{
        put("AAA", new TradeIndex("AAA", "100"));
        put("BBB", new TradeIndex("BBB", "200"));
        put("CCC", new TradeIndex("CCC", "300"));
    }};

    @Override
    @RequestMapping
    public List<TradeIndex> getAllIndexes() {
        return new ArrayList<>(indexMap.values());
    }

    @Override
    @RequestMapping("/{key}")
    public TradeIndex getIndexByKey(@PathVariable String key) {
        return indexMap.get(key);
    }
}

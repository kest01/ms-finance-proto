package ru.alfacapital.ms.etrader.external;


import ru.alfacapital.ms.etrader.external.model.TradeIndex;

import java.util.List;

/**
 * Внешний интерфейс для REST сервиса ETrader
 */
public interface ETraderService {

    List<TradeIndex> getAllIndexes();

    TradeIndex getIndexByKey(String key);

}
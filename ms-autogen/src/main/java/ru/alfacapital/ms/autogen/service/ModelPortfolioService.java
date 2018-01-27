package ru.alfacapital.ms.autogen.service;

import org.springframework.stereotype.Service;
import ru.alfacapital.ms.autogen.model.ModelAsset;
import ru.alfacapital.ms.autogen.model.ModelPortfolio;

import java.math.BigDecimal;

/**
 * Created by KKharitonov on 27.01.18.
 */
@Service
public class ModelPortfolioService {

    public ModelPortfolio getCurrentModelPortfolio() {
        return ModelPortfolio.builder()
                .asset(new ModelAsset("AAA", BigDecimal.valueOf(10)))
                .asset(new ModelAsset("BBB", BigDecimal.valueOf(100)))
                .asset(new ModelAsset("CCC", BigDecimal.valueOf(1000)))
                .balance(BigDecimal.valueOf(100))
                .build();
    }

}

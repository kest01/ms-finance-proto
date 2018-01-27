package ru.alfacapital.ms.autogen.service;

import org.springframework.stereotype.Service;
import ru.alfacapital.ms.autogen.model.Portfolio;

/**
 * Created by KKharitonov on 27.01.18.
 */
@Service
public class RebalanceService {

    private final ModelPortfolioService modelPortfolioService;

    public RebalanceService(ModelPortfolioService modelPortfolioService) {
        this.modelPortfolioService = modelPortfolioService;
    }

    public Portfolio rebalance(Portfolio previousPortfolio) {
        return previousPortfolio;
    }
}

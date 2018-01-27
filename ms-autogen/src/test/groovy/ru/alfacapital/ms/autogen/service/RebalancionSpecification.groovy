package ru.alfacapital.ms.autogen.service

import ru.alfacapital.ms.autogen.model.Asset
import ru.alfacapital.ms.autogen.model.ModelAsset
import ru.alfacapital.ms.autogen.model.ModelPortfolio
import ru.alfacapital.ms.autogen.model.Portfolio
import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by KKharitonov on 27.01.18.
 */
class RebalanceSpec extends Specification {

    def rebalanceService
    def modelPortfolio = ModelPortfolio.builder()
            .asset(new ModelAsset('AAA', 0.5))
            .build()

    @Shared sourcePortfolio1 = new Portfolio(assets: [new Asset('AAA', 10.0)], balance: 100.0)
    @Shared sourcePortfolio2 = new Portfolio(assets: [new Asset('BBB', 10.0)], balance: 100.0)

    def setup() {
        def modelPortfolioService = Mock(ModelPortfolioService)
        modelPortfolioService.currentModelPortfolio >> modelPortfolio
        rebalanceService = new RebalanceService(modelPortfolioService)
    }


    def "one plus one should equal two"() {
        expect:
        println("Validate")
        rebalanceService.rebalance(sourcePortfolio) == sourcePortfolio

        where:
        sourcePortfolio << [sourcePortfolio1, sourcePortfolio2]
    }

}

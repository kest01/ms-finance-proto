package ru.alfacapital.ms.autogen.model;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by KKharitonov on 27.01.18.
 */
@Data
@Builder
public class ModelPortfolio {

    @Singular
    private Collection<ModelAsset> assets;

    private BigDecimal balance;

}

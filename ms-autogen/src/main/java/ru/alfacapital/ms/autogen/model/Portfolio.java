package ru.alfacapital.ms.autogen.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by KKharitonov on 27.01.18.
 */
@Data
public class Portfolio {

    private List<Asset> assets;

    BigDecimal balance;

}

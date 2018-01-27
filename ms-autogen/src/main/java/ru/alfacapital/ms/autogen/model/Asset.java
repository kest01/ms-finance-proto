package ru.alfacapital.ms.autogen.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Актив
 *
 * Created by KKharitonov on 27.01.18.
 */
@Data
@AllArgsConstructor
public class Asset {

    private String key;
    private BigDecimal amount;

}

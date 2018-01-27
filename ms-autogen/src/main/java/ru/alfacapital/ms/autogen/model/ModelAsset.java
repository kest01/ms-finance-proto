package ru.alfacapital.ms.autogen.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by KKharitonov on 27.01.18.
 */
@Data
@AllArgsConstructor
public class ModelAsset {

    private String key;
    private BigDecimal proportion;

}

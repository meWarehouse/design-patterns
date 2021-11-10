package com.at.designpattern.responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zero
 * @create 2020-11-21 19:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest {

    private int id;
    private double purchasePrice;

}

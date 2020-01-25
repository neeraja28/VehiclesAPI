package com.udacity.pricing.domain.price;

import java.util.List;

public class PriceList {

    private List<Price> priceList;

    public List<Price> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Price> priceList) {
        this.priceList = priceList;
    }
}

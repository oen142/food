package com.wani.food.order.domain;

import com.wani.food.shop.domain.MenuRepository;
import com.wani.food.shop.domain.Shop;
import com.wani.food.shop.domain.ShopRepository;
import org.springframework.stereotype.Component;

@Component
public class OrderValidator {

    private ShopRepository shopRepository;
    private MenuRepository menuRepository;

    public OrderValidator(ShopRepository shopRepository,
        MenuRepository menuRepository) {
        this.shopRepository = shopRepository;
        this.menuRepository = menuRepository;
    }

}

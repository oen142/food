package com.wani.food.billing.domain;

import com.wani.food.order.domain.OrderDeliveredEvent;
import com.wani.food.shop.domain.ShopRepository;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BillShopWithOrderDeliveredEventHandler {

    private ShopRepository shopRepository;
    private BillingRepository billingRepository;

    public BillShopWithOrderDeliveredEventHandler(
        ShopRepository shopRepository, BillingRepository billingRepository) {
        this.shopRepository = shopRepository;
        this.billingRepository = billingRepository;
    }

    @Async
    @EventListener
    @Transactional
    public void handle(OrderDeliveredEvent event){
        shopRepository
    }
}

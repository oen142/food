package com.wani.food.billing.domain;

import com.wani.food.generic.money.domain.Money;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BILLINGS")
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BILLING_ID")
    private Long id;

    @Column(name = "SHOP_ID")
    private Long shopId;

    @Column(name = "COMMISSION")
    private Money commission = Money.ZERO;

    Billing() {
    }

    public Billing(Long shopId) {
        this(null, shopId, Money.ZERO);
    }

    public Billing(Long id, Long shopId, Money commission) {
        this.id = id;
        this.shopId = shopId;
        this.commission = commission;
    }

    public void billCommissionFee(Money commission) {
        this.commission = this.commission.plus(commission);
    }
}

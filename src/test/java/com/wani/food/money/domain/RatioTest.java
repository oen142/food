package com.wani.food.money.domain;

import static org.assertj.core.api.Assertions.*;

import com.wani.food.generic.money.domain.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RatioTest {

    @Test
    public void 퍼센트() {

        Ratio tenPercent = Ratio.valueOf(0.1);
        Money thousandWon = Money.wons(1000);

        assertThat(tenPercent.of(thousandWon)).isEqualTo(Money.wons(100));
    }
}

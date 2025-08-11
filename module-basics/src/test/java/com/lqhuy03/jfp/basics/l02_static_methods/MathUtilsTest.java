package com.lqhuy03.jfp.basics.l02_static_methods;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MathUtilsTest {
    @Test
    void add_should_sum_two_integers() {
        assertThat(MathUtils.add(2, 3)).isEqualTo(5);
    }
}
package org.example;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class AssertjTest {

    @Test
    public void assertjTest() {
        BigDecimal weight = new BigDecimal("60.2").setScale(3, BigDecimal.ROUND_HALF_UP);
        List<String> jobs = Arrays.asList("Художник", "Поэт", "Музыкант");
        Person vasia = new Person("Вася", 45, weight, jobs);
        assertThat(vasia)
                .as("Василий")
                .hasFieldOrProperty("name")
                .hasFieldOrPropertyWithValue("name", "Вася")
                .hasFieldOrPropertyWithValue("age", 45)
                .hasFieldOrProperty("age")
                .isInstanceOf(Person.class);
        assertThat(vasia.getJobs())
                .as("Работы Василия")
                .containsAnyOf("Художник", "Врач");


    }
}

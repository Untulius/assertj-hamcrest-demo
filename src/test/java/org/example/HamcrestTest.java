package org.example;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTest {

    @Test
    public void hamcrestTest() {
        BigDecimal weight = new BigDecimal("60.2").setScale(3, BigDecimal.ROUND_HALF_UP);
        List<String> jobs = Arrays.asList("Художник", "Поэт", "Музыкант");
        Person vasia = new Person("Вася", 45, weight, jobs);

        assertThat(vasia, hasProperty("name"));
        assertThat("Вася", is(vasia.getName()));
        assertThat(45, is(vasia.getAge()));
        assertThat(vasia, hasProperty("age"));
        assertThat(vasia, isA(Person.class));

        assertThat(vasia.getJobs(), hasItem("Художник"));
        assertThat(vasia.getJobs(), contains("Художник", "Поэт", "Музыкант"));
    }
}

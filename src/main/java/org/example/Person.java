package org.example;

import java.math.BigDecimal;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private BigDecimal weight;
    private List<String> jobs;

    public Person(String name, int age, BigDecimal weight, List<String> jobs) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.jobs = jobs;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public List<String> getJobs() {
        return jobs;
    }
}

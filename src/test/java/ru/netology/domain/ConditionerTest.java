package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        assertEquals(20, conditioner.increaseCurrentTemperature(19));
        assertEquals(30, conditioner.increaseCurrentTemperature(32));
        assertEquals(15, conditioner.increaseCurrentTemperature(12));

    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        assertEquals(18, conditioner.decreaseCurrentTemperature(19));
        assertEquals(30, conditioner.decreaseCurrentTemperature(33));
        assertEquals(15, conditioner.decreaseCurrentTemperature(15));
    }

}
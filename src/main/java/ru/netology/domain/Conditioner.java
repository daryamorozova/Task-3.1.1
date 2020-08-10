package ru.netology.domain;

public class Conditioner {
    private String name;
    private int currentTemperature;
    private int maxTemperature = 30;
    private int minTemperature = 15;



    public int increaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature >= minTemperature & currentTemperature < maxTemperature) {
            this.currentTemperature = currentTemperature + 1;
        }

        if (currentTemperature >= maxTemperature) {
            this.currentTemperature = maxTemperature;
        }

        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
        }

        return this.currentTemperature;
    }

    public int decreaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature > minTemperature & currentTemperature <= maxTemperature) {
            this.currentTemperature = currentTemperature - 1;
        }
        if (currentTemperature <= minTemperature) {
            this.currentTemperature = minTemperature;
        }

        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
        }
        return this.currentTemperature;

    }


}

package ru.netology.domain;

public class RadioAdvanced {
    private String name;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    private int currentRadioStation;
    private int maxRadioStation=9;
    private int minRadioStation=0;



    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }

        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void changeRadioStationByNextButton() {
        if (currentRadioStation == maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
            return;
        }
        setCurrentRadioStation(currentRadioStation + 1);
    }

    public void changeRadioStationByPrevButton() {
        if (currentRadioStation == minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
            return;
        }
        setCurrentRadioStation(currentRadioStation - 1);
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        setCurrentVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        setCurrentVolume(currentVolume - 1);
    }

    /*Getters*/

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }
}

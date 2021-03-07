package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {
    RadioAdvanced radio = new RadioAdvanced();

    @Test
    public void setMinRadioStationTest() {
        radio.setMinRadioStation(0);
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void setMaxRadioStationTest() {
        radio.setMaxRadioStation(9);
        assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void setMinVolumeTest() {
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setMaxVolumeTest() {
        radio.setMaxVolume(10);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void setRadioStationTest() {
        radio.setCurrentRadioStation(1);
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void setMinRadioStationValueTest() {
        radio.setCurrentRadioStation(radio.getMinRadioStation() - 1);
        assertEquals(radio.getMinRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    public void setMaxRadioStationValueTest() {
        radio.setCurrentRadioStation(radio.getMaxRadioStation() + 1);
        assertEquals(radio.getMinRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationUpToRound() {
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.changeRadioStationByNextButton();
        assertEquals(radio.getMinRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationDownToRound() {
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.changeRadioStationByPrevButton();
        assertEquals(radio.getMaxRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeRadioStationByBackButton() {
        radio.setCurrentRadioStation(1);
        radio.changeRadioStationByPrevButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationIfNumberIsTrue() {
        radio.setCurrentRadioStation(6);
        radio.changeRadioStationByNextButton();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    void shouldIncreaseMaxVolume() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeTest() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeMinTest() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}
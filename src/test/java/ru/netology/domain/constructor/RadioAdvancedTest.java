package ru.netology.domain.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioAdvancedTest {
 RadioAdvanced radio = new RadioAdvanced();
//Установка радиостанции//
    @Test
    public void setMinRadioStationTest() {
        radio.setMinRadioStation(0);
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void setMaxRadioStationTest() {
        RadioAdvanced radio = new RadioAdvanced(0,10);
        radio.setMaxRadioStation(10);
        assertEquals(10, radio.getMaxRadioStation());
    }
    @Test
    public void setRadioStationTest() {
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }
    @Test
    public void setMinRadioStationValueTest() {
        RadioAdvanced radio = new RadioAdvanced(0,0,10,0);
        radio.setCurrentRadioStation(radio.getMinRadioStation() - 1);
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void setMaxRadioStationValueTest() {
        RadioAdvanced radio = new RadioAdvanced(0,0,10,0);
        radio.setCurrentRadioStation(radio.getMaxRadioStation() + 1);
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldChangeRadioStationUpToRound() {
        RadioAdvanced radio = new RadioAdvanced(0,0,10,0);
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.changeRadioStationByNextButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationDownToRound() {
        RadioAdvanced radio = new RadioAdvanced(0,0,10,0);
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.changeRadioStationByPrevButton();
        assertEquals(10, radio.getCurrentRadioStation());
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

    //Регулировка громкости//
    @Test
    public void setMinVolumeTest() {
        RadioAdvanced radio = new RadioAdvanced("",0);
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setMaxVolumeTest() {
        RadioAdvanced radio = new RadioAdvanced(120);
        radio.setMaxVolume(1);
        assertEquals(1, radio.getMaxVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        RadioAdvanced radio = new RadioAdvanced("",100,0,0);
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    void shouldIncreaseMaxVolume() {
        RadioAdvanced radio = new RadioAdvanced(100,100,10);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeTest() {
        RadioAdvanced radio = new RadioAdvanced(100,1,10);
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeMinTest() {
        RadioAdvanced radio = new RadioAdvanced(100,0,10);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}
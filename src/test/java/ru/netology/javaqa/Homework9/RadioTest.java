
package ru.netology.javaqa.Homework9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setupRadioChannel() {

        Radio channel = new Radio();

        channel.setRadioChannel(7);

        int expected = 7;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupLowerRadioChannel() {

        Radio channel = new Radio();

        channel.setRadioChannel(-1);

        int expected = 0;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupBiggerRadioChannel() {

        Radio channel = new Radio();

        channel.setRadioChannel(10);

        int expected = 0;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannelAfterMax() {

        Radio channel = new Radio();

        channel.setRadioChannel(9);

        channel.nextChannel();

        int expected = 0;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannel() {

        Radio channel = new Radio();

        channel.setRadioChannel(8);

        channel.nextChannel();

        int expected = 9;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannel() {

        Radio channel = new Radio();
        channel.setRadioChannel(9);
        channel.prevChannel();

        int expected = 8;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinRadioChannel() {

        Radio channel = new Radio();
        channel.setRadioChannel(0);
        channel.prevChannel();

        int expected = 9;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupVolumeLevel() {

        Radio volume = new Radio();

        volume.setCurrentVolumeLevel(26);

        int expected = 26;
        int actual = volume.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupLowerVolumeLevel() {

        Radio volume = new Radio();

        volume.setCurrentVolumeLevel(-1);

        int expected = 0;
        int actual = volume.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupBiggerVolumeLevel() {

        Radio volume = new Radio();

        volume.setCurrentVolumeLevel(101);

        int expected = 0;
        int actual = volume.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLevel() {

        Radio volume = new Radio();

        volume.setCurrentVolumeLevel(0);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolumeLevel() {

        Radio volume = new Radio();

        volume.setCurrentVolumeLevel(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLevel() {

        Radio volume = new Radio();
        volume.setCurrentVolumeLevel(26);

        volume.decreaseVolume();

        int expected = 25;
        int actual = volume.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMinVolumeLevel() {

        Radio volume = new Radio();
        volume.setCurrentVolumeLevel(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

}

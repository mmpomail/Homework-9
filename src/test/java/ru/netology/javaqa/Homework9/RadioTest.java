
package ru.netology.javaqa.Homework9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setMaxChannels() {

        Radio channel = new Radio(15);

        Assertions.assertEquals(15, channel.getNumberOfChannels());
    }

    @Test
    public void setMaxChannelsS() {

        Radio channel = new Radio();

        Assertions.assertEquals(10, channel.getNumberOfChannels());
    }

    @Test
    public void setupRadioChannel() {

        Radio channel = new Radio(5);

        channel.setRadioChannel(4);

        int expected = 4;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupRadioChannelLowerThenMin() {

        Radio channel = new Radio(15);

        channel.setRadioChannel(-1);

        int expected = 0;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupRadioChannelBiggerThenMin() {

        Radio channel = new Radio(15);

        channel.setRadioChannel(15);

        int expected = 0;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannel() {

        Radio channel = new Radio(15);

        channel.setRadioChannel(0);

        channel.nextChannel();

        int expected = 1;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannelAfterMax() {

        Radio channel = new Radio(15);

        channel.setRadioChannel(14);

        channel.nextChannel();

        int expected = 0;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannel() {

        Radio channel = new Radio(15);

        channel.setRadioChannel(14);

        channel.prevChannel();

        int expected = 13;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannelAfterMin() {

        Radio channel = new Radio(15);

        channel.setRadioChannel(0);

        channel.prevChannel();

        int expected = 14;
        int actual = channel.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupVolumeLevel() {

        Radio volume = new Radio();

        volume.setCurrentVolumeLevel(26);

        int expected = 26;
        int actual = volume.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupLowerVolumeLevel() {

        Radio volume = new Radio();

        volume.setCurrentVolumeLevel(-1);

        int expected = 0;
        int actual = volume.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupBiggerVolumeLevel() {

        Radio volume = new Radio();

        volume.setCurrentVolumeLevel(101);

        int expected = 0;
        int actual = volume.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLevel() {

        Radio volume = new Radio();

        volume.setCurrentVolumeLevel(0);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolumeLevel() {

        Radio volume = new Radio();

        volume.setCurrentVolumeLevel(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLevel() {

        Radio volume = new Radio();
        volume.setCurrentVolumeLevel(26);

        volume.decreaseVolume();

        int expected = 25;
        int actual = volume.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMinVolumeLevel() {

        Radio volume = new Radio();
        volume.setCurrentVolumeLevel(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }


}


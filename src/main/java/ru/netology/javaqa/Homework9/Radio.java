package ru.netology.javaqa.Homework9;

public class Radio {

    private int numberOfChannels = 10;
    private int minChannel = 0;
    private int currentChannel = minChannel;
    private int maxSoundLevel = 100;
    private int minSoundLevel = 0;

    private int currentSoundLevel = minSoundLevel;

    public Radio(int numberOfChannels) {
        this.numberOfChannels = numberOfChannels;
    }

    public Radio() {

    }

    public int getNumberOfChannels() {
        return numberOfChannels;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentSoundLevel() {
        return currentSoundLevel;
    }

    public void setRadioChannel(int newRadioChannel) {

        if (newRadioChannel < minChannel) {
            return;
        }

        if (newRadioChannel > (numberOfChannels - 1)) {
            return;
        }
        currentChannel = newRadioChannel;

    }

    public void nextChannel() {

        if (currentChannel == (numberOfChannels - 1)) {
            currentChannel = 0;
        } else {
            currentChannel += 1;
        }

    }

    public void prevChannel() {
        if (currentChannel == minChannel) {
            currentChannel = (numberOfChannels - 1);
        } else {
            currentChannel -= 1;
        }

    }

    public void setCurrentVolumeLevel(int newVolumeLevel) {

        if (newVolumeLevel < minSoundLevel) {
            return;
        }

        if (newVolumeLevel > maxSoundLevel) {
            return;
        }
        currentSoundLevel = newVolumeLevel;
    }

    public void increaseVolume() {
        if (currentSoundLevel == maxSoundLevel) {
            return;
        } else {
            currentSoundLevel += 1;
        }
    }

    public void decreaseVolume() {
        if (currentSoundLevel == minSoundLevel) {
            return;
        } else {
            currentSoundLevel -= 1;

        }
    }


}


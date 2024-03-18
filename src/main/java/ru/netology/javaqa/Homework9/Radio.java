package ru.netology.javaqa.Homework9;

public class Radio {

    private int currentChannel;
    private int currentVolumeLevel;

    public int getCurrentChannel() {

        return currentChannel;
    }

    public int getCurrentVolumeLevel() {

        return currentVolumeLevel;
    }

    public void setRadioChannel(int newRadioChannel) {

        if (newRadioChannel < 0) {
            return;
        }

        if (newRadioChannel > 9) {
            return;
        }
        currentChannel = newRadioChannel;

    }

    public void nextChannel() {

        if (currentChannel == 9) {
            currentChannel = 0;
        } else {
            currentChannel += 1;
        }

    }

    public void prevChannel() {
        if (currentChannel == 0) {
            currentChannel = 9;
        } else {
            currentChannel -= 1;
        }

    }

    public void setCurrentVolumeLevel(int newVolumeLevel) {

        if (newVolumeLevel < 0) {
            return;
        }

        if (newVolumeLevel > 100) {
            return;
        }
        currentVolumeLevel = newVolumeLevel;
    }

    public void increaseVolume() {
        if (currentVolumeLevel == 100) {
            return;
        } else {
            currentVolumeLevel += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolumeLevel == 0) {
            return;
        } else {
            currentVolumeLevel -= 1;

        }
    }

}



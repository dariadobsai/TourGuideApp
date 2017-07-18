package com.example.android.tourapp;

class ListPhrases {

    private int french;
    private int english;
    private int sound;

    ListPhrases(int french, int english, int sound) {
        this.french = french;
        this.english = english;
        this.sound = sound;
    }

    int getFrench() {
        return french;
    }

    int getEnglish() {
        return english;
    }

    int getSound(){
        return sound;
    }
}

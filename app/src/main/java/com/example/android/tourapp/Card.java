package com.example.android.tourapp;

class Card {

    private int line1;
    private int line2;
    private int image;

   Card(int image, int line1, int line2) {
        this.image = image;
        this.line1 = line1;
        this.line2 = line2;
    }

    public int getImage() {
        return image;
    }

    int getLine1() {
        return line1;
    }

    int getLine2() {
        return line2;
    }
}

package com.example.android.tourapp;

class List {

    private int name;
    private int address;
    private int image;

    List(int image, int name, int address) {
        this.image = image;
        this.name = name;
        this.address = address;
    }

    int getPicture() {
        return image;
    }

    int getName() {
        return name;
    }

    int getAddress() {
        return address;
    }
}

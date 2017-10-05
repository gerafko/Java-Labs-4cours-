package com.company;


public class Main {

    public static void main(String[] args) {

        MusicalInstrument[] ArrayInstruments = new MusicalInstrument[3];
        Drum d = new Drum();
        ArrayInstruments[0] = d;
        Woodwind w = new Woodwind();
        ArrayInstruments[1] = w;
        Stringed s = new Stringed();
        ArrayInstruments[2] = s;

        for (int i = 0; i < ArrayInstruments.length; i++)
        {
            System.out.println(ArrayInstruments[i].name.toString());
        }
    }
}

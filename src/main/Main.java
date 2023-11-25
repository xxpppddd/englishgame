package main;
import Quiz.*;
import Hangman.*;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        new Hangman().setVisible(true);
        sound.SoundPlay.playSoundReset("sound/girlfront.wav");
    }
}

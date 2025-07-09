package br.com.dio.hangman.model;

import java.util.List;

import static br.com.dio.hangman.model.HangmanGameStatus.PENDING;

public class HangmanGame {

    private String hangman;
    private HangmanGameStatus hangmanGameStatus;

    public HangmanGame(final List<HangmanChar> caracters) {
        var whiteSpaces = " ".repeat(caracters.size());
        var characterSpace = "-".repeat(caracters.size());
        this.hangmanGameStatus = PENDING;
        buildHangmanDesign(whiteSpaces, characterSpace);
    }

    @Override
    public String toString() {
        return this.hangman;
    }

    private void buildHangmanDesign(final String whiteSpaces, final String characterSpace) {
        this.hangman = "  -----  " + whiteSpaces + System.lineSeparator() +
                  "  |   |  " + whiteSpaces + System.lineSeparator() +
                  "  |   |  " + whiteSpaces + System.lineSeparator() +
                  "  |      " + whiteSpaces + System.lineSeparator() +
                  "  |      " + whiteSpaces + System.lineSeparator() +
                  "  |      " + whiteSpaces + System.lineSeparator() +
                  "  |      " + whiteSpaces + System.lineSeparator() +
                  "=========" + whiteSpaces + System.lineSeparator();
    }
}

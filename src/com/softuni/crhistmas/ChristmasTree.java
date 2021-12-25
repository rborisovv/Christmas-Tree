package com.softuni.crhistmas;

public class ChristmasTree {
    private static final String EMPTY_SYMBOL = "\s";
    private static final String STAR_SYMBOL = EMPTY_SYMBOL + "*";
    private static final String LOG_SYMBOL = "||||";

    private final int lengthOfTree;
    private int numberOfSpaces;

    public ChristmasTree(int lengthOfTree) {
        this.lengthOfTree = lengthOfTree;
        numberOfSpaces = lengthOfTree;
    }

    public String buildChristmasTree() {
        StringBuilder tree = new StringBuilder();
        for (int countOfStars = 1; countOfStars <= lengthOfTree; countOfStars++) {
            tree.append(System.lineSeparator());
            tree.append(EMPTY_SYMBOL.repeat(Math.max(0, numberOfSpaces--)));
            tree.append(STAR_SYMBOL.repeat(countOfStars));
        }
        return tree.toString();
    }

    public String buildTreeLog() {
        StringBuilder log = new StringBuilder();
        int lengthOfLog = (lengthOfTree / 5) * 2;
        for (int i = 0; i <= lengthOfLog; i++) {
            log.append(EMPTY_SYMBOL.repeat(Math.max(0, lengthOfTree)));
            log.append(LOG_SYMBOL).append(System.lineSeparator());
        }
        return log.toString();
    }
}
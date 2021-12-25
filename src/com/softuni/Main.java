package com.softuni;

import com.softuni.crhistmas.ChristmasTree;
import com.softuni.messages.ExceptionMessages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.softuni.messages.ConstantMessages.*;

public class Main {
    private static final BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
    private static int lengthOfTree;

    public static void main(String[] args) throws IOException {
        while (lengthOfTree == 0) {
            try {
                System.out.println(ENTER_CHRISTMAS_TREE_LENGTH);
                lengthOfTree = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println(ExceptionMessages.INVALID_NUMBER);
            }
        }

        ChristmasTree tree = new ChristmasTree(lengthOfTree);
        System.out.println(tree.buildChristmasTree());
        System.out.println(tree.buildTreeLog());
    }
}
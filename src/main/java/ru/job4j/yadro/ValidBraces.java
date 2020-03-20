package ru.job4j.yadro;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Class ValidBraces.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 20.03.2020
 */
public class ValidBraces {

    /**
     * Checks the braces' order in a string.
     *
     * @param braces, a string with braces.
     * @return true if the braces' order is right, otherwise false.
     */
    public static boolean checkBracesOder(String braces) {
        boolean result = true;
        int counter = 0;
        char[] symbols = braces.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : symbols) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                counter++;
            }
            if (c == ')' || c == '}' || c == ']') {
                if (!stack.isEmpty()) {
                    char fromStack = stack.peek();
                    if ((fromStack == '(' && c == ')')
                            || (fromStack == '{' && c == '}')
                            || (fromStack == '[' && c == ']')) {
                        stack.pop();
                        counter--;
                    } else {
                        result = false;
                        break;
                    }
                } else {
                    result = false;
                    break;
                }
            }
        }
        return counter == 0 && result;
    }
}

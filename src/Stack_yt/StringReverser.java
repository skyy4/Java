package Stack_yt;

import java.util.Stack;


class StringReverser {
    public static String reverseString(String str) {
        // Create a character array to store the reversed string
        char[] reverseString = new char[str.length()];

        // Create a stack to hold characters
        Stack<Character> stack = new Stack<>();

        // Push each character from the input string onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop characters from the stack and add them to the character array
        int i = 0;
        while (!stack.isEmpty()) {
            reverseString[i++] = stack.pop();
        }

        // Convert the character array to a string
        return new String(reverseString);
    }

    public static void main(String[] args) {
        String input1 = "GeeksForGeeks";
        System.out.println(input1 + " <- Reverse -> " + reverseString(input1));

        String input2 = "Hello World";
        System.out.println(input2 + " <- Reverse -> " + reverseString(input2));
    }
}

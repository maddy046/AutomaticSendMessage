package com.AutomaticSendMessage;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class AutomaticSendMessage {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Message to send the friend: ");
        String message = scanner.nextLine();
        System.out.println("How many times you want to send message: ");
        int size = scanner.nextInt();

        StringSelection stringSelection = new StringSelection(message);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        Thread.sleep(5000);

        Robot robot = new Robot();
        for (int i = 1; i <= size; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(1000);
        }



    }
}

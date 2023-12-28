package Test;
import java.awt.EventQueue;
import View.View_Home;
import View.View_LogIn;

import java.awt.*;

public class Test1 {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {

                    View_LogIn frame = new View_LogIn();

                    frame.setVisible(true);

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        });

    }
}

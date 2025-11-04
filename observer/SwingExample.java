package observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {

    JFrame frame;

    public static void main(String[] args) {
        SwingExample example = new SwingExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        
        // using inner class for observers
        button.addActionListener(new AngelListener());

        // using lambda for observer (function object)
        button.addActionListener(event -> System.out.println(event.toString()));

        frame.setSize(500, 500);
        frame.add(button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
        
    }

}

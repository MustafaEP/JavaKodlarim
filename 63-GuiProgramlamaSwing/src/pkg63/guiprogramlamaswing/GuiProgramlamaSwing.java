package pkg63.guiprogramlamaswing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuiProgramlamaSwing {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setTitle("İlk Pencerem");
        jFrame.setSize(500, 600);
        jFrame.setLocation(1400, 200);

        JTextField textField = new JTextField(10);

        jFrame.getContentPane().setLayout(new FlowLayout());

        JButton button = new JButton("Gönder");

        JLabel jLabel = new JLabel("Buraya İsminizi Giriniz: ");
        JLabel jLabel1 = new JLabel();

        jFrame.getContentPane().add(jLabel);
        jFrame.getContentPane().add(textField);
        jFrame.getContentPane().add(button);
        jFrame.getContentPane().add(jLabel1);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel1.setText("Merhabalar " + textField.getText() + " programa hoşgeldin");
            }
        });

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

    }

}

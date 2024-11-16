import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Javaswing {
    public static JFrame f = new JFrame();
    public static JPanel container = new JPanel();
    public static JButton currButton;
    public static JTextField currInput;
    public static JScrollPane scrollPane;
    public static boolean running = true;
    public static void main(String[] args) {
        addTextLine("Hello there, I am ZooBot! I can help with finding the animal exhibit of your choosing, the nearest bathroom, and provide contact information.");
        f.add(container);
        container.add(addInputLine());
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        scrollPane = new JScrollPane(container);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        f.add(scrollPane);
        f.setSize(400,500);
        f.setVisible(true);
    }
    public static String doCommand(String cmd) {
        if(cmd.equals("quit")) {
            running = false;
            return "";
        }
        return Chatbot.doCommand(cmd);
        // return cmd;
    }
    public static void addTextLine(String text) {
        JLabel label = new JLabel(text);
        container.add(label);
        container.add(Box.createVerticalStrut(40));
        update();
    }
    public static JPanel addInputLine() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // panel.setLayout(new FlowLayout());
        JTextField textField = new JTextField(20);
        panel.add(textField);
        JButton btn = new JButton("enter");
        panel.add(btn);
        currButton = btn;
        currInput = textField;
        panel.setMaximumSize(new Dimension(250, panel.getPreferredSize().height));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("quit")) {
                    addTextLine(doCommand(textField.getText()));
                    container.add(addInputLine());
                }
                btn.setEnabled(false);
                textField.setEditable(false);
                currInput.requestFocus();
                SwingUtilities.invokeLater(() -> {
                    JScrollBar sb = scrollPane.getVerticalScrollBar();
                    sb.setValue(sb.getMaximum());
                });
                update();
            }
        });
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    currButton.doClick();
                }
            }
        });
        update(panel);
        return panel;
    }
    public static void update(JPanel panel) {
        panel.revalidate();
        panel.repaint();
    }
    public static void update() {
        update(container);
    }
}
package View;

import Model.BreakfastOptionCheckbox;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BreakfastView extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private ArrayList<BreakfastOptionCheckbox> breakfastOptionCheckboxes;
    private JButton acceptButton;
    private JTextField selectedBreakfastTextField;
    private JTextField totalCostTextField;

    public BreakfastView() {
        super();
//        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));
        this.setLayout(new GridLayout(1,2));

        setupPanel1();
        setupPanel2();

        this.add(panel1);
        this.add(panel2);

        this.setSize(400, 300);
        this.setTitle("Breakfast");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void setupPanel1() {
        panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBackground(Color.BLUE);

        panel1.add(new JLabel("Menu"));

        breakfastOptionCheckboxes = new ArrayList<>();
        breakfastOptionCheckboxes.add(new BreakfastOptionCheckbox("Toast", 7));
        breakfastOptionCheckboxes.add(new BreakfastOptionCheckbox("Beans", 6));
        breakfastOptionCheckboxes.add(new BreakfastOptionCheckbox("Tea", 4));
        breakfastOptionCheckboxes.add(new BreakfastOptionCheckbox("Coffee", 4.5));

        for (BreakfastOptionCheckbox option : breakfastOptionCheckboxes) {
            panel1.add(option);
        }

        acceptButton = new JButton("Accept");
        panel1.add(acceptButton);
    }

    private void setupPanel2() {
        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        panel2.setBackground(Color.RED);

        panel2.add(new JLabel("My breakfast"));
        selectedBreakfastTextField = new JTextField();
        panel2.add(selectedBreakfastTextField);

        panel2.add(new JLabel("Total cost"));
        totalCostTextField = new JTextField();
        panel2.add(totalCostTextField);

    }
}

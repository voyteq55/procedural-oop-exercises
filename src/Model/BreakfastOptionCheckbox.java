package Model;

import javax.swing.*;

public class BreakfastOptionCheckbox extends JCheckBox {
    private String optionName;
    private double cost;

    public BreakfastOptionCheckbox(String name, double cost) {
        super();
        this.optionName = name;
        this.cost = cost;
        this.setText(getFullOptionName());
    }

    public String getFullOptionName() {
        return optionName + " - " + cost + "zl";
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

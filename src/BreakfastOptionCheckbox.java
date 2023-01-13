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

    public double getCost() {
        return cost;
    }
}

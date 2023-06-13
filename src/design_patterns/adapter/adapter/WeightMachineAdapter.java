package design_patterns.adapter.adapter;

import design_patterns.adapter.adaptee.WeightMachine;

public class WeightMachineAdapter implements IWeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapter(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPounds();
        // convert it to kg
        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}

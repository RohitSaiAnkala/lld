package design_patterns.adapter;

import design_patterns.adapter.adaptee.WeighMachineForBabies;
import design_patterns.adapter.adaptee.WeightMachine;
import design_patterns.adapter.adapter.IWeightMachineAdapter;
import design_patterns.adapter.adapter.WeightMachineAdapter;

public class Main {
    public static void main(String[] args) {
        WeightMachine weightMachine = new WeighMachineForBabies();
        IWeightMachineAdapter weightMachineAdapter = new WeightMachineAdapter(weightMachine);
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}

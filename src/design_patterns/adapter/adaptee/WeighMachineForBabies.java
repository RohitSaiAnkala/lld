package design_patterns.adapter.adaptee;

public class WeighMachineForBabies implements WeightMachine{
    @Override
    public double getWeightInPounds() {
        return 28;
    }
}

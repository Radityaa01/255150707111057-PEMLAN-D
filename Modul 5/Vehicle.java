public class Vehicle {
    private double load = 0.0; 
    private static final double maxLoad = 10000; 

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return maxLoad; 
    }

    public boolean addBox(double weight) {
        double temp = this.load + weight;

        if (temp <= maxLoad) {
            this.load = temp;
            return true;
        } else {
            return false;
        }
    }
}
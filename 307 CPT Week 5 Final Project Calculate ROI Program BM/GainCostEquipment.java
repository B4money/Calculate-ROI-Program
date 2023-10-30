// Calculate ROI Program GainCostEquipment.java class
// Ben Merritt
// CPT 307 Data Structures & Algorithms
// Dr Tina Tian
// September 5, 2022

public class GainCostEquipment implements Comparable<GainCostEquipment> {

    private String equipment;
    private double gain;
    private double cost;

    private double roi = 0;

    public GainCostEquipment(String equipment, double gain, double cost) {
        super();
        this.equipment = equipment;
        this.gain = gain;
        this.cost = cost;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }

    public double getCost() {
        return cost;
    }

    public double getROI() {
        return roi;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // Calculates ROI
    public void calculateROI() {
        this.roi = (gain - cost) / cost;
    }

    // returns the display return format of each item and results
    @Override
    public String toString() {
        return "\nEquipment Name: " + equipment + "\nGain: $" + gain
                + "\nCost: $" + cost + "\nROI: " + roi + "\n";
    }

    // Compares items on list and returns in largest ROI to Least ROI
    @Override
    public int compareTo(GainCostEquipment o) {
        double roi = o.getROI();
        if (this.roi < roi) {
            return 1;
        } else if (this.roi == roi) {
            return 0;
        } else {
            return -1;
        }
    }

}
    /*
     *   Task 1, Task 2
     */


public class Main {
    public static void main(String[] args) {



        Credit[] dataCredit = new Credit[10];


        // laptop 1
        Laptop lap1 = new Laptop("5448552114831144", "FFLAP", "Mac Os");
        lap1.setWeight(1027.3);
        lap1.setProcessorType("Intel 2345");


        // laptop 2
        Laptop lap2 = new Laptop(1123.4, "Amd Ryzen 3700");
        lap2.setOs("Windows/DOS");
        lap2.setModel("SSLAP");
        lap2.setMacAddress("5879554785477847");


        // laptop 3
        Laptop lap3 = new Laptop();
        lap3.setMacAddress("4584841618416161165");
        lap3.setModel("TTLAP");
        lap3.setProcessorType("AMD/Intel");
        lap3.setOs("Windows/Mac/DOS");
        lap3.setWeight(1278.4);

        lap1.getInfo();
        lap2.getInfo();
        lap3.getInfo();

    }
}

class Credit {
    private String nameOfCredit;
    private double creditRate;
    private int maturityDate;
    private boolean penalties;


    // methods

    public void getInfoAboutCredit() {
        System.out.println("Info about your Credit:" + '\n' +
                "Name of credit: " + getNameOfCredit() + '\n' +
                "Credit rate: " + getCreditRate() + '\n' +
                "Maturity date: " + getMaturityDate() + '\n' +
                "penalties: " + getPenalties());
    }

    // end methods

    // constructors

    public Credit(String nameOfCredit, double creditRate, int maturityDate, boolean penalties) {
        setNameOfCredit(nameOfCredit);
        setCreditRate(creditRate);
        setMaturityDate(maturityDate);
        setPenalties(penalties);
    }

    public Credit(String nameOfCredit, double creditRate) {
        setCreditRate(creditRate);
        setNameOfCredit(nameOfCredit);
    }

    // end constructors

    // getters and setters

    public void setNameOfCredit(String nameOfCredit) {
        this.nameOfCredit = nameOfCredit;
    }

    public String getNameOfCredit() {
        return nameOfCredit;
    }

    public void setCreditRate(double creditRate) {
        this.creditRate = creditRate;
    }

    public double getCreditRate() {
        return creditRate;
    }

    public void setMaturityDate(int maturityDate) {
        this.maturityDate = maturityDate;
    }

    public int getMaturityDate() {
        return maturityDate;
    }

    public void setPenalties(boolean penalties) {
        this.penalties = penalties;
    }

    public String getPenalties() {
        if (penalties) return "Yes";
        else return "No";
    }

    // end getters and setters
}

class Laptop {
    private String macAddress;
    private String model;
    private double weight;
    private String processorType;
    private String os;

    // constructors

    public Laptop(String macAddress, String model, String os) {
        setMacAddress(macAddress);
        setModel(model);
        setOs(os);
    }

    public Laptop(double weight, String processorType) {
        setProcessorType(processorType);
        setWeight(weight);
    }

    public Laptop() {
    }

    // end constructors


    // methods

    public void showNotePad(String name) {
        System.out.println("Content of " + name + " file.");
    }

    public void getInfo() {
        System.out.println("Model: " + getModel() + '\n' +
                "Mac Address: " + getMacAddress() + '\n' +
                "Weight: " + getWeight() + '\n' +
                "Processor type: " + getProcessorType() + '\n' +
                "OS: " + getProcessorType() + '\n');
    }

    public void showNotePad(String name, int lines) {
        System.out.println("Content of " + name + "file." + lines + " lines.");
    }
    // end methods


    // getters and setters

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    // end getters and setters


}
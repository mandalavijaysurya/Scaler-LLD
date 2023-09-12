package io.designpatterns.Cars;

public class Tata implements ICar<Tata>{
    private String modelName;
    private int engineSize;
    private int noOfWheels;
    private String serialNumber;

    public Tata(String modelName, int engineSize, int noOfWheels, String serialNumber){
        this.modelName = modelName;
        this.engineSize = engineSize;
        this.noOfWheels = noOfWheels;
        this.serialNumber = serialNumber;  
    }
    public Tata(Tata t){
        this.modelName = t.getModelName();
        this.engineSize = t.getEngineSize();
        this.noOfWheels = t.getNoOfWheels();
        this.serialNumber = t.getSerialNumber();
    }
    public Tata(){

    }
    public String getModelName() {
        return modelName;
    }
    public int getEngineSize() {
        return engineSize;
    }
    public int getNoOfWheels() {
        return noOfWheels;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public Tata clone(){
        Tata tata = new Tata();
        tata.setModelName(modelName);
        tata.setEngineSize(engineSize);
        tata.setNoOfWheels(noOfWheels);
        tata.setSerialNumber(serialNumber);
        return tata;
    }
    @Override
    public String toString() {
        return "Tata [modelName=" + modelName + ", engineSize=" + engineSize + ", noOfWheels=" + noOfWheels
                + ", serialNumber=" + serialNumber + "]";
    }
}

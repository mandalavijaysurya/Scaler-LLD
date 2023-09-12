package io.designpatterns.Cars;

public class Maruti implements ICar<Maruti> {
    private String modelName;
    private int engineSize;
    private int noOfWheels;
    private String serialNumber;

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
    public Maruti clone() {
        Maruti maruti = new Maruti();
        maruti.engineSize = this.engineSize;
        maruti.serialNumber = this.serialNumber;
        maruti.modelName = this.modelName;
        maruti.noOfWheels = this.noOfWheels;
        return maruti;
    }

    @Override
    public String toString() {
        return "Maruti [modelName=" + modelName + ", engineSize=" + engineSize + ", noOfWheels=" + noOfWheels
                + ", serialNumber=" + serialNumber + "]";
    }
    
}

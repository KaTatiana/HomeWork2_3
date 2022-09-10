public abstract class Transport {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount){
        this.modelName=modelName;
        this.wheelsCount=wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void updateWheels() {

        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }
    }
    public void check(){
        updateWheels();
    }
}

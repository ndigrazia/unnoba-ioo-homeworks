public abstract class Locomotora {

    private int potenciaMax;
    private float velocidadMax;
    private float pesoEspecifico;
    
    public float getPesoEspecifico() {
        return pesoEspecifico;
    }

    public void setPesoEspecifico(float pesoEspecifico) {
        this.pesoEspecifico = pesoEspecifico;
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public float getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(float velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public abstract int consumo();

    public float cantidadDeLitrosNecesarios(int km) {
        return (consumo() * km);
    }
}
   

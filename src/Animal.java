/**
 * Created by DAM on 7/11/16.
 */
public class Animal {
    private String especie;
    public boolean potSaltar;
    public boolean potVolar;
    public boolean potNadar;
    public boolean potCaminar;

    public Animal(String especie,boolean potSaltar, boolean potVolar, boolean potNadar, boolean potCaminar) {
        this.especie = especie;
        this.potSaltar = potSaltar;
        this.potVolar = potVolar;
        this.potNadar = potNadar;
        this.potCaminar = potCaminar;
    }

    public boolean isPotCaminar() {
        return potCaminar;
    }

    public boolean isPotSaltar() {
        return potSaltar;
    }

    public boolean isPotNadar() {
        return potNadar;
    }

    public boolean isPotVolar() {
        return potVolar;
    }

}

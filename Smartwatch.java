package poo.Ejercicio;

public class SmartWatch extends SmartDevice {

String tipoBanda;

public SmartWatch(){

}

    public SmartWatch(String fabricante, String modelo, int capBateria, int serialNum, String sistOperativo, String tipoBanda) {
        super(fabricante, modelo, capBateria, serialNum, sistOperativo);
        this.tipoBanda = tipoBanda;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tipoBanda='" + tipoBanda + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capBateria=" + capBateria +
                ", serialNum=" + serialNum +
                ", sistOperativo='" + sistOperativo + '\'' +
                '}';
    }
}

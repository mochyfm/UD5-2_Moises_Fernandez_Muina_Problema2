import com.telas.vehicles.VeredaGT;

public class Main {
    public static void main(String[] args) {

        VeredaGT miCochaso = new VeredaGT("69-GT", 250.0f, 0.0f, 50f);
        // Tiene muy buena vida útil.

        System.out.println("El VeredaGT tiene " + miCochaso.energyLevel() + "W de energía" + "\n");

        miCochaso.recharge();
        miCochaso.recharge();

        System.out.println(" ");

        System.out.println("Ahora tiene " + miCochaso.energyLevel() + "W de energía");

        miCochaso.move();

        System.out.println("Se ha movido, y ahora tiene " + miCochaso.energyLevel() + "W de energía" + "\n");

        for (int i = 0; i < 5; i++) {
            miCochaso.move();
            System.out.println(miCochaso.energyLevel() + "W ");
        }

        System.out.println("Vamos a movernos una vez más..." + "\n");
        miCochaso.move();
        System.out.println(" ");
        System.out.println(miCochaso.status());
        miCochaso.recharge();
        System.out.println(miCochaso.status());



    }
}
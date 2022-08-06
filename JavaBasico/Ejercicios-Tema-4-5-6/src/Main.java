import com.poo.herencia.SmartPhone;
import com.poo.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        //Instanciamos el Objecto SmartPhone
        SmartPhone smartPhone = new SmartPhone("Lenovo Inc", "Levono", "ASX123", "AMD A500", "Negro", "LCD", 3000, true);

        System.out.println("Informacion Tenica de Celulares");
        System.out.println("Fabricante: "+smartPhone.fabricante);
        System.out.println("Marca: "+smartPhone.marca);
        System.out.println("Modelo: "+smartPhone.modelo);
        System.out.println("Procesador: "+smartPhone.procesador);
        System.out.println("Color del SmartPhone: "+smartPhone.color);
        System.out.println("Tipo de Pantalla: "+smartPhone.tipopantalla);
        System.out.println("Mili Amperios Bateria: "+smartPhone.bateria);
        System.out.println("Cuenta con Cargador: "+smartPhone.escargador);

        //Instanciamos SmartWach
        SmartWatch smartWatch = new SmartWatch("Huawei Inc", "SmartWatch BBNM", "GHTY-2", "Intel Core", "Plateado", "Cuero", "Si", false);

        System.out.println();
        System.out.println("Informacion Tenica de SmartWach");
        System.out.println("Fabricante: "+smartWatch.fabricante);
        System.out.println("Marca: "+smartWatch.marca);
        System.out.println("Modelo: "+smartWatch.modelo);
        System.out.println("Procesador: "+smartWatch.procesador);
        System.out.println("Color del SmartWatch: "+smartWatch.color);
        System.out.println("Tipo de Pulsera del SmartWatch: "+smartWatch.getPulsera());
        System.out.println("Mili Amperios Bateria: "+smartWatch.getTactic());
        System.out.println("Es Clasico: "+smartWatch.isEsclasico());
    }
}
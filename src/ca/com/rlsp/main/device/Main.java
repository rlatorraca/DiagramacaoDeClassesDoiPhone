package ca.com.rlsp.main.device;

import ca.com.rlsp.main.device.smartphone.SmartPhone;
import ca.com.rlsp.main.device.smartphone.device.android.Android;
import ca.com.rlsp.main.device.smartphone.device.iphone.Iphone;
import ca.com.rlsp.main.device.smartphone.google.Pixel;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SmartPhone device1 = new Iphone("José");
        printAllBehaviors(device1);

        SmartPhone device2 = new Android("Mario");
        printAllBehaviors(device2);

        SmartPhone device3 = new Pixel("Jorge");
        printAllBehaviors(device3);
    }

    private static void printAllBehaviors(SmartPhone device) {

        device.ligar();
        device.atender();
        device.iniciarCorrerioVoz();

        device.exibirPagina();
        device.adicionarNovaAba();
        device.atualizarPagina();

        device.tocar();
        device.pausar();
        device.selecionarMusica();
    }
}
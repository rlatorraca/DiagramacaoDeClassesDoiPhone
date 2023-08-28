package ca.com.rlsp.main.device.smartphone;

public class SmartPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutoMusical {


    private String deviceName;
    private String ownerName;

    public SmartPhone(String deviceName, String ownerName){
        setDeviceName(deviceName);
        System.out.println("==========================================");
        System.out.printf("Device name: %s - Device owner: %s\n", getDeviceName(), ownerName);
    }

    @Override
    public void ligar() {
        System.out.printf("Ligar smartphone: %s\n", getDeviceName());
    }

    @Override
    public void atender() {
        System.out.printf("Atender smartphone: %s\n", getDeviceName());
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.printf("Iniciar correio de voz do smartphone: %s\n", getDeviceName());
    }

    @Override
    public void exibirPagina() {
        System.out.printf("Exibir pagina no browser do smartphone: %s\n", getDeviceName());
    }

    @Override
    public void adicionarNovaAba() {
        System.out.printf("Iniciar correio de voz do smartphone: %s\n", getDeviceName());
    }

    @Override
    public void atualizarPagina() {
        System.out.printf("Iniciar correio de voz do smartphone: %s\n", getDeviceName());
    }

    @Override
    public void tocar() {
        System.out.printf("Tocar musica no smartphone: %s\n", getDeviceName());
    }

    @Override
    public void pausar() {
        System.out.printf("Pausar musica no smartphone: %s\n", getDeviceName());
    }

    @Override
    public void selecionarMusica() {
        System.out.printf("Selecionar musica no smartphone: %s\n", getDeviceName());
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}

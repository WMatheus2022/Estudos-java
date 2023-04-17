public class SmartTv {

    Boolean ligado = false;
    int canal=1;
    int volume=25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;

    }
    public void diminuirCanal() {
        canal--;
    }

    public void aumetarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }

    public void ligar() {
         ligado = true;
    }

    public void Desligado() {
        ligado = false;
    }

}
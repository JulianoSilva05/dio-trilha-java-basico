public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void informacoes() {
        System.out.println("TV Ligada? : " + ligada);
        System.out.println("Canal Atual? : " + canal);
        System.out.println("Volume Atual? : " + volume);
    }

    public void canal(int ch){
        canal = ch;
    }

    public void ligar(){
        boolean ligada = true;
    }
    public void desligar(){
        boolean ligada = false;
    }
    public void aumentarVolume(int vol){
        volume += vol;
        if (volume >=100){
            volume = 100;
        }
    }
    public void diminuirVolume(int vol){
        volume -= vol;
        if (volume <= 0){
            volume = 0;
        }
    }

}

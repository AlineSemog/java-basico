public class SmarTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void subirCanal(){
        canal++;
    }

    public void descerCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: + volume");
    }

        public void diminuirVolume(){
        volume--;
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

}

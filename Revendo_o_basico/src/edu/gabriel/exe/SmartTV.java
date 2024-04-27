package edu.gabriel.exe;

public class SmartTV {
    boolean ligada;
    int canal;
    int volume;

    public SmartTV(){
        this.ligada = false;
        this.canal = 0;
        this.volume = 25;
    }

    public void ligar(){
        this.ligada = true;
        System.out.println("A tv foi ligada");
    }

    public void desligar(){
        this.ligada = false;
        System.out.println("A tv foi desligada");
    }

    public void mudarDeCanal(int canal){
        this.canal = canal;
        System.out.printf("Mudando para o canal %d%n", this.canal);
    }

    public void aumentarSom(){
        if (this.volume < 100) {
            this.volume += 5;
            System.out.printf("O som da tv está em %d%n", this.volume);
        } else {
            System.out.println("O volume está no máximo");
        }
    }

    public void diminuirSom(){
        if (this.volume >= 0){
            this.volume -= 5;
            System.out.printf("O som da tv está em %d%n", this.volume);
        } else {
            System.out.println("O volume já está no zero");
        }
    }

}

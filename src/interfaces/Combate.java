package interfaces;

public interface Combate {
    int getVida();
    int getVidaSan();
    int getDano();
    int getPrestigio();
    void receberDano(int dano);
    void aplicarDano(int dano);
    void aumentarPrestigio(int valor);
    void diminuirPrestigio(int valor);
}

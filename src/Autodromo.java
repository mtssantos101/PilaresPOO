public class Autodromo {
    public static void main(String[] args) {
        carro civic= new carro();
        civic.ligar();
        civic.andar();
        civic.darre();
        civic.setChassi("184355");

        moto pcx= new moto();
        pcx.setChassi("315611");
        pcx.ligar();

    }
}

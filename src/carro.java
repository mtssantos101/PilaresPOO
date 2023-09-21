public class carro extends Veiculo {

    public void ligar(){
        conferircombustivel();
        conferindocambio();
        System.out.println("carro ligado");
    }
    private void conferircombustivel(){
        System.out.println("tanque cheio");
    }
    private void conferindocambio(){
        System.out.println("conferindo câmbio");
    }
    public void andar(){
        System.out.println("carro está andando");
    }
    public void darre(){
        System.out.println("carro está dando ré");
    }
}

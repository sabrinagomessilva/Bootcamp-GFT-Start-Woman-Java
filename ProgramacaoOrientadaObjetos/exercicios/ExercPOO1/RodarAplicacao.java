package dio.poo;

public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("azul");
        carro1.setModelo("corola");
        carro1.setCapacidadeTanque(10);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.totalValorTanque(10));

        //exemplo com o construtor com parâmetros

        Carro carro2 = new Carro("amarelo", "Uno", 40);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(10));

    }

}

package dio.com.exercicios.loops;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando programa");

        Animal animal = new Animal();

        animal.peso = 1.0d;

        System.out.println(animal);
        System.out.println(animal.DadosResumidos());
        animal.tempoRegistro();

    }
}

package dio.colletctions.Map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
            put("corola", 16.1);

        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("\nConfira se o modelo uno está no dicionário: " + carrosPopulares.containsKey("uno"));

        System.out.println("\nExiba Consuma do Uno: " + carrosPopulares.get("uno"));
        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\nExiba o modelo mais econômicos e o seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        System.out.println(consumoMaisEficiente);

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        //System.out.println(entries);
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("\nO modelo mais eficiente é: " + modeloMaisEficiente + "- " + consumoMaisEficiente);


            }


        }

        //System.out.println("\nExiba o modelo menos econômico e o seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = " ";
        for (Map.Entry<String, Double>entry: carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("\nModelo menos eficiente e o seu consumo: " + modeloMenosEficiente + "- " + consumoMenosEficiente);
            }


        }


        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while ((iterator.hasNext())) {
            soma += iterator.next();
        }

        System.out.println("\nExiba a soma dos consumos: " + soma);

        System.out.println("\nExiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));


        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();

        }

        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("\nApague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("\nConfira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}


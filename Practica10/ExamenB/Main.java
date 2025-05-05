import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Ambiente amazonia = new Ambiente("Tropical", 28.0, "Arcilloso", 
                                      new String[]{"Rio Amazonas", "Montañas Andes"});
        Ambiente sahara = new Ambiente("Desértico", 38.0, "Arenoso", 
                                     new String[]{"Océano Atlántico", "Cordillera Atlas"});

        
        Planta orquidea = new Planta("Orchidaceae", "Orchidaceae", 
                                    new String[]{"Sudamérica", "Centroamérica"}, 8);
        Planta cactus = new Planta("Cactaceae", "Caryophyllales", 
                                 new String[]{"Desiertos América"}, 9);

        
        List<Planta> plantas = new ArrayList<>();
        plantas.add(orquidea);
        plantas.add(cactus);

        List<Ambiente> ambientes = new ArrayList<>();
        ambientes.add(amazonia);
        ambientes.add(sahara);

        EstudioDistribucion estudio = new EstudioDistribucion(
            plantas.toArray(new Planta[0]), 
            ambientes.toArray(new Ambiente[0]), 
            2020
        );

        
        System.out.println("=== Análisis de dispersión ===");
        Map<String, String> patrones = estudio.analizarPatronesDispersion();
        patrones.forEach((planta, dispersion) -> 
            System.out.println(planta + ": " + dispersion)
        );

        System.out.println("\n=== Comparación histórica ===");
        estudio.compararConDatosHistoricos().forEach(System.out::println);

       
        System.out.println("\n=== Simulación cambio climático (+5°C) ===");
        amazonia.simularCambioClimatico(5);
        System.out.println("Nuevo clima en Amazonia: " + amazonia.getTipoClima());
    }
}
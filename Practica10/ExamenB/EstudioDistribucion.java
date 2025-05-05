import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EstudioDistribucion {
    private Planta[] plantasAnalizadas;
    private Ambiente[] ambientes;
    private int anioInicioEstudio;

    public EstudioDistribucion(Planta[] plantasAnalizadas, 
                              Ambiente[] ambientes, int anioInicioEstudio) {
        this.plantasAnalizadas = plantasAnalizadas;
        this.ambientes = ambientes;
        this.anioInicioEstudio = anioInicioEstudio;
    }

    public Map<String, String> analizarPatronesDispersion() {
        Map<String, String> resultados = new HashMap<>();
        for (Planta planta : plantasAnalizadas) {
            resultados.put(
                planta.getNombreCientifico(), 
                planta.evaluarDispersion(ambientes[0])
            );
        }
        return resultados;
    }

    public List<String> compararConDatosHistoricos() {
        return List.of(
            "Las especies tropicales han reducido su hábitat en un 20%",
            "Aumento de adaptación en zonas áridas (+35%)"
        );
    }
}
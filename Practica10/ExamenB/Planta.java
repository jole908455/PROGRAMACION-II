class Planta {
    private String nombreCientifico;
    private String familia;
    private String[] regionesNativas;
    private int resistenciaClimatica;

    public Planta(String nombreCientifico, String familia, 
                 String[] regionesNativas, int resistenciaClimatica) {
        this.nombreCientifico = nombreCientifico;
        this.familia = familia;
        this.regionesNativas = regionesNativas;
        this.resistenciaClimatica = resistenciaClimatica;
    }

    public boolean adaptarseAClima(Ambiente ambiente) {
        for (String region : regionesNativas) {
            if (region.toLowerCase().contains(ambiente.getTipoClima().toLowerCase())) {
                return true;
            }
        }
        return resistenciaClimatica >= 5;
    }

    public String evaluarDispersion(Ambiente ambiente) {
        return (ambiente.getBarrerasGeograficas().length > 1) ? "Dispersión Limitada" : "Dispersión Amplia";
    }

   
    public String getNombreCientifico() { return nombreCientifico; }
    public String[] getRegionesNativas() { return regionesNativas; }
}
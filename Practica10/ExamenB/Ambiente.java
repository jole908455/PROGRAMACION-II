class Ambiente {
    private String tipoClima;
    private double temperaturaPromedio;
    private String tipoSuelo;
    private String[] barrerasGeograficas;

    public Ambiente(String tipoClima, double temperaturaPromedio, 
                   String tipoSuelo, String[] barrerasGeograficas) {
        this.tipoClima = tipoClima;
        this.temperaturaPromedio = temperaturaPromedio;
        this.tipoSuelo = tipoSuelo;
        this.barrerasGeograficas = barrerasGeograficas;
    }

    public String generarReporteImpacto() {
        int impacto = barrerasGeograficas.length * 15;
        return String.format("Barreras geográficas reducen biodiversidad en %d%%", impacto);
    }

    public void simularCambioClimatico(double deltaTemp) {
        this.temperaturaPromedio += deltaTemp;
        if (temperaturaPromedio > 35) this.tipoClima = "Árido Extremo";
        else if (temperaturaPromedio > 30) this.tipoClima = "Árido";
    }

 
    public String getTipoClima() { return tipoClima; }
    public String[] getBarrerasGeograficas() { return barrerasGeograficas; }
}
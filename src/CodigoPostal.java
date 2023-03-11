public class CodigoPostal {
    private String indicativo;
    private String extensão;
    private String nomeDaZona;

    public CodigoPostal(String indicativo, String extensão, String nomeDaZona) {
        this.indicativo = indicativo;
        this.extensão = extensão;
        this.nomeDaZona = nomeDaZona;
    }

    public String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }

    public String getExtensão() {
        return extensão;
    }

    public void setExtensão(String extensão) {
        this.extensão = extensão;
    }

    public String getNomeDaZona() {
        return nomeDaZona;
    }

    public void setNomeDaZona(String nomeDaZona) {
        this.nomeDaZona = nomeDaZona;
    }

    @Override
    public String toString() {
        return indicativo + "-" + extensão + " " + nomeDaZona;
    }
}

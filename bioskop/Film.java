public class Film {
    private String judul; // atribut
    private String jadwalTayang; // atribut
    private double harga; // atribut

    // konstruktor
    public Film(String judul, String jadwalTayang, double harga) {
        this.judul = judul;
        this.jadwalTayang = jadwalTayang;
        this.harga = harga;
    }

    // Getter
    public String getJudul() {
        return judul;
    }

    public String getJadwalTayang() {
        return jadwalTayang;
    }

    public double getHarga() {
        return harga;
    }

    // Setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setJadwalTayang(String jadwalTayang) {
        this.jadwalTayang = jadwalTayang;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}

public class Pemesanan {
    private Pelanggan pelanggan;
    private Tiket tiket;
    private double totalHarga; // atribut

    // kosntruktor
    public Pemesanan(Pelanggan pelanggan, Tiket tiket) {
        this.pelanggan = pelanggan;
        this.tiket = tiket;
        this.totalHarga = tiket.getFilm().getHarga() * tiket.getJumlah();
    }

    // getter
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    // setter
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

}

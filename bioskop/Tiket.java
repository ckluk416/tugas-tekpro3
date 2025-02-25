public class Tiket {
    private Film film;
    private int jumlah;

    public Tiket(Film film, int jumlah) {
        this.film = film;
        this.jumlah = jumlah;
    }

    // Getter
    public Film getFilm() {
        return film;
    }

    public int getJumlah() {
        return jumlah;
    }

    // Setter
    public void setFilm(Film film) {
        this.film = film;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
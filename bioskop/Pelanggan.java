public class Pelanggan {
    private String nama; // atribut
    private String email; // atribut

    // konstruktor
    public Pelanggan(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

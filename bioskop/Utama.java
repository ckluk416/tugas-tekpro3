public class Utama {
    public static void main(String[] args) {
        Film film1 = new Film("Das Boot", "20:00", 50000);
        Pelanggan pelanggan1 = new Pelanggan("Gunther Lutjens", "guntherbismarck@kriegsmarine.de");
        Tiket tiket1 = new Tiket(film1, 2);
        Pemesanan pemesanan1 = new Pemesanan(pelanggan1, tiket1);
        
        System.out.println("Pelanggan: " + pelanggan1.getNama());
        System.out.println("Film: " + film1.getJudul());
        System.out.println("Total Harga: Rp. " + pemesanan1.getTotalHarga());
    }
}

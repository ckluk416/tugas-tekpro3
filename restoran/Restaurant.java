// public class Restaurant {
//     public String[] nama_makanan;
//     public double[] harga_makanan;
//     public int[] stok;
//     public static byte id = 0;
public class Restaurant {
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private int id;

//     public Restaurant() {
//         nama_makanan = new String[10];
//         harga_makanan = new double[10];
//         stok = new int[10];
//     }
    public Restaurant() {
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
        id = 0;
    }

// //     public void tambahMenuMakanan(String nama, double harga, int stok) {
// //         this.nama_makanan[id] = nama;
// //         this.harga_makanan[id] = harga;
// //         this.stok[id] = stok;
// //     }
//     public void tambahMenuMakanan(String nama, double harga, int stok) {
//         this.namaMakanan[id] = nama;
//         this.hargaMakanan[id] = harga;
//         this.stok[id] = stok;
//         id++;
//     }
    public void tambahMenuMakanan(String nama, double harga, int stok) {
      if (stok >= 0) {
         this.namaMakanan[id] = nama;
         this.hargaMakanan[id] = harga;
         this.stok[id] = stok;
         id++;
       } else {
          System.out.println("Stok tidak valid");
       }
    }

//     public void tampilMenuMakanan() {
//         for (int i = 0; i <= id; i++) {
//             if (!isOutOfStock(i)) {
//                 System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
//             }
//         }
//     }
    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(namaMakanan[i] + "[" + stok[i] + "]" + "\tRp. " + hargaMakanan[i]);
            }
        }
    }

//     public boolean isOutOfStock(int id) {
//         if (stok[id] == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public boolean pesanMakanan(String nama, int jumlah) {
        for (int i = 0; i < id; i++) {
            if (namaMakanan[i].equals(nama) && stok[i] >= jumlah) {
                stok[i] -= jumlah;
                System.out.println("Pesanan berhasil: " + nama + " sebanyak " + jumlah);
                return true;
            }
        }
        System.out.println("Stok " + nama + " tidak mencukupi atau " + nama + " tidak ditemukan");
        return false;
    }
}
//     public static void nextId() {
//         id++;
//     }
// }

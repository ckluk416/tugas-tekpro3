// public class RestaurantMain {
//     public static void main(String[] args) {
//         Restaurant menu = new Restaurant();
//         menu.tambahMenuMakanan("Bala-Bala", 1000, 20);
//         Restaurant.nextId();
//         menu.tambahMenuMakanan("Gehu", 1000, 20);
//         Restaurant.nextId();
//         menu.tambahMenuMakanan("Tahu", 1000, 0);
//         Restaurant.nextId();
//         menu.tambahMenuMakanan("Molen", 1000, 20);
//         menu.tampilMenuMakanan();
//     }
// }
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1000, 20);
        menu.tambahMenuMakanan("Gehu", 1000, 20);
        menu.tambahMenuMakanan("Tahu", 1000, 0);
        menu.tambahMenuMakanan("Molen", 1000, 20);
        menu.tampilMenuMakanan();

        // Pemesanan makanan
        menu.pesanMakanan("Bala-Bala", 5);
        menu.pesanMakanan("Tahu", 2); // Stok tidak mencukupi
        menu.tampilMenuMakanan();
    }
}

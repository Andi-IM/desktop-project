public class Mulai {
    public static void main(String[] args) {
        System.out.println("Belajar Github");
        System.out.println();
        // tampilkan("Hakkan");

        new Hakkan().tampilkan(); // cara singkat untuk memanggil objek
        
        Andi andi = new Andi();
        andi.tampilkan(); // memanggil interface untuk memanggil nama "Andi"
    }

    public static void tampilkan(String nama){
        System.out.println(nama);
    }
}


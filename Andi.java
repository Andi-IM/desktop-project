
public class Andi implements GetItem{

    private static String nama = "Andi Irham";

    public static String getNama() {
        return nama;
    }

    @Override
    public void tampilkan(){
        System.out.println(getNama());
    }
}

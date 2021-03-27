public class Hakkan implements GetItem{
    private  static String nama = "Hakkan";

    public static  String getNama(){
        return nama;
    }

    @Override
    public void tampilkan(){
        System.out.println(getNama());
    }
}

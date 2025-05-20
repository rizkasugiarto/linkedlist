public class siswa {
    String nama;
    siswa berikutnya;

    // karena kita buat constructor sendiri, 
    // maka default constructor tidak dibuatkan oleh JVM
    /*
    public Siswa(){

    }
     */

    public siswa(String x){
        nama = x;
    }
}
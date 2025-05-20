public class demoKelas {
    public static void main(String[] args) {
        siswa Rizka = new siswa("Rizka");

        Kelas k = new Kelas(Rizka);

        siswa rizka = (new siswa ("Rizka"));
        k.tambahDiBelakang(new siswa ("Rizka"));
        k.tambahDiBelakang(new siswa("Dea"));
        k.tambahDiBelakang(new siswa("Intan"));
        k.tambahDiBelakang(new siswa("Namara"));
        k.hapus("Rizka");
        k.tampilkansemua(); 

        System.out.println("jumlah siswa: " + k.jumlahsiswa());
        System.out.println("urutan Rizka: " + k.urutan("Rizka"));
        System.out.println("siswa di index 2: " + k.ambilDi(2).nama);

        k.hapus("Rizka");
        System.out.println("setelah hapus Rizka:");
        k.tampilkansemua();
    }
}
public class KeluargaMain {
    public static void main(String[] args) {
        Ibu ibu = new Ibu("Ibu ratna ", 40);
        Ayah ayah = new Ayah("bapak heri", 45);
        Adik adik = new Adik("adik saya justin", 13, "Pendidikan di pondok pesantren");
        Saya saya = new Saya("jefri", 20, "Berkuliah semester 4");

        ibu.bekerja("pedagang");
        ayah.bekerja("pedagang");
        
        System.out.println("Umur ibu saya adalah " + ibu.umur + " tahun");
        System.out.println("Umur ayah saya adalah " + ayah.umur + " tahun");
        System.out.println(adik.nama + " berumur " + adik.umur + " tahun sedang " + adik.statusPendidikan);
        System.out.println(saya.nama + " berumur " + saya.umur + " tahun sedang " + saya.statusKuliah);
    }
}
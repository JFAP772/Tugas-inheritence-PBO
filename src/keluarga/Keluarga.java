class Keluarga {
    String nama;
    int umur;

    public Keluarga(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void bekerja(String pekerjaan) {
        System.out.println(nama + " bekerja sebagai " + pekerjaan);
    }
}

class Ibu extends Keluarga {
    public Ibu(String nama, int umur) {
        super(nama, umur);
    }
}

class Ayah extends Keluarga {
    public Ayah(String nama, int umur) {
        super(nama, umur);
    }
}

class Adik extends Keluarga {
    String statusPendidikan;

    public Adik(String nama, int umur, String statusPendidikan) {
        super(nama, umur);
        this.statusPendidikan = statusPendidikan;
    }
}

class Saya extends Keluarga {
    String statusKuliah;

    public Saya(String nama, int umur, String statusKuliah) {
        super(nama, umur);
        this.statusKuliah = statusKuliah;
    }
}



package FileUTSBimaa;

public class RekeningBima01 {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;

    public RekeningBima01(String a, String b, String c, String d, String e) {
        this.noRekening = a;
        this.nama = b;
        this.namaIbu = c;
        this.phone = d;
        this.email = e;
    }

    public String getNama() {
        return nama;
    }
}

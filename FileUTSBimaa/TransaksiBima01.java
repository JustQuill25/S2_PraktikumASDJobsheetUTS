package FileUTSBimaa;

public class TransaksiBima01 {
    String noRekening;
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;

    public TransaksiBima01(String a, double b, double c, double d, String e) {
        this.noRekening = a;
        this.saldo = b;
        this.saldoAwal = c;
        this.saldoAkhir = d;
        this.tanggalTransaksi = e;
    }
}

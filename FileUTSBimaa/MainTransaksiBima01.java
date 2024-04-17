package FileUTSBimaa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class MainTransaksiBima01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<RekeningBima01> rekenings = new ArrayList<>();
        ArrayList<TransaksiBima01> transaksis = new ArrayList<>();

        // Data Rekening
        rekenings.add(new RekeningBima01("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263",
                "ligula.Nullam@tacitisociosqu.edu"));
        rekenings.add(new RekeningBima01("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547",
                "nec@lectusjusto.org"));
        rekenings.add(new RekeningBima01("16240401 2243", "Fuller", "Finn Dunlap", "571-7062",
                "convallis@Vestibulumanteipsum.org"));
        rekenings.add(new RekeningBima01("16270525 0112", "Malcolm", "Keane Floyd", "623-0234",
                "porttitor.tellus.non@Curabitur.ca"));
        rekenings.add(new RekeningBima01("16971204 2416", "Geofrey", "Stephen Pratt", "1-683-416-8323",
                "ut.pellentesque@luctusutpellentesque.com"));

        // Data Transaksi
        transaksis.add(new TransaksiBima01("16030927 3084", 898214, 494048, 3587, "2021-03-09 07:54:42"));
        transaksis.add(new TransaksiBima01("16100617 0573", 205420, 200162, 775880, "2021-06-25 10:23:00"));
        transaksis.add(new TransaksiBima01("16240401 2243", 838632, 350929, 328316, "2021-09-18 23:00:04"));
        transaksis.add(new TransaksiBima01("16270525 0112", 230659, 204434, 690503, "2022-02-02 19:10:34"));
        transaksis.add(new TransaksiBima01("16971204 2416", 770592, 334245, 444267, "2020-08-11 13:36:56"));

        int choice = 0;
        while (choice != 5) {
            System.out.println("==========================");
            System.out.println("      UTS PUNYA BIMA      ");
            System.out.println("==========================");
            System.out.println();
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Pilih ( 1 - 5 ) : ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Pilihan 1:");
                    System.out.println("No Rekening\tNama\t\tNama Ibu\t\tPhone\t\t\tEmail");
                    for (RekeningBima01 rekening : rekenings) {
                        System.out.println(
                                rekening.noRekening + "\t" + rekening.nama + "\t\t" + rekening.namaIbu + "\t\t" +
                                        rekening.phone + "\t\t" + rekening.email);
                    }
                    break;
                case 2:
                    System.out.println("Pilihan 2:");
                    System.out.println("No Rekening\tSaldo\t\tSaldo Awal\tSaldo Akhir\tTanggal Transaksi");
                    for (TransaksiBima01 transaksi : transaksis) {
                        System.out.println(
                                transaksi.noRekening + "\t" + transaksi.saldo + "\t" + transaksi.saldoAwal + "\t" +
                                        transaksi.saldoAkhir + "\t" + transaksi.tanggalTransaksi);
                    }
                    break;
                case 3:
                    System.out.println("Pilihan 3:");
                    System.out.println("No Rekening\tSaldo\t\tSaldo Awal\tSaldo Akhir\tTanggal Transaksi");
                    for (TransaksiBima01 transaksi : transaksis) {
                        if (transaksi.saldo > 500000) {
                            System.out.println(
                                    transaksi.noRekening + "\t" + transaksi.saldo + "\t" + transaksi.saldoAwal + "\t" +
                                            transaksi.saldoAkhir + "\t" + transaksi.tanggalTransaksi);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Pilihan 4:");
                    System.out.println("No Rekening\tNama\t\tNama Ibu\t\tPhone\t\t\tEmail");
                    Collections.sort(rekenings, Comparator.comparing(RekeningBima01::getNama));
                    for (RekeningBima01 rekening : rekenings) {
                        System.out.println(
                                rekening.noRekening + "\t" + rekening.nama + "\t\t" + rekening.namaIbu + "\t\t" +
                                        rekening.phone + "\t\t" + rekening.email);
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka dari 1 hingga 5.");
                    break;
            }
        }
        scanner.close();
    }
}

import java.util.Scanner;

abstract class Pasien {
    protected String kdPasien;
    protected String namaPasien;
    protected int biayaObat;
    
    void biayaDokter() {
        }
    void diskon() {
        }
}
class PasienRawatJalan extends Pasien {
    int biayaKonsultasi;
    int kedatanganPasien;
    int biayaPeriksa;
    int diskon;
    int biayaDokter;
    int totalBiaya;
    public Scanner masuk = new Scanner (System.in);
    
    void PasienRawatJalan() {
        System.out.print("Kode Pasien : ");
        kdPasien = masuk.nextLine();
        System.out.print("Nama Pasien : ");
        namaPasien = masuk.nextLine();
        System.out.print("Biaya Obat Pasien : ");
        biayaObat = masuk.nextInt();
        System.out.print("Biaya Konsultasi : ");
        biayaKonsultasi = masuk.nextInt();
        System.out.print("Jumlah Kedatangan Pasien : ");
        kedatanganPasien = masuk.nextInt();
    }
    void biayaDokter() {
        biayaDokter = biayaKonsultasi + 10000;
    }
    void diskon() {
        if (kedatanganPasien >= 5) diskon = 20000;
        else diskon = 0;
    }
    void totalBiaya() {
        totalBiaya =  (biayaObat + biayaDokter - diskon);
    }
    void info(){
        biayaDokter();
        diskon();
        totalBiaya();
        System.out.println("Kode Pasien : " + kdPasien+"\nNama Pasien : " + namaPasien);
        System.out.println("===============================================");
        System.out.println("Biaya Dokter (Biaya konsul + Administrasi 10000) : " + biayaDokter+"\nDiskon : "+diskon+"\nBiaya Total : "+totalBiaya);
    }
}
public class ProgramKasir {
    public static void main (String []args) {
        PasienRawatJalan pasien = new PasienRawatJalan();
        pasien.PasienRawatJalan();
        System.out.println("===============================================\n");
        pasien.info();
    }
}
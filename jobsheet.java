import java.util.Scanner;

public class jobsheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDoc, peringkatJuara;
        Boolean statusPendanaanPKM;

        System.out.print("Masukan nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA,BAKORMA,MANDIRI,PKM,LAINNYA) : ");
        jenisKegiatan = sc.nextLine().toUpperCase();

        if (jenisKegiatan.equals("BELMAWA") || jenisKegiatan.equals("BAKORMA") || jenisKegiatan.equals("MANDIRI")) {
            System.out.print("Peringkat juara : ");
            peringkatJuara = sc.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                System.out.print("Jumlah dokumen yang di upload  (0-4) : ");
                jumlahDoc = sc.nextInt();

                if (jumlahDoc == 4) {
                    System.out.println("dana penghargaan di berikan");
                } else {
                    System.out.println("Anda tidak di berikan dana");
                    System.out.println("dokumen tidak lengkap (kurang " + (4 - jumlahDoc) + " dokumen). Dana penghargaan tidak di berikan ");
                }
            }
        } else if (jenisKegiatan.equals("PKM")) {
            System.out.print("Stataus Pendanaan : ");
            statusPendanaanPKM = sc.nextBoolean();

            if (statusPendanaanPKM) {
                System.out.println("Dana di berikan");
            } else {
                System.out.println("Dana tidak di berikan");
            }
        } else {
            System.out.println("Tidak memperoloeh dana penghargaan");
            System.out.println("Silahkan anda meilih cabang lomba yang lain");
        }
    }
}

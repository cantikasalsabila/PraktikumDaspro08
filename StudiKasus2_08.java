import java.util.Scanner;

public class StudiKasus2_08{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa  : ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = input.nextLine().trim().toUpperCase();
        System.out.print("Jumlah dokumen  : ");
        int dokumen = Integer.parseInt(input.nextLine().trim());

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Peringkat juara : ");
            int peringkat = Integer.parseInt(input.nextLine().trim());

            if (peringkat >= 1 && peringkat <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
        } 
        input.close();
    }
}
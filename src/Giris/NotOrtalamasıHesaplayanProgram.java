import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat, turkce, fizik, kimya, muzik, tarih;

        //Scanner sınıfımızı tamamladık
        Scanner inp= new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        int Toplam = (mat + turkce + fizik + kimya + tarih + muzik);
        double sonuc = Toplam / 6;
        System.out.println("Ortalamanız : " + sonuc);

        boolean kosul = 60 < sonuc;

        String vStr = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(vStr);


    }
}

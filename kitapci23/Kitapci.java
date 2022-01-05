package kitapci23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapci {
    static Scanner scan =new Scanner(System.in);
    static int kitapNo=1000;
static List<Kitap> kitap=new ArrayList<>();

    public static void main(String[] args) {
     menu(kitap);

    }
    public static void menu(List<Kitap>kitap){
        System.out.println("*******kitapciya hosgeldiniz**************");
        System.out.println("yapmak istediginiz islemi seciniz\n1:listele\n2:kitap ekle\n3:sil\n4:cikis");
String secim= scan.next();
switch (secim){
    case "1": listeleme(kitap);
    break;
    case "2": ekle(kitap);
        break;
    case "3": sil(kitap);
       break;
    case "4": cikis();
        break;
    default:
        System.out.println("hatali giris yaptin adam gibi gir ");
}
    }

    private static void sil(List<Kitap> kitap) {


        System.out.println("silmek istediginiz kitap no");
        int silinecekNo= scan.nextInt();
        for (Kitap w:kitap
             ) {
            if (w.getNo()==silinecekNo){
                kitap.remove(w);
                System.out.println(silinecekNo+"nolu kitap silindi");
            }else {
                System.out.println("girdiginiz no da kitap bulunamadi");
            }
            menu(kitap);
        }






    }


    private static void listeleme(List<Kitap> kitap) {
        if (!kitap.isEmpty()){
            System.out.println(kitap.toString());
        }
    else {
            System.out.println("goruntulenecek kitap yok");
        }
        menu(kitap);


    }

    public static void cikis(){
    System.out.println("bi daha bekleriz ");

}

    public static void ekle(List<Kitap>kitap){
Scanner scan=new Scanner(System.in);
        System.out.println("eklemek istediginiz kitabin adini giriniz ");
        String kitapAdi= scan.next();

        System.out.println("yazar adini giriniz");
        String yazar=scan.next();

        System.out.println("yayinyilini giriniz");
   int yayin= scan.nextInt();
        System.out.println("kitap fiyatini giriniz");
   double fiyat= scan.nextDouble();

  Kitap obj=new Kitap(++kitapNo,kitapAdi,yazar,yayin,fiyat);
   kitap.add(obj);
        System.out.println(kitap.toString()+" eklendi");
        menu(kitap);


    }




}

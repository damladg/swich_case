import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        //ÖDEV: Hesap makinesini switch-case kullanarak yapınız.

        int sayi1,sayi2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = scan.nextInt();
        System.out.println("Yapmak istediğiniz işlemi giriniz:\n"+"Toplam için :1\n" +
                "Çıkarma için :2\n" + "Çarpma için :3\n" + "Bölme için :4\n" );
        int secim = scan.nextInt();

        switch(secim){
            case 1:
                System.out.print("TOPLAM: " + (sayi1+sayi2));
                break;

            case 2:
                System.out.print("ÇIKARMA: " + (sayi1-sayi2));
                break;

            case 3:
                System.out.print("ÇARPMA: " + (sayi1*sayi2));
                break;

            case 4:
                System.out.print("BÖLME: " + (sayi1/sayi2));
                break;

            default:
                System.out.println("İşlem geçersiz! Geçerli sayıyı giriniz ! ");




        }




    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen doğum tarihinizi gün ve ay şeklinde giriniz.");

        System.out.print("Doğduğunuz gün:");
        day = input.nextInt();

        System.out.print("Doğduğunuz ay:");
        month = input.nextInt();


        if (day < 32) {
            switch (month) {
                case 1:
                    if ((day >= 1) && (day < 22)) {
                        System.out.println("Oğlak Burcusunuz!");
                    } else {
                        System.out.println("Kova Burcusunuz!");
                    }

                    break;

                case 2:
                    if ((day >= 1) && (day < 20)) {
                        System.out.println("Kova Burcusunuz!");
                    } else {
                        System.out.println("Balık Burcusunuz!");
                    }
                    break;

                case 3:
                    if ((day >= 1) && (day < 21)) {
                        System.out.println("Balık Burcusunuz!");
                    } else {
                        System.out.println("Koç Burcusunuz!");
                    }
                    break;

                case 4:
                    if ((day >= 1) && (day < 21)) {
                        System.out.println("Koç Burcusunuz!");
                    } else {
                        System.out.println("Boğa Burcusunuz!");
                    }
                    break;

                case 5:
                    if ((day >= 1) && (day < 23)) {
                        System.out.println("Boğa Burcusunuz!");
                    } else {
                        System.out.println("İkizler Burcusunuz!");
                    }
                    break;

                case 6:
                    if ((day >= 1) && (day < 23)) {
                        System.out.println("İkizler Burcusunuz!");
                    } else {
                        System.out.println("Yengeç Burcusunuz!");
                    }
                    break;

                case 7:
                    if ((day >= 1) && (day < 23)) {
                        System.out.println("Yengeç Burcusunuz!");
                    } else {
                        System.out.println("Aslan Burcusunuz!");
                    }
                    break;

                case 8:
                    if ((day >= 1) && (day < 23)) {
                        System.out.println("Aslan Burcusunuz!");
                    } else {
                        System.out.println("Başak Burcusunuz!");
                    }
                    break;

                case 9:
                    if ((day >= 1) && (day < 23)) {
                        System.out.println("Başak Burcusunuz!");
                    } else {
                        System.out.println("Terazi Burcusunuz!");
                    }
                    break;

                case 10:
                    if ((day >= 1) && (day < 23)) {
                        System.out.println("Terazi Burcusunuz!");
                    } else {
                        System.out.println("Akrep Burcusunuz!");
                    }
                    break;

                case 11:
                    if ((day >= 1) && (day < 21)) {
                        System.out.println("Akrep Burcusunuz!");
                    } else {
                        System.out.println("Yay Burcusunuz!");
                    }
                    break;

                case 12:
                    if ((day >= 1) && (day < 21)) {
                        System.out.println("Yay Burcusunuz!");
                    } else {
                        System.out.println("Oğlak Burcusunuz!");
                    }
                    break;

                default:
                    System.out.println("Hatalı Giriş Yaptınız!");
            }
        } else {
            System.out.println("Hatalı Giriş Yaptınız!");
        }

    }

}

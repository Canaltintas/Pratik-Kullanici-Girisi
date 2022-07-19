import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String user,pass,resetPass;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        user = input.nextLine();
        System.out.print("Şifre : ");
        pass=input.nextLine();

        if (user.equals("patika") && pass.equals("java101")){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Kullanıcı adı/Şifre Hatalı!");
            System.out.print("Şifrenizi Sıfırlamak İstermisiniz (E / H) :" );
            resetPass=input.nextLine();
            if (resetPass.equals("E")){
                System.out.print("Yeni Sifreyi Giriniz :");
                pass=input.nextLine();
                if (pass.equals("java101")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu");
                }
            }else{
                System.out.println("Hayır veya Hatalı Seçim.");
            }
        }

    }
}

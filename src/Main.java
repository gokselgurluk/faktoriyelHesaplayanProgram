import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!) formül
        int nFak=1,rFak=1,nrFak=1 ,C,n,r;

        Scanner inp =new Scanner(System.in);

        System.out.println("n faktöreilyeli yazınız");
            n  = inp.nextInt();

        System.out.println("r faktöreilyeli yazınız");
            r = inp.nextInt();

            for(int i =1 ;i<=n; i++){ //n elamanın faktöriyeli nFak degerine atadık

                nFak *= i;
            }
            for(int i =1 ;i<=r; i++) { //r elemanın faktöriyeli rFak degerine atadık

                rFak *= i;
            }
            for(int i =1 ;i<=(n-r); i++){ //n-r nin faktöriyeli  nrFak degerine atadık

                nrFak *= i;
            }

            C=nFak/(rFak*(nrFak)); // formule göre hesaplama yaptık
        System.out.println("C(n,r) Kombinasyonu\n"+C); // sonucu kullanıcıya göstermek için ekrana bastırdık

    }
}
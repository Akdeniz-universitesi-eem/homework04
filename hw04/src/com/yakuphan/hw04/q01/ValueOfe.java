package com.yakuphan.hw04.q01;
/* 1) Unit Test nedir? Neden Unit Test yaparız? Unit Test Frameworkları listeleyiniz. Unit Test için
uyulması gereken kuralları belirtiniz.

Unit test bir yazılımın en küçük yazılım testidir. Tek bir kod parçasının beklendiği gibi
çalıştığını gözlemlemek için kullanılır.

Unit test yazılımın geliştiricileri tarafından yapılır. Unit test yazılan kod parçalarının
her parçasının tasarlandığı şekilde çalıştığını doğrular. Bu durum kodda düzenleme yapmayı
kolaylaştırır. Fakat unit testler tüm hataları ortaya çıkarmayabilir. Program kodları tek tek
çalışırken bir araya geldiğinde düzenli olarak çalışmayabilir.

Unit test Frameworkleri; Robot framework, JUnit, Spock, TestNG, Jasmin, Mocha.

Unit testler yazılırken dikkat edilmesi gereken bazı maddeler vardır:
1. En küçük parcacığı test edilmeli
2. Sadece bir senaryo ile test edilir
3. Kullanılan adımlar belirlenir
4. Test metodu ismi test edilen kod parçasının senaryosunun yansıması olmalıdır.
5. Test edilen kısım diğer kısımlardan bağımsız olmalıdır.
6. Testlerimiz tam otomatik şekilde çalışmalı.
7. Hızlı ve çabuk sonuçlar vermeli.
8. Okunaklı, anlaşılabilir ve sürdürebilir olmaldır.
9. Test başarısız olduğunda durmalı ve hata raporunu iyi şekilde döndürmelidir.
 --------------------------------------------------------------------------------------------------- */

/* 2) Design patern nedir? Kaç tipi vardır her tipe 2 adet örnek veriniz?

Design patterns yani tasarım kalıpları, yazılım geliştirmede yaygın olarak
karşılaşılan zorluklar için yeniden kullanılabilir nesne yönelimli yazılımlardır.
Yinelenen tasarım sorunlarına zaman içinde test edilmiş yanıtlardır.
Hem bir çözümün açıklamasını hem de belirli bir sorunu ele alırken kullanımını açıklar.

Tasarım kalıpları 3 tipe ayrılır. Bunlar yaratıcı, yapısal ve davranışsal tasarım kalıplarıdır.
Yaratıcı tasarım kalıplarına örnek olarak Factory Yöntemi, Prototip verilebilir.
Yapısal tasarım kalıplarına örnek olarak Flyweight, Proxy verilebilir.
Davranışsal tasarım kalıplarına örnek olarak da Memento, Şablon Yöntemi verilebilir.

---------------------------------------------------------------------------------------------------- */

import java.util.Scanner;

public class ValueOfe {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter sensitivity level:");
        //We take input from the user to find out how precisely the e value should be measured
        int x= inp.nextInt(); //We assign the received variable to an int value
        System.out.println("Value of e=" + findSens(x));
        //We insert this value into the findsens method.
    }
    public static double findSens(int x){

        double e=1; //We create a double variable e
        double sum;
        //We create the sum variable to collect the operations returned in the loop and assign it to the value e

        for(int i=1; i<=x; i++){
            sum=1;
            for(int j=1; j<=i; j++){
                sum = sum * 1/(double)(j); //factorial calculus
            }
            e += sum; //We assign it to the value of e
        }
        return e;
    }


}
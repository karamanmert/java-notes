package bastan_Basla_2.Exception1;

/*
runtime errorler: exception thrown edilerek çözülür.

Exceptionlar try catch yada methodlarda handle edilmek zorunda.(1-2)

throw new Exception("buna; throwing an exception" denir.)

Throwable class Exception classının superclassıdır.

Eğer kendi exceptionumuzu yazmak istersek, Exception u extend edip yazabiliriz.

System Errors:(Error)JVM tarafından yakalanır

Exception: Bizim yazdığımız koddaki hatalar.

Error, RuntimeException ve alt sınıfları unchecked exceptions olarak bilinirler.

Diğer tüm exceptionlar ise checked exceptionslardır.

Checked exception: program kullanıcıyı try catch blogunda hatayı kontrol edip düzelmesi için zorlar.
yada method başlıgında başlığında belirtmesi gerekir.

Unchecked ex. programda her yerde karşımıza çıkaiblir. Ama try catch kullanmak hantallık oldugu için
java kullanmamızı zorunlu kılmaz.unchecked de.

Eğer bir method exception fırtacaksa bunu belirtmelidir. Buna declaring exception denir.

Uncheckedlerde doğrudan belirmemize gerek yoktur.

Checkedlerde ise doğrudan belirtmemize gerek var
.Çünkü çağırdanın haberi olmalı(the caller of the method is informed of the exception.)

Program bir hatayı tespit ettiğinde hataya uygun (InputMissException) exceptionu throw eder.
Bu throwing an exception olarak binilir.

TheException ex = new TheException();
throw ex;
throw new TheException();
bu 2 ifade aynıdır. ya objeyi yaratırsın throw dersin yada tek satırda.
Exceptionun 2 constructorı vardır. 1 tanesi boş, diğeri ise String message olan. onada getMessage() ile erişilebilir.

Bir try bloğu ardından exceptionu yakalamadık için n adet catch blogu olabilir. hangisine uyarsa oraya girer.

try blogunda hatyayı buldugu an try blogunun kalanları çalıştırılmaz. direkt olarak exceptiona gidilir.
exceptionu çözen koda: Exception Handler denir.
Hata spesific bir methodda bulunmazsa geriye doğru arama yapılır.
(aritchmetikte bulamadı. runtimeex e baktı orada da yoksa excpe bakar bu şekilde geriye)

catch blokları sırayla incelenir.(n adet catch varsa)
Eğer catch de varsa catch bloğu çalıştırılır.
Yoksa handlerdaki methodlara bakılır.
Aranan hata methodlarda da yoksa consoldan error mesajı verilir.
Bu işlemlere catching an exception denir.

Catch blokları özelden genele doğru gitmelidir.
catch(aritth e)
catch(exception e) gibi

Multi catch var: catch (Exception1 | Exception2 | ... | Exceptionk ex)

Finally bloğu her zaman çalışır.


 */

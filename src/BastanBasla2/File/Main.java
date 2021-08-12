/*
File classı, dosya/klasör ismi alma, yeniden adlandırma, silme işlemlerini yapar.
Reading ve writing ile ilgili method içermez.

Dosya ismi string olmalıdır. "mert.txt" gibi
File ise filename ve directory path için bir wrapper classtır.
Yani:
new File("c:\\book") c:\book dizinine(Directory) bir File nesnesi oluşturur.
new File("c:\\book\\test.dat") -> c:\book\test.dat "dosyası" için bir File nesnesi oluşturur.

File'ın dosya oluşturmak için bir constuctorı yoktur.
Dosya isminin olup olmasına bakmaksızın bir file instance ı oluşturursun.
Ve exists() metodu ile olup olmadıgına bakarsın.

2 tip dosya vardır. text ve binary. biz texti incelicez.

Dosyaya yazı yazmak için PrintWriter'ı kullanırız.
PrintWriter output = new PrintWriter(filename); yazılacak dosyayı cons. olarak veririz.
print, printf, println methodlarını cagırabiliriz.
close ile kapat.

Programcılar dosyayı kapatmayı çoğu zaman unuturlar bunun için try-with-resources denilen
bir syntax vardır ve bu otomatik olarak dosyayı kapatır.
try (
// Create a file
PrintWriter output = new PrintWriter(file);
) {
// Write formatted output to the file
output.print("John T Smith ");
output.println(90);
output.print("Eric K Jones ");
output.println(85);
}

Dosyadan okumak için Scanner kullanılır.
Scanner input = new Scanner(new File(filename));
.next() methodu boşluk görene kadar .nextLine() ise satır sonuna kadar okur.
while(hasNext()) diyerek tüm dosya okuturlur. ve dosya kapatlır.

Pcdeki verileri okudugumuz gibi internetten de veri okuyabiliriz.
URLden bilgi okumak için;
URL objesi yarat,
const olarak adresi ver.
Sonra url.openStream() ile akışı başlat.(veri akışı) bunu da Scanner ile oku.
Scanner input = new Scanner(url.openStream());
bundan sonrasını Scannerin hasNext ve .nextleriyle hallet.


 */
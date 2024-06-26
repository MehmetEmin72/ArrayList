import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //  ArrayList

        ArrayList ListeDizisi=new ArrayList();// biz önce ArrayList yapısından bir nesne olüştürdük

        ListeDizisi.add("String değer");// ListeDizisi nesnemize 0. index olarak  string bir değer atadık

        ListeDizisi.add(72);// int tibinde bir değer verdik

        ListeDizisi.add(21.72);// float tipinde bir değer verdik

        // farklı veri tiplerinde veriler ArrayList yapısına eklenebiliyor

        ListeDizisi.add(3,"String");// biz burada index değerine göre Dizilistemize eleman ekleyebiliyoruz

        ListeDizisi.forEach(i-> System.out.println(i));// Liste dizimizi ekrana yzdırdık çıktılarını bakmak için

        // Eğer eklediğimşz bir indise eleman eklemeye kalkışsak kod ta hata vermez bunu yapabilir
        // ama ondan sonraki elemanları bir birim yana kaydırarak ilerler buda buyük veri kümeleri için tavsiye edilmez örnek versek
        ListeDizisi.add(2,"melek");//normalde 2. indk değerimize(21.72)olması lazımdı ama yeptığımız eklemeyle
        // yeni 2. index değerimiz "melek" oluyor ve ondan soraki değerler bir birim kaydırılıyor

        ListeDizisi.forEach(i-> System.out.println(i));

        ListeDizisi.add("zero");// 5. indis değerimizi ekledik
        ListeDizisi.remove(5);// biz burada eklediğimiz 5. indis değerini sildik

        System.out.println("                   *************************************************************************************");

        // LinkedList
        // aralarındaki fark çok değil sadece arka planda çalışma ve maliyetleri arasında fark var araya eleman eklemek istersek LinkedList ler tercih edilmelidir
        //eğer ArrayListe ara eleman eklemek istersek calışma zamanı O(n) olur ama LinkedListe araya eleman eklersek çalışma zamanı O(1) olur ve maliyet azalır

        List<String> ListLink = new LinkedList<String>();// yeni bir linkedList nesnesi olüştürdük
        ListLink.add("isim0");// linkedList yapımıza ekleme yapıyoruz
        ListLink.add("isim1");
        ListLink.add("isim2");
        ListLink.add("isim3");
        ListLink.add("isim4");
        ListLink.add("isim5");

        ListLink.remove(2);//2. indexteki vrimizi silebiliriz

        ListLink.forEach(i-> System.out.println(i));// ekrana yazdırma işlemini yaptık



    }
}
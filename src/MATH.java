
public class MATH{
    public static void main(String[] args){
    System.out.println(Math.exp(4));
    System.out.println(Math.log(2.71));
    System.out.println(Math.pow(2,3));
    System.out.println(Math.log10(100));
    System.out.println(Math.sqrt(3));    // içine yazılan sayının karekökünü alır
    System.out.println(Math.ceil(2.5));
    System.out.println(Math.floor(4.6));
    System.out.println(Math.rint(5.5)); // önce yakın sayıya yuvarlar eğer eşitse çift sayıya yuvarlar
    System.out.println(Math.round(3.89));
    System.out.println(Math.max(1,10));
    System.out.println(Math.min(2,4));
    System.out.println(Math.abs(-2));
    System.out.println(Math.random());
    System.out.println("kalem\nkağıt");
    System.out.println("Hoca\töğrenci");
    System.out.println("bıyık\fsakal");
    System.out.println("sıcak\rmürekkep");
    System.out.println("kızarmış\btavuk");
    System.out.println(Math.exp(4));
    System.out.println(Math.exp(4));
    System.out.println("bıyık\fsakal");
    System.out.println("sıcak\rmürekkep");
    System.out.println("kızarmış\btavuk");
    System.out.println(Math.exp(4));
    System.out.println(Math.exp(4));
    char ch='k';  // char veri tipi tek tırnak ile yaz
    System.out.println(Character.isDigit(ch));
    System.out.println(Character.isLetter(ch));
    System.out.println(Character.isLowerCase(ch));
    System.out.println(Character.isUpperCase(ch));
    System.out.println(Character.toUpperCase(ch));
    String kale="yazar";
    String şato="hoşgeldin dostum hoşgeldin hoşgittin";
    System.out.println(kale.length());
    System.out.println(kale.getBytes());
    System.out.println(kale.charAt(2));
    System.out.println(şato.indexOf("2"));// indexofun içine yazdığımız karakterin metinde ilk geçtiği indeksi verir eğer yoksa -1 yazdırır
     System.out.println(şato.lastIndexOf("h"));// index of aynı mantık sadece en son indeksi veriyo
    System.out.println(kale.concat(şato));// iki string ifadeyi birbirine bağlar
    System.out.println(kale.substring(2,4));
}
}
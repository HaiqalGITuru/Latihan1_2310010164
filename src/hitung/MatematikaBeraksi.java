package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika haiqal = new Matematika(6, 4);

        System.out.println("Hasil penjumlahan: " + haiqal.setPenjumlahan());
        System.out.println("Hasil pengurangan: " + haiqal.setPengurangan());
        System.out.println("Hasil perkalian: " + haiqal.setPerkalian());
        System.out.println("Hasil pembagian: " + haiqal.setPembagian());
    }
}
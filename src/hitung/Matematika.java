package hitung;

public class Matematika {
    //membuat variabel
    private double bill, bil2;

    //membuat constructor
    public Matematika(double bill, double bil2) {
        this.bill = bill;
        this.bil2 = bil2;
    }

    //membuat method setPenjumlahan
    public double setPenjumlahan() {
        return bill + bil2;
    }
}
class bookstore {
    public static void main(String[] args)
    {
        int bookcount = 3;
        int price = 275;
        int total_amount = bookcount * price;
        int discount = 10;

        double discount_value = (discount / 100.0) * total_amount;
        double final_total = total_amount - discount_value;

        System.out.println("Discount: " + discount_value);
        System.out.println("Total after discount: " + final_total);
    }
}
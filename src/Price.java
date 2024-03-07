public class Price {
    public static void main(String[] args)
    { double priceWithoutVat = 9.99;
        System.out.println("Price without VAT: " + priceWithoutVat);

        double priceWithVat = priceWithoutVat * 1.23;
        System.out.println("Price with VAT " + priceWithVat);

        double valueWithVat = priceWithVat * 10000;
        System.out.println("Value with VAT: " + valueWithVat);

        double priceWithoutVat2 = valueWithVat / 1.23;
        System. out. println("Value without VAT: " + priceWithoutVat2);
    }
}

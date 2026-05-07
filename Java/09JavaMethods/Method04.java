// Method With Parameters and Return Value
// Return Type With Parameters

class Shop {
    int calculateTotal(int price, int quantity) {
        int total = price * quantity;
        return total;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        int totalAmount = shop.calculateTotal(50, 3);
        System.out.println("Total Amount: " + totalAmount);

        System.out.println("Total Amount for 100 price and 5 quantity: " + shop.calculateTotal(100, 5));
    }
}
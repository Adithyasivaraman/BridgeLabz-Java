class Discount{
    public static void main(String[] args) {
        int studentFee = 125000;
        double discount = 10;
        double discountAmount = studentFee*(discount/100);
        double finalFee = studentFee - discountAmount;
        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+finalFee);
    }
}
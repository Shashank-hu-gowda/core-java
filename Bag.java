class Bag {
    static byte numberOfParts = 3;
    static short manufacturingYear = 2023;
    static int price = 1200;
    static long serialNumber = 4455667788L;
    static boolean isWaterproof = true;

    public static void main(String[] args) 
	{
        byte numberOfParts = 5;
        short manufacturingYear = 2024;
        int price = 1800;
        long serialNumber = 9988776655L;
        boolean isWaterproof = false;

        System.out.println(Bag.numberOfParts);
        System.out.println(Bag.manufacturingYear);
        System.out.println(Bag.price);
        System.out.println(Bag.serialNumber);
        System.out.println(Bag.isWaterproof);
        System.out.println("----------------------");
        System.out.println(numberOfParts);
        System.out.println(manufacturingYear);
        System.out.println(price);
        System.out.println(serialNumber);
        System.out.println(isWaterproof);
    }
}
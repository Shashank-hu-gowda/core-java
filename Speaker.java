class Speaker {
    static short manufacturingYear = 2023;
    static int price = 7000;
    static double frequencyRange = 45.75;
    static char soundQualityGrade = 'A';
    static boolean isBluetoothSupported = true;

    public static void main(String[] args)
	{
        short manufacturingYear = 2024;
        int price = 8500;
        double frequencyRange = 50.50;
        char soundQualityGrade = 'B';
        boolean isBluetoothSupported = false;

        System.out.println( Speaker.manufacturingYear);
        System.out.println( Speaker.price);
        System.out.println(Speaker.frequencyRange);
        System.out.println( Speaker.soundQualityGrade);
        System.out.println(Speaker.isBluetoothSupported);
        System.out.println("----------------------");
        System.out.println(manufacturingYear);
        System.out.println( price);
        System.out.println( frequencyRange);
        System.out.println( soundQualityGrade);
        System.out.println( isBluetoothSupported);
    }
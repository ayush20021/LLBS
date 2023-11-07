package practise;

public class DecimalToBinary {

    // Function to convert decimal to binary
    public static void decimalToBinary(int decimal) {
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        System.out.print("Binary representation: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    // Main method to test the decimalToBinary function
    public static void main(String[] args) {
        int decimalNumber = 25;
        System.out.println("Decimal number: " + decimalNumber);
        decimalToBinary(decimalNumber);
    }
}

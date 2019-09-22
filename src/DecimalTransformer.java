import java.util.Scanner;

public class DecimalTransformer {
    public static long binary(int number) {
        long interimNumber = number;
        long binary = 0;
        int digit = 0;


        while (interimNumber >= 0) {
            if (interimNumber == 1) {
                binary += (Math.pow(10, digit));
                interimNumber = -1;

            }

            else {
                binary = binary + (long)(interimNumber % 2 * Math.pow(10, digit));
                interimNumber /= 2;
                digit += 1;

            }
        }

        return binary;
    }

    public static long base8(int number) {
        int interimNumber = number;
        long base8 = 0;
        int digit = 0;

        while (interimNumber > 0) {

            base8 = base8 + (long) (interimNumber % 8 * Math.pow(10, digit));
            interimNumber /= 8;
            digit += 1;

        }
        return base8;
    }

    public static String base16(int number) {
        int interimNumber = number;
        String base16 = "";
        if (interimNumber < 16) {}
        else
        {
            while (interimNumber >= 16) {
                if (interimNumber % 16 < 10) {
                    base16 += String.valueOf(interimNumber % 16);
                } else {
                    switch (interimNumber % 16) {
                        case 10:
                            base16 += "A"; break;
                        case 11:
                            base16 += "B"; break;
                        case 12:
                            base16 += "C"; break;
                        case 13:
                            base16 += "D"; break;
                        case 14:
                            base16 += "E"; break;
                        case 15:
                            base16 += "F"; break;
                        default: break;
                    }
                }
                interimNumber /= 16;

            } }
        if (interimNumber< 10) {
            base16 += String.valueOf(interimNumber);

        } else {
            switch (interimNumber) {
                case 10:
                    base16 += "A"; break;
                case 11:
                    base16 += "B"; break;
                case 12:
                    base16 += "C"; break;
                case 13:
                    base16 += "D"; break;
                case 14:
                    base16 += "E"; break;
                case 15:
                    base16 += "F"; break;
                default: break;
            }
        }
        StringBuffer buffer = new StringBuffer(base16);

        return String.valueOf(buffer.reverse());
    }

    public static void main(String[] args) {
        System.out.println ("Enter Decimal number: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println("Decimal number: " + input);
        System.out.println("Base2:          " + binary(input));
        System.out.println("Base8:          " + base8(input));
        System.out.println("Base16:         " + base16(input));
    }
}

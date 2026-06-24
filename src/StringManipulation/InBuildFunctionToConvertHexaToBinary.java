package StringManipulation;

public class InBuildFunctionToConvertHexaToBinary {
    public static void main(String[] args) {
        String hex = "1A";

        int decimal = Integer.parseInt(hex,16);

        String  binary = Integer.toBinaryString(decimal);

        System.out.println(binary);
    }
}

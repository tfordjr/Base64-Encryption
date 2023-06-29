// Terry Ford Jr - Project 3 - Decoder - CS 2261

package edu.umsl;
import java.util.Scanner;
import static org.apache.commons.codec.binary.Base64.*;

public class Decoder {
    public static void main(String[] args) {
        String encodedString = "SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWN" +
                "oLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y";

        // DECODE
        System.out.print("Decoding...\n" + encodedString + " decodes to:\n");
        byte[] asciiArr = decodeBase64(encodedString);
        int length = asciiArr.length;
        String[] decodedArr = new String[length];

        for (int i = 0; i < length; i++) {
            //System.out.println(asciiArr[i]);    LINE TO PRINT ASCII VALUES
            decodedArr[i] = Character.toString((char) asciiArr[i]);
            System.out.print(decodedArr[i]);
        }

        // ENCODE
        System.out.print("\n\nEncoding...\nPlease input some text to be encoded: ");
        String input = "what", encodedInput;
        Scanner sc = new Scanner(System.in);
        try {
            input = sc.nextLine();
        } catch (Exception ex) {
            System.out.println("Exceptions handled.");
        }
        encodedInput = encodeBase64String(input.getBytes());
        System.out.println(encodedInput);
    }
}
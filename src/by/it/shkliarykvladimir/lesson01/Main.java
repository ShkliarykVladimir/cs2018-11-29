package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i=-128;i != 128; i++){

            String binary =Integer.toBinaryString(i);
            if (binary.length()>8) binary=binary.substring(binary.length() -8);
            binary = String.format("%8s",binary).replace(" ", "0");
            System.out.printf("%8s ",binary, i);

            String ocral =Integer.toOctalString(i);
            if (octal.length()>3) octal=octal.substring(octal.length() -3);
            octal = String.format("%3s",octal).replace(" ", "0");
            System.out.printf("%3s ",octal, i);

            String hex =Integer.toHexString(i);
            if (hex.length()>2) hex=hex.substring(hex.length() -2);
            hex = String.format("%2s",hex).replace(" ", "0");
            System.out.printf("%2s %4d %n",hex, i);
        }
    }
}

package Study;

import java.util.StringTokenizer;

public class TestTokenizer {
    public static void main(String[] args) {
        StringTokenizer s1 = new StringTokenizer("Hi guys, I'm Lam");
        System.out.println("Number of tokens of s1: " + s1.countTokens());

        while(s1.hasMoreTokens()) {
            System.out.println(s1.nextToken());
        }

        StringTokenizer s2 = new StringTokenizer("Orange,Apple,Watermelon", ",");
        System.out.println("Number of tokens of s2: " + s2.countTokens());

        while(s2.hasMoreTokens()) {
            System.out.println(s2.nextToken());
        }

        StringTokenizer s3 = new StringTokenizer("I like Raiden Shogun      ,and I want to gacha her", " ", true);
        System.out.println(s3.countTokens());

        while(s3.hasMoreTokens()) {
            System.out.println(s3.nextToken());
        }

        StringTokenizer s4 = new StringTokenizer("I like Raiden Shogun      ,and I want to gacha her", " ", false);
        System.out.println(s4.countTokens());

        while(s4.hasMoreTokens()) {
            System.out.println(s4.nextToken());
        }
}}

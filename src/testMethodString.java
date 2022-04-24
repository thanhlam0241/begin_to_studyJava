public class testMethodString {
    public static void main(String args[]){
        String s1="Raiden Shogun is the best character";
        String s2="Raiden Shogun is also the best sub dps";
        //charAt() method:
        System.out.println(s1.charAt(0));//return R
        System.out.println(s2.charAt(0));//also return R

        //compareTo() method:
        System.out.println(s1.compareTo(s2));//return positive number,maybe

        //concat() method:
        System.out.println(s1.concat(s2));
        System.out.println(s1);//s1 is't changed,but if we write s1=s1.concat(s2),it will change,maybe

        //contains() method :
        System.out.println(s1.contains("Raiden"));//true
        System.out.println(s2.contains("Kequing"));//false,maybe

        //endsWith() method:
        System.out.println(s1.endsWith("character"));//true,maybe
        System.out.println(s2.endsWith("character"));//false,maybe

        //startsWith method: like endsWith

        //equals() method:
        System.out.println(s1.equals(s2));//false

        //equalsIgnoreCase() method: like equals,but ignore low case or up case

        //format() method:like printf and sprintf in C,example:
        String name = "sonoo";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.33434);
        String sf3 = String.format("value is %32.12f", 32.33434);

        System.out.println(sf1);//sonoo
        System.out.println(sf2);//32.33434
        System.out.println(sf3);//value is              32.33434000000000,there are maybe 32-12 blanks

        //getBytes() method:

        //getChars() method:
        String str = new String("hello Java how are you?");
        char[] ch = new char[4];
        try {
            str.getChars(1, 2, ch, 2);//src.charAt(1)->ch[2],end
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        //indexOf() method:return the site of substring/char of the string,example:
        String s = "this is index of example";

           //Truyền vào chuỗi con
        int index1 = s.indexOf("is");//maybe 2
        int index2 = s.indexOf("index");//maybe 8
        System.out.println(index1 + "  " + index2);//2 8

           //Truyền vào chuỗi con và chỉ số bắt đầu
        int index3 = s.indexOf("is", 4);//maybe 5
        System.out.println(index3);//5

            //Truyền vào giá trị Char
        int index4 = s.indexOf('s');//maybe 3
        System.out.println(index4);//3

        //intern() method:
        //join() method:
        String a1="fuck";
        String a2="you";
        String a3="bitch";
        System.out.println(String.join(" ",a1,a2,a3));//fuck you bitch

        //lastIndexOf(): like indexOf(),but return the last index
        //length()
        //replace()
        //replaceAll(): replace all the string
        String a4 = "viettuts is a very good website";
        String replaceString = a4.replaceAll("t", "j"); //replace "a" to "e"
        System.out.println(replaceString);
        String a5 = "My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString1 = a5.replaceAll("is", "was"); // thay the tat ca cac chuoi "is" thanh "was"
        System.out.println(replaceString1);
        //split() method:
        String a6 = "java string split method by viettuts";
        String[] words = a6.split(" ");//tach chuoi dua tren khoang trang
        //su dung vong lap foreach de in cac element cua mang chuoi thu duoc
        for (String w : words) {
            System.out.print(w+" ");
        }
        String[] word1=a6.split("\\s",4);
        for(String w:word1){
            System.out.print(w+"+");
        }

        //toCharArray(): return a array of chars
        String t="Raiden";
        char[] wo=t.toCharArray();
        for(char w:wo){
            System.out.print(w+"+");
        }
        //toLowerCase,toUpperCase
        //trim():delete all blanks in start and end


    }


    }


package Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class inputStream {
    public static void main(String[] args) throws IOException {
                char c;
                BufferedReader br = new BufferedReader(new
                        InputStreamReader(System.in, System.console().charset()));
                System.out.println("Enter characters, 'q' to quit.");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q');
    }
}





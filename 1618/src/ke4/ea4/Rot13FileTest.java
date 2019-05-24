package ke4.ea4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Rot13FileTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("testout.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        
        FileInputStream fis = new FileInputStream("testin.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        
        Adapter adapter = new Adapter(isr);
        CharEingabeStrom cs = new UmlautSzFilter(adapter);
        cs = new GrossBuchstabenFilter(cs);
        cs = new Rot13Filter(cs);
        
        int zeichen = -1;
        while ((zeichen = cs.read()) != -1) {
            osw.write(zeichen);
            System.out.println(zeichen);
        }
        isr.close();
        osw.close();
    }
}
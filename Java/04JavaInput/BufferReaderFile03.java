import  java.io.*;

public class BufferReaderFile03 {
    public  static  void  main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new FileReader("sampleFile.txt"));

        if (br.ready()) {
            System.out.println("File has data to read.");

            String line;
            while (br.ready()) {
                line = br.readLine();
                System.out.println(line);
            }
        } else {
            System.out.println("File is empty or not ready to read.");
        }
        
        br.close();
    }
}

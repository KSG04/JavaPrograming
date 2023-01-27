package h.입력과출력;

// 데이터를 입력하고 출력하는 방법
// 데이터가 오고 가는 길 = stream

// InputStream OutputStream


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class main {
    public static void main(String[] args) {

        InputStream input = null;
        try {
            input = new FileInputStream("C:\\InputStream.txt");
            int data = 0;

            while (true){
                try {
                    data = input.read();
                }catch (Exception e){
                    e.printStackTrace();
                }
                if (data == -1)
                    break;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                if (input != null)
                    input.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

package i.네트워크.실습;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        Scanner scanner = null;

        try {

            socket = new Socket("localhost",9000);
            System.out.println("서버 연결 완료");

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);

            scanner = new Scanner(System.in);

            while (true){
                System.out.println("메세지 입력 : ");
                String outM = scanner.nextLine();
                dataOutputStream.writeUTF(outM);
                dataOutputStream.flush();

                String inputM = dataInputStream.readUTF();
                System.out.println("메세지 : " + inputM);

                if (outM.equals("STOP")) break;
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (socket != null) socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package g.예외처리.finally연습;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// 예외 발생 여부에 상관없이 무조건 실행 시킬때 finally
public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b;
        ArrayList<String > list = null;
        //ArrayList<String> list = new ArrayList<>();
        //list.add("hi");

        int[] Arr = {0,1,2,3,4};

        try {
            System.out.println("input a : ");
            a = in.nextInt();
            System.out.println("input b : ");
            b = in.nextInt();
            System.out.println(" a / b = " + (a / b ));

            for (int k = 0 ; k < 6 ; k++){
                System.out.println("Arr["+ k + "] : " + Arr[k]);
            }
            System.out.println("list.size() : " + list.size());
        }catch (InputMismatchException e ){ //input 값이 int 인데 String 을 넣을 경우 에러
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e ) { // Array값 불일치
            e.printStackTrace();
        }catch (Exception e ){
            e.printStackTrace();
        }finally {
            System.out.println("예외 발생 여부에 상관없이 무조건 실행");
        }
        System.out.println("Exception after");


    }
}

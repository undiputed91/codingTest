package org.example.baekjoon.baek10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        sc.nextLine();
        // nextInt()를 하고 바로 nextLine으로 값을 받으려고 하면 인식을 못한다. 정수값만 받는 걸로 설정 되기에 개행문자가 버퍼에 남아 nextLine을 한 번 함으로써 개행문자(\n)을 지워줘야 함
        for(int i =0; i<j; i++){
            String AB = sc.nextLine(); // 9번 줄이 없다면 여기에 (\n)이 들어가버린다.
            String[] ABArray = AB.split(" ");
            int A = Integer.parseInt(ABArray[0]);
            int B = Integer.parseInt(ABArray[1]);

            System.out.println(A+B);
        }
    }

    //입력값으로 A B를 받을 때 굳이 위에처럼 스트링으로 받고 split으로 자를 필요 없이
    //  import java.util.Scanner;
    //  public class Main {
    //    public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //
    //        int T = sc.nextInt();
    //
    //        for (int i = 0; i < T; i++) {
    //            int A = sc.nextInt();
    //            int B = sc.nextInt();
    // 그냥 따로 nextInt() 두번 호출해도 됨
    //            System.out.println(A+B);
    //        }
    //        sc.close();
    //    }
    //}

}

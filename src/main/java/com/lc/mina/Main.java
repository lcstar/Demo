package com.lc.mina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
//    public static void main(String[] args)throws Exception {
//        MinaClient client=new MinaClient();
//        client.connect();
//        client.sendMsg2Server("message from cilent");
//    }
public static void main(String[] args) throws IOException {
    System.out.println("访客的来访时间与离开时间如下：");
    String visitTime[]={"10 14","12 14","8 9","8 11","14 17"};
    ArrayList list = new ArrayList();
    for(int i=0;i<visitTime.length;i++){
        System.out.println(visitTime[i]);
        list.add(visitTime[i]);
    }
    int[] x = new int[list.size()];
    int[] y = new int[list.size()];
    for (int i = 0; i < x.length; i++) {
        String input = (String) list.get(i);
        String[] strs = input.split(" ");
        x[i] = Integer.parseInt(strs[0]);
        y[i] = Integer.parseInt(strs[1]);
    }
    Arrays.sort(x);
    Arrays.sort(y);
    for (int time = 0; time < 25; time++) {
        System.out.println(time + " 时的最大访客数：" + maxGuest(x, y, time));
    }
}

    public static int maxGuest(int[] x, int[] y, int time) {
        int number = 0;
        //No.1
        //开始写代码，给出访客的来访时间与离开时间，计算某时刻的最大访客量，补充完整maxGuest方法
        int[] numbers = new int[25];
        for(int i = 0;i < x.length;i++){
            for(int j = x[i];j < y[i];j++){
                numbers[j] = numbers[j] + 1;
            }
        }
        number = numbers[time];





        //end_code
        return number;
    }
}

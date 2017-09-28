package com.lc.mina;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        MinaClient client=new MinaClient();
        client.connect();
        client.sendMsg2Server("message from cilent");
    }
}

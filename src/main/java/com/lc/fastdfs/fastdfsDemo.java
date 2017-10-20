package com.lc.fastdfs;

import org.junit.Test;

public class fastdfsDemo {
    @Test
    public void FastdfsTest() throws Exception{
        FastDFSClient fastDFSClient = new FastDFSClient("classpath:com.lc.poi/fdfs_client.conf");
        String string = fastDFSClient.uploadFile("");
        System.out.println(string);
    }
}

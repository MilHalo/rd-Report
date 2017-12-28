package com.easytoolsoft.easyreport.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Halo on 2017/12/28.
 */
public class TestClass {
    public static void main(String[] args) {
        try {
            System.out.println("本机IP："+InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

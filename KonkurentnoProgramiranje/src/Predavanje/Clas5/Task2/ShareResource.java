package Predavanje.Clas5.Task2;

import Predavanje.Clas5.Task1.ThreadUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ShareResource {

    private volatile boolean variable;

    private void addToList(String str) throws IOException {
        File file = new File("res_log.txt");
        FileWriter thread = new FileWriter(file, true);
        thread.write(str);
        thread.close();
    }
    synchronized void test1(ShareResource r1) throws IOException {
        System.out.println("test1-begin");
        ThreadUtil.sleep(1000);
        addToList("test started");
        System.out.println("test1-locking r1");
        System.out.println("test1-waiting r3");
        // taking object lock of s2 enters
        // into test2 method
        while (variable){
            r1.test3(this);
        }
        variable = false;
        System.out.println("test1-end");

    }

    // second synchronized method
    synchronized void test2(ShareResource r2) throws IOException {
        System.out.println("test2-begin");
        ThreadUtil.sleep(1000);

        System.out.println("test2-locking r2");
        System.out.println("test2-waiting r1");
        // taking object lock of s1 enters
        // into test1 method
        while (variable){
            r2.test1(this);
        }
        variable = false;
        System.out.println("test2-end");

    }

    synchronized void test3(ShareResource r3) throws IOException {
        System.out.println("test3-begin");
        ThreadUtil.sleep(1000);

        System.out.println("test3-locking r3");
        System.out.println("test3-waiting r2");
        // taking object lock of s2 enters
        // into test2 method
        while (!variable){
            r3.test2(this);
        }
        variable = false;
        System.out.println("test1-end");

    }
}

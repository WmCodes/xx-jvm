package xyz.drafter.jvm.ch1.deencrpt;

import java.io.*;

/**
 * @author drafter
 * @date 2019/12/17
 * @desciption
 */
public class XorEncrpt {

    private void xor(InputStream in , OutputStream out)throws Exception{
        int ch;
        while (-1 != (ch = in.read())){
            ch  = ch^0xff;
            out.write(ch);
        }
    }

    public void encrypt(File src,File des)throws Exception{
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(des);
        xor(in, out);
        in.close();
        out.close();

    }

    public byte[] decrypt(File src)throws Exception{
        InputStream in = new FileInputStream(src);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        xor(in,bos);
        byte[] date = bos.toByteArray();
        return date;
    }

    public static void main(String[] args)throws Exception {
        File src = new File("D:\\jcwl\\work\\xx-jvm\\target\\classes\\xyz\\drafter\\jvm\\ch1\\deencrpt\\DemoUserSrc.class");
        File desc = new File("D:\\jcwl\\work\\xx-jvm\\target\\classes\\xyz\\drafter\\jvm\\ch1\\deencrpt\\DemoUser.class");
        XorEncrpt demoEncrypyUtil = new XorEncrpt();
        demoEncrypyUtil.encrypt(src, desc);
        System.out.println("加密完成");


    }
}

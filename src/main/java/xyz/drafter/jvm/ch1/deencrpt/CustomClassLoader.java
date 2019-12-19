package xyz.drafter.jvm.ch1.deencrpt;

import java.io.File;

/**
 * @author drafter
 * @date 2019/12/17
 * @desciption
 */
public class CustomClassLoader extends ClassLoader {

    private final String name;
    private String basePath;
    private final static String FILE_EXT = ".class";

    public CustomClassLoader(String name) {
        this.name = name;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    private byte[] loadClassDate(String name){
        byte[] date = null;
        XorEncrpt demoEncryptUtil = new XorEncrpt();
        try {
            String tempName = name.replaceAll("\\.", "\\\\");
            date = demoEncryptUtil.decrypt(new File(basePath+tempName+FILE_EXT));
        }catch (Exception e){
            e.printStackTrace();
        }
        return date;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = this.loadClassDate(name);
        return this.defineClass(name, data, 0, data.length);
    }
}

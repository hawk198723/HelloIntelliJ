package JAVAClasses.OtherClasses.SystemClass;

import org.junit.Test;

public class SystemClassTest {
    @Test
    public void test1(){
//        String javaVersion = System.getProperty("java.version");
        System.out.println("java version is:" + System.getProperty("java.version"));
        System.out.println("java home is:" + System.getProperty("java.home"));
        System.out.println("OS name is:" + System.getProperty("os.name"));
        System.out.println("OS version is:" + System.getProperty("os.version"));
        System.out.println("user name is:" + System.getProperty("user.name"));
        System.out.println("user home is:" + System.getProperty("user.home"));
        System.out.println("user dir is:" + System.getProperty("user.dir"));

    }
}

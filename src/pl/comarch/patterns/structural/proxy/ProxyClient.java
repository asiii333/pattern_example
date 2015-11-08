package pl.comarch.patterns.structural.proxy;

/**
 * Created by Asia on 2015-11-07.
 */
public class ProxyClient {
    public static void main(String[] args){
        CommandExecutor executor = new CommandExecutorProxy("Asia", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }
}

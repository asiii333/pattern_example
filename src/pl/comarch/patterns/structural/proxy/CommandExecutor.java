package pl.comarch.patterns.structural.proxy;

/**
 * Created by Asia on 2015-11-07.
 */
public interface CommandExecutor {
    public void runCommand(String cmd) throws Exception;
}

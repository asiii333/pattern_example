package construct.singleton;

import junit.framework.Assert;
import junit.framework.TestCase;
import pl.comarch.patterns.construct.singleton.SingleObject;

/**
 * Created by Asia on 2015-11-03.
 */
public class SingletonTest extends TestCase {
    private SingleObject singleObject1;
    private SingleObject singleObject2;

    public void testSingleton(){
        singleObject1 = SingleObject.getInstance();
        singleObject2 = SingleObject.getInstance();;
        Assert.assertEquals(true, singleObject1 == singleObject2);
    }
}

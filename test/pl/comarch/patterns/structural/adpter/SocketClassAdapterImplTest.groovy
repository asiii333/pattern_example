package pl.comarch.patterns.structural.adpter

/**
 * Created by Asia on 2015-11-28.
 */
class SocketClassAdapterImplTest extends spock.lang.Specification {
    def SocketClassAdapterImpl socketAddapter= new SocketClassAdapterImpl();

    def "Get120Volt"() {
      expect:
      new Volt(120) == socketAddapter.get120Volt();
    }

    def "Get12Volt"() {
        expect:
        new Volt(12) == socketAddapter.get12Volt();
    }

    def "Get3Volt"() {
        expect:
        new Volt(3) == socketAddapter.get3Volt();
    }

    def "Test conver volt"(){
        expect:
        new Volt(12) == socketAddapter.convertVolt(new Volt(120), 10)
    }

}

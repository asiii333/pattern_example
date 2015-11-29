package pl.comarch.patterns.structural.adpter

import spock.lang.Specification

/**
 * Created by Asia on 2015-11-28.
 */
class SocketTest extends Specification {
    def "GetVolt"() {
        def socket = new Socket()
        expect:
        new Volt(120) == socket.getVolt()
    }
}

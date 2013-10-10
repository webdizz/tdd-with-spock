package name.webdizz.tdd.spock.demo

import spock.lang.Specification


class XPDaysDemoTest extends Specification {

    XPDaysDemo testingInstance = new XPDaysDemo()

    def 'should do something'(){
        expect:
        testingInstance.sayHello()
    }

}
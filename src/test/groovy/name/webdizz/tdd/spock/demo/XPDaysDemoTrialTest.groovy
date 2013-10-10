package name.webdizz.tdd.spock.demo

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class XPDaysDemoTrialTest extends Specification {

    @Shared
    XPDaysDemoTrial testingInstance

    def setupSpec() {
        testingInstance = new XPDaysDemoTrial()
    }

    def cleanupSpec() {
        testingInstance = null
    }

    def 'should say hello'() {
        expect:
        testingInstance.sayHello('') == 'Hello, '
    }

    def 'should say to me'() {
        String name = 'Izzet'
        when:
        String result = testingInstance.sayHello(name)
        then:
        result == 'Hello, Izzet'
        and:
        result.contains(name)
    }

    @Unroll
    def 'should say hello to #name'() {
        when:
        String result = testingInstance.sayHello(name)
        then:
        result == "Hello, ${name}"
        where:
        name     | _
        'World'  | _
        'Java'   | _
        'Groovy' | _
    }

    def 'should not say hello for null names'() {
        when:
        String result = testingInstance.sayHello(null)
        then:
        thrown(IllegalArgumentException)
    }

    def 'should say nice looking hello'() {
        setup:
        String name = 'Spock'
        Wrapper wrapper = Mock()
        String wrappingString = "Hello, ${name}"
        wrapper.wrap(wrappingString) >> "|${wrappingString}|"
        testingInstance.setWrapper(wrapper)
        when:
        String result = testingInstance.sayHello(name, '|')
        then:
        result == "|Hello, ${name}|"
    }

}
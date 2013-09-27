package name.webdizz.tdd.spock

import spock.lang.Specification
import spock.lang.Unroll
import spock.lang.Shared
import spock.lang.Ignore

class CreditCardValidatorTest extends Specification {

    @Shared
    def testingInstance

    def setup(){
	testingInstance = new CreditCardValidator()
    }
    
    def 'should create validator'(){
        when:
        def res = testingInstance.isValid()
        then:
        res == false
    }

    @Unroll
    def 'should not allow empty like values #cardNumber'(){
        when:
        def res = testingInstance.isValid(cardNumber)
        then:
        res == false
        where:
        cardNumber | _
        null       | _
        ''         | _
    }

    @Ignore
    def 'should be ignored'(){
	println 'Never invoked'
	expect: 'a' == "a"
    }
}
package name.webdizz.tdd.spock

import spock.lang.Specification
import spock.lang.Unroll

class CreditCardValidatorTest extends Specification {

    def 'should create validator'(){
        def testingInstance = new CreditCardValidator()
        when:
        def res = testingInstance.isValid()
        then:
        res == false
    }

    @Unroll
    def 'should not allow empty like values'(){
        def testingInstance = new CreditCardValidator()
        when:
        def res = testingInstance.isValid(cardNumber)
        then:
        res == false
        where:
        cardNumber | _
        null       | _
        ''         | _
    }
}
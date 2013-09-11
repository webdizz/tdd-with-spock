package name.webdizz.tdd.spock;

public class CreditCardValidator {

    public boolean isValid(String cardNumber){

        return null != cardNumber && !"".equals(cardNumber);
    }
}

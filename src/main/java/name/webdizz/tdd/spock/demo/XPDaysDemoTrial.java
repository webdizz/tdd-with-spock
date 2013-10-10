package name.webdizz.tdd.spock.demo;

import com.google.common.base.Preconditions;

public class XPDaysDemoTrial {

    private Wrapper wrapper;

    public String sayHello(final String name) {
        Preconditions.checkArgument(name != null, "Name should not be null");
        return "Hello, " + name;
    }

    public String sayHello(final String name, final String separator) {
        return wrapper.wrap(sayHello(name));
    }

    public void setWrapper(final Wrapper wrapper) {
        this.wrapper = wrapper;
    }
}

interface Wrapper {
    String wrap(String name);
}

class PipeWrapper implements Wrapper {

    private static final String PIPE = "|";

    @Override
    public String wrap(final String name) {
        return PIPE + name + PIPE;
    }
}
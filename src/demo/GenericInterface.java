package demo;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created by teacher
 * 10:12 2016/4/14.
 */
public interface GenericInterface<T extends Serializable & Closeable> {

    void method(T t);
}

class TestClass<T extends Serializable & Closeable> implements GenericInterface<T> {

    @Override
    public void method(T t) {

    }

    public static void main(String[] args) {
        TestClass<E> stringTestClass = new TestClass<>();
    }
}

class E implements Serializable, Closeable {

    @Override
    public void close() throws IOException {

    }
}

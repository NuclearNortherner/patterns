package in.blagush.learn.patterns.builder.example2.interfaces;

public interface Builder<T> {

    T reset();

    T addMayonnaise();

    T addSausage();

    T addKetchup();

    T addGreen();



}

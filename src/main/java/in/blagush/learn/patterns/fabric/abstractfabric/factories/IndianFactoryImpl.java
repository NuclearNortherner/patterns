package in.blagush.learn.patterns.fabric.abstractfabric.factories;

import in.blagush.learn.patterns.fabric.abstractfabric.beans.IndianTeaCupImpl;
import in.blagush.learn.patterns.fabric.abstractfabric.beans.IndianTeaPackImpl;
import in.blagush.learn.patterns.fabric.abstractfabric.beans.IndianTeaSpoonImpl;
import in.blagush.learn.patterns.fabric.abstractfabric.interfaces.Factory;
import in.blagush.learn.patterns.fabric.abstractfabric.interfaces.TeaCup;
import in.blagush.learn.patterns.fabric.abstractfabric.interfaces.TeaPack;
import in.blagush.learn.patterns.fabric.abstractfabric.interfaces.TeaSpoon;

public class IndianFactoryImpl implements Factory {
    @Override
    public TeaCup createTeaCup() {
        return new IndianTeaCupImpl();
    }

    @Override
    public TeaPack createTeaPack() {
        return new IndianTeaPackImpl();
    }

    @Override
    public TeaSpoon createTeaSpoon() {
        return new IndianTeaSpoonImpl();
    }
}

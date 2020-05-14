package in.blagush.learn.patterns.fabric.abstractfabric.factories;

import in.blagush.learn.patterns.fabric.abstractfabric.beans.ChineseTeaCupImpl;
import in.blagush.learn.patterns.fabric.abstractfabric.beans.ChineseTeaPackImpl;
import in.blagush.learn.patterns.fabric.abstractfabric.beans.ChineseTeaSpoonImpl;
import in.blagush.learn.patterns.fabric.abstractfabric.interfaces.Factory;
import in.blagush.learn.patterns.fabric.abstractfabric.interfaces.TeaCup;
import in.blagush.learn.patterns.fabric.abstractfabric.interfaces.TeaPack;
import in.blagush.learn.patterns.fabric.abstractfabric.interfaces.TeaSpoon;

public class ChineseFactoryImpl implements Factory {
    @Override
    public TeaCup createTeaCup() {
        return new ChineseTeaCupImpl();
    }

    @Override
    public TeaPack createTeaPack() {
        return new ChineseTeaPackImpl();
    }

    @Override
    public TeaSpoon createTeaSpoon() {
        return new ChineseTeaSpoonImpl();
    }
}

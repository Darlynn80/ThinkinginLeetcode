package net.thingking.coding.codingInterview;

import java.util.concurrent.RecursiveTask;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by darlynn on 3/23/17.
 *
 * CommandTask can be invoked by any other test class to check under the multi-Thread curriculum
 * this class use the param Supplier , which is callback function , and use lambda when you need to execute your task.
 * Supplier is a new feature for java8 , which is under the package of function.
 * Learn more
 */

@SuppressWarnings("unavailable")
public class CommandTask extends RecursiveTask<Supplier> {
    private Supplier supplier;
    protected Supplier compute() {
        return (Supplier) supplier.get();
    }
}

@SuppressWarnings("uncomplished")
class executeTask {
    public Supplier execute(Supplier supplierTask, Consumer consumer) {
        return null;
    }
}
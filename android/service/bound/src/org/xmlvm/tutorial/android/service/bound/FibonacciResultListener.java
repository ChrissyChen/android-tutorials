package org.xmlvm.tutorial.android.service.bound;

/**
 * FibonacciResultListener is a simple interface that FibonacciService uses to
 * return the results of a computation. FibonacciActivity implements this
 * interface.
 */
public interface FibonacciResultListener {

    public void resultAvailable(final int n, final int res);
}

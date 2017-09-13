package net.thingking.coding.ds_alg_java;

import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Created by darlynn on 7/3/17.
 *
 * Description:
 * heap
 */
public class PriorityQueue {
    /**
     * 堆的数据结构实现
     */
    public class BinaryHeap<AnyType extends Comparable<? super AnyType>> implements Iterable<AnyType> {
        private static final int DEFAULT_CAPACITY = 10;
        private AnyType[] array;
        private int currentSize;

        /**
         * 初始化堆， 默认大小为10
         */
        public BinaryHeap() {
            this(DEFAULT_CAPACITY);
        }

        /**
         * 初始化堆， 指定大小
         * @param capacity 指定堆的大小
         */
        public BinaryHeap(int capacity) {
            currentSize = capacity;
            array = (AnyType[])new Object[currentSize];
        }

        /**
         * 初始化堆， 对其元素进行初始化
         * @param items
         */
        public BinaryHeap(AnyType[] items) {
            if (currentSize < items.length) {
                currentSize = 2*items.length;
                array = (AnyType[]) new Object[currentSize];
            }
            for (int i=0; i< items.length; i++) {
                array[i] = items[i];
            }
        }

        public void insert(AnyType x) {
            if (currentSize == array.length-1)
                enlargeArray(array.length*2+1);
            percolateUp(x);
        }

        public AnyType findMin() {
            //
            return null;
        }
        public AnyType deleteMin() {
            if (isEmpty()) {
                throw new BufferUnderflowException();
            }
            AnyType minItem = findMin();
            array[1] = array[currentSize--];
            percolateDown(1);
            return minItem;
        }

        public boolean isEmpty() {
            return currentSize==0;
        }
        public void makeEmpty() {
            //
        }

        //下滤操作
        private void percolateDown( int hole) {
            int k;
            AnyType tmp = array[hole];
            for ( ; hole*2 <=currentSize; hole = k) {
                k = hole*2;
                if (k!=currentSize && array[k].compareTo(array[k+1])>0) {
                    k++;
                }
                if (array[k].compareTo(tmp) <0) {
                    array[hole] = array[k];
                    hole = k;
                }
                else
                    break;
            }
            array[hole] = tmp;
        }

        //上滤操作
        private void percolateUp(AnyType x) {
            int hole = ++currentSize;
            while (hole>1 && x.compareTo(array[hole/2])<0) {
                array[hole] = array[hole/2];
                hole = hole/2;
            }
            array[hole] = x;
        }
        private void buildHeap() {
            //
        }

        /**
         * 堆容器扩容
         * */
        private void enlargeArray(int newSize) {
            currentSize = newSize;
            AnyType[] tmp = (AnyType[]) new Object[newSize];
            for (int i=0; i<array.length; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }

        @Override
        public Iterator<AnyType> iterator() {
            return new HeapIteraor();
        }

        public class HeapIteraor<AnyType> implements Iterator {

            HeapIteraor() {
                //
            }

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        }
    }
}

package net.thingking.coding.ds_alg_java;

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
    public class BinaryHeap<AnyType extends Comparable<? super AnyType>> {
        private static final int DEFAULT_CAPACITY = 10;
        private AnyType[] array;
        private int currentSize;

        public BinaryHeap() {
            //
        }
        public BinaryHeap(int capacity) {
            currentSize = capacity;
            //
        }
        public BinaryHeap(AnyType[] items) {
            //
        }

        public void insert(AnyType x) {
            //
        }

        public AnyType findMin() {
            //
            return null;
        }
        public AnyType deleteMin() {
            //
            return findMin();
        }

        public boolean isEmpty() {
            //
            return false;
        }
        public void makeEmpty() {
            //
        }

        private void percolateDown( int hole) {
            //
        }
        private void buildHeap() {
            //
        }
        private void enlargeArray(int newSize) {
            //
        }
    }
}

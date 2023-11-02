package cpsc2150.listDec;

import java.util.List;

interface IShuffleList<T> extends List<T> {
    default void shuffle(int swaps) {
        // base case
        if (swaps <= 0) {
            return;
        }

        // pick indices of items to swap
        int index1 = (int) (Math.random() * size());
        int index2 = (int) (Math.random() * size());

        // swap them
        swap(index1, index2);

        // repeat swaps times
        shuffle(swaps - 1);
    }

    default void swap(int i, int j) {
        T temp = get(i);
        set(i, get(j));
        set(j, temp);
    }
}
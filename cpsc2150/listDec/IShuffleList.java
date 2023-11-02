package cpsc2150.listDec;

import java.util.List;

public abstract interface IShuffleList<T> extends List<T> {
	/*
	 * Switches two random items in the list for the number of times specified by swaps
	 *
	 * @param swaps number of times to swap
	 *
	 * @post the list has had two elements swapped at random swaps times
	 */
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

	/*
	 * Swap two items in the list, specified by i and j
	 *
	 * @param i first item to swap
	 * @param j second item to swap
	 *
	 * @pre i and j are valid indexes of the list
	 *
	 * @post list[i] = list[j] AND list[j] = list[i]
	 */
    default void swap(int i, int j) {
        T temp = get(i);
        set(i, get(j));
        set(j, temp);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTheOddTest {

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortTheOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortTheOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }

    @Test
    public void justSelectionSortTest(){
        assertArrayEquals(new int[]{ 0, 1, 3, 5, 8 }, SortTheOdd.selectionSort(new int[]{ 1, 3, 8, 5, 0 }));
        assertArrayEquals(new int[]{ 0, 1, 5, 7, 8 }, SortTheOdd.selectionSort(new int[]{ 5, 7, 1, 8, 0 }));

    }

}
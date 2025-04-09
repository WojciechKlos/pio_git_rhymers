package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_STACK_SIZE = 12;
    private static final int INVALID_STACK_VALUE = -1;
    public static final int EMPTY_STACK_INDICATOR = -1;

    private int[] numbers = new int[MAX_STACK_SIZE];
    public int total = EMPTY_STACK_INDICATOR;

    /**
     *
     * Metoda ta dodaje nowy element do tablicy
     * numbers pod warunkiem, że struktura (stos) nie jest pełna.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    /**
     *
     * Metoda sprawdza, czy stos jest pusty. Zwraca wartość true,
     * jeśli zmienna total ma wartość -1, co oznacza, że żaden element nie został jeszcze dodany.
     */
    public boolean callCheck() { return total == EMPTY_STACK_INDICATOR; }

    /**
     *
     * Metoda ta weryfikuje, czy stos jest pełny. Zwraca true,
     * jeśli wartość total wynosi 11, czyli tablica numbers osiągnęła maksymalny rozmiar (12 elementów, indeksy 0-11).
     */
    public boolean isFull() { return total == MAX_STACK_SIZE-1; }


    /**
     *
     * Metoda pozwala "spojrzeć" na górny element stosu bez jego usuwania.
     */
    protected int peekaboo() {
        if (callCheck())
            return INVALID_STACK_VALUE;
        return numbers[total];
    }

    /**
     *
     * Metoda ta umożliwia usunięcie ostatnio dodanego elementu z tablicy.
     */
    public int countOut() {
        if (callCheck())
            return INVALID_STACK_VALUE;
        return numbers[total--];
    }

    /**
     *
     * Prosty getter, który zwraca aktualną wartość pola total,
     * czyli indeks ostatniego elementu na stosie.
     */
    public int getTotal() { return total; }
}

package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    private int total = -1;

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
    public boolean callCheck() { return total == -1; }

    /**
     *
     * Metoda ta weryfikuje, czy stos jest pełny. Zwraca true,
     * jeśli wartość total wynosi 11, czyli tablica numbers osiągnęła maksymalny rozmiar (12 elementów, indeksy 0-11).
     */
    public boolean isFull() { return total == 11; }

    /**
     *
     * Metoda pozwala "spojrzeć" na górny element stosu bez jego usuwania.
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    /**
     *
     * Metoda ta umożliwia usunięcie ostatnio dodanego elementu z tablicy.
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

    /**
     *
     * Prosty getter, który zwraca aktualną wartość pola total,
     * czyli indeks ostatniego elementu na stosie.
     */
    public int getTotal() { return total; }
}

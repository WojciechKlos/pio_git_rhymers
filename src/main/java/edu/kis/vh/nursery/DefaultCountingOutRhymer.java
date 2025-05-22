package edu.kis.vh.nursery;

/**
 * Prosta implementacja stosu o stałym rozmiarze 12 elementów.
 * Umożliwia dodawanie, pobieranie i podgląd ostatniego elementu.
 */
public class DefaultCountingOutRhymer {

    private static final int MAX_STACK_SIZE = 12;
    private static final int INVALID_STACK_VALUE = -1;
    public static final int EMPTY_STACK_INDICATOR = -1;

    private int[] numbers = new int[MAX_STACK_SIZE];
    public int total = EMPTY_STACK_INDICATOR;

    /**
     * Wkłada nowy element na wierzch stosu, jeśli nie jest pełny.
     *
     * @param in element, który ma zostać włożony na stos
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return {@code true} jeśli stos nie zawiera żadnych elementów, {@code false} w przeciwnym razie
     */
    public boolean callCheck() { return total == EMPTY_STACK_INDICATOR; }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return {@code true} jeśli na stosie znajduje się maksymalna liczba elementów ({@value #MAX_STACK_SIZE}), {@code false} w przeciwnym razie
     */
    public boolean isFull() { return total == MAX_STACK_SIZE-1; }


    /**
     * Zwraca element znajdujący się na wierzchu stosu, nie usuwając go.
     *
     * @return ostatnio dodany element, albo {@code -1} jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return INVALID_STACK_VALUE;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca element z wierzchu stosu.
     *
     * @return ostatnio dodany element, albo {@code -1} jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return INVALID_STACK_VALUE;
        return numbers[total--];
    }

    /**
     * Zwraca bieżący indeks wierzchołka stosu.
     *
     * @return indeks ostatniego elementu na stosie (od -1 do {@value #MAX_STACK_SIZE}-1)
     */
    public int getTotal() { return total; }
}

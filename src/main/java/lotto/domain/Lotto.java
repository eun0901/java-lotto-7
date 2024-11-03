package lotto.domain;

import java.util.Collections;
import java.util.List;

import static lotto.common.Constants.*;
import static lotto.view.OutputView.getErrorMessage;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
        sortDesc();
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException(getErrorMessage(INVALID_LOTTO_SIZE));
        }
    }

    public Integer size () {
        return numbers.size();
    }

    public boolean compare(List<Integer> numbers) {
        if (numbers == null) {
            return false;
        }

        return this.numbers.equals(numbers);
    }

    @Override
    public String toString () {
        List<String> numbersToString = numbers.stream()
                .map(String::valueOf)
                .toList();

        return String.join(LOTTO_NUMBER_PRINT_DELIMITER, numbersToString);
    }

    private void sortDesc () {
        Collections.sort(numbers);
    }
}

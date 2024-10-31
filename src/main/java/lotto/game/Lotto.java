package lotto.game;

import lotto.Utils.Convertor;
import lotto.dto.LottoPrize;
import lotto.dto.WinningNumbers;
import lotto.io.OutputHandler;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = Convertor.sortNumbers(numbers);
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    // TODO: 추가 기능 구현
    public void printLotto() {
        OutputHandler.printLottos(Convertor.convert(numbers));
    }

    public LottoPrize decideLottoPrize(WinningNumbers winningNumbers) {
        int matchCount = checkMatchingCount(winningNumbers.getSelectedNumbers());
        boolean hasBonusNumber = hasBonusNumber(winningNumbers.getBonusNumber());

        if (matchCount == 5 && hasBonusNumber) {
            return LottoPrize.BONUS;
        }

        if (matchCount > 2) {
            return LottoPrize.values()[matchCount - 3];
        }

        return null;
    }

    private int checkMatchingCount(List<Integer> selectedNumbers) {
        return  (int) numbers.stream()
                .filter(selectedNumbers::contains)
                .count();
    }

    private boolean hasBonusNumber(int bonusNumber) {
        return numbers.contains(bonusNumber);
    }
}
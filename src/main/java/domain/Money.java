package domain;

import java.util.Objects;

public class Money {

    int amount;

    public Money(int money) {
        validate(money);
        this.amount = money;
    }

    private void validate(int money) {
        if (money <= 0) {
            throw new IllegalStateException("돈은 0원 보다 커야합니다.");
        }
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Money money = (Money) o;
        return Objects.equals(amount, money.getAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
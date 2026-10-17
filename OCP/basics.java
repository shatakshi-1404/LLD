interface DiscountPolicy {
    double calculate(double price);
}

class RegularDiscount implements DiscountPolicy {
    public double calculate(double price) {
        return price * 0.05;
    }
}

class PremiumDiscount implements DiscountPolicy {
    public double calculate(double price) {
        return price * 0.10;
    }
}

class DiscountService {
    double calculate(
        DiscountPolicy policy,
        double price
    ) {
        return policy.calculate(price);
    }
}
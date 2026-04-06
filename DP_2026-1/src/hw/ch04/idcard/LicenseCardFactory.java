package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100;
    private String baseDate;
    private String expiryDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
        this.expiryDate = "2031-03-19";
    }

    @Override
    protected Product createProduct(String holder) {
        int currentNumber = licenseCounter++;
        return new LicenseCard(holder, currentNumber, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        LicenseCard card = (LicenseCard) product;
        System.out.println(card.getHolder() + "의 면허증(" + card.getLicenseNumber() + ")을 등록했습니다.");
    }
}
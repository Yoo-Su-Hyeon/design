package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int current = 0;  

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(current);  

        current = (current + 1) % 3;  

        return hand;
    }

    @Override
    public void study(boolean win) {
    }
}
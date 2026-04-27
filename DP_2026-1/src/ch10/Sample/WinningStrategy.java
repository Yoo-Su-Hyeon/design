package ch10.Sample;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) { //직전 승부에서 패했으면, 난수를 사용해서 다음 손을 내민다
            prevHand = Hand.getHand(random.nextInt(3)); //nextInt(3) : 0 부터 2 사이의 난수 정수 생성
        }
        return prevHand; //직전 승부에서 승리했으면, 동일한 손을 내민다
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}

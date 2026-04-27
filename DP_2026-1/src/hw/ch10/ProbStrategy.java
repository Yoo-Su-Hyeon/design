package hw.ch10;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue)); //현재 손 기준 행의 합만큼 범위를 정해서 난수를 뽑음.
        //가중치 비율대로 손을 뽑는 코드
        int handvalue = 0;
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        //현재 손을 이전 손으로 밀고, 새로 뽑은 손을 현재 손으로 저장
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        //숫자를 실제 Hand 객체로 변환하여 반환
        return Hand.getHand(handvalue);
    }

    //history[handvalue] 한 줄의 합 계산
    private int getSum(int handvalue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++; //이기면, 이전 손-> 현재 손 조합의 가중치 1 증가
        } else {    //지면, 다른 두 손 쪽 가중치 증가
            history[prevHandValue][(currentHandValue + 1) % 3]++; 
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}

package practice.ch10;

public class Main {
    public static void main(String[] args) {
        // Hand h1 = Hand.ROCK;
        // Hand h2 = Hand.SCISSORS;

        // // 주먹과 보자기 중 누가 쎄냐 !! 
        // if(h1.isStrongerThan(h2)){
        //     System.out.println(h1+"이"+h2+"보다 강하다.");
        // } else if(h1.isWeakerThan(h2)){
        //     System.out.println(h1+"이"+h2+"보다 약하다.");
        // } else{
        //     System.out.println(h1+"과"+h2+"는 비겼다.");
        // }
        
        // 플레이어 2명 생성
        Player player1 = new Player("유수현", new ProbStrategy(314));  // 하드코드 되어있음
        Player player2 = new Player("홍길동", new WinningStrategy(15));  // 하드코드 되어있음

        // 게임 시키기

        for (int i=0; i<10; i++){
            Hand h1 = player1.nextHand();
            Hand h2 = player2.nextHand();

            //h1과 h2 중 누가 이겻냐!! 
            if(h1.isStrongerThan(h2)){
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if(h1.isWeakerThan(h2)){
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else{
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result");
        System.out.println(player1);
        System.out.println(player2);

    }
}

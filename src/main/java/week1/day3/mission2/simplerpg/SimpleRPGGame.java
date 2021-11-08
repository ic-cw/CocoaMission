package main.java.week1.day3.mission2.simplerpg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class SimpleRPGGame {
    //    5 * 5 배열 초기화
    //    화면 중앙에는 캐릭터 위치
    //    임의의 장소에 몬스터 위치
    //    임의의 장소에 1개의 지뢰를 배치한다. 단 지뢰는 플레이어가 밟기 전까지 화면에 표시하지 않는다.
    //    콘솔 입력으로 WASD 중 하나의 키를 입력받고 엔터를 누르면 캐릭터가 상좌하우로 이동함
    //    캐릭터가 지뢰를 밟으면 사망
    //    캐릭터가 몬스터의 위치까지 이동하면 몬스터가 사라지고 정해진 점수 획득
    //    점수 획득시 새로운 몬스터와 지뢰를 배치한다.
    //    매 턴마다 현재 배열의 상태를 화면에 출력.
    //    똑같이 구현하지 않아도 되니 재미있는 게임을 만들어 보자.
    public static void main(String[] args) {
        SimpleRPGGame s = new SimpleRPGGame();
        s.run();
    }

    private void run() {
        Random rd = new Random();
        Character character = createCharacter();
        Bomb bomb = createBomb(rd);
        Monster monster = createMonster(rd, bomb);
        System.out.println(character.getXCoordinate() + " " + character.getYCoordinate());
        System.out.println(bomb.getXCoordinate() + " " + bomb.getYCoordinate());
        System.out.println(monster.getXCoordinate() + " " + monster.getYCoordinate());
    }

    private Character createCharacter() {
        Character characterLocation = new Character(2, 2);
        return characterLocation;
    }

    private Bomb createBomb(Random rd) {
        Bomb bombLocation = new Bomb(rd.nextInt(5), rd.nextInt(5));
        if (bombLocation.getXCoordinate() == 2 && bombLocation.getYCoordinate() == 2) {
            createBomb(rd);
        }
        return bombLocation;
    }

    private Monster createMonster(Random rd, Bomb bomb) {
        System.out.println(bomb);
        Monster monsterLocation = new Monster(rd.nextInt(5), rd.nextInt(5));
        System.out.println(bomb.getXCoordinate() + "   " + bomb.getYCoordinate());
        if (monsterLocation.getXCoordinate()==bomb.getXCoordinate() && monsterLocation.getYCoordinate() == bomb.getYCoordinate()) {
            createMonster(rd, bomb);
        }
        return monsterLocation;
    }
}

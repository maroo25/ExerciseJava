public class Exercise6_9 {
}

class Marine {
    int x=0, y=0; // Marine (x,y) 의 위치좌표
    int hp = 60; // 현재 체력
    static int weapon = 6; // 공격력
    static int armor = 0; // 방어력
    static void weaponUp() {
        weapon++;
    }
    static void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x; // this.x , x 는 인스턴스 변수 는 지역변수
        this.y = y; // this.y , y 는 인스턴스 변수 는 지역변수
    }
}

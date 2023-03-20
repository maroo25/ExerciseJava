public class Coffee {
    String name;
    int shot, syrup, milk; //30 , 10, 50
    static int volumeOfCup = 500;

    static int Water(Coffee c){  // 클래스 메서드, 참조형 매개변수
        return Coffee.volumeOfCup - (c.shot*30 + c.syrup*10 + c.milk*50);
    } //클래스메서드, 참조형 매개변수

    int Water2(){  // 인스턴스 메서드는 매개변수를 필요로하지 않는다.
        return Coffee.volumeOfCup - (shot*30 + syrup*10 + milk*50);
    }  //인스턴스 메서드

    static int Water3(int shot, int syrup, int milk){  // 클래스 메서드, 기본형 매개변수
        return Coffee.volumeOfCup - (shot*30 + syrup*10 + milk*50);
    }

    Coffee(){
        this("latte", 2, 0, 1);   // Coffee() 생성자 안에 this로 또다른 Coffee 생성자 호출 : 생성자 간의 호출 this 사용
    }

    Coffee(String name){
        this(name, 2, 0, 1);
    }

    Coffee(String name, int shot, int syrup, int milk){ //Coffee() 생성자의 매개변수 String name의 값을
        this.name = name;   // 인스턴스 변수 name에 저장한다. 구분이 안 되므로, 인스턴스 변수 앞에 this. 를 붙인다.
        this.shot = shot;   // 이처럼 생성자의 매개변수로, 인스턴스 변수들의 초기값을 제공받는 경우가 많은데,
        this.syrup = syrup;   // 이때 변수 이름이 일치하는 경우가 많으므로, this를 사용해 구분한다.
        this.milk = milk;   // static은 인스턴스 생성 없이도 호출가능하므로, this를 사용할 수 없다.
    }

}

class CoffeeTest{
    public static void main(String args[]){

        Coffee cof4 = new Coffee();
        System.out.println("cof4 is " + cof4.name + " with " + cof4.shot + "shots, " + cof4.syrup + " syrups, " + cof4.milk + "mL of milk");

//        Coffee cof5 = new Coffee();
//        System.out.println("cof4 " + cof5.name + " needs " + cof5.Water2() + "ml of water");

        Coffee cof6 = new Coffee("caramel Latte");
        System.out.println("cof6 " + cof6.name + " needs " + cof6.Water2() + "mL of water");


//        Coffee cof1 = new Coffee();
//        cof1.name = "latte";
//        cof1.shot = 3;
//        cof1.syrup = 2;
//        cof1.milk = 3;
//
//        Coffee cof2 = new Coffee();
//        cof2.name = "americano";
//        cof2.shot = 2;
//        cof2.syrup = 0;
//        cof2.milk = 0;
//
//        Coffee cof3 = new Coffee();
//        cof3.name = "americano2";
//
//        System.out.println(cof1.name+" needs "+Coffee.Water(cof1)+"mL of water.");
//        System.out.println(cof2.name+" needs "+cof2.Water2()+"mL of water.");
//        System.out.println(cof3.name+" needs "+Coffee.Water3(3,2,0)+"mL of water.");
    }

}


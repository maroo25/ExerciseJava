public class Exercise6_18{ //MemberCall
        int iv = 10;
        static int cv = 20;
        int iv2 = cv;
//        static int cv2 = iv; // A - 라인 컴파일 에러
        static void staticMethod1() {
            System.out.println(cv);
 //           System.out.println(iv); // B - 라인 컴파일 에러
        }
        void instanceMethod1() {
            System.out.println(cv);
//            System.out.println(iv); // C 라인
        }
        static void staticMethod2() {
            staticMethod1();
//            instanceMethod1(); // D - 라인 컴파일 에러
        }
        void instanceMethod2() {
//            staticMethod1(); // E 라인
            instanceMethod1();
        }
    }

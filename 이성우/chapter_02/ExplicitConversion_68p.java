package chapter_02;

public class ExplicitConversion_68p {

    public static void main(String[] args) {

        /*
         * <명시적 형변환> - 66쪽
         * 
         * 묵시적 형변환과 반대의 경우.
         * 
         * 바이트 크기가 큰 자료형에서 작은 자료형으로 대입할 경우 쓸 수 있다. 
         * 강제로 형을 바꾸려면 바꿀 형을 괄호를 써서 명시.
         * 
         * 자료손실이 발생.
         * 
         */

        double dNum = 3.14;
        int iNum2 = (int) dNum;         // 실수인 double형 변수 dNum에 3.14를 대입하고 초기화. 그 후 정수자료형 int로 형변환하고 변수 iNum2에 대입.
        System.out.println(iNum2);      // 강제형변환 후. 자료손실(소수점이하 생략) 발생하고. 정수인 3만 출력.

        
        double dNum1 = 1.2;             // 실수 double형 dNum1 변수에 1.2 대입하고 초기화.
        float fNum2 = 0.9F;             // float형 fNum2 변수에 0.9F 대입하고 초기화.

        int iNum3 = (int) dNum1 + (int) fNum2;  // dNum1변수를 int형으로 강제 형변환, fNum2변수를 int형으로 강제 형변환. 각각 형변환 후 더해짐. (명시적형변환)
        int iNum4 = (int) (dNum1 + fNum2);      // dNum1 변수와 fNum2 변수를 더한 후 int형으로 강제 형변환. (명시적형변환)

        System.out.println(iNum3);              // 각각 명시적 형변환 후 dNum1 은 1, fNum2는 0으로 변환된 값을 더한 후 출력.
        System.out.println(iNum4);              // 우선 dNum1과 fNum2가 묵시적형변환으로 더해진 후. int형으로 명시적 형변환을 함.
                                                // 1.2+0.9 = 2.2 이후 int형으로 형변환하여 결과값은 2가 나온다.
    }

}

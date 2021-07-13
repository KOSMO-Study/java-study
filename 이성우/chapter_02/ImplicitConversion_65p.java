package chapter_02;

public class ImplicitConversion_65p {

    public static void main(String[] args) {

        /*
         * <형변환>
         * 
         * 하나의 자료형으로 통일 한 후 연산을 할 때 '형변환(type conversion)이 이루어 진다.
         * 
         * 형변환 종류는 
         * 1.묵시적형변환(자동형변환) 
         * 2.명시적형변환(강제형변환) 이 있다.
         * 
         * 형 변환의 기본 원칙. 
         * 1. 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어진다. 
         * 2. 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이루어진다.
         * 
         * 기본원칙과 반대로 형변환이 안되는 이유는 '자료손실' 때문.
         * 
         */

        byte bNum = 10;             // byte형 변수 bNum 선언과 동시에 값 10 대입.
        int iNum = bNum;            // byte형 변수 bNum 값을 int형 변수 iNum에 대입함.

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;             // int형 변수 iNum2 선언과 동시에 값 20을 대입.
        float fNum = iNum2;         // 더 정밀한 float형으로 iNum2가 실수형은 float형으로 변환.

        System.out.println(iNum);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;         // 우선적으로 iNum이 float 형으로 형변환 되어 fNum과 연산되고, 연산이 된 후 dNum으로 대입하기 위해 double형으로 변환되어 대입.
                                    // 묵시적 형 변환.
        System.out.println(dNum);

    }

}

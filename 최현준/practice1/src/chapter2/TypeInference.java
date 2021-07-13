package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10;				//int i = 10으로 컴파일됨
		var j = 10.0;			//double j = 10으로 컴파일됨
		var str = "hello";		//String str = "hello"로 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str="test";		//다른 문자열은 대입 가능
		//str=3;
	}

}

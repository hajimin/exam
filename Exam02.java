package z_exam;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * [2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
		 * 
		 *        1byte,   2byte,   4byte,   8byte
		 * 논리형    boolean
		 * 문자형                        char
		 * 정수형      byte	   short     int      long
		 * 실수형                                         float    double
		 * 
		 * 
		 * - 정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * - 실수 : float(4byte), double(8byte) <-조금더 정확
		 * - 문자 : char(2byte)
		 * - 논리 : boolean(1byte) 참,거짓
		 * 
		 * [2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형(data type)을 선택해야 할까? 
		 * regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로 초기화 하는 한 줄의 코드를 적으시오.
		 * 
		 * byte _regNo;
		 * _regNo = 9508102401329;
		 * 
		 * long regNo = 9508102401329L;
		 * 
		 * [2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		 * int i = 100;
		 * long l =100L;
		 * final float PI = 3.14f;
		 * 
		 * - 리터럴 : 100, 100L, 3.14f
		 * - 변수 : i, l
		 * - 키워드 : int, long, final, float
		 * - 상수 : PI
		 * 
		 * 리터럴(=상수/변하지 않는값)의 종류
		 * - 숫자 : 0, 10, -5, 3.14
		 * - 문자 : '가', 'a', '0', ''
		 * - 문자열 : "가나다", "abc", "123", " ", "" 공백, 아무것도 없어도 문자열
		 * - 그외 : true, false, null
		 * 
		 * 
		 * [2-4] 다음 중 기본형(primitive type)이 아닌 것은?
		 * a. int
		 * b. Byte (O)
		 * c. double
		 * d. boolean
		 * 
		 * [2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오류’라고 적으시오.
		 * System.out.println(“1” + “2”) → ( 12 )
		 * System.out.println(true + “”) → ( true )
		 * System.out.println(‘A' + 'B') → ( AB )
		 * System.out.println('1' + 2) → ( 오류 )
		 * System.out.println('1' + '2') → ( 오류 )
		 * System.out.println('J' + “ava”) → ( java )
		 * System.out.println(true + null) → ( 오류 )
		 * 
		 * [2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
		 * a. if      
		 * b. True    (O)
		 * c. NULL    (O)
		 * d. Class   (O)
		 * e. System  (O)
		 * 
		 *
		 * 
		 *[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
		 *a. $ystem       (O)
		 *b. channel#5
		 *c. 7eleven
		 *d. If           (O)
		 *e. 자바                    (O)
		 *f. new
		 *g. $MAX_NUM     (O)
		 *h. hello@com
		 * 
		 * 명명규칙
		 * - 블럭안에서 변수명은 중복될 수 없다.
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다. (한글사용자제)
		 * - 대소문자가 구분되며 길이에 제한이 없다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.
		 * - [기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
		 * - [여러 단어로 이루어지는 경우 단어의 첫 글자를 대문자로 한다.(상수는 언더바로 구분)]
		 * - [클래스명의 첫글자는 대문자로 한다.]
		 * - [패키지명은 모두 소문자로 한다.]
		 * 
		 * 
		 * [2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오)
		 * a. int    (O)
		 * b. long   
		 * c. short  
		 * d. float  (O)
		 * e. double  
		 *   
		 * 
		 * 참조형 타입
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * - ex) String, Variable, int[], 
		 * - 값이 직접 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다. 주소를 (확인)참조할 수 있어서 참조형 타입
		 * - 변수의 크키는 4byte 이다
		 * 
		 * [2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
		 * byte b = 10;
		 * char ch = 'A';
		 * int i = 100;
		 * long l = 1000L;
		 * 
		 * a. b = (byte)i;           
		 * b. ch = (char)b;           (O)
		 * c. short s = (short)ch;    
		 * d. float f = (float)l;     (O)
		 * e. i = (int)ch;            (O)
		 * 
		 * [2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		 * 
		 * 
		 * [2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
		 *(O) a. byte b = 256; 127까지만됨
		 *(O) b. char c = ''; char는 반드시 한 개의 문자를 지정해야함
		 *(O) c. char answer = 'no'; 한개 문자만
		 *(O) d. float f = 3.14 f가 없어서
		 * e. double d = 1.4e3f; 생략가능
		 * 
		 * [2-12] 다음 중 main메서드의 선언부로 알맞은 것은? (모두 고르시오)
		 * (O) a. public static void main(String[] args) void main
		 * (O) b. public static void main(String args[]) void main
		 * (O) c. public static void main(String[] arv)  void main
		 * d. public void static main(String[] args) 
		 * (O) e. static public void main(String[] args) static public 순서가 바뀌어도 됨
		 * 
		 * 
		 * [2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
		 * 
		 * a. boolean - false 
		 * b. char - '\u0000' 
		 * c. float - 0.0     (O) f
		 * d. int - 0         
		 * e. long - 0        (O) L
		 * f. String - ""     (O) 참조형 기본값 null
		 */

	}

}

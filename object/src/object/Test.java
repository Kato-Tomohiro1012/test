package object;

public class Test {

	public static void main(String[] args){

	Person taro = new Person();

	taro.name="山田太郎";
	taro.age=20;

	System.out.println(taro.name);
	System.out.println(taro.age);
	taro.talk();
	taro.walk();

	taro.name="木村次郎";
	taro.age=18;

	System.out.println(taro.name);
	System.out.println(taro.age);

	taro.name="鈴木花子";
	taro.age=16;

	System.out.println(taro.name);
	System.out.println(taro.age);

	taro.name="加藤友寛";
	taro.age=25;

	System.out.println(taro.name);
	System.out.println(taro.age);

	taro.phoneNumber="090";
	taro.address="神奈川";

	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);

	Robot aibo = new Robot();

	aibo.name="アイボ";

	aibo.talk();
	aibo.walk();
	aibo.run();

	Robot asimo = new Robot();

	asimo.name="アシモ";

	asimo.talk();
	asimo.walk();
	asimo.run();

	Robot pepper = new Robot();

	pepper.name="ペッパー";

	pepper.talk();
	pepper.walk();
	pepper.run();

	}
}

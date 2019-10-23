import java.util.Scanner;

public class Dome1 {
    public static void main(String[] area){
	    int a = 0;
		int b = 0;
		int mode = 0;// 0:加 1:减 2:乘 3:除
		int result = 0;
		int i = 0;
		int x = 0;
		int key = 0;
		int end[] = new int[100];
		char m = 0;
		int a1[] = new int[100];
		int b1[] = new int[100];
		char f[] = new char[100];
		int s = 0;
		int t = 0;
		int p = 0;
		boolean key1 = true ;
		Scanner reader = new Scanner(System.in);
		while (key1) {
			System.out.println("请输入想要打印题目的数量");
			x = reader.nextInt();
			if (x % 2 == 0 || x % 1 == 0) {
				key1 = false;
				System.out.println("正确");
			}

			else {
				key1 = true;
				System.out.println("输入错误，请重新输入");
			}
		}
		key1 = true ;
		while (key1) {
			System.out.println("请输入想打印题目的范围");
			t = reader.nextInt();
			t = (int) (Math.random() * t + 1);
			if (t % 2 == 0 || t % 1 == 0) {
				key1 = false;
				System.out.println("正确");
			}

			else {
				key1 = true;
				System.out.println("输入错误，请重新输入");
			}
		}
		key1 = true ;
		while (key1) {
			System.out.println("是否需要含有乘除法，不需要输入“2”需要输入“4”");
			s = reader.nextInt();
			if (s == 2 || s == 4) {
				key1 = false;
				System.out.println("正确");
			} else {
				key1 = true;
				System.out.println("输入错误，请重新输入");
			}
		}
		key1 = true ;
		while (key1) {
			System.out.println("是否需要含有负数结果的题目，需要输入“1”，不需要输入“2”") ;
			p = reader.nextInt() ;
			switch (p) {
			case 1:{
				for (i = 0; i < x; i++) {
					a = (int) (Math.random() * t + 1);
					b = (int) (Math.random() * t + 1);
					mode = (int) (Math.random() * s + 1);
					switch (mode) {
					case 0:
						m = '+';
						result = a + b;
						break;
					case 1:
						m = '-';
						result = a - b;
						break;
					case 2:
						m = '*';
						result = a * b;
						break;
					case 3:
						m = '/';
						result = a / b;
						break;
					default:
						System.out.println("somethingis wrong!\n");
						break;
					}
					end[i] = result;
					a1[i] = a;
					b1[i] = b;
					f[i] = m;
					if (result > 100) {
						i--;
						continue;
					}
					System.out.print(a + " ");
					System.out.print(m + " ");
					System.out.print(b + " ");
					System.out.println("=");
				}
				key1 = false ;
				break;
				}
			case 2: {
				for (i = 0; i < x; i++) {
					a = (int) (Math.random() * t + 1);// 随机数部分
					b = (int) (Math.random() * t + 1);
					mode = (int) (Math.random() * s + 1);
					switch (mode) {
					case 0:
						m = '+';
						result = a + b;
						break;
					case 1:
						m = '-';
						result = a - b;
						break;
					case 2:
						m = '*';
						result = a * b;
						break;
					case 3:
						m = '/';
						result = a / b;
						break;
					default:
						System.out.println("somethingis wrong!\n");
						break;
					}
					end[i] = result;
					a1[i] = a;
					b1[i] = b;
					f[i] = m;
					if (result > 100 || result < 0) {
						i--;
						continue;
					}
					System.out.print(a + " ");
					System.out.print(m + " ");
					System.out.print(b + " ");
					System.out.println("=");
				}
				key1 = false ;
				break;
			}
				
			default:
				System.out.println("输入的数值错误");
				key1 = true;
				break;
			}
		}
		System.out.println("请输入“1”查看结果");
		key = reader.nextInt();
		if (key == 1) {
			for (i = 0; i <= x - 1; i++) {
				System.out.print(a1[i]);
				System.out.print(f[i]);
				System.out.print(b1[i]);
				System.out.print("=");
				System.out.print(end[i]+"\n");
			}
		}
		System.out.println("好好学习，天天向上");

	}
}

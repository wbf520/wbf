import java.util.Scanner;

public class Dome1 {
    public static void main(String[] area){
	    int a = 0;
		int b = 0;
		int mode = 0;// 0:�� 1:�� 2:�� 3:��
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
			System.out.println("��������Ҫ��ӡ��Ŀ������");
			x = reader.nextInt();
			if (x % 2 == 0 || x % 1 == 0) {
				key1 = false;
				System.out.println("��ȷ");
			}

			else {
				key1 = true;
				System.out.println("�����������������");
			}
		}
		key1 = true ;
		while (key1) {
			System.out.println("���������ӡ��Ŀ�ķ�Χ");
			t = reader.nextInt();
			t = (int) (Math.random() * t + 1);
			if (t % 2 == 0 || t % 1 == 0) {
				key1 = false;
				System.out.println("��ȷ");
			}

			else {
				key1 = true;
				System.out.println("�����������������");
			}
		}
		key1 = true ;
		while (key1) {
			System.out.println("�Ƿ���Ҫ���г˳���������Ҫ���롰2����Ҫ���롰4��");
			s = reader.nextInt();
			if (s == 2 || s == 4) {
				key1 = false;
				System.out.println("��ȷ");
			} else {
				key1 = true;
				System.out.println("�����������������");
			}
		}
		key1 = true ;
		while (key1) {
			System.out.println("�Ƿ���Ҫ���и����������Ŀ����Ҫ���롰1��������Ҫ���롰2��") ;
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
					a = (int) (Math.random() * t + 1);// ���������
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
				System.out.println("�������ֵ����");
				key1 = true;
				break;
			}
		}
		System.out.println("�����롰1���鿴���");
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
		System.out.println("�ú�ѧϰ����������");

	}
}

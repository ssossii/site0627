package site0627;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyboardInput {
	public static void main(String[] args) {
		//��� �Է� ��Ʈ���� �ֻ��� Ŭ�����̴�
		//����  �� � ������ �Է±�⸦ ����Ѵ� ������, ��Ŭ����
		//�� ���۷��� �Ҽ� �ִ�
		//Ű����� ���� ��Ʈ���� �̹� �����Ǿ� �ִ� �� �����ڰ� ����
		//�� �� �ִ°��� �ƴ϶�, �ý��������� �����ȴ� ����
		//System Ŭ������ ���� ���� �� �ִ�
		System.out.println();
		InputStream is= System.in;
		
		InputStreamReader reader = new InputStreamReader(is);

		try {
			int data=0;
			while(true) {
				data=reader.read();
				System.out.print((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

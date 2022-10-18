package khie;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * java ��Ʈ���� ����
 * 1. ����Ʈ ��Ʈ�� ���� Ŭ����
 * 	  - ����Ʈ ��Ʈ�� ������� �����͸� ������ϴ� Ŭ����
 * 	  ==> xxxInputStream / xxxOutputStream
 * 
 * 2. ���� ��Ʈ�� ���� Ŭ����
 *    - ���� ��Ʈ�� ������� �����͸� ������ϴ� Ŭ����
 *    ==> xxxReader / xxxWriter
 * 
 * 3. ����Ʈ ��Ʈ�� -> ���� ��Ʈ������ ��ȯ ���� Ŭ����
 * 	  ==>InputStreamReader / OutputStreamWriter
 */

/*
 * ����� ���� Ŭ���� !
 * 
 * InputStreamReader : Ű����� ���� 1����Ʈ�� �о����, ��ü������ �Ű������� System.in�־�� �ֿܼ� Ű���� �Է� ���� 
 * Reader : �о���� (�߻�Ŭ����) �����ڴ� xxxReader
 * bufferedxxx: ������Ʈ�� ó�� �ð� ���� ����
 * FileInputStream : ���� �о����
 * FileOutputStream : ���� ����ϱ�(����)
 * File : ���� �Ӽ�,��¥ ��� �����ϱ�
 * FileWriter : ����(�޸��� ��) �ȿ� �� �ֱ� 
 */

/*
 * ����� Ŭ���� ���� �޼���
 * InputStreamReader : ��������.read(); <-������ ������ �о� ���¸޼���, intŸ������ ��ȯ�Ѵ�
 * Reader : �߻�Ŭ������ ��ü����� ������ �ʿ�, ��������.read(); <-������ ������ �о� ���¸޼���, intŸ������ ��ȯ�Ѵ�
 * Bufferedxxx : ��ü������ �������� �Ű������� ��Ʈ�� ���������� �־�� �Ѵ�.
 * FileINputStream : ��������.read();
 * FileOutputStream : ��������.write(); <- �Ű������� �����ϰ� ���� ���� �Է�
 * File : ��ü ���� �� �Ű������� ��� ����  mkdir()<- ������ ������ ����� �ִ� �޼��� , createfile<- ������ ������ ����� �ִ� �޼���
 * FileWriter : ��ü ���� �� �Ű������� ��� �Է� ��������.write() <-���� �Է��Ҷ� ���� �޼���,�Ű������� ���� �Է�, ��������.newline <- �ٹٲ�
 */
public class Ex03 {

	public static void main(String[] args) {
			
		System.out.println("�Է� �� �� �̶�� �Է��ϼ���.");
		
		InputStreamReader isr = new InputStreamReader(System.in); // �ֿܼ� Ű����� �Է� �ϰ� ���ִ� ���
		

		try {
			while(true) {
				int readByte = isr.read();				//�ֿܼ� Ű����� �Է��� ����Ʈ���� �о� ���� ���
				
				if(readByte == '��') {					//if '��'�� �Էµ� ��� while�� ��������
					break;
				}
				System.out.print((char)readByte);		//read() : intŸ������ ��ȯ�Ǳ� ������ ����� ����ȯ�� �ؾ��Ѵ�.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				isr.close();			//InputStreamReader �ݱ� (try~catch �ʿ�)
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}

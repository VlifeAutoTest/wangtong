package studentdemo;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		score = sc.nextInt();
		judgeScore(score);
		/*Student stu =new Student();
		System.out.println(stu.judgeScore(90));*/
													
	}
	/**
	 * �ж�ѧ���ɼ��ȼ�
	 * @param score
	 * @return 
	 */
	public static String judgeScore(int score){
		int grade = score/10;
		if (score>=0&&score<=100) {
			switch (grade) {
			case 10:
			case 9:
				System.out.println("���ĳɼ�Ϊ:"+score+"�ȼ�ΪA��");
				return"A";
			case 8:
				System.out.println("���ĳɼ�Ϊ:"+score+"�ȼ�ΪB��");
				return"B";
			case 7:
				System.out.println("���ĳɼ�Ϊ:"+score+"�ȼ�ΪC��");
				return"C";
			case 6:
				System.out.println("���ĳɼ�Ϊ:"+score+"�ȼ�ΪD��");
				return"D";
			default:
				System.out.println("�ܱ�Ǹ�����ĳɼ�Ϊ��������Ŭ����");
				return"N";
			}
		} else {
			System.out.println("�Բ���������ɼ���Ч�����ɼ�Ӧ��1-100֮�䣩");
			return"F";
		}
	}

}
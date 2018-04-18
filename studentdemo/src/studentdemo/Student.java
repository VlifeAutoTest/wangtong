package studentdemo;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		score = sc.nextInt();
		judgeScore(score);
		/*Student stu =new Student();
		System.out.println(stu.judgeScore(90));*/
													
	}
	/**
	 * 判断学生成绩等级
	 * @param score
	 * @return 
	 */
	public static String judgeScore(int score){
		int grade = score/10;
		if (score>=0&&score<=100) {
			switch (grade) {
			case 10:
			case 9:
				System.out.println("您的成绩为:"+score+"等级为A！");
				return"A";
			case 8:
				System.out.println("您的成绩为:"+score+"等级为B！");
				return"B";
			case 7:
				System.out.println("您的成绩为:"+score+"等级为C！");
				return"C";
			case 6:
				System.out.println("您的成绩为:"+score+"等级为D！");
				return"D";
			default:
				System.out.println("很抱歉！您的成绩为不及格，请努力！");
				return"N";
			}
		} else {
			System.out.println("对不起，您输入成绩无效！（成绩应在1-100之间）");
			return"F";
		}
	}

}
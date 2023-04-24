package test0421;

public class Job {
	String name;
	String job;
	int money = 2000000;
	
	public void Employee (String name, String job) {
		if(job.equals("사원")) {
			System.out.println(name + job + "님의 급여는 " + money + "원 입니다.");
		}else if(job.equals("주임")) {
			System.out.println(name + job + "님의 급여는 " + (money+(money*10/100)) + "원 입니다.");
		}else if(job.equals("대리")) {
			System.out.println(name + job + "님의 급여는 " + (money+(money*20/100)) + "원 입니다.");
		}else if(job.equals("과장")) {
		System.out.println(name + job + "님의 급여는 " + (money+(money*30/100)) + "원 입니다.");
		}else if(job.equals("차장")) {
			System.out.println(name + job + "님의 급여는 " + (money+(money*40/100)) + "원 입니다.");
		}else if(job.equals("팀장")) {
			System.out.println(name + job + "님의 급여는 " + (money+(money*50/100)) + "원 입니다.");
		}else {
			System.out.println("남은 돈 다 님 꺼");
		}
	}
}

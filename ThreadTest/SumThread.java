
public class SumThread extends Thread{
	public long startnumber;
	public long endnumber;
	public long sum;
	public SumThread(long startnumber,long endnumber){
		this.startnumber = startnumber;
		this.endnumber = endnumber;
		this.sum=0;
	}//쓰레드 초기화,각자 쓰레드가 처음시작할숫자와 끝날 숫자를 정함
	public void run(){
		long a=startnumber;
			for(int i=(int)a;i<=endnumber;i++)
				{sum+=startnumber;
				startnumber+=1;
				}//startnumber부터 endnumber까지 더하기
	}

	}
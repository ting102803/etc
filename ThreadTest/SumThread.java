
public class SumThread extends Thread{
	public long startnumber;
	public long endnumber;
	public long sum;
	public SumThread(long startnumber,long endnumber){
		this.startnumber = startnumber;
		this.endnumber = endnumber;
		this.sum=0;
	}//������ �ʱ�ȭ,���� �����尡 ó�������Ҽ��ڿ� ���� ���ڸ� ����
	public void run(){
		long a=startnumber;
			for(int i=(int)a;i<=endnumber;i++)
				{sum+=startnumber;
				startnumber+=1;
				}//startnumber���� endnumber���� ���ϱ�
	}

	}
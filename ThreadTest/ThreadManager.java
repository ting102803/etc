
public class ThreadManager {
	SumThread A[];
	public void createThread(long a,int b){
		A = new SumThread[b];
		long start = 1;
		long end = a/b;//ù �������� �����ڸ� �����ش�.
	for(int i =0;i<b;i++){
		A[i]=new SumThread(start,end);
		A[i].start();
		start += a/b;
		end += a/b;//���� ������� a/b��ŭ ���Ѱ����� �����Ѵ�.
	}}
	
	public long getSumOfNum() throws InterruptedException{
		long result=0;
		for(int i=0; i<A.length;i++){
			A[i].join(); 
			result+=A[i].sum;
		}//���ϱ����� A[i]�� ����Ǿ����� Ȯ���� ���Ѵ�
		return result;
	}}
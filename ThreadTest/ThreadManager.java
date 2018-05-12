
public class ThreadManager {
	SumThread A[];
	public void createThread(long a,int b){
		A = new SumThread[b];
		long start = 1;
		long end = a/b;//첫 쓰레드의 끝숫자를 정해준다.
	for(int i =0;i<b;i++){
		A[i]=new SumThread(start,end);
		A[i].start();
		start += a/b;
		end += a/b;//다음 쓰레드는 a/b만큼 더한값부터 시작한다.
	}}
	
	public long getSumOfNum() throws InterruptedException{
		long result=0;
		for(int i=0; i<A.length;i++){
			A[i].join(); 
			result+=A[i].sum;
		}//더하기전에 A[i]가 종료되었는지 확인후 더한다
		return result;
	}}
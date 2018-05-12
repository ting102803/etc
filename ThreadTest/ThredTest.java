
public class ThredTest {

	public static void main(String[] args) throws InterruptedException {
	long start, end;
	ThreadManager tm = new ThreadManager();

		
	System.out.println("=== N과 M의 값에 따른 실행시간 측정 ===");
	System.out.printf("쓰레드 숫자 : %20d개      %50d개       %70d개      %70d개    %80d개\n",1,2,4,8,16);
	for(long N=16;N<=300000000;N*=4){
		for(int M=1; M<=16;M*=2){
		tm.createThread(N,M);//숫자 N까지 더하기는 하는데 M개의 쓰레드로 한다
		start = System.nanoTime();
		System.out.printf ("합계 : %18d",tm.getSumOfNum());//합계를 추출
		end = System.nanoTime();
		System.out.printf("    걸린시간 : %9d\t",end - start);
	}
	System.out.println();
	}}}
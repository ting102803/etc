
public class ThredTest {

	public static void main(String[] args) throws InterruptedException {
	long start, end;
	ThreadManager tm = new ThreadManager();

		
	System.out.println("=== N�� M�� ���� ���� ����ð� ���� ===");
	System.out.printf("������ ���� : %20d��      %50d��       %70d��      %70d��    %80d��\n",1,2,4,8,16);
	for(long N=16;N<=300000000;N*=4){
		for(int M=1; M<=16;M*=2){
		tm.createThread(N,M);//���� N���� ���ϱ�� �ϴµ� M���� ������� �Ѵ�
		start = System.nanoTime();
		System.out.printf ("�հ� : %18d",tm.getSumOfNum());//�հ踦 ����
		end = System.nanoTime();
		System.out.printf("    �ɸ��ð� : %9d\t",end - start);
	}
	System.out.println();
	}}}
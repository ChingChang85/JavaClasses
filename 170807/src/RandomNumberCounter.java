import java.util.Random;

/**
* ��@�ɶ��O���G
 * ����G<08/07>: <00:00>~<00:00>: <00:00>
 * �{���ؼСG
 * �]�p�W��G
 * �]�p�Q�k�G
 * �����X�G
 *  
 */

/**
 * @author User
 *
 */
public class RandomNumberCounter {
	
	Random random = new Random();
	int[] NumCounts = new int[10];
	double[] Percents = new double[10];
	int i,minNum, maxNum,AllTimes;
	
	
	
	public int[] allHitCounts(){
		

		for (int id = 0; id < AllTimes; id++) {
			
			i = random.nextInt(maxNum+1);
			
			NumCounts[i] = NumCounts[i] + 1;
			
		}
		
		return NumCounts ;
		
	}
	public double[] allHitPercents(){
		
		for (int id = 0; id < maxNum; id++) {
			
			
			Percents[id] = (NumCounts[id]*100)/AllTimes;
			
		}
		
		
		return Percents;
		
	}
	public int hitCountOf(int number){
				
		return NumCounts[number];
		
	}
	public double hitPercentOf(int number){
		
		return Percents[number];
		
	}
	public int[] allNumbers(){
		
		return NumCounts;
		
	}
	boolean excute(int minNum, int maxNum, int rollTimes){
		if(minNum>=maxNum&&AllTimes<1){
			return false;
		}
		else{
			return true;
		}
		
		
	}
	public static void main(String[] args) {
		RandomNumberCounter randomNumberCounter = new RandomNumberCounter();
		int minNum = 0, maxNum = 9, AllTimes = 1000 ,number=5;
		boolean istrue;
		istrue = randomNumberCounter.excute(minNum, maxNum, AllTimes);
		if (istrue) {
			randomNumberCounter.minNum = minNum;
			randomNumberCounter.maxNum = maxNum;
			randomNumberCounter.AllTimes = AllTimes;
			randomNumberCounter.NumCounts = randomNumberCounter.allHitCounts();
			for (int id = 0; id <= maxNum; id++) {
				
				System.out.println(id+"�����ͦ���:"+randomNumberCounter.NumCounts[id]);
				
			}
			
			randomNumberCounter.Percents = randomNumberCounter.allHitPercents();
			
			for (int id = 0; id <= maxNum; id++) {
				
				System.out.println(id+"�����;��v:"+randomNumberCounter.Percents[id]+"%");
				
			}
			
			System.out.println(number+"�����ͦ���:"+randomNumberCounter.NumCounts[number]);
		
			System.out.println(number+"�����;��v:"+randomNumberCounter.Percents[number]);
			
			System.out.println("�`�@���ͦ���"+AllTimes);
			
		}
	}

}

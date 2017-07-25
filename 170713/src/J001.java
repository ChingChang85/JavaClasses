/**
 * 實作時間記錄： 日期：<07/17>: <14:50>~<15:40>: <00:50> 
 * 程式目標：請使用Math.random()，產生0到9的亂數，並計算在100之後，每個數字出現的比例 
 * 設計規格:輸入0到9的數字，然後產生亂數，輸出算出每個數字出現的比例
 * 設計想法：
 * 出現次數英文:iHitCnts
 * 把Math.random()包起來 
 * 虛擬碼:
 * 產生一個矩陣，長度為10。出現0的次數，依此類推
 * 呼叫亂數100次
 * 依產生數字，更新該數字出現次數
 * 最後，計算數字出現比例
 * 輸出
 */
public class J001 {
	public static void main(String[] args) {
		int[] iHitCnts = new int[10];
		for (int id = 0; id < 100; id++) {
			int iNum = (int) (10 * Math.random());
			iHitCnts[iNum]++;
		}
		for (int id = 0; id < iHitCnts.length; id++) {
			double dblPercent = 100.0 * (iHitCnts[id] / 100.0);
			System.out.printf("數字:" + id + "出現比例:" + "%.2f", dblPercent);
			System.out.println("%");
		}
	}

}
/**
 * ��@�ɶ��O���G ����G<07/17>: <14:50>~<15:40>: <00:50> 
 * �{���ؼСG�Шϥ�Math.random()�A����0��9���üơA�íp��b100����A�C�ӼƦr�X�{����� 
 * �]�p�W��:��J0��9���Ʀr�A�M�Უ�ͶüơA��X��X�C�ӼƦr�X�{�����
 * �]�p�Q�k�G
 * �X�{���ƭ^��:iHitCnts
 * ��Math.random()�]�_�� 
 * �����X:
 * ���ͤ@�ӯx�}�A���׬�10�C�X�{0�����ơA�̦�����
 * �I�s�ü�100��
 * �̲��ͼƦr�A��s�ӼƦr�X�{����
 * �̫�A�p��Ʀr�X�{���
 * ��X
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
			System.out.printf("�Ʀr:" + id + "�X�{���:" + "%.2f", dblPercent);
			System.out.println("%");
		}
	}

}
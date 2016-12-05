//�ۑ�̗v���𖞂������߂ɂ͎��ƒ��ɑg�񂾃v���O������and�Ɋ����邾���ł悩�������A���̃p�[�Z�v�g�����́u���`�����\�v�Ȗ��ɂ̂ݗL���Ƃ��������͗l�X�Ȗ�����`�����\�ɂȂ�悤�H�v����΃A���S���Y�����̂̓V���v�������͂Ȃ̂ŁA�ƂĂ��ėp��������Ǝv�����B
package perceptron;

public class Perceptron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nu[] = {0.35, 0.2};
		Perceptron_lib plib = new Perceptron_lib(2, nu, 0.5, 0.01);
		
		//�w�K�f�[�^
		double input[][] = { {1,1}, {1,0}, {0,1}, {0,0}};
		double output[] = {1, 0, 0, 0};
		
		//�w�K
		int index;
		for(int i = 0; i < 150; i++){
			index = (int)(Math.random()*4);
			plib.getParameter(input[index], output[index]);
			System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
		}
		//���ʊm�F
		for(int i = 0; i < output.length; i++){
			if(plib.getOutput(input[i]) == output[i])
				System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
			else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		}
		System.out.println("Check : nu = "+nu[0]+", "+nu[1]);
	}

}
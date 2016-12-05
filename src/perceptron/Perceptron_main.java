//課題の要件を満たすためには授業中に組んだプログラムをandに換えるだけでよかったが、このパーセプトロンの「線形分離可能」な問題にのみ有効という特徴は様々な問題を線形分離可能になるよう工夫すればアルゴリズム自体はシンプルかつ強力なので、とても汎用性があると思った。
package perceptron;

public class Perceptron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nu[] = {0.35, 0.2};
		Perceptron_lib plib = new Perceptron_lib(2, nu, 0.5, 0.01);
		
		//学習データ
		double input[][] = { {1,1}, {1,0}, {0,1}, {0,0}};
		double output[] = {1, 0, 0, 0};
		
		//学習
		int index;
		for(int i = 0; i < 150; i++){
			index = (int)(Math.random()*4);
			plib.getParameter(input[index], output[index]);
			System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
		}
		//結果確認
		for(int i = 0; i < output.length; i++){
			if(plib.getOutput(input[i]) == output[i])
				System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
			else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		}
		System.out.println("Check : nu = "+nu[0]+", "+nu[1]);
	}

}
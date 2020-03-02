public class f{
	public static void main(String []args) {
			
			if(args.length != 0){
				System.out.println(args[0]);
				if(args[0].equals("-h")){
					System.out.println("====================================");
					System.out.println("-a to add number(a) + number (b)");
					System.out.println("-d to divison number(a) / number (b)");
					System.out.println("-s to substract number(a) - number (b)");
					System.out.println("-m to modoulus number(a) % number (b)");
					System.out.println("-i to intrest p r t");
				}
				if(args[0].equals("-a") ){
					int a = Integer.parseInt(String.valueOf(args[1]));
					int b = Integer.parseInt(String.valueOf(args[2]));
					int c = a+b;
					System.out.println("addition is "+c);
				}
				if(args[0].equals("-d")){
					int a = Integer.parseInt(String.valueOf(args[1]));
					int b = Integer.parseInt(String.valueOf(args[2]));
					int c = a/b;
					System.out.println("divison is "+c);
				}
				if(args[0].equals("-s")){
					int a = Integer.parseInt(String.valueOf(args[1]));
					int b = Integer.parseInt(String.valueOf(args[2]));
					int c = a-b;
					System.out.println("substraction is "+c);
				}
				if(args[0].equals("-m")){
					int a = Integer.parseInt(String.valueOf(args[1]));
					int b = Integer.parseInt(String.valueOf(args[2]));
					int c = a%b;
					System.out.println("modulous is "+c);
				}
				if(args[0].equals("-i")){
					int a = Integer.parseInt(String.valueOf(args[1]));
					int b = Integer.parseInt(String.valueOf(args[2]));
					int d = Integer.parseInt(String.valueOf(args[3]));
					int c = (a*b*d)/100;
					System.out.println("intrest is "+c);
				}
				
		}
		else{		
			System.out.println("Hello java");

		}
   }
}

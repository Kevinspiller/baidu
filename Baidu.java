class Baidu{
		public static void main(String args[]){
			
			if(args.length==0){
				System.out.println("Modo de compilar o programa: \n java Baidu nomedoarquivo.bd\n");
			} else{
				Decifra le= new Decifra(args[0]);
			}
		}
}

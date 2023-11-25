public class Random{
	public static void main(String[] args){
		Double Sum=0.0;
		for(int i=0;i<args.length;i++){
			Sum+=Double.parseDouble(args[i]);
		}
		System.out.println(Sum);
	}
}


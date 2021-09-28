class RestaurentTester{

		public static void main(String a[]){

					Restaurent rest=new Restaurent();
					rest.name="1947";
					rest.type="veg";
					rest.location="Malleshwaram";
					rest.ownerName="Sadanand Gowda";
					rest.location= "raajajinagara";
					rest.serveFood();
					System.out.println(rest.name+"\n"+rest.type+"\n"+rest.location+"\n"+rest.ownerName+"\n"+rest.location+"\n" 	);


		Restaurent rest1=new Restaurent();
		rest1.name="ALBEK";
		rest1.type="nonveg";
		rest1.location="rajajinagara";
		rest1.ownerName="mustafa";
		rest1.location= "indiranagar";
		rest1.serveFood();
		System.out.println(rest.name+"\n"+rest.type+"\n"+rest.location+"\n"+rest.ownerName+"\n"+rest.location+"\n " 	);



}





}
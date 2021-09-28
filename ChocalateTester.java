class ChocalateTester{

public static void main(String a[]){
	
Chocalate chocalate=new Chocalate();
chocalate.name="FiveStar";
chocalate.barCode=21345;
chocalate.madeDate=2019;
chocalate.fresh=true;
chocalate.expDate=2024;
 


System.out.println(chocalate.name+"\n"+chocalate.barCode+"\n"+chocalate.madeDate+"\n"+chocalate.fresh+"\n"+chocalate.expDate+"\n");
chocalate.Sell();

Chocalate chocalate1=new Chocalate();
chocalate1.name="DairymilkSilk";
chocalate1.barCode=12456;
chocalate1.madeDate=2021;
chocalate1.fresh=true;
chocalate1.expDate=2025;
 


System.out.println(chocalate1.name+"\n"+chocalate1.barCode+"\n"+chocalate1.madeDate+"\n"+chocalate1.fresh+"\n"+chocalate1.expDate+"\n");
chocalate1.Sell();
}







}
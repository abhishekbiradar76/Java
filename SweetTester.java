class SweetTester{

public static void main(String a[]){

Sweet sweet=new Sweet();
sweet.name="kaajuPoori";
sweet.code=20132;
sweet.mfgDate=2022;
sweet.ingradients="kaaju";
sweet.expDate=2026;



System.out.println(sweet.name+"\n"+sweet.code+"\n"+sweet.mfgDate+"\n"+sweet.ingradients+"\n"+sweet.expDate+"\n");

sweet.Eat();






Sweet sweet1=new Sweet();
sweet.name="BadamPoori";
sweet.code=2011;
sweet.mfgDate=2021;
sweet.ingradients="Kava";
sweet.expDate=2025;



System.out.println(sweet.name+"\n"+sweet.code+"\n"+sweet.mfgDate+"\n"+sweet.ingradients+"\n"+sweet.expDate+"\n");

sweet.Eat();
}









}
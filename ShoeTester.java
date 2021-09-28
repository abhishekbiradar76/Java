class ShoeTester{
public static void main(String a[]){

Shoe shoe=new Shoe();
shoe.name="NIKE";
shoe.size=8;
shoe.rate=2500;
shoe.waterProof=true;
System.out.println(shoe.name+"\n"+shoe.size+"\n"+shoe.rate+"\n"+shoe.waterProof+"\n");
shoe.comfort();


}

}
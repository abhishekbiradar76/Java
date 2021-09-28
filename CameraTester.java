class CameraTester{

public static void main(String a[]){

Camera camera=new Camera();
camera.name="CANON";
camera.fixel= 68;
camera.price=64000;
camera.highRasaluted=true;
System.out.println(camera.name+"\n"+camera.fixel+"\n"+camera.price+"\n"+camera.highRasaluted+"\n");
camera.Shot();



Camera camera2=new Camera();
camera.name="NIKON";
camera.fixel= 72;
camera.price=64002;
camera.highRasaluted=true;
System.out.println(camera.name+"\n"+camera.fixel+"\n"+camera.price+"\n"+camera.highRasaluted+"\n");
camera.Shot();






}











}
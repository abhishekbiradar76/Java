class ChatCenter{
	String centerName;
	int centerId;
	String location;  
	String ownerName;
	boolean isOpen;
	String items[]={"pani Puri","Kachori","Samosa","pav Bhaji","sandwich"};
	
	
	
	public ChatCenter(){
	this("Sai Chats","near KLE Ground",2,"Ranganath",true);
	System.out.println(" Chat center object is created");
	
	
	}


	public ChatCenter(String centerName,String location, int centerId , String ownerName, boolean isOpen  ){
		
		this.centerName=centerName;
		this.location=location;
		this.items=items;
		this.centerId= centerId;
		this.ownerName= ownerName;
		this.isOpen = isOpen;
		
		}

	
	public void displayChatCenter(){
		
		System.out.println(this.centerName+""+this.centerId+""+this.ownerName+""+this.location+""+this.isOpen);
		
	}
		
		
		
	
	public void getItems(){
	for(int i=0;i<this.items.length; i++){
		System.out.println(this.items[i]);
		
	}	
		
		
		
	}
	
	}
	
	
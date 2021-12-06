package com.xworkz.olympicgames;
public class GameDTO {
	public GameDTO() {
		System.out.println("Creat is created"); 
	}
private String gameName;
private int gameNo;
private String gameInstrument;
private String gameType;
private String gameDuration;
public String getGameName() {
	return gameName;
}
public void setGameName(String gameName) {
	this.gameName = gameName;
}
public int getGameNo() {
	return gameNo;
}
public void setGameNo(int gameNo) {
	this.gameNo = gameNo;
}
public String getGameInstrument() {
	return gameInstrument;
}
public void setGameInstrument(String gameInstrument) {
	this.gameInstrument = gameInstrument;
}
public String getGameType() {
	return gameType;
}
public void setGameType(String gameType) {
	this.gameType = gameType;
}
public String getGameDuration() {
	return gameDuration;
}
public void setGameDuration(String gameDuration) {
	this.gameDuration = gameDuration;
}
@Override
public String toString() {
	return "GameDTO [gameName=" + gameName + ", gameNo=" + gameNo + ", gameInstrument=" + gameInstrument + ", gameType="
			+ gameType + ", gameDuration=" + gameDuration + "]";
}

}

package jp.ac.uryukyu.ie.e215718;

class WordBook{
	String ja;
	String en;
	WordBook(String ja,String en){
		this.ja = ja;
		this.en = en;
	}
	boolean check(String words){
		return words.equalsIgnoreCase(this.en);
	}
}
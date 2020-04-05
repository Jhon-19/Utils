package note;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Notebook {
	private int length,sigma,id;
	private String name;
	private List<Note> notes;
	
	public Notebook(String name,int id) {
		this.name=name;
		this.id=id;
		notes=new ArrayList<Note>();
		length=0;
		sigma=0;
	}
	
	public void addNote(String newtitle,String newtext) {
		notes.add(new Note(newtitle,newtext,sigma));
		length++;
		sigma++;
	}
	
	public void enSelect(int nid) {
		for(int i=0;i<notes.size();i++) {
			if(notes.get(i).getId()==nid) {
				notes.get(i).selected=true;
				return;
			}
		}
	}
	
	public void unSelect(int nid) {
		for(int i=0;i<notes.size();i++) {
			if(notes.get(i).getId()==nid) {
				notes.get(i).selected=false;
				return;
			}
		}
	}
	
	public void delNote(int nid) {
		for(int i=0;i<notes.size();i++) {
			if(notes.get(i).getId()==nid) {
				notes.remove(i);
				return;
			}
		}
	}
	
	public void mutiDelNote() {
		for(int i=0;i<notes.size();i++) {
			if(notes.get(i).selected==true) {
				notes.remove(i);
			}
		}
	}
	
	public void sortByCreatedTime() {
		Note.sortByCreatedTime(notes, 0, notes.size()-1);
	}
	
	public void sortByLastEditedTime() {
		Note.sortByLastEditedTime(notes, 0, notes.size()-1);
	}
	
	public void sortByLength() {
		Note.sortByLength(notes, 0, notes.size()-1);
	}
	
}

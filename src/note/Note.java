package note;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Note {
	private String title,text;
	private Date created_time,last_edited_time;
	private int length,id;
	public boolean selected=false;
	
	static void sortByCreatedTime(List<Note> notes,int l,int r) {
		if(l>=r)return;
		int scout=l;
		int i=l,j=r;
		boolean tag=false;
		while(i<j) {
			if(tag==false) {
				if(notes.get(j).getCreatedTime().after(notes.get(scout).getCreatedTime())) {
					tag=true;
					continue;
				}
				j--;
				continue;
			}
			else {
				if(notes.get(i).getCreatedTime().before(notes.get(scout).getCreatedTime())) {
					tag=false;
					Note temp=notes.get(j);
					notes.set(j,notes.get(i));
					notes.set(i,temp);
					continue;
				}
				i++;
				continue;
			}
		}
		Note temp=notes.get(i);
		notes.set(i,notes.get(scout));
		notes.set(scout, temp);
		sortByCreatedTime(notes,l,i-1);
		sortByCreatedTime(notes,i+1,r);
	}
	
	static void sortByLastEditedTime(List<Note> notes,int l,int r) {
		if(l>=r)return;
		int scout=l;
		int i=l,j=r;
		boolean tag=false;
		while(i<j) {
			if(tag==false) {
				if(notes.get(j).getLastEditedTime().after(notes.get(scout).getLastEditedTime())) {
					tag=true;
					continue;
				}
				j--;
				continue;
			}
			else {
				if(notes.get(i).getLastEditedTime().before(notes.get(scout).getLastEditedTime())) {
					tag=false;
					Note temp=notes.get(j);
					notes.set(j,notes.get(i));
					notes.set(i,temp);
					continue;
				}
				i++;
				continue;
			}
		}
		Note temp=notes.get(i);
		notes.set(i,notes.get(scout));
		notes.set(scout, temp);
		sortByLastEditedTime(notes,l,i-1);
		sortByLastEditedTime(notes,i+1,r);
	}
	
	static void sortByLength(List<Note> notes,int l,int r) {
		if(l>=r)return;
		int scout=l;
		int i=l,j=r;
		boolean tag=false;
		while(i<j) {
			if(tag==false) {
				if(notes.get(j).getLength()<notes.get(scout).getLength()) {
					tag=true;
					continue;
				}
				j--;
				continue;
			}
			else {
				if(notes.get(i).getLength()>notes.get(scout).getLength()) {
					tag=false;
					Note temp=notes.get(j);
					notes.set(j,notes.get(i));
					notes.set(i,temp);
					continue;
				}
				i++;
				continue;
			}
		}
		Note temp=notes.get(i);
		notes.set(i,notes.get(scout));
		notes.set(scout, temp);
		sortByLength(notes,l,i-1);
		sortByLength(notes,i+1,r);
	}
	
	public Note(String newtitle,String newtext,int newid) {
		title=newtitle;
		text=newtext;
		created_time=new Date();
		last_edited_time=new Date();
		length=newtitle.length()+newtext.length();
		id=newid;
	}
	
	public void Edit(String newtitle,String newtext) {
		title=newtitle;
		text=newtext;
		last_edited_time=new Date();
		length=newtitle.length()+newtext.length();
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getText() {
		return text;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getId() {
		return id;
	}
	
	public Date getCreatedTime() {
		return created_time;
	}
	
	public Date getLastEditedTime() {
		return last_edited_time;
	}
}

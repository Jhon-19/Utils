package note;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class NoteTest {
	public static void main(String[] args) {
		List<Note> notes=new ArrayList<Note>();
		notes.add(new Note("Hello World","This is a new world!"));
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("成功了");
		}
		notes.add(new Note("Hello World","This is a new world!!"));
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("成功了");
		}
		notes.add(new Note("Hello World","This is a new world!!!"));
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("成功了");
		}
		notes.add(new Note("Hello World","This is a new world!!!!"));
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("成功了");
		}
		notes.add(new Note("Hello World","This is a new world!!!!!"));
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("成功了");
		}
		notes.add(new Note("Hello World","This is a new world!!!!!!"));
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("成功了");
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//
		for(int i=0;i<6;i++) {
			System.out.println(notes.get(i).getLength());
		}
		Note.sortByLength(notes,0,notes.size()-1);
		for(int i=0;i<6;i++) {
			System.out.println(notes.get(i).getLength());
		}
	}
}

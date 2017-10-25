package com.company;

import java.util.ArrayList;

public class Books
{
	ArrayList<Chapters> Chapterno = new ArrayList<Chapters>();
	//Chapters chapternumber=new Chapters();

	public ArrayList<Chapters> getChapterno()
	{
		return Chapterno;
	}

	public void setChapterno(ArrayList<Chapters> chapterno)
	{
		Chapterno = chapterno;
	}


	private String BooksTittle;

	public String getBooksTittle()
	{
		return BooksTittle;
	}

	public void setBooksTittle(String booksTittle)
	{
		BooksTittle = booksTittle;
	}

	public void addChapters(Chapters aChapter)
	{
		Chapterno.add(aChapter);
	}

}

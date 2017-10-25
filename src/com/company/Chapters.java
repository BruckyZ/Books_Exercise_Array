package com.company;

import java.util.ArrayList;

public class Chapters
{
	ArrayList<Pages> pageno = new ArrayList<Pages>();

	public ArrayList<Pages> getPageno()
	{
		return pageno;
	}

	public void setPageno(ArrayList<Pages> pageno)
	{
		this.pageno = pageno;
	}


	private String ChapterNo;

	public String getChapterNo()
	{
		return ChapterNo;
	}

	public void setChapterNo(String chapterNo)
	{
		ChapterNo = chapterNo;
	}

	public void addPages(Pages aPages)
	{
		pageno.add(aPages);
	}
}

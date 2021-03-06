package com.javaex.ex02;

import java.util.List;

public class AuthorApp {

	public static void main(String[] args) {
		
		List<AuthorVo> List;
		AuthorDao authorDao = new AuthorDao();
		
		//작가등록
		authorDao.authorInsert("김문열", "경북 영양");
		
		authorDao.authorInsert("박경리", "경상남도 통영");
		
		authorDao.authorInsert("유시민", "17대 국회의원");
		
		authorDao.authorInsert("기안84", "기안동에서산84년생");
		
		authorDao.authorInsert("강풀", "온라인만화가1세대");
		
		authorDao.authorInsert("김영하", "알쓸신잡");
		
		List = authorDao.authorSelect();
	    for(int i=0; i<List.size(); i++) {
        	AuthorVo Vo = List.get(i);
        	System.out.println(Vo.getAuthorId()+","+Vo.getAuthorName()+","+Vo.getAuthorDesc());
        }
	    System.out.println("---------------------------------------------------------------------");
		
		
		/*
		List = authorDao.authorSelect();
	    for(int i=0; i<List.size(); i++) {
        	AuthorVo Vo = List.get(i);
        	System.out.println(Vo.getAuthorId()+","+Vo.getAuthorName()+","+Vo.getAuthorDesc());
        }
	    System.out.println("---------------------------------------------------------------------");
	    
	    
		//작가수정
		authorDao.authorUpdate(2, "박경리(수정)", "경상남도 통영(수정)");
		
		List = authorDao.authorSelect();
	    for(int i=0; i<List.size(); i++) {
        	AuthorVo Vo = List.get(i);
        	System.out.println(Vo.getAuthorId()+","+Vo.getAuthorName()+","+Vo.getAuthorDesc());
        }
	    System.out.println("---------------------------------------------------------------------");
		
		//작가삭제
		authorDao.authorDelete(1);
		
		List = authorDao.authorSelect();
	    for(int i=0; i<List.size(); i++) {
        	AuthorVo Vo = List.get(i);
        	System.out.println(Vo.getAuthorId()+","+Vo.getAuthorName()+","+Vo.getAuthorDesc());
        }
	    System.out.println("---------------------------------------------------------------------");
	    */
	}
	

}

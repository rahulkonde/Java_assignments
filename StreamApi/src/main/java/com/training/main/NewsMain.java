package com.training.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.model.News;

public class NewsMain {
	public static void main(String[] args) {

		List<News> news = new ArrayList<>();
		Map<String, String> newsComment=new HashMap<>();
	newsComment.put("maheshbabu", "Low budget");
	newsComment.put("ramcharan", "High budget");
		
		if(news.stream().filter((s)->s.getNewsId()==1) != null) {
			for(Map.Entry<String, String> keyvalue :newsComment.entrySet())
		news.add(new News(1, "rahul",keyvalue.getKey(),keyvalue.getValue()));}
		news.forEach((e)->System.out.println(e));
   
	}

}

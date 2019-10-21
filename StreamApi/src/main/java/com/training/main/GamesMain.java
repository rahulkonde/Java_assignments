package com.training.main;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.training.model.Games;

public class GamesMain {
	public static void main(String[] args) {

		List<Games> play = new ArrayList<>();
		play.add(new Games("footBall"));
		play.add(new Games("volleyBall"));
		play.add(new Games("cicket"));
		play.add(new Games("hockey"));
		play.add(new Games("tableTennis"));
		play.add(new Games("tennis"));

		// To print only the 1st letters and make a string
		StringBuilder str = new StringBuilder();
//		for (Games game : play) {
//			str.append(game.getGames().charAt(2));
//
//		}
//		System.out.println(str);
		// to dispaly all
//		Consumer<Games>  display= (a)-> System.out.println(a);
//		play.forEach(display);
//		

		// To replace 1st letter word with Upper case
		System.out.println(str.toString());
		play.forEach((s) -> {
			str.append(s.getGames().charAt(0));
		});
		UnaryOperator<Games> uppercaseFirstLetter = (s) -> {
			char[] array = s.getGames().toCharArray();
			array[0] = Character.toUpperCase(array[0]);
			return new Games(new String(array));
		};
		play.replaceAll(uppercaseFirstLetter);
		play.forEach((s) -> System.out.println(s));

	}

	//

}

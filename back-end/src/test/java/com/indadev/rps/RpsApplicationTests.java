package com.indadev.rps;

import com.indadev.rps.model.Game;
import com.indadev.rps.model.Play;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class RpsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void newGame(){
		Game g = new Game("1");
		assertSame(g.getId(),"1");
		assertNotNull(g);
	}

	@Test
	void player1AlwaysRock(){
		Game g = new Game("1");
		g.play();
		assertNotNull(g.getPlays());
		assertNotNull(g.getPlays().get(0));
		assertSame(1,g.getPlays().get(0).getPlayer1());
		for (int i = 0; i < 10; ++i) g.play();
		for (Play p : g.getPlays()){
			assertSame(1,p.getPlayer1());
		}
	}

	@Test
	void player2Random(){
		Game g = new Game("1");
		g.play();
		assertNotNull(g.getPlays());
		assertNotNull(g.getPlays().get(0));
		int p2 = g.getPlays().get(0).getPlayer2();
		assertTrue(1 <= p2 && p2 <= 3);
		for (int i = 0; i < 10; ++i) g.play();
		for (Play p : g.getPlays()){
			assertTrue(1 <= p.getPlayer2() && p.getPlayer2() <= 3);
		}
	}

	@Test
	void playerWin(){
		Game g = new Game("1");
		g.play();
		assertNotNull(g.getPlays());
		assertNotNull(g.getPlays().get(0));
		for (int i = 0; i < 10; ++i) g.play();
		for (Play p : g.getPlays()){
			int p2 = p.getPlayer2();
			String winner = p.getWinner();

			if (p2 == 2){
				assertSame("Player 2",winner);
			} else if (p2 == 3){
				assertSame("Player 1",winner);
			}else{
				assertSame("Draw",winner);
			}
			assertTrue(1 <= p.getPlayer2() && p.getPlayer2() <= 3);
		}
	}

	//TODO: test restart
	//TODO: test rounds
}

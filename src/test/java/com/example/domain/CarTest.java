package com.example.domain;

//org.hamcrest.CoreMatchersクラスのMatcher関連メソッドを利用するためのstaticインポート
import static org.hamcrest.CoreMatchers.*;
//JUnit関連メソッドを利用するためのstaticインポート
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.exception.OverSpeedException;

/**
 * Carクラスをテストするクラス.
 * @author igamasayuki
 *
 */
public class CarTest {

	Car car;
	
	/**
	 * <pre>
	 * 全テスト実行前に１度だけ実行されるセットアップメソッド.
	 * 全てのテストに共通する前処理を行う際に使用する。
	 * 例えば、全テストで利用するテストデータを作るためのSQL
	 * を実行するなど。
	 * </pre>
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("全テスト実行前に１度だけ実行される");
	}

	/**
	 * <pre>
	 * 全テスト実行後に１度だけ実行されるメソッド.
	 * 例えば、使用したテストデータを削除し、初期化する処理など。
	 * </pre>
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("全テスト実行後に１度だけ実行される");
	}

	/**
	 * <pre>
	 * 各テスト実行前に毎回実行されるメソッド.
	 * 各テストで共通した前処理があればこちらに処理を書く。
	 * 同じ情報が詰まったインスタンスを作成する処理など。
	 * </pre>
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("各テスト実行前に毎回実行される");
		car = new Car();
		car.setPlateNumber("000-0000");
		car.setBodyColor("Gold");
	}

	/**
	 * <pre>
	 * 各テスト実行後に毎回実行されるメソッド.
	 * 各テストで共通した後処理があればこちらに処理を書く。
	 * テストで使用したインスタンス(オブジェクト)は自動的にメモリから
	 * 削除されるため、このメソッドはあまり利用の機会はない。
	 * </pre>
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("各テスト実行後に毎回実行される");
	}

	/**
	 * <pre>
	 * CarクラスのspeedUp()メソッドの正常系テスト.
	 * 車のスピードが指定した速度分上がっているかテストする。
	 * </pre>
	 */
	@Test
	public void testSpeedUp0() throws OverSpeedException{
		System.out.println("testSpeedUp()メソッド実行");
		int actual = car.speedUp(10);
		int expected = 10; //←ここを書き換えて実行もしてみる
		// 一昔前の検証方法
		assertEquals("スピードの値が正しくありません。", expected, actual);
		// 最近の検証方法
		assertThat("スピードの値が正しくありません。", actual, is(expected));
		assertThat("スピードの値が正しくありません。", actual, equalTo(expected));
		assertThat("スピードの値が正しくありません。", actual, is(not(expected+1)));
	}

	/**
	 * <pre>
	 * CarクラスのspeedUp()メソッドのテスト.
	 * 車のスピードが時速120km/h以上出ないことをテストする。
	 * </pre>
	 */
	@Test
	public void testSpeedUp1() throws OverSpeedException{
		System.out.println("testSpeedUp1()メソッド実行");
		assertThat("スピードの値が正しくありません。", 10, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 20, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 30, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 40, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 50, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 60, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 70, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 80, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 90, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 100, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 110, is(car.speedUp(10)));
		assertThat("スピードの値が正しくありません。", 120, is(car.speedUp(10)));
		// 時速120km/h以上出ないことを確認
		assertThat("スピードの値が正しくありません。", 120, is(car.speedUp(10)));
	}
	
	/**
	 * <pre>
	 * CarクラスのspeedUp()メソッドのテスト.
	 * 急激なスピードアップを行った際に例外が出るかテストする。
	 * 境界値：99,100の99をテスト
	 * </pre>
	 */
	@Test
	public void testSpeedUp2() {
		System.out.println("testSpeedUp2()メソッド実行");
		try {
			assertThat("スピードの値が正しくありません。", 99, is(car.speedUp(99)));
		} catch (OverSpeedException e) {
			fail("OverSpeedExceptionが発生しました。");
		}
	}
	
	/**
	 * <pre>
	 * CarクラスのspeedUp()メソッドのテスト.
	 * 急激なスピードアップを行った際に例外が出るかテストする。
	 * 境界値：99,100の100をテスト
	 * </pre>
	 */
	@Test
	public void testSpeedUp3() {
		System.out.println("testSpeedUp3()メソッド実行");
		try {
			car.speedUp(100);
			fail("例外が発生しませんでした。");
		} catch (OverSpeedException e) {
		    assertThat("メッセージが一致しません",
                    e.getMessage(),
                    is("急激なスピードアップはできません。"));
		}
	}

	/**
	 * <pre>
	 * CarクラスのspeedUp()メソッドのテスト.
	 * スピードアップをマイナスにしようとした際に例外が出るかテストする。
	 * </pre>
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSpeedUp4() {
		System.out.println("testSpeedUp4()メソッド実行");
		try {
			car.speedUp(-1);
		} catch (OverSpeedException e) {
			fail("違う例外をスローしました。");
		}
	}
}

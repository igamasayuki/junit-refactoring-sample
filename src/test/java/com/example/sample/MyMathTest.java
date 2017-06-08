package com.example.sample;


//Matcher関連メソッドを利用するためのstaticインポート
import static org.hamcrest.CoreMatchers.*;
//JUnit関連メソッドを利用するためのstaticインポート
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
* MyMathクラスのテスト.
* 
* @author igamasayuki
*
*/
public class MyMathTest {

  /** 計算結果 */
  private double answer;

  /**
   * <pre>
   * 全テスト実行前に１度だけ実行されるセットアップメソッド.
   * 全てのテストに共通する前処理を行う際に使用する。
   * 例えば、全テストで利用するテストデータを作るためのSQL
   * を実行するなど。
   * </pre>
   * 
   * @throws Exception
   *             　今回は例外は発生しない
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
      System.out.println("setUpBeforeClass()の呼出し。全テスト実行前に１度だけ実行される");
  }

  /**
   * <pre>
   * 全テスト実行後に１度だけ実行されるメソッド.
   * 例えば、使用したテストデータを削除し、初期化する処理など。
   * </pre>
   * 
   * @throws Exception
   *             　今回は例外は発生しない
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
      System.out.println("tearDownAfterClass()の呼出し。全テスト実行後に１度だけ実行される");
  }

  /**
   * <pre>
   * 各テスト実行前に毎回実行されるメソッド.
   * 各テストで共通した前処理があればこちらに処理を書く。
   * 同じ情報が詰まったインスタンスを作成する処理など。
   * </pre>
   * 
   * @throws Exception
   *             　今回は例外は発生しない
   */
  @Before
  public void setUp() throws Exception {
      // 毎回計算結果が入るanswerを初期化
      answer = 0.0;
      System.out.println("setUp()の呼出し。各テスト実行前に毎回実行される");
  }

  /**
   * <pre>
   * 各テスト実行後に毎回実行されるメソッド.
   * 各テストで共通した後処理があればこちらに処理を書く。
   * テストで使用したインスタンス(オブジェクト)は自動的にメモリから
   * 削除されるため、このメソッドはあまり利用の機会はない。
   * </pre>
   * 
   * @throws Exception
   *             　今回は例外は発生しない
   */
  @After
  public void tearDown() throws Exception {
      System.out.println("tearDown()の呼出し。各テスト実行後に毎回実行される");
  }

  // 一昔前(Junit4.3以前)の検証メソッド
  // assertEquals("エラーメッセージ", "期待値", "実際の結果");
  // assertNotEquals("エラーメッセージ", "期待値", "実際の結果");
  // 最近(Junit4.4から)の検証メソッド
  // assertThat("エラーメッセージ", "実際の結果", is("期待値"));
  // assertThat("エラーメッセージ", "実際の結果", equalTo("期待値")); isと同じ。isの方が直感的
  // assertThat("エラーメッセージ", "実際の結果", is(not("期待値")));

  @Test
  public void testPower1() {
      answer = MyMath.power(0, -2);
      assertThat("TC1:期待値と実際の結果が異なります", answer, is(Double.POSITIVE_INFINITY));
  }

  @Test
  public void testPower2() {
      answer = MyMath.power(0, -1);
      assertThat("TC2:期待値と実際の結果が異なります", answer, is(Double.POSITIVE_INFINITY));
  }

  @Test
  public void testPower3() {
      answer = MyMath.power(0, 0);
      assertThat("TC3:期待値と実際の結果が異なります", answer, is(1.0));
  }

  @Test
  public void testPower4() {
      answer = MyMath.power(0, 1);
      assertThat("TC4:期待値と実際の結果が異なります", answer, is(0.0));
  }

  @Test
  public void testPower5() {
      answer = MyMath.power(0, 2);
      assertThat("TC5:期待値と実際の結果が異なります", answer, is(0.0));
  }

  @Test
  public void testPower6() {
      answer = MyMath.power(1, -2);
      assertThat("TC6:期待値と実際の結果が異なります", answer, is(1.0));
  }

  @Test
  public void testPower7() {
      answer = MyMath.power(1, -1);
      assertThat("TC7:期待値と実際の結果が異なります", answer, is(1.0));
  }

  @Test
  public void testPower8() {
      answer = MyMath.power(1, 0);
      assertThat("TC8:期待値と実際の結果が異なります", answer, is(1.0));
  }

  @Test
  public void testPower9() {
      answer = MyMath.power(1, 1);
      assertThat("TC9:期待値と実際の結果が異なります", answer, is(1.0));
  }

  @Test
  public void testPower10() {
      answer = MyMath.power(1, 2);
      assertThat("TC10:期待値と実際の結果が異なります", answer, is(1.0));
  }

  @Test
  public void testPower11() {
      answer = MyMath.power(-1, -2);
      assertThat("TC11:期待値と実際の結果が異なります", answer, is(1.0));
  }

  @Test
  public void testPower12() {
      answer = MyMath.power(-1, -1);
      assertThat("TC12:期待値と実際の結果が異なります", answer, is(-1.0));
  }

  @Test
  public void testPower13() {
      answer = MyMath.power(-1, 0);
      assertThat("TC13:期待値と実際の結果が異なります", answer, is(1.0));
  }

  @Test
  public void testPower14() {
      answer = MyMath.power(-1, 1);
      assertThat("TC14:期待値と実際の結果が異なります", answer, is(-1.0));
  }

  @Test
  public void testPower15() {
      answer = MyMath.power(-1, 2);
      assertThat("TC15:期待値と実際の結果が異なります", answer, is(1.0));
  }

  @Test
  public void testPower16() {
      answer = MyMath.power(2, -2);
      assertThat("TC16:期待値と実際の結果が異なります", answer, is(0.25));
  }

  @Test
  public void testPower17() {
      answer = MyMath.power(2, -1);
      assertThat("TC17:期待値と実際の結果が異なります", answer, is(0.5));
  }

  @Test
  public void testPower18() {
      answer = MyMath.power(2, 0);
      assertThat("TC18:期待値と実際の結果が異なります", answer, is(1.0));
  }

  @Test
  public void testPower19() {
      answer = MyMath.power(2, 1);
      assertThat("TC19:期待値と実際の結果が異なります", answer, is(2.0));
  }

  @Test
  public void testPower20() {
      answer = MyMath.power(2, 2);
      assertThat("TC20:期待値と実際の結果が異なります", answer, is(4.0));
  }

  /**
   * 例外が発生するか検証
   */
  @Test
  public void testPower21() {
      try {
          answer = MyMath.power(100, 0);
          fail("TC21:例外が発生しなければなりません");
      } catch (IllegalArgumentException e) {
          assertThat("メッセージが一致しません", e.getMessage(), is("100以上の値は不正です"));
      }
  }

  /**
   * 例外が発生するか検証
   */
  @Test
  public void testPower22() {
      try {
          answer = MyMath.power(0, 1000);
          fail("TC22:例外が発生しなければなりません");
      } catch (IllegalArgumentException e) {
          assertThat("メッセージが一致しません", e.getMessage(), is("100以上の値は不正です"));
      }
  }

}

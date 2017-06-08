package com.example.domain;

import com.example.exception.OverSpeedException;

/**
 * 車を表すクラス.
 * @author igamasayuki
 *
 */
public class Car {
	/** 制限速度 */
	private final int MAX_SPEED = 120;
	/** 異常な速度 */
	private final int ABNORMAL_SPEED = 100;
	/** 速度 */
	private int speed;
	/** プレートナンバー */
	private String plateNumber;
	/** 車体の色 */
	private String bodyColor;

	/**
	 * <pre>
	 * 車の速度を上げます.
	 * この車はある一定速度以上出すことができないように制御されています。
	 * また急激に速度を上げようとすると例外が発生します。
	 * </pre>
	 * @param speed 上げたい速度
	 * @return　上がった後の速度
	 * @throws OverSpeedException 速度を急激に上げようとした場合に発生する例外
	 */
	public int speedUp(int speed) throws OverSpeedException{
		if (speed >= ABNORMAL_SPEED) {
			throw new OverSpeedException("急激なスピードアップはできません。");
		}
		if (speed < 0) {
			throw new IllegalArgumentException("スピードをマイナスすることはできません。");
		}
		
		this.speed += speed;
		
		if(this.speed >= MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
		return this.speed;
	}

	
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	
}

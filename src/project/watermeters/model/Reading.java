package project.watermeters.model;

import java.io.Serializable;

public class Reading implements Serializable {

	private static final long serialVersionUID = 1L;

	private int year;
	private int month;
	private int coldWater;
	private int hotWater;

	public Reading(int year, int month, int coldWater, int hotWater) {
		this.year = year;
		this.month = month;
		this.coldWater = coldWater;
		this.hotWater = hotWater;
	}

	public boolean hasYearAndMonth(int year2, int month2) {
		return year == year2 && month == month2;
	}

	public void edit(int coldWater2, int hotWater2) {
		coldWater = coldWater2;
		hotWater = hotWater2;
	}

	@Override
	public String toString() {
		return year + " " + month + " " + coldWater + " " + hotWater;
	}

	public boolean isMonthValid() {
		return month >= 1 && month <= 12;
	}

	public int getColdWater() {
		return coldWater;
	}

	public int getHotWater() {
		return hotWater;
	}
}

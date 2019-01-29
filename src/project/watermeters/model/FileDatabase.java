package project.watermeters.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import project.watermeters.ApplicationSession;
import project.watermeters.utils.Serializer;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Reading> readings = new ArrayList<Reading>();

	@Override
	public void addReading(Reading reading) {
		if (!reading.isMonthValid()) {
			throw new RuntimeException("Luna invalida!");
		}
		readings.add(reading);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public Reading getReadingByYearAndMonth(int year, int month) {
		for (Reading reading : readings) {
			if (reading.hasYearAndMonth(year, month)) {
				return reading;
			}
		}
		return null;
	}

	@Override
	public void editReading(int year, int month, int coldWater, int hotWater) {
		Reading reading = getReadingByYearAndMonth(year, month);
//		if (reading == null) {
//			throw new RuntimeException("Reading not found");
//		}
		reading.edit(coldWater, hotWater);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public List<Reading> getReadings() {
		return readings;
	}

	@Override
	public Reading getPreviousReadingByYearAndMonth(int year, int month) {
		int previousYear = year;
		int previousMonth = month - 1;

		if (month == 1) {
			previousYear -= 1;
			previousMonth = 12;
		}

		return getReadingByYearAndMonth(previousYear, previousMonth);
	}

	@Override
	public void clear() {
		readings.clear();
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

}

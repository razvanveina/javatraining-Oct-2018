package project.watermeters.model;

import java.util.List;

public interface Database {
	void addReading(Reading reading);

	Reading getReadingByYearAndMonth(int year, int month);

	void editReading(int year, int month, int coldWater, int hotWater);

	List<Reading> getReadings();

	Reading getPreviousReadingByYearAndMonth(int year, int month);

	void clear();
}

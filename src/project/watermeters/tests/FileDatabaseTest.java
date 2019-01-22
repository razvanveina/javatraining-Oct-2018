package project.watermeters.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import project.watermeters.model.Database;
import project.watermeters.model.FileDatabase;
import project.watermeters.model.Reading;

class FileDatabaseTest {

	@Test
	void testAddReading() {
		Database db = new FileDatabase();
		db.addReading(new Reading(2019, 1, 2, 3));
		Reading reading = db.getReadingByYearAndMonth(2019, 1);
		assertTrue(reading != null);
	}

	@Test
	void testGetPreviousReading() {
		Database db = new FileDatabase();
		db.addReading(new Reading(2019, 1, 2, 3));
		db.addReading(new Reading(2019, 2, 2, 3));
		Reading reading = db.getPreviousReadingByYearAndMonth(2019, 2);
		assertTrue(reading != null);
		assertEquals("2019 1 2 3", reading.toString());
	}

	@Test
	void testGetPreviousReading2() {
		Database db = new FileDatabase();
		db.addReading(new Reading(2018, 12, 2, 3));
		db.addReading(new Reading(2019, 1, 2, 3));
		db.addReading(new Reading(2019, 2, 2, 3));
		Reading reading = db.getPreviousReadingByYearAndMonth(2019, 1);
		assertTrue(reading != null);
		assertEquals("2018 12 2 3", reading.toString());
	}
}

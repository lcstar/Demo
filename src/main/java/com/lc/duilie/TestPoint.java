package com.lc.duilie;

import org.junit.Test;

public class TestPoint {

	@Test
	public void TestPoint() {
		Point firstPoint = new Point();
		firstPoint.setData(1);
		Point nextPoint = new Point();
		nextPoint.setData(2);
		firstPoint.setNext(nextPoint);
		for (int i = nextPoint.getData() + 1; i < 10; i++) {
			Point nowPoint = nextPoint;
			Point next = new Point();
			next.setData(i);
			nowPoint.setNext(next);
			nextPoint = next;
		}
		do {
			System.out.println(firstPoint.getData());
			firstPoint = firstPoint.getNext();
		} while (firstPoint != null);

	}
}

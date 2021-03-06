package arrays.medium;

import org.junit.jupiter.api.Test;

import static arrays.medium.SumOfIntervals.sumIntervals;
import static org.junit.jupiter.api.Assertions.*;

class SumOfIntervalsTest {

	@Test
	public void shouldHandleNullOrEmptyIntervals() {
		assertEquals(0, sumIntervals(null));
		assertEquals(0, sumIntervals(new int[][]{}));
		assertEquals(0, sumIntervals(new int[][]{{4, 4}, {6, 6}, {8, 8}}));
	}

	@Test
	public void shouldAddDisjoinedIntervals() {
		assertEquals(9, sumIntervals(new int[][]{{1, 2}, {6, 10}, {11, 15}}));
		assertEquals(11, sumIntervals(new int[][]{{4, 8}, {9, 10}, {15, 21}}));
		assertEquals(7, sumIntervals(new int[][]{{-1, 4}, {-5, -3}}));
		assertEquals(78, sumIntervals(new int[][]{{-245, -218}, {-194, -179}, {-155, -119}}));
	}

	@Test
	public void shouldAddAdjacentIntervals() {
		assertEquals(54, sumIntervals(new int[][]{{1, 2}, {2, 6}, {6, 55}}));
		assertEquals(23, sumIntervals(new int[][]{{-2, -1}, {-1, 0}, {0, 21}}));
	}

	@Test
	public void shouldAddOverlappingIntervals() {
		assertEquals(7, sumIntervals(new int[][]{{1, 4}, {7, 10}, {3, 5}}));
		assertEquals(6, sumIntervals(new int[][]{{5, 8}, {3, 6}, {1, 2}}));
		assertEquals(19, sumIntervals(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}}));
	}

	@Test
	public void shouldHandleMixedIntervals() {
		assertEquals(13, sumIntervals(new int[][]{{2, 5}, {-1, 2}, {-40, -35}, {6, 8}}));
		assertEquals(1234, sumIntervals(new int[][]{{-7, 8}, {-2, 10}, {5, 15}, {2000, 3150}, {-5400, -5338}}));
		assertEquals(158, sumIntervals(new int[][]{{-101, 24}, {-35, 27}, {27, 53}, {-105, 20}, {-36, 26},}));
	}

	@Test
	public void shouldHandleRandomIntervals() {
		assertEquals(18690, sumIntervals(new int[][]{{-9820, 5857}, {-9804, -3176}, {-9371, 2958}, {-8072, -3381}, {-7796, -2988}, {-7770, 1495}, {-7632, 8870}, {-7436, 3710}, {-7183, 4407}, {-6790, -348}, {-6418, 7501}, {-5923, 3095}, {-5893, 7863}, {-5727, 5220}, {-5221, -4283}, {-5018, 6862}, {-4788, 1720}, {-2185, 5924}, {-2079, 4559}, {402, 2979}, {4108, 6590}}));
	}
}
package sorting.easy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
    @Test
    public void TestCase1() {
        int[] expected = {1};
        int[] input = {1};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {1, 2};
        int[] input = {1, 2};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {1, 2};
        int[] input = {2, 1};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase4() {
        int[] expected = {1, 2, 3};
        int[] input = {1, 3, 2};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase5() {
        int[] expected = {1, 2, 3};
        int[] input = {3, 1, 2};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase6() {
        int[] expected = {1, 2, 3};
        int[] input = {1, 2, 3};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase7() {
        int[] expected = {-10, -7, -7, -6, -6, -5, -5, -4, -4, -4, -2, -1, 1, 3, 5, 5, 6, 8, 8, 10};
        int[] input = {-4, 5, 10, 8, -10, -6, -4, -2, -5, 3, 5, -4, -5, -1, 1, 6, -7, -6, -7, 8};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase8() {
        int[] expected = {-10, -10, -9, -7, -7, -6, -5, -2, 2, 2, 3, 3, 4, 5, 8, 8, 9, 10};
        int[] input = {-7, 2, 3, 8, -10, 4, -6, -10, -2, -7, 10, 5, 2, 9, -9, -5, 3, 8};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase9() {
        int[] expected = {-10, -10, -9, -6, -5, -2, -2, -1, 1, 2, 4, 4, 6, 7, 7, 8, 8, 8, 8, 9, 10, 10};
        int[] input = {8, -6, 7, 10, 8, -1, 6, 2, 4, -5, 1, 10, 8, -10, -9, -10, 8, 9, -2, 7, -2, 4};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase10() {
        int[] expected = {-10, -8, -6, -2, -2, -1, 1, 1, 2, 2, 3, 5, 9};
        int[] input = {5, -2, 2, -8, 3, -10, -6, -1, 2, -2, 9, 1, 1};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase11() {
        int[] expected = {
                -10, -10, -9, -9, -9, -8, -8, -6, -4, -4, -4, -2, -1, 0, 0, 0, 0, 1, 1, 2, 2, 4, 4, 5, 5, 7,
                8, 8, 9, 10
        };
        int[] input = {
                2, -2, -6, -10, 10, 4, -8, -1, -8, -4, 7, -4, 0, 9, -9, 0, -9, -9, 8, 1, -4, 4, 8, 5, 1, 5, 0,
                0, 2, -10
        };
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase12() {
        int[] expected = {
                -9, -9, -9, -7, -7, -7, -4, -4, -3, -3, -3, -2, -1, 0, 1, 1, 3, 4, 4, 5, 8, 9
        };
        int[] input = {4, 1, 5, 0, -9, -3, -3, 9, 3, -4, -9, 8, 1, -3, -7, -4, -9, -1, -7, -2, -7, 4};
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase13() {
        int[] expected = {
                -991, -848, -764, -755, -710, -706, -646, -614, -610, -583, -484, -474, -439, -359, -348,
                -246, -215, -212, -171, -160, -153, -56, -32, -27, -3, 9, 12, 55, 107, 131, 222, 230, 240,
                246, 427, 507, 564, 565, 568, 603, 635, 661, 710, 736, 787, 821, 892, 934, 970, 996
        };
        int[] input = {
                427, 787, 222, 996, -359, -614, 246, 230, 107, -706, 568, 9, -246, 12, -764, -212, -484, 603,
                934, -848, -646, -991, 661, -32, -348, -474, -439, -56, 507, 736, 635, -171, -215, 564, -710,
                710, 565, 892, 970, -755, 55, 821, -3, -153, 240, -160, -610, -583, -27, 131
        };
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase14() {
        int[] expected = {
                -998, -882, -827, -817, -796, -731, -681, -657, -581, -523, -435, -387, -382, -331, -269,
                -255, -220, -216, -169, -163, -75, -43, -6, 80, 100, 180, 228, 280, 354, 366, 372, 382, 382,
                432, 471, 519, 652, 680, 747, 749, 753, 769, 771, 805, 847, 906, 913, 956, 972, 980, 991
        };
        int[] input = {
                991, -731, -882, 100, 280, -43, 432, 771, -581, 180, -382, -998, 847, 80, -220, 680, 769, -75,
                -817, 366, 956, 749, 471, 228, -435, -269, 652, -331, -387, -657, -255, 382, -216, -6, -163,
                -681, 980, 913, -169, 972, -523, 354, 747, 805, 382, -827, -796, 372, 753, 519, 906
        };
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase15() {
        int[] expected = {
                -995, -987, -978, -898, -796, -785, -772, -763, -755, -746, -720, -679, -626, -609, -581,
                -562, -559, -557, -544, -491, -489, -425, -389, -367, -343, -313, -112, -94, -86, -79, -68,
                -67, -19, -7, 31, 34, 43, 51, 67, 85, 120, 165, 187, 204, 232, 243, 260, 384, 393, 397, 421,
                432, 444, 489, 508, 515, 612, 624, 662, 687, 697, 732, 737, 759, 776, 777, 825, 878, 921, 924,
                946, 947, 975, 993
        };
        int[] input = {
                384, -67, 120, 759, 697, 232, -7, -557, -772, -987, 687, 397, -763, -86, -491, 947, 921, 421,
                825, -679, 946, -562, -626, -898, 204, 776, -343, 393, 51, -796, -425, 31, 165, 975, -720,
                878, -785, -367, -609, 662, -79, -112, -313, -94, 187, 260, 43, 85, -746, 612, 67, -389, 508,
                777, 624, 993, -581, 34, 444, -544, 243, -995, 432, -755, -978, 515, -68, -559, 489, 732, -19,
                -489, 737, 924
        };
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase16() {
        int[] expected = {
                -975, -947, -924, -917, -877, -810, -753, -739, -738, -731, -702, -685, -656, -655, -581,
                -578, -531, -500, -488, -401, -396, -359, -356, -320, -312, -279, -249, -154, -90, -54, -45,
                61, 94, 150, 153, 153, 194, 195, 266, 329, 343, 376, 394, 399, 445, 452, 459, 464, 528, 544,
                551, 556, 568, 669, 689, 713, 738, 748, 763, 788, 844, 867, 886, 904, 972, 993
        };
        int[] input = {
                544, -578, 556, 713, -655, -359, -810, -731, 194, -531, -685, 689, -279, -738, 886, -54, -320,
                -500, 738, 445, -401, 993, -753, 329, -396, -924, -975, 376, 748, -356, 972, 459, 399, 669,
                -488, 568, -702, 551, 763, -90, -249, -45, 452, -917, 394, 195, -877, 153, 153, 788, 844, 867,
                266, -739, 904, -154, -947, 464, 343, -312, 150, -656, 528, 61, 94, -581
        };
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase17() {
        int[] expected = {
                -991, -976, -937, -917, -904, -885, -837, -821, -740, -641, -628, -609, -602, -599, -568,
                -560, -557, -529, -519, -453, -415, -384, -373, -321, -319, -220, -158, -96, -92, -90, -85,
                -67, -50, -36, -19, 63, 80, 121, 154, 168, 207, 228, 254, 268, 268, 270, 294, 295, 296, 306,
                307, 328, 351, 381, 387, 391, 401, 407, 434, 437, 491, 505, 518, 558, 588, 593, 607, 613, 619,
                629, 676, 678, 718, 730, 753, 759, 798, 802, 834, 879, 881, 896, 915, 937, 946, 949, 986
        };
        int[] input = {
                -19, 759, 168, 306, 270, -602, 558, -821, -599, 328, 753, -50, -568, 268, -92, 381, -96, 730,
                629, 678, -837, 351, 896, 63, -85, 437, -453, -991, 294, -384, -628, -529, 518, 613, -319,
                -519, -220, -67, 834, 619, 802, 207, 946, -904, 295, 718, -740, -557, -560, 80, 296, -90, 401,
                407, 798, 254, 154, 387, 434, 491, 228, 307, 268, 505, -415, -976, 676, -917, 937, -609, 593,
                -36, 881, 607, 121, -373, 915, -885, 879, 391, -158, 588, -641, -937, 986, 949, -321
        };
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    @Test
    public void TestCase18() {
        int[] expected = {
                -987, -950, -949, -942, -941, -935, -908, -874, -855, -846, -823, -817, -796, -738, -733,
                -730, -685, -578, -575, -575, -544, -542, -469, -441, -420, -415, -410, -376, -371, -363,
                -359, -353, -337, -293, -265, -257, -254, -191, -167, -160, -155, -126, -120, -51, -36, -13,
                14, 48, 52, 59, 59, 125, 157, 164, 183, 201, 238, 243, 295, 323, 328, 341, 355, 356, 372, 399,
                422, 490, 490, 540, 572, 610, 631, 646, 700, 724, 746, 800, 829, 842, 888, 892, 892, 919, 950,
                965, 980, 995
        };
        int[] input = {
                -823, 164, 48, -987, 323, 399, -293, 183, -908, -376, 14, 980, 965, 842, 422, 829, 59, 724,
                -415, -733, 356, -855, -155, 52, 328, -544, -371, -160, -942, -51, 700, -363, -353, -359, 238,
                892, -730, -575, 892, 490, 490, 995, 572, 888, -935, 919, -191, 646, -120, 125, -817, 341,
                -575, 372, -874, 243, 610, -36, -685, -337, -13, 295, 800, -950, -949, -257, 631, -542, 201,
                -796, 157, 950, 540, -846, -265, 746, 355, -578, -441, -254, -941, -738, -469, -167, -420,
                -126, -410, 59
        };
        assertTrue(compare(BubbleSort.bubbleSort(input), expected));
    }

    public boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
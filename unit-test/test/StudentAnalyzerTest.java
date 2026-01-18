import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

public class StudentAnalyzerTest {
    // #1
    @Test
    public void testCountExcellentStudents_mixedValidInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
    }

    @Test
    public void testCountExcellentStudents_allValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 10.0, 7.5)));
    }

    @Test
    public void testCountExcellentStudents_empty() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_boundary() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0)));
    }

    // #2
    @Test
    public void testCalculateValidAverage_mixedValidInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // (9.0 + 8.5 + 7.0) / 3 = 8.1666...
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_allValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.0, analyzer.calculateValidAverage(Arrays.asList(8.0, 8.0, 8.0)), 0.0001);
    }

    @Test
    public void testCalculateValidAverage_empty() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.0001);
    }

    @Test
    public void testCalculateValidAverage_onlyInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 11.0)), 0.0001);
    }
}

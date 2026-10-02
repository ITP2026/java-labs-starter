package edu.course.lab02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataSampleTest {
    @Test
    void createsCorrectSample() {
        DataSample sample =
                new DataSample("1", "cat", SampleStatus.NEW, new double[]{1.0, 2.0, 3.0});

        assertEquals("1", sample.getId());
        assertEquals("cat", sample.getLabel());
        assertEquals(SampleStatus.NEW, sample.getStatus());
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, sample.getFeatures());
    }

    @Test
    void changesStatus() {
        DataSample sample =
                new DataSample("1", "cat", SampleStatus.NEW, new double[]{1.0, 2.0});

        sample.changeStatus(SampleStatus.READY);
        assertEquals(SampleStatus.READY, sample.getStatus());
        assertTrue(sample.isReady());
    }

    @Test
    void newSampleIsNotReady() {
        DataSample sample =
                new DataSample("1", "cat", SampleStatus.NEW, new double[]{1.0, 2.0});
        assertFalse(sample.isReady());
    }

    @Test
    void calculatesAverage() {
        DataSample sample =
                new DataSample("1", "cat", SampleStatus.NEW, new double[]{1.0, 2.0, 3.0});
        assertEquals(2.0, sample.averageFeatures());
    }

    @Test
    void rejectsEmptyId() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new DataSample("", "cat", SampleStatus.NEW, new double[]{1.0})
        );
    }

    @Test
    void rejectsNullFeatures() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new DataSample("1", "cat", SampleStatus.NEW, null)
        );
    }

    @Test
    void copiesFeatures() {
        double[] features = {1.0, 2.0};

        DataSample sample =
                new DataSample("1", "cat", SampleStatus.NEW, features);
        features[0] = 100.0;
        assertEquals(1.0, sample.getFeatures()[0]);
    }

    @Test
    void returnedFeaturesCannotChangeInternalArray() {
        DataSample sample =
                new DataSample("1", "cat", SampleStatus.NEW, new double[]{1.0, 2.0});
        double[] returned = sample.getFeatures();
        returned[0] = 100.0;
        assertEquals(1.0, sample.getFeatures()[0]);
    }
}
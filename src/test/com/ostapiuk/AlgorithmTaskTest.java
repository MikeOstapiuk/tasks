package com.ostapiuk;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AlgorithmTaskTest {

    @Test
    public void sumLastDigits() {
        assertEquals(14, AlgorithmTask.sumLastDigits(3146167, 3));
    }

    @Test
    public void findCommonMultiple() {
        List <Long> list = Arrays.asList(18L, 36L);
        assertEquals(list, AlgorithmTask.findCommonMultiple(6,9));
    }

    @Test
    public void findMersenNumbers() {
        List <Long> list = Arrays.asList(1L, 3L, 7L, 15L, 31L, 63L);
        assertEquals(list,AlgorithmTask.findMersenNumbers(92));
    }

    @Test (expected = IllegalArgumentException.class)
    public void sumLastDigitsBadArguments() {
        AlgorithmTask.sumLastDigits(-5, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findCommonMultipleBadArguments(){
        AlgorithmTask.findCommonMultiple(-6,9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMersenNumbersBadArgument() {
        AlgorithmTask.findMersenNumbers(-92);
    }
}
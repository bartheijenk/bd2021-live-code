package org.example.firsttaste.slides.mocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

class CoronaTestAanvragerTest {

    private CoronaTestAanvrager target;
    private ScannerWrapper scannerWrapperMock = Mockito.mock(ScannerWrapper.class);

    @BeforeEach
    void setUp() {
        target = new CoronaTestAanvrager();
        target.setScanner(scannerWrapperMock);
        when(scannerWrapperMock.nextLine()).thenReturn("1234"); // fluent API
    }

    @Test
    void run() {
        target.run();
    }
}

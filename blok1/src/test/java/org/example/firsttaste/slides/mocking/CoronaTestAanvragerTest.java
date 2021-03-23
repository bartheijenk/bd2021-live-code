package org.example.firsttaste.slides.mocking;

import org.assertj.core.api.Assertions;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class CoronaTestAanvragerTest {

    private CoronaTestAanvrager target;
    private ScannerWrapper scannerWrapperMock = Mockito.mock(ScannerWrapper.class);
    private SoutWrapper soutMock = Mockito.mock(SoutWrapper.class);

    @BeforeEach
    void setUp() {
        target = new CoronaTestAanvrager();
        target.setScanner(scannerWrapperMock);
        target.setSout(soutMock);
        when(scannerWrapperMock.nextLine()).thenReturn("1234"); // fluent API
        // when(soutMock.print()).thenReturn("1234"); // not working: void returns nothing
    }

    @Test
    void run() {
        // given

        // when
        target.start();

        // then
        //   asserts
        //   verifies
        verify(scannerWrapperMock, times(1)).nextLine();
        verify(soutMock, times(1)).print(any());
        verify(soutMock, times(2)).println(any());
    }

    @Test
    void testShowBSN() {
        String actual = target.showBSN("1234");

        // junit(5)
        assertTrue(actual.contains("1234"));

        // hamcrest
        MatcherAssert.assertThat(actual, is("Uw BSN is: 1234"));

        // assertj
        Assertions.assertThat(actual).contains("1234");
    }
}

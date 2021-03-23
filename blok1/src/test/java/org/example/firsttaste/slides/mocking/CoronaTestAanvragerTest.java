package org.example.firsttaste.slides.mocking;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class CoronaTestAanvragerTest {

    private ArgumentCaptor<String> stringArg;
    private ArgumentCaptor<Integer> intArg;

    private CoronaTestAanvrager target;
    private ScannerWrapper scannerWrapperMock = Mockito.mock(ScannerWrapper.class);
    private SoutWrapper soutMock = Mockito.mock(SoutWrapper.class);

    @BeforeEach
    void setUp() {
        stringArg = ArgumentCaptor.forClass(String.class);
        intArg = ArgumentCaptor.forClass(Integer.class);

        // target aanmaken en dependencies erop zetten:
        target = new CoronaTestAanvrager();
        target.setScanner(scannerWrapperMock);
        target.setSout(soutMock);

        // mocks programmeren:
        when(scannerWrapperMock.nextLine()).thenReturn("1234"); // fluent API

        // when(soutMock.print()).thenReturn(???); // not working: void returns nothing
        doNothing().when(soutMock).print(stringArg.capture());
        doNothing().when(soutMock).println(stringArg.capture());
    }

    @Test
    void whenStartThenScannerAndSoutAreCalled() {
        // given

        // when
        target.start();

        // then
        //   asserts
        //   verifies
        verify(scannerWrapperMock, times(1)).nextLine();
        verify(soutMock, times(1)).print(any());
        verify(soutMock, times(2)).println(any());

        // latest argument:
        assertThat(stringArg.getValue()).startsWith("Uw test is gepland op: ");

        // all recorded arguments:
        assertThat(stringArg.getAllValues().get(0)).isEqualTo("Wat is uw BSN? ");
        assertThat(stringArg.getAllValues().get(1)).contains("1234");
        assertThat(stringArg.getAllValues().get(2)).startsWith("Uw test is gepland op: ");
    }

    @Test
    void testShowBSN() {
        String actual = target.showBSN("1234");

        // junit(5)
        assertTrue(actual.contains("1234"));

        // hamcrest
        MatcherAssert.assertThat(actual, is("Uw BSN is: 1234"));

        // assertj
        assertThat(actual).contains("1234");
    }

    @Test
    void test() {
        final int $42 = 42;

        when(soutMock.doeIets(intArg.capture())).thenReturn("bla " + $42);

        String s = target.doeIetsMetSoutWrapper($42);

        assertThat(s).isEqualTo("bla 42");
        assertThat(intArg.getValue()).isEqualTo(84);
    }
}

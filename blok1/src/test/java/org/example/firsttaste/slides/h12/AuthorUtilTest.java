package org.example.firsttaste.slides.h12;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AuthorUtilTest {

    @Test
    void showAuthorsOnClassTest() {
        AuthorUtil util = new AuthorUtil();
        Class<GamePlayer> c = GamePlayer.class;

        String classAuthor = util.showAuthorsOnClass(c);

        assertEquals(classAuthor, "Bram");

        // List<String> methodAuthors = util.showAuthorsOnMethods(c);
    }

    @Test
    void showAuthorsOnClassTest2() {
        AuthorUtil util = new AuthorUtil();
        Class<SomeOtherClass> c = SomeOtherClass.class;

        String classAuthor = util.showAuthorsOnClass(c);

        assertNull(classAuthor);

        // List<String> methodAuthors = util.showAuthorsOnMethods(c);
    }

    @Test
    void showAuthorsOnMethodsTest() {
        AuthorUtil util = new AuthorUtil();
        Class<GamePlayer> c = GamePlayer.class;

        List<String> methodAuthors = util.showAuthorsOnMethods(c);

        assertThat(methodAuthors).contains("Timo Kramer", "Menno Kramer");
    }
}

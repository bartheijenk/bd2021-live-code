package org.example.java16;

public class AuthorUtil {
    public String showAuthorOnClass(Class<AuthorUtil> c) {
        // pattern matching for instanceof (java 16)
        // if (c.getAnnotation(Author.class) instanceof Author a) {
        //     return a.value();
        // }

        return null;
    }

    public static void main(String[] args) {
        String s = new AuthorUtil().showAuthorOnClass(AuthorUtil.class);
        System.out.println(s);
    }
}

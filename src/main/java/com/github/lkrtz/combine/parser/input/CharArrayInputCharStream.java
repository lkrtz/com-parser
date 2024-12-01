package com.github.lkrtz.combine.parser.input;

import java.util.Deque;

public class CharArrayInputCharStream implements InputCharStream {

    private final Deque<Character> buffer;

    public CharArrayInputCharStream(Deque<Character> buffer) {
        this.buffer = buffer;
    }

    @Override
    public Character peek() {
        return null;
    }

    @Override
    public Character pop() {
        return null;
    }
}

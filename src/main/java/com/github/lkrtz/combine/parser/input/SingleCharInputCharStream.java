package com.github.lkrtz.combine.parser.input;

import java.util.ArrayDeque;
import java.util.Deque;

public class SingleCharInputCharStream implements InputCharStream {

    private final Deque<Character> buffer;

    public SingleCharInputCharStream(Character c) {
        buffer = new ArrayDeque<>();
        buffer.addLast(c);
    }

    @Override
    public Character peek() {
        return buffer.peek();
    }

    @Override
    public Character pop() {
        if (buffer.isEmpty()) {
            return null;
        }
        return buffer.pop();
    }
}

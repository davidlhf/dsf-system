package com.dsfsys.mathematics;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class HashMathematics {

    public static final long SEED = 305441741L;

    public static long hash64A(ByteBuffer buf) {
        ByteOrder byteOrder = buf.order();
        buf.order(ByteOrder.LITTLE_ENDIAN);
        long m = -4132994306676758123L;
        int r = 47;

        long h;
        for(h = SEED ^ (long)buf.remaining() * m; buf.remaining() >= 8; h *= m) {
            long k = buf.getLong();
            k *= m;
            k ^= k >>> r;
            k *= m;
            h ^= k;
        }

        if (buf.remaining() > 0) {
            ByteBuffer finish = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
            finish.put(buf).rewind();
            h ^= finish.getLong();
            h *= m;
        }

        h ^= h >>> r;
        h *= m;
        h ^= h >>> r;
        buf.order(byteOrder);
        return h;
    }
}

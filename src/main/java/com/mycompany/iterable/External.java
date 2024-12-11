package com.mycompany.iterable;

public class External {
    class Internal {
        static class InternalStatic{}
    }
    public static void main(String[] args) {
        External.Internal internal = new External().new Internal();
        External.Internal.InternalStatic internalStatic = new External.Internal.InternalStatic();
    }
}

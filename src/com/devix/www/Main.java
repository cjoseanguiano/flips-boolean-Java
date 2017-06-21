package com.devix.www;

import com.sun.tools.javac.util.Log;

import static sun.jvm.hotspot.debugger.win32.coff.DebugVC50X86RegisterEnums.TAG;

public class Main {

    public static void main(String[] args) {

        boolean value = true;
        System.out.println(value);

        value = !value;
//        Log.i(TAG, "main: " + value);
        System.out.println(value);

        value = !value;
        System.out.println(value);
    }
}

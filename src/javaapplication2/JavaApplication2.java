package javaapplication2;

import Container.JacobClass;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import com.sun.jna.win32.W32APIFunctionMapper;
import com.sun.jna.win32.W32APIOptions;
import com.sun.jna.win32.StdCallLibrary;

public interface JavaApplication2 extends StdCallLibrary {
        
    JavaApplication2 INSTANCE = (JavaApplication2) Native.load("kernel32",JavaApplication2.class);
    
    JavaApplication2 SYNC_INSTANCE = (JavaApplication2) Native.syncronizedLibrary(INSTANCE);
}

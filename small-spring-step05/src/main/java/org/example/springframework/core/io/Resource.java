package org.example.springframework.core.io;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;

public interface Resource {

    InputStream getInputStream() throws IOException;
}

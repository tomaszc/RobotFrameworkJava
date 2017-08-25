package org.my.robotLibrary;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.Slf4jNotifier;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;

/**
 * Module that can run wire mock on provided port and with config from given path
 */
@SuppressWarnings("unused")
public class WiremockLibrary
{
    public static final int PORT_DEFAULT = 6124;

    private final WireMockServer server;

    public WiremockLibrary(String confPath){
        this(confPath, PORT_DEFAULT);
    }

    public WiremockLibrary(String confPath, int port)
    {
        this.server = new WireMockServer(
                WireMockConfiguration.options()
                        .port(port)
                        .usingFilesUnderClasspath(confPath)
                        .notifier( new Slf4jNotifier(false)) );
    }

    public synchronized void startWireMock(){
        server.start();
    }

    public void stopWireMock(){
        server.stop();
    }

    public String getWireMockURI(){
        return "localhost:"+ server.port();
    }
}

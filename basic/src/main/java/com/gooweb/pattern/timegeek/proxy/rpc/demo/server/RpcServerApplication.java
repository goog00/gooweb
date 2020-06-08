package com.gooweb.pattern.timegeek.proxy.rpc.demo.server;

import com.gooweb.pattern.timegeek.proxy.rpc.RpcServer;

public class RpcServerApplication {

    public static void main(String[] args) throws Exception {
      CalculatorService service = new CalculatorServiceImpl();
      RpcServer server = new RpcServer();
      server.export(service, 1234);
    }

}
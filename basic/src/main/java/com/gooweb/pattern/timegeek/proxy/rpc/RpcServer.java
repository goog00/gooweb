package com.gooweb.pattern.timegeek.proxy.rpc;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author steng
 * @description
 * @date 2020-06-05 9:30 上午
 **/
public class RpcServer {

    public void export(Object service,int port) throws Exception{
        if(service == null){
            throw new IllegalArgumentException("service instance == null");
        }

        if(port <=0 || port > 65535){
            throw new IllegalArgumentException("Invalid port " + port);
        }

        ServerSocket server = new ServerSocket(port);

        while (true){
            final Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                        ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
                        try {

                            String methodName = input.readUTF();
                            Class<?>[] parameterTypes = (Class<?>[])input.readObject();
                            Object[] arguments = (Object[]) input.readObject();
                            Method method = service.getClass().getMethod(methodName,parameterTypes);
                            Object result = method.invoke(service,arguments);
                            output.writeObject(result);

                        } catch (Throwable e) {
                            output.writeObject(e);
                        } finally {
                            output.close();
                            input.close();
                            socket.close();
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }).start();
        }

    }
}

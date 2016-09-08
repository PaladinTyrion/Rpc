package com.rpc.Service;

/**
 * Created by paladintyrion on 16/9/5.
 *
 * @author <a href="mailto: paladinosmenttt@sina.com" /> paladintyrion
 * @version 1.0.0
 */
@RpcService(value = SimpleService.class)
public class SimpleServiceImpl implements SimpleService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }
}

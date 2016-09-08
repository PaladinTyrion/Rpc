package com.rpc.Beans;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by paladintyrion on 16/9/6.
 *
 * @author <a href="mailto: paladinosmenttt@sina.com" /> paladintyrion
 * @version 1.0.0
 */
public class RpcRequest {

    @Setter
    @Getter
    private String requestId;

    @Setter
    @Getter
    private String className;

    @Setter
    @Getter
    private String methodName;

    @Setter
    @Getter
    private Class<?>[] parameterTypes;

    @Setter
    @Getter
    private Object[] parameters;
}

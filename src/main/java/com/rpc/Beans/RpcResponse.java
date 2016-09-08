package com.rpc.Beans;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by paladintyrion on 16/9/6.
 *
 * @author <a href="mailto: paladinosmenttt@sina.com" /> paladintyrion
 * @version 1.0.0
 */
public class RpcResponse {

    @Setter
    @Getter
    private String requestId;

    @Setter
    @Getter
    private Throwable errorMsg;

    @Setter
    @Getter
    private Object result;

    @Setter
    @Getter
    private boolean error;
}

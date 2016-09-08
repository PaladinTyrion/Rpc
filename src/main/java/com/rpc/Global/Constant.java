package com.rpc.Global;

/**
 * Created by paladintyrion on 16/9/6.
 *
 * @author <a href="mailto: paladinosmenttt@sina.com" /> paladintyrion
 * @version 1.0.0
 */
public class Constant {

    /** zookeeper的session超时时间 */
    public static final int ZK_SESSION_TIMEOUT = 5000;
    /** zookeeper的永久注册路径 */
    public static final String ZK_REGISTRY_PATH = "/registry";
    /** zookeeper的数据节点路径 */
    public static final String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";
}

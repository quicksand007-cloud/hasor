/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.rsf.center.server;
import net.hasor.rsf.address.InterAddress;
import net.hasor.rsf.center.server.domain.AuthInfo;
import net.hasor.rsf.center.server.domain.Result;
import net.hasor.rsf.center.server.domain.ServiceInfo;
import net.hasor.rsf.domain.RsfServiceType;
/**
 * 接口授权查询。
 * @version : 2016年2月22日
 * @author 赵永春(zyc@hasor.net)
 */
public interface AuthQuery {
    /**
     * 发布服务权限检测
     * @param authInfo 授权信息
     * @param rsfAddress 请求 center 的远程机器
     * @param serviceInfo 服务信息
     * @param serviceType 提供者 or 消费者
     * @return
     */
    public Result<Boolean> checkPublish(AuthInfo authInfo, InterAddress rsfAddress, ServiceInfo serviceInfo, RsfServiceType serviceType);
}
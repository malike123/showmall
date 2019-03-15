/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 ‭‭‭‭‭‭‭‭‭‭‭‭[smallbun] www.smallbun.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.lvb.shopsmall.lib.manage.monitor.service;

import org.lvb.shopsmall.lib.manage.monitor.vo.OnlineUserVO;

import java.util.List;

/**
 * 监控业务接口
 * @author SanLi
 * Created by 2689170096@qq.com on 2019/1/13 13:51
 */
public interface SysMonitorService {

	/**
	 * 从会话注册表中获取用户
	 * @return {@link List <  OnlineUserVO  >}
	 */
	List<OnlineUserVO> getUsersFromSessionRegistry();

	/**
	 * 下线所有用户
	 */
	void expireUserSessions();


	/**
	 * 下线指定用户
	 * @param sessionId {@link String}
	 */
	void expireUserSession(String sessionId);

	/**
	 * 在线用户数量
	 * @return {@link Long}
	 */
	Long onlineUserCount();
}

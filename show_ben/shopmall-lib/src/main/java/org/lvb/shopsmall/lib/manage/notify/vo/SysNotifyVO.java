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

package org.lvb.shopsmall.lib.manage.notify.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.lvb.shopsmall.lib.manage.notify.entity.SysNotifyEntity;
import org.lvb.shopsmall.lib.manage.user.entity.SysUserEntity;
import org.lvb.smallbun.framework.annotation.DictValue;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 通知公告VO对象
 *
 * @author SanLi
 * Created by 2689170096@qq.com on 2019/2/21 22:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysNotifyVO extends SysNotifyEntity {
    /**
     * 接收人集合
     */
    @NotEmpty(message = "公告接收人不能为空")
    private List<SysUserEntity> receiverUser;
    /**
     * 类型
     */
    @DictValue(typeCode = "NOTIFY_GENRE", valueField = "notifyGenre")
    private String notifyGenreName;

    /**
     * 状态
     */
    @DictValue(typeCode = "NOTIFY_STATUS", valueField = "notifyStatus")
    private String notifyStatusName;
}

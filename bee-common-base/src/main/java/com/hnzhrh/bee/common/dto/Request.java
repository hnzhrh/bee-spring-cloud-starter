package com.hnzhrh.bee.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 增删改查请求基类，增删改请求自行定义
 * @see Query
 * @author erpang
 * @version v1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Request extends DTO{
    /**
     * 企业ID
     */
    private String cid;

    /**
     * 操作用户ID
     */
    private String operatorId;
}

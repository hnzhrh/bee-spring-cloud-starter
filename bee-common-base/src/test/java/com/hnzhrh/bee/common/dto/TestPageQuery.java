package com.hnzhrh.bee.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TestPageQuery extends PageQuery{
    private String name;
}

package com.hnzhrh.bee.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TestQuery extends Query{
    private String name;
}

package com.hnzhrh.bee.common.dto;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DtoTest {
    @Test
    public void testQuery() {
        TestQuery testQuery = new TestQuery();
        testQuery.setCid("c001");
        testQuery.setOperatorId("userid:34");
        testQuery.setName("erpang");

        TestPageQuery testPageQuery = new TestPageQuery();
        testPageQuery.getOffset();

        SingleResponse<TestQuery> response = SingleResponse.of(new TestQuery());

        List<TestQuery> list = new ArrayList<>();
        MultiResponse<TestQuery> multiResponse = MultiResponse.of(list);

        PageResponse<TestQuery> pageResponse = PageResponse.of(list, 100, 10, 2);
        System.out.println(pageResponse.getPageIndex());
        System.out.println(pageResponse.getTotalCount());
        System.out.println(pageResponse.getTotalPages());
    }
}

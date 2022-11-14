package cn.edu.tsinghua.iotdb.benchmark.workload.query.impl;

public class OpenRangeQuery extends Query {

    long tsLessThan, tsGreaterThan;
    double valueLessThan, valueGreaterThan;
    double closedValueRangeLB, closedValueRangeUB;

    public OpenRangeQuery(long tsLessThan, long tsGreaterThan) {

    }

    @Override
    public StringBuilder getQueryAttrs() {
        return null;
    }
}

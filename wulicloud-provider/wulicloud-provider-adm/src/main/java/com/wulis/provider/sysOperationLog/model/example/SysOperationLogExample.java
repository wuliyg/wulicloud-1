package com.wulis.provider.sysOperationLog.model.example;

import java.util.ArrayList;
import java.util.List;

public class SysOperationLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOperationLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNull() {
            addCriterion("input_time is null");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNotNull() {
            addCriterion("input_time is not null");
            return (Criteria) this;
        }

        public Criteria andInputTimeEqualTo(String value) {
            addCriterion("input_time =", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotEqualTo(String value) {
            addCriterion("input_time <>", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThan(String value) {
            addCriterion("input_time >", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThanOrEqualTo(String value) {
            addCriterion("input_time >=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThan(String value) {
            addCriterion("input_time <", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThanOrEqualTo(String value) {
            addCriterion("input_time <=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLike(String value) {
            addCriterion("input_time like", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotLike(String value) {
            addCriterion("input_time not like", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeIn(List<String> values) {
            addCriterion("input_time in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotIn(List<String> values) {
            addCriterion("input_time not in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeBetween(String value1, String value2) {
            addCriterion("input_time between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotBetween(String value1, String value2) {
            addCriterion("input_time not between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNull() {
            addCriterion("operation_name is null");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNotNull() {
            addCriterion("operation_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNameEqualTo(String value) {
            addCriterion("operation_name =", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotEqualTo(String value) {
            addCriterion("operation_name <>", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThan(String value) {
            addCriterion("operation_name >", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThanOrEqualTo(String value) {
            addCriterion("operation_name >=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThan(String value) {
            addCriterion("operation_name <", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThanOrEqualTo(String value) {
            addCriterion("operation_name <=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLike(String value) {
            addCriterion("operation_name like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotLike(String value) {
            addCriterion("operation_name not like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameIn(List<String> values) {
            addCriterion("operation_name in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotIn(List<String> values) {
            addCriterion("operation_name not in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameBetween(String value1, String value2) {
            addCriterion("operation_name between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotBetween(String value1, String value2) {
            addCriterion("operation_name not between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("operation_type like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("operation_type not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationResultIsNull() {
            addCriterion("operation_result is null");
            return (Criteria) this;
        }

        public Criteria andOperationResultIsNotNull() {
            addCriterion("operation_result is not null");
            return (Criteria) this;
        }

        public Criteria andOperationResultEqualTo(String value) {
            addCriterion("operation_result =", value, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultNotEqualTo(String value) {
            addCriterion("operation_result <>", value, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultGreaterThan(String value) {
            addCriterion("operation_result >", value, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultGreaterThanOrEqualTo(String value) {
            addCriterion("operation_result >=", value, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultLessThan(String value) {
            addCriterion("operation_result <", value, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultLessThanOrEqualTo(String value) {
            addCriterion("operation_result <=", value, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultLike(String value) {
            addCriterion("operation_result like", value, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultNotLike(String value) {
            addCriterion("operation_result not like", value, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultIn(List<String> values) {
            addCriterion("operation_result in", values, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultNotIn(List<String> values) {
            addCriterion("operation_result not in", values, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultBetween(String value1, String value2) {
            addCriterion("operation_result between", value1, value2, "operationResult");
            return (Criteria) this;
        }

        public Criteria andOperationResultNotBetween(String value1, String value2) {
            addCriterion("operation_result not between", value1, value2, "operationResult");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddIsNull() {
            addCriterion("interface_add is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddIsNotNull() {
            addCriterion("interface_add is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddEqualTo(String value) {
            addCriterion("interface_add =", value, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddNotEqualTo(String value) {
            addCriterion("interface_add <>", value, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddGreaterThan(String value) {
            addCriterion("interface_add >", value, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddGreaterThanOrEqualTo(String value) {
            addCriterion("interface_add >=", value, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddLessThan(String value) {
            addCriterion("interface_add <", value, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddLessThanOrEqualTo(String value) {
            addCriterion("interface_add <=", value, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddLike(String value) {
            addCriterion("interface_add like", value, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddNotLike(String value) {
            addCriterion("interface_add not like", value, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddIn(List<String> values) {
            addCriterion("interface_add in", values, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddNotIn(List<String> values) {
            addCriterion("interface_add not in", values, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddBetween(String value1, String value2) {
            addCriterion("interface_add between", value1, value2, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddNotBetween(String value1, String value2) {
            addCriterion("interface_add not between", value1, value2, "interfaceAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddIsNull() {
            addCriterion("ip_add is null");
            return (Criteria) this;
        }

        public Criteria andIpAddIsNotNull() {
            addCriterion("ip_add is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddEqualTo(String value) {
            addCriterion("ip_add =", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddNotEqualTo(String value) {
            addCriterion("ip_add <>", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddGreaterThan(String value) {
            addCriterion("ip_add >", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddGreaterThanOrEqualTo(String value) {
            addCriterion("ip_add >=", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddLessThan(String value) {
            addCriterion("ip_add <", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddLessThanOrEqualTo(String value) {
            addCriterion("ip_add <=", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddLike(String value) {
            addCriterion("ip_add like", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddNotLike(String value) {
            addCriterion("ip_add not like", value, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddIn(List<String> values) {
            addCriterion("ip_add in", values, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddNotIn(List<String> values) {
            addCriterion("ip_add not in", values, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddBetween(String value1, String value2) {
            addCriterion("ip_add between", value1, value2, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andIpAddNotBetween(String value1, String value2) {
            addCriterion("ip_add not between", value1, value2, "ipAdd");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeIsNull() {
            addCriterion("execution_start_time is null");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeIsNotNull() {
            addCriterion("execution_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeEqualTo(String value) {
            addCriterion("execution_start_time =", value, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeNotEqualTo(String value) {
            addCriterion("execution_start_time <>", value, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeGreaterThan(String value) {
            addCriterion("execution_start_time >", value, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("execution_start_time >=", value, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeLessThan(String value) {
            addCriterion("execution_start_time <", value, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeLessThanOrEqualTo(String value) {
            addCriterion("execution_start_time <=", value, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeLike(String value) {
            addCriterion("execution_start_time like", value, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeNotLike(String value) {
            addCriterion("execution_start_time not like", value, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeIn(List<String> values) {
            addCriterion("execution_start_time in", values, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeNotIn(List<String> values) {
            addCriterion("execution_start_time not in", values, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeBetween(String value1, String value2) {
            addCriterion("execution_start_time between", value1, value2, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionStartTimeNotBetween(String value1, String value2) {
            addCriterion("execution_start_time not between", value1, value2, "executionStartTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeIsNull() {
            addCriterion("execution_end_time is null");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeIsNotNull() {
            addCriterion("execution_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeEqualTo(String value) {
            addCriterion("execution_end_time =", value, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeNotEqualTo(String value) {
            addCriterion("execution_end_time <>", value, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeGreaterThan(String value) {
            addCriterion("execution_end_time >", value, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("execution_end_time >=", value, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeLessThan(String value) {
            addCriterion("execution_end_time <", value, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeLessThanOrEqualTo(String value) {
            addCriterion("execution_end_time <=", value, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeLike(String value) {
            addCriterion("execution_end_time like", value, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeNotLike(String value) {
            addCriterion("execution_end_time not like", value, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeIn(List<String> values) {
            addCriterion("execution_end_time in", values, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeNotIn(List<String> values) {
            addCriterion("execution_end_time not in", values, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeBetween(String value1, String value2) {
            addCriterion("execution_end_time between", value1, value2, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andExecutionEndTimeNotBetween(String value1, String value2) {
            addCriterion("execution_end_time not between", value1, value2, "executionEndTime");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(String value) {
            addCriterion("is_enable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(String value) {
            addCriterion("is_enable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(String value) {
            addCriterion("is_enable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(String value) {
            addCriterion("is_enable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(String value) {
            addCriterion("is_enable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(String value) {
            addCriterion("is_enable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLike(String value) {
            addCriterion("is_enable like", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotLike(String value) {
            addCriterion("is_enable not like", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<String> values) {
            addCriterion("is_enable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<String> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(String value1, String value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(String value1, String value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andOperatorByIsNull() {
            addCriterion("operator_by is null");
            return (Criteria) this;
        }

        public Criteria andOperatorByIsNotNull() {
            addCriterion("operator_by is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorByEqualTo(String value) {
            addCriterion("operator_by =", value, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByNotEqualTo(String value) {
            addCriterion("operator_by <>", value, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByGreaterThan(String value) {
            addCriterion("operator_by >", value, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByGreaterThanOrEqualTo(String value) {
            addCriterion("operator_by >=", value, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByLessThan(String value) {
            addCriterion("operator_by <", value, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByLessThanOrEqualTo(String value) {
            addCriterion("operator_by <=", value, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByLike(String value) {
            addCriterion("operator_by like", value, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByNotLike(String value) {
            addCriterion("operator_by not like", value, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByIn(List<String> values) {
            addCriterion("operator_by in", values, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByNotIn(List<String> values) {
            addCriterion("operator_by not in", values, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByBetween(String value1, String value2) {
            addCriterion("operator_by between", value1, value2, "operatorBy");
            return (Criteria) this;
        }

        public Criteria andOperatorByNotBetween(String value1, String value2) {
            addCriterion("operator_by not between", value1, value2, "operatorBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
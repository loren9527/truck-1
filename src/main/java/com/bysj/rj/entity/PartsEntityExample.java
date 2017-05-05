package com.bysj.rj.entity;

import java.util.ArrayList;
import java.util.List;

public class PartsEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartsEntityExample() {
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

        public Criteria andPartIdIsNull() {
            addCriterion("part_id is null");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNotNull() {
            addCriterion("part_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartIdEqualTo(Long value) {
            addCriterion("part_id =", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotEqualTo(Long value) {
            addCriterion("part_id <>", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThan(Long value) {
            addCriterion("part_id >", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("part_id >=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThan(Long value) {
            addCriterion("part_id <", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThanOrEqualTo(Long value) {
            addCriterion("part_id <=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdIn(List<Long> values) {
            addCriterion("part_id in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotIn(List<Long> values) {
            addCriterion("part_id not in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdBetween(Long value1, Long value2) {
            addCriterion("part_id between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotBetween(Long value1, Long value2) {
            addCriterion("part_id not between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("part_name is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("part_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("part_name =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("part_name <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("part_name >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_name >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("part_name <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("part_name <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("part_name like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("part_name not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("part_name in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("part_name not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("part_name between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("part_name not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIsNull() {
            addCriterion("type_number is null");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIsNotNull() {
            addCriterion("type_number is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNumberEqualTo(String value) {
            addCriterion("type_number =", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotEqualTo(String value) {
            addCriterion("type_number <>", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberGreaterThan(String value) {
            addCriterion("type_number >", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("type_number >=", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLessThan(String value) {
            addCriterion("type_number <", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLessThanOrEqualTo(String value) {
            addCriterion("type_number <=", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLike(String value) {
            addCriterion("type_number like", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotLike(String value) {
            addCriterion("type_number not like", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIn(List<String> values) {
            addCriterion("type_number in", values, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotIn(List<String> values) {
            addCriterion("type_number not in", values, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberBetween(String value1, String value2) {
            addCriterion("type_number between", value1, value2, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotBetween(String value1, String value2) {
            addCriterion("type_number not between", value1, value2, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNull() {
            addCriterion("business_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("business_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("business_name =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("business_name <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("business_name >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_name >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("business_name <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("business_name <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("business_name like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("business_name not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(List<String> values) {
            addCriterion("business_name in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(List<String> values) {
            addCriterion("business_name not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("business_name between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("business_name not between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andProduceTimeIsNull() {
            addCriterion("produce_time is null");
            return (Criteria) this;
        }

        public Criteria andProduceTimeIsNotNull() {
            addCriterion("produce_time is not null");
            return (Criteria) this;
        }

        public Criteria andProduceTimeEqualTo(Long value) {
            addCriterion("produce_time =", value, "produceTime");
            return (Criteria) this;
        }

        public Criteria andProduceTimeNotEqualTo(Long value) {
            addCriterion("produce_time <>", value, "produceTime");
            return (Criteria) this;
        }

        public Criteria andProduceTimeGreaterThan(Long value) {
            addCriterion("produce_time >", value, "produceTime");
            return (Criteria) this;
        }

        public Criteria andProduceTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("produce_time >=", value, "produceTime");
            return (Criteria) this;
        }

        public Criteria andProduceTimeLessThan(Long value) {
            addCriterion("produce_time <", value, "produceTime");
            return (Criteria) this;
        }

        public Criteria andProduceTimeLessThanOrEqualTo(Long value) {
            addCriterion("produce_time <=", value, "produceTime");
            return (Criteria) this;
        }

        public Criteria andProduceTimeIn(List<Long> values) {
            addCriterion("produce_time in", values, "produceTime");
            return (Criteria) this;
        }

        public Criteria andProduceTimeNotIn(List<Long> values) {
            addCriterion("produce_time not in", values, "produceTime");
            return (Criteria) this;
        }

        public Criteria andProduceTimeBetween(Long value1, Long value2) {
            addCriterion("produce_time between", value1, value2, "produceTime");
            return (Criteria) this;
        }

        public Criteria andProduceTimeNotBetween(Long value1, Long value2) {
            addCriterion("produce_time not between", value1, value2, "produceTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIsNull() {
            addCriterion("storage_time is null");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIsNotNull() {
            addCriterion("storage_time is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTimeEqualTo(Long value) {
            addCriterion("storage_time =", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotEqualTo(Long value) {
            addCriterion("storage_time <>", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeGreaterThan(Long value) {
            addCriterion("storage_time >", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("storage_time >=", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeLessThan(Long value) {
            addCriterion("storage_time <", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeLessThanOrEqualTo(Long value) {
            addCriterion("storage_time <=", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIn(List<Long> values) {
            addCriterion("storage_time in", values, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotIn(List<Long> values) {
            addCriterion("storage_time not in", values, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeBetween(Long value1, Long value2) {
            addCriterion("storage_time between", value1, value2, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotBetween(Long value1, Long value2) {
            addCriterion("storage_time not between", value1, value2, "storageTime");
            return (Criteria) this;
        }

        public Criteria andPartitionIsNull() {
            addCriterion("partition is null");
            return (Criteria) this;
        }

        public Criteria andPartitionIsNotNull() {
            addCriterion("partition is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionEqualTo(String value) {
            addCriterion("partition =", value, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionNotEqualTo(String value) {
            addCriterion("partition <>", value, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionGreaterThan(String value) {
            addCriterion("partition >", value, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionGreaterThanOrEqualTo(String value) {
            addCriterion("partition >=", value, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionLessThan(String value) {
            addCriterion("partition <", value, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionLessThanOrEqualTo(String value) {
            addCriterion("partition <=", value, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionLike(String value) {
            addCriterion("partition like", value, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionNotLike(String value) {
            addCriterion("partition not like", value, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionIn(List<String> values) {
            addCriterion("partition in", values, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionNotIn(List<String> values) {
            addCriterion("partition not in", values, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionBetween(String value1, String value2) {
            addCriterion("partition between", value1, value2, "partition");
            return (Criteria) this;
        }

        public Criteria andPartitionNotBetween(String value1, String value2) {
            addCriterion("partition not between", value1, value2, "partition");
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
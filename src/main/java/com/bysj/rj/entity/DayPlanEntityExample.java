package com.bysj.rj.entity;

import java.util.ArrayList;
import java.util.List;

public class DayPlanEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DayPlanEntityExample() {
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

        public Criteria andDpIdIsNull() {
            addCriterion("dp_id is null");
            return (Criteria) this;
        }

        public Criteria andDpIdIsNotNull() {
            addCriterion("dp_id is not null");
            return (Criteria) this;
        }

        public Criteria andDpIdEqualTo(Long value) {
            addCriterion("dp_id =", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdNotEqualTo(Long value) {
            addCriterion("dp_id <>", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdGreaterThan(Long value) {
            addCriterion("dp_id >", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dp_id >=", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdLessThan(Long value) {
            addCriterion("dp_id <", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdLessThanOrEqualTo(Long value) {
            addCriterion("dp_id <=", value, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdIn(List<Long> values) {
            addCriterion("dp_id in", values, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdNotIn(List<Long> values) {
            addCriterion("dp_id not in", values, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdBetween(Long value1, Long value2) {
            addCriterion("dp_id between", value1, value2, "dpId");
            return (Criteria) this;
        }

        public Criteria andDpIdNotBetween(Long value1, Long value2) {
            addCriterion("dp_id not between", value1, value2, "dpId");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Long value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Long value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Long value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Long value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Long value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Long value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Long> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Long> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Long value1, Long value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Long value1, Long value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeIsNull() {
            addCriterion("plan_volume is null");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeIsNotNull() {
            addCriterion("plan_volume is not null");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeEqualTo(Integer value) {
            addCriterion("plan_volume =", value, "planVolume");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeNotEqualTo(Integer value) {
            addCriterion("plan_volume <>", value, "planVolume");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeGreaterThan(Integer value) {
            addCriterion("plan_volume >", value, "planVolume");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_volume >=", value, "planVolume");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeLessThan(Integer value) {
            addCriterion("plan_volume <", value, "planVolume");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("plan_volume <=", value, "planVolume");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeIn(List<Integer> values) {
            addCriterion("plan_volume in", values, "planVolume");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeNotIn(List<Integer> values) {
            addCriterion("plan_volume not in", values, "planVolume");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeBetween(Integer value1, Integer value2) {
            addCriterion("plan_volume between", value1, value2, "planVolume");
            return (Criteria) this;
        }

        public Criteria andPlanVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_volume not between", value1, value2, "planVolume");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeIsNull() {
            addCriterion("good_volume is null");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeIsNotNull() {
            addCriterion("good_volume is not null");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeEqualTo(Integer value) {
            addCriterion("good_volume =", value, "goodVolume");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeNotEqualTo(Integer value) {
            addCriterion("good_volume <>", value, "goodVolume");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeGreaterThan(Integer value) {
            addCriterion("good_volume >", value, "goodVolume");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_volume >=", value, "goodVolume");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeLessThan(Integer value) {
            addCriterion("good_volume <", value, "goodVolume");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("good_volume <=", value, "goodVolume");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeIn(List<Integer> values) {
            addCriterion("good_volume in", values, "goodVolume");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeNotIn(List<Integer> values) {
            addCriterion("good_volume not in", values, "goodVolume");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeBetween(Integer value1, Integer value2) {
            addCriterion("good_volume between", value1, value2, "goodVolume");
            return (Criteria) this;
        }

        public Criteria andGoodVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("good_volume not between", value1, value2, "goodVolume");
            return (Criteria) this;
        }

        public Criteria andBadVolumeIsNull() {
            addCriterion("bad_volume is null");
            return (Criteria) this;
        }

        public Criteria andBadVolumeIsNotNull() {
            addCriterion("bad_volume is not null");
            return (Criteria) this;
        }

        public Criteria andBadVolumeEqualTo(Integer value) {
            addCriterion("bad_volume =", value, "badVolume");
            return (Criteria) this;
        }

        public Criteria andBadVolumeNotEqualTo(Integer value) {
            addCriterion("bad_volume <>", value, "badVolume");
            return (Criteria) this;
        }

        public Criteria andBadVolumeGreaterThan(Integer value) {
            addCriterion("bad_volume >", value, "badVolume");
            return (Criteria) this;
        }

        public Criteria andBadVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bad_volume >=", value, "badVolume");
            return (Criteria) this;
        }

        public Criteria andBadVolumeLessThan(Integer value) {
            addCriterion("bad_volume <", value, "badVolume");
            return (Criteria) this;
        }

        public Criteria andBadVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("bad_volume <=", value, "badVolume");
            return (Criteria) this;
        }

        public Criteria andBadVolumeIn(List<Integer> values) {
            addCriterion("bad_volume in", values, "badVolume");
            return (Criteria) this;
        }

        public Criteria andBadVolumeNotIn(List<Integer> values) {
            addCriterion("bad_volume not in", values, "badVolume");
            return (Criteria) this;
        }

        public Criteria andBadVolumeBetween(Integer value1, Integer value2) {
            addCriterion("bad_volume between", value1, value2, "badVolume");
            return (Criteria) this;
        }

        public Criteria andBadVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("bad_volume not between", value1, value2, "badVolume");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNull() {
            addCriterion("is_finish is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNotNull() {
            addCriterion("is_finish is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishEqualTo(Byte value) {
            addCriterion("is_finish =", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotEqualTo(Byte value) {
            addCriterion("is_finish <>", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThan(Byte value) {
            addCriterion("is_finish >", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_finish >=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThan(Byte value) {
            addCriterion("is_finish <", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThanOrEqualTo(Byte value) {
            addCriterion("is_finish <=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishIn(List<Byte> values) {
            addCriterion("is_finish in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotIn(List<Byte> values) {
            addCriterion("is_finish not in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishBetween(Byte value1, Byte value2) {
            addCriterion("is_finish between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotBetween(Byte value1, Byte value2) {
            addCriterion("is_finish not between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdIsNull() {
            addCriterion("truck_plan_id is null");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdIsNotNull() {
            addCriterion("truck_plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdEqualTo(Long value) {
            addCriterion("truck_plan_id =", value, "truckPlanId");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdNotEqualTo(Long value) {
            addCriterion("truck_plan_id <>", value, "truckPlanId");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdGreaterThan(Long value) {
            addCriterion("truck_plan_id >", value, "truckPlanId");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("truck_plan_id >=", value, "truckPlanId");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdLessThan(Long value) {
            addCriterion("truck_plan_id <", value, "truckPlanId");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdLessThanOrEqualTo(Long value) {
            addCriterion("truck_plan_id <=", value, "truckPlanId");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdIn(List<Long> values) {
            addCriterion("truck_plan_id in", values, "truckPlanId");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdNotIn(List<Long> values) {
            addCriterion("truck_plan_id not in", values, "truckPlanId");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdBetween(Long value1, Long value2) {
            addCriterion("truck_plan_id between", value1, value2, "truckPlanId");
            return (Criteria) this;
        }

        public Criteria andTruckPlanIdNotBetween(Long value1, Long value2) {
            addCriterion("truck_plan_id not between", value1, value2, "truckPlanId");
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
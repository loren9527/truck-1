package test.com.bysj.rj.entity;

import java.util.ArrayList;
import java.util.List;

public class TruckPlanEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TruckPlanEntityExample() {
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

        public Criteria andPlanIdIsNull() {
            addCriterion("plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Long value) {
            addCriterion("plan_id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Long value) {
            addCriterion("plan_id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Long value) {
            addCriterion("plan_id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Long value) {
            addCriterion("plan_id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Long value) {
            addCriterion("plan_id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Long> values) {
            addCriterion("plan_id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Long> values) {
            addCriterion("plan_id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Long value1, Long value2) {
            addCriterion("plan_id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Long value1, Long value2) {
            addCriterion("plan_id not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIsNull() {
            addCriterion("truck_type is null");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIsNotNull() {
            addCriterion("truck_type is not null");
            return (Criteria) this;
        }

        public Criteria andTruckTypeEqualTo(String value) {
            addCriterion("truck_type =", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeNotEqualTo(String value) {
            addCriterion("truck_type <>", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeGreaterThan(String value) {
            addCriterion("truck_type >", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("truck_type >=", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeLessThan(String value) {
            addCriterion("truck_type <", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeLessThanOrEqualTo(String value) {
            addCriterion("truck_type <=", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeLike(String value) {
            addCriterion("truck_type like", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeNotLike(String value) {
            addCriterion("truck_type not like", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIn(List<String> values) {
            addCriterion("truck_type in", values, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeNotIn(List<String> values) {
            addCriterion("truck_type not in", values, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeBetween(String value1, String value2) {
            addCriterion("truck_type between", value1, value2, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeNotBetween(String value1, String value2) {
            addCriterion("truck_type not between", value1, value2, "truckType");
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

        public Criteria andPlanNumberIsNull() {
            addCriterion("plan_number is null");
            return (Criteria) this;
        }

        public Criteria andPlanNumberIsNotNull() {
            addCriterion("plan_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlanNumberEqualTo(String value) {
            addCriterion("plan_number =", value, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberNotEqualTo(String value) {
            addCriterion("plan_number <>", value, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberGreaterThan(String value) {
            addCriterion("plan_number >", value, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberGreaterThanOrEqualTo(String value) {
            addCriterion("plan_number >=", value, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberLessThan(String value) {
            addCriterion("plan_number <", value, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberLessThanOrEqualTo(String value) {
            addCriterion("plan_number <=", value, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberLike(String value) {
            addCriterion("plan_number like", value, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberNotLike(String value) {
            addCriterion("plan_number not like", value, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberIn(List<String> values) {
            addCriterion("plan_number in", values, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberNotIn(List<String> values) {
            addCriterion("plan_number not in", values, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberBetween(String value1, String value2) {
            addCriterion("plan_number between", value1, value2, "planNumber");
            return (Criteria) this;
        }

        public Criteria andPlanNumberNotBetween(String value1, String value2) {
            addCriterion("plan_number not between", value1, value2, "planNumber");
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

        public Criteria andRemainVolumeIsNull() {
            addCriterion("remain_volume is null");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeIsNotNull() {
            addCriterion("remain_volume is not null");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeEqualTo(Integer value) {
            addCriterion("remain_volume =", value, "remainVolume");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeNotEqualTo(Integer value) {
            addCriterion("remain_volume <>", value, "remainVolume");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeGreaterThan(Integer value) {
            addCriterion("remain_volume >", value, "remainVolume");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("remain_volume >=", value, "remainVolume");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeLessThan(Integer value) {
            addCriterion("remain_volume <", value, "remainVolume");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("remain_volume <=", value, "remainVolume");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeIn(List<Integer> values) {
            addCriterion("remain_volume in", values, "remainVolume");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeNotIn(List<Integer> values) {
            addCriterion("remain_volume not in", values, "remainVolume");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeBetween(Integer value1, Integer value2) {
            addCriterion("remain_volume between", value1, value2, "remainVolume");
            return (Criteria) this;
        }

        public Criteria andRemainVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("remain_volume not between", value1, value2, "remainVolume");
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

        public Criteria andPlanDateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Long value) {
            addCriterion("plan_date =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Long value) {
            addCriterion("plan_date <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Long value) {
            addCriterion("plan_date >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_date >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Long value) {
            addCriterion("plan_date <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Long value) {
            addCriterion("plan_date <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Long> values) {
            addCriterion("plan_date in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Long> values) {
            addCriterion("plan_date not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Long value1, Long value2) {
            addCriterion("plan_date between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Long value1, Long value2) {
            addCriterion("plan_date not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateIsNull() {
            addCriterion("produce_date is null");
            return (Criteria) this;
        }

        public Criteria andProduceDateIsNotNull() {
            addCriterion("produce_date is not null");
            return (Criteria) this;
        }

        public Criteria andProduceDateEqualTo(Long value) {
            addCriterion("produce_date =", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotEqualTo(Long value) {
            addCriterion("produce_date <>", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateGreaterThan(Long value) {
            addCriterion("produce_date >", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateGreaterThanOrEqualTo(Long value) {
            addCriterion("produce_date >=", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateLessThan(Long value) {
            addCriterion("produce_date <", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateLessThanOrEqualTo(Long value) {
            addCriterion("produce_date <=", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateIn(List<Long> values) {
            addCriterion("produce_date in", values, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotIn(List<Long> values) {
            addCriterion("produce_date not in", values, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateBetween(Long value1, Long value2) {
            addCriterion("produce_date between", value1, value2, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotBetween(Long value1, Long value2) {
            addCriterion("produce_date not between", value1, value2, "produceDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNull() {
            addCriterion("finish_date is null");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNotNull() {
            addCriterion("finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinishDateEqualTo(Long value) {
            addCriterion("finish_date =", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotEqualTo(Long value) {
            addCriterion("finish_date <>", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThan(Long value) {
            addCriterion("finish_date >", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThanOrEqualTo(Long value) {
            addCriterion("finish_date >=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThan(Long value) {
            addCriterion("finish_date <", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThanOrEqualTo(Long value) {
            addCriterion("finish_date <=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateIn(List<Long> values) {
            addCriterion("finish_date in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotIn(List<Long> values) {
            addCriterion("finish_date not in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateBetween(Long value1, Long value2) {
            addCriterion("finish_date between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotBetween(Long value1, Long value2) {
            addCriterion("finish_date not between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andCheckIsNull() {
            addCriterion("check is null");
            return (Criteria) this;
        }

        public Criteria andCheckIsNotNull() {
            addCriterion("check is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEqualTo(String value) {
            addCriterion("check =", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotEqualTo(String value) {
            addCriterion("check <>", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThan(String value) {
            addCriterion("check >", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThanOrEqualTo(String value) {
            addCriterion("check >=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThan(String value) {
            addCriterion("check <", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThanOrEqualTo(String value) {
            addCriterion("check <=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLike(String value) {
            addCriterion("check like", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotLike(String value) {
            addCriterion("check not like", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckIn(List<String> values) {
            addCriterion("check in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotIn(List<String> values) {
            addCriterion("check not in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckBetween(String value1, String value2) {
            addCriterion("check between", value1, value2, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotBetween(String value1, String value2) {
            addCriterion("check not between", value1, value2, "check");
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
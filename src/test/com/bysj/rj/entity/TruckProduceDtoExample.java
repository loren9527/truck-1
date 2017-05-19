package test.com.bysj.rj.entity;

import java.util.ArrayList;
import java.util.List;

public class TruckProduceDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TruckProduceDtoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTruckNumberIsNull() {
            addCriterion("truck_number is null");
            return (Criteria) this;
        }

        public Criteria andTruckNumberIsNotNull() {
            addCriterion("truck_number is not null");
            return (Criteria) this;
        }

        public Criteria andTruckNumberEqualTo(String value) {
            addCriterion("truck_number =", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberNotEqualTo(String value) {
            addCriterion("truck_number <>", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberGreaterThan(String value) {
            addCriterion("truck_number >", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberGreaterThanOrEqualTo(String value) {
            addCriterion("truck_number >=", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberLessThan(String value) {
            addCriterion("truck_number <", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberLessThanOrEqualTo(String value) {
            addCriterion("truck_number <=", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberLike(String value) {
            addCriterion("truck_number like", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberNotLike(String value) {
            addCriterion("truck_number not like", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberIn(List<String> values) {
            addCriterion("truck_number in", values, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberNotIn(List<String> values) {
            addCriterion("truck_number not in", values, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberBetween(String value1, String value2) {
            addCriterion("truck_number between", value1, value2, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberNotBetween(String value1, String value2) {
            addCriterion("truck_number not between", value1, value2, "truckNumber");
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

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceIsNull() {
            addCriterion("employee_place is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceIsNotNull() {
            addCriterion("employee_place is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceEqualTo(String value) {
            addCriterion("employee_place =", value, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceNotEqualTo(String value) {
            addCriterion("employee_place <>", value, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceGreaterThan(String value) {
            addCriterion("employee_place >", value, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("employee_place >=", value, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceLessThan(String value) {
            addCriterion("employee_place <", value, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceLessThanOrEqualTo(String value) {
            addCriterion("employee_place <=", value, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceLike(String value) {
            addCriterion("employee_place like", value, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceNotLike(String value) {
            addCriterion("employee_place not like", value, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceIn(List<String> values) {
            addCriterion("employee_place in", values, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceNotIn(List<String> values) {
            addCriterion("employee_place not in", values, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceBetween(String value1, String value2) {
            addCriterion("employee_place between", value1, value2, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeePlaceNotBetween(String value1, String value2) {
            addCriterion("employee_place not between", value1, value2, "employeePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeIsNull() {
            addCriterion("employee_grade is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeIsNotNull() {
            addCriterion("employee_grade is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeEqualTo(String value) {
            addCriterion("employee_grade =", value, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeNotEqualTo(String value) {
            addCriterion("employee_grade <>", value, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeGreaterThan(String value) {
            addCriterion("employee_grade >", value, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeGreaterThanOrEqualTo(String value) {
            addCriterion("employee_grade >=", value, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeLessThan(String value) {
            addCriterion("employee_grade <", value, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeLessThanOrEqualTo(String value) {
            addCriterion("employee_grade <=", value, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeLike(String value) {
            addCriterion("employee_grade like", value, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeNotLike(String value) {
            addCriterion("employee_grade not like", value, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeIn(List<String> values) {
            addCriterion("employee_grade in", values, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeNotIn(List<String> values) {
            addCriterion("employee_grade not in", values, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeBetween(String value1, String value2) {
            addCriterion("employee_grade between", value1, value2, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andEmployeeGradeNotBetween(String value1, String value2) {
            addCriterion("employee_grade not between", value1, value2, "employeeGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationIsNull() {
            addCriterion("current_operation is null");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationIsNotNull() {
            addCriterion("current_operation is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationEqualTo(String value) {
            addCriterion("current_operation =", value, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationNotEqualTo(String value) {
            addCriterion("current_operation <>", value, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationGreaterThan(String value) {
            addCriterion("current_operation >", value, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationGreaterThanOrEqualTo(String value) {
            addCriterion("current_operation >=", value, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationLessThan(String value) {
            addCriterion("current_operation <", value, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationLessThanOrEqualTo(String value) {
            addCriterion("current_operation <=", value, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationLike(String value) {
            addCriterion("current_operation like", value, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationNotLike(String value) {
            addCriterion("current_operation not like", value, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationIn(List<String> values) {
            addCriterion("current_operation in", values, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationNotIn(List<String> values) {
            addCriterion("current_operation not in", values, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationBetween(String value1, String value2) {
            addCriterion("current_operation between", value1, value2, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andCurrentOperationNotBetween(String value1, String value2) {
            addCriterion("current_operation not between", value1, value2, "currentOperation");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIsNull() {
            addCriterion("truckType is null");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIsNotNull() {
            addCriterion("truckType is not null");
            return (Criteria) this;
        }

        public Criteria andTrucktypeEqualTo(String value) {
            addCriterion("truckType =", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotEqualTo(String value) {
            addCriterion("truckType <>", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeGreaterThan(String value) {
            addCriterion("truckType >", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeGreaterThanOrEqualTo(String value) {
            addCriterion("truckType >=", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeLessThan(String value) {
            addCriterion("truckType <", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeLessThanOrEqualTo(String value) {
            addCriterion("truckType <=", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeLike(String value) {
            addCriterion("truckType like", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotLike(String value) {
            addCriterion("truckType not like", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIn(List<String> values) {
            addCriterion("truckType in", values, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotIn(List<String> values) {
            addCriterion("truckType not in", values, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeBetween(String value1, String value2) {
            addCriterion("truckType between", value1, value2, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotBetween(String value1, String value2) {
            addCriterion("truckType not between", value1, value2, "trucktype");
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
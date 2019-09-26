package com.cicms.pojo;

import java.util.ArrayList;
import java.util.List;

public class TakeMedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TakeMedicineExample() {
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

        public Criteria andTakenoIsNull() {
            addCriterion("takeNo is null");
            return (Criteria) this;
        }

        public Criteria andTakenoIsNotNull() {
            addCriterion("takeNo is not null");
            return (Criteria) this;
        }

        public Criteria andTakenoEqualTo(String value) {
            addCriterion("takeNo =", value, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoNotEqualTo(String value) {
            addCriterion("takeNo <>", value, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoGreaterThan(String value) {
            addCriterion("takeNo >", value, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoGreaterThanOrEqualTo(String value) {
            addCriterion("takeNo >=", value, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoLessThan(String value) {
            addCriterion("takeNo <", value, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoLessThanOrEqualTo(String value) {
            addCriterion("takeNo <=", value, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoLike(String value) {
            addCriterion("takeNo like", value, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoNotLike(String value) {
            addCriterion("takeNo not like", value, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoIn(List<String> values) {
            addCriterion("takeNo in", values, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoNotIn(List<String> values) {
            addCriterion("takeNo not in", values, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoBetween(String value1, String value2) {
            addCriterion("takeNo between", value1, value2, "takeno");
            return (Criteria) this;
        }

        public Criteria andTakenoNotBetween(String value1, String value2) {
            addCriterion("takeNo not between", value1, value2, "takeno");
            return (Criteria) this;
        }

        public Criteria andPaynoIsNull() {
            addCriterion("payNo is null");
            return (Criteria) this;
        }

        public Criteria andPaynoIsNotNull() {
            addCriterion("payNo is not null");
            return (Criteria) this;
        }

        public Criteria andPaynoEqualTo(String value) {
            addCriterion("payNo =", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoNotEqualTo(String value) {
            addCriterion("payNo <>", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoGreaterThan(String value) {
            addCriterion("payNo >", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoGreaterThanOrEqualTo(String value) {
            addCriterion("payNo >=", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoLessThan(String value) {
            addCriterion("payNo <", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoLessThanOrEqualTo(String value) {
            addCriterion("payNo <=", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoLike(String value) {
            addCriterion("payNo like", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoNotLike(String value) {
            addCriterion("payNo not like", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoIn(List<String> values) {
            addCriterion("payNo in", values, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoNotIn(List<String> values) {
            addCriterion("payNo not in", values, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoBetween(String value1, String value2) {
            addCriterion("payNo between", value1, value2, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoNotBetween(String value1, String value2) {
            addCriterion("payNo not between", value1, value2, "payno");
            return (Criteria) this;
        }

        public Criteria andTaketypeIsNull() {
            addCriterion("takeType is null");
            return (Criteria) this;
        }

        public Criteria andTaketypeIsNotNull() {
            addCriterion("takeType is not null");
            return (Criteria) this;
        }

        public Criteria andTaketypeEqualTo(Integer value) {
            addCriterion("takeType =", value, "taketype");
            return (Criteria) this;
        }

        public Criteria andTaketypeNotEqualTo(Integer value) {
            addCriterion("takeType <>", value, "taketype");
            return (Criteria) this;
        }

        public Criteria andTaketypeGreaterThan(Integer value) {
            addCriterion("takeType >", value, "taketype");
            return (Criteria) this;
        }

        public Criteria andTaketypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("takeType >=", value, "taketype");
            return (Criteria) this;
        }

        public Criteria andTaketypeLessThan(Integer value) {
            addCriterion("takeType <", value, "taketype");
            return (Criteria) this;
        }

        public Criteria andTaketypeLessThanOrEqualTo(Integer value) {
            addCriterion("takeType <=", value, "taketype");
            return (Criteria) this;
        }

        public Criteria andTaketypeIn(List<Integer> values) {
            addCriterion("takeType in", values, "taketype");
            return (Criteria) this;
        }

        public Criteria andTaketypeNotIn(List<Integer> values) {
            addCriterion("takeType not in", values, "taketype");
            return (Criteria) this;
        }

        public Criteria andTaketypeBetween(Integer value1, Integer value2) {
            addCriterion("takeType between", value1, value2, "taketype");
            return (Criteria) this;
        }

        public Criteria andTaketypeNotBetween(Integer value1, Integer value2) {
            addCriterion("takeType not between", value1, value2, "taketype");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoIsNull() {
            addCriterion("prescriptionNo is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoIsNotNull() {
            addCriterion("prescriptionNo is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoEqualTo(String value) {
            addCriterion("prescriptionNo =", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoNotEqualTo(String value) {
            addCriterion("prescriptionNo <>", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoGreaterThan(String value) {
            addCriterion("prescriptionNo >", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoGreaterThanOrEqualTo(String value) {
            addCriterion("prescriptionNo >=", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoLessThan(String value) {
            addCriterion("prescriptionNo <", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoLessThanOrEqualTo(String value) {
            addCriterion("prescriptionNo <=", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoLike(String value) {
            addCriterion("prescriptionNo like", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoNotLike(String value) {
            addCriterion("prescriptionNo not like", value, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoIn(List<String> values) {
            addCriterion("prescriptionNo in", values, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoNotIn(List<String> values) {
            addCriterion("prescriptionNo not in", values, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoBetween(String value1, String value2) {
            addCriterion("prescriptionNo between", value1, value2, "prescriptionno");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnoNotBetween(String value1, String value2) {
            addCriterion("prescriptionNo not between", value1, value2, "prescriptionno");
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
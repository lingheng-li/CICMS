package com.cicms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentExample() {
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

        public Criteria andPatientnoIsNull() {
            addCriterion("patientNo is null");
            return (Criteria) this;
        }

        public Criteria andPatientnoIsNotNull() {
            addCriterion("patientNo is not null");
            return (Criteria) this;
        }

        public Criteria andPatientnoEqualTo(String value) {
            addCriterion("patientNo =", value, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoNotEqualTo(String value) {
            addCriterion("patientNo <>", value, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoGreaterThan(String value) {
            addCriterion("patientNo >", value, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoGreaterThanOrEqualTo(String value) {
            addCriterion("patientNo >=", value, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoLessThan(String value) {
            addCriterion("patientNo <", value, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoLessThanOrEqualTo(String value) {
            addCriterion("patientNo <=", value, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoLike(String value) {
            addCriterion("patientNo like", value, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoNotLike(String value) {
            addCriterion("patientNo not like", value, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoIn(List<String> values) {
            addCriterion("patientNo in", values, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoNotIn(List<String> values) {
            addCriterion("patientNo not in", values, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoBetween(String value1, String value2) {
            addCriterion("patientNo between", value1, value2, "patientno");
            return (Criteria) this;
        }

        public Criteria andPatientnoNotBetween(String value1, String value2) {
            addCriterion("patientNo not between", value1, value2, "patientno");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("payStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("payStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(Integer value) {
            addCriterion("payStatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(Integer value) {
            addCriterion("payStatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(Integer value) {
            addCriterion("payStatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payStatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(Integer value) {
            addCriterion("payStatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(Integer value) {
            addCriterion("payStatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<Integer> values) {
            addCriterion("payStatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<Integer> values) {
            addCriterion("payStatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(Integer value1, Integer value2) {
            addCriterion("payStatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payStatus not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPayremarksIsNull() {
            addCriterion("payRemarks is null");
            return (Criteria) this;
        }

        public Criteria andPayremarksIsNotNull() {
            addCriterion("payRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andPayremarksEqualTo(String value) {
            addCriterion("payRemarks =", value, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksNotEqualTo(String value) {
            addCriterion("payRemarks <>", value, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksGreaterThan(String value) {
            addCriterion("payRemarks >", value, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksGreaterThanOrEqualTo(String value) {
            addCriterion("payRemarks >=", value, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksLessThan(String value) {
            addCriterion("payRemarks <", value, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksLessThanOrEqualTo(String value) {
            addCriterion("payRemarks <=", value, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksLike(String value) {
            addCriterion("payRemarks like", value, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksNotLike(String value) {
            addCriterion("payRemarks not like", value, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksIn(List<String> values) {
            addCriterion("payRemarks in", values, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksNotIn(List<String> values) {
            addCriterion("payRemarks not in", values, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksBetween(String value1, String value2) {
            addCriterion("payRemarks between", value1, value2, "payremarks");
            return (Criteria) this;
        }

        public Criteria andPayremarksNotBetween(String value1, String value2) {
            addCriterion("payRemarks not between", value1, value2, "payremarks");
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
package com.cicms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andPatientnameIsNull() {
            addCriterion("patientName is null");
            return (Criteria) this;
        }

        public Criteria andPatientnameIsNotNull() {
            addCriterion("patientName is not null");
            return (Criteria) this;
        }

        public Criteria andPatientnameEqualTo(String value) {
            addCriterion("patientName =", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotEqualTo(String value) {
            addCriterion("patientName <>", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameGreaterThan(String value) {
            addCriterion("patientName >", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameGreaterThanOrEqualTo(String value) {
            addCriterion("patientName >=", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLessThan(String value) {
            addCriterion("patientName <", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLessThanOrEqualTo(String value) {
            addCriterion("patientName <=", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLike(String value) {
            addCriterion("patientName like", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotLike(String value) {
            addCriterion("patientName not like", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameIn(List<String> values) {
            addCriterion("patientName in", values, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotIn(List<String> values) {
            addCriterion("patientName not in", values, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameBetween(String value1, String value2) {
            addCriterion("patientName between", value1, value2, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotBetween(String value1, String value2) {
            addCriterion("patientName not between", value1, value2, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatinentsexIsNull() {
            addCriterion("patinentSex is null");
            return (Criteria) this;
        }

        public Criteria andPatinentsexIsNotNull() {
            addCriterion("patinentSex is not null");
            return (Criteria) this;
        }

        public Criteria andPatinentsexEqualTo(String value) {
            addCriterion("patinentSex =", value, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexNotEqualTo(String value) {
            addCriterion("patinentSex <>", value, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexGreaterThan(String value) {
            addCriterion("patinentSex >", value, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexGreaterThanOrEqualTo(String value) {
            addCriterion("patinentSex >=", value, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexLessThan(String value) {
            addCriterion("patinentSex <", value, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexLessThanOrEqualTo(String value) {
            addCriterion("patinentSex <=", value, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexLike(String value) {
            addCriterion("patinentSex like", value, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexNotLike(String value) {
            addCriterion("patinentSex not like", value, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexIn(List<String> values) {
            addCriterion("patinentSex in", values, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexNotIn(List<String> values) {
            addCriterion("patinentSex not in", values, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexBetween(String value1, String value2) {
            addCriterion("patinentSex between", value1, value2, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatinentsexNotBetween(String value1, String value2) {
            addCriterion("patinentSex not between", value1, value2, "patinentsex");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayIsNull() {
            addCriterion("patientBirthday is null");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayIsNotNull() {
            addCriterion("patientBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayEqualTo(String value) {
            addCriterion("patientBirthday =", value, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayNotEqualTo(String value) {
            addCriterion("patientBirthday <>", value, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayGreaterThan(String value) {
            addCriterion("patientBirthday >", value, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("patientBirthday >=", value, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayLessThan(String value) {
            addCriterion("patientBirthday <", value, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayLessThanOrEqualTo(String value) {
            addCriterion("patientBirthday <=", value, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayLike(String value) {
            addCriterion("patientBirthday like", value, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayNotLike(String value) {
            addCriterion("patientBirthday not like", value, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayIn(List<String> values) {
            addCriterion("patientBirthday in", values, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayNotIn(List<String> values) {
            addCriterion("patientBirthday not in", values, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayBetween(String value1, String value2) {
            addCriterion("patientBirthday between", value1, value2, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientbirthdayNotBetween(String value1, String value2) {
            addCriterion("patientBirthday not between", value1, value2, "patientbirthday");
            return (Criteria) this;
        }

        public Criteria andPatientphoneIsNull() {
            addCriterion("patientPhone is null");
            return (Criteria) this;
        }

        public Criteria andPatientphoneIsNotNull() {
            addCriterion("patientPhone is not null");
            return (Criteria) this;
        }

        public Criteria andPatientphoneEqualTo(Integer value) {
            addCriterion("patientPhone =", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneNotEqualTo(Integer value) {
            addCriterion("patientPhone <>", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneGreaterThan(Integer value) {
            addCriterion("patientPhone >", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("patientPhone >=", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneLessThan(Integer value) {
            addCriterion("patientPhone <", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneLessThanOrEqualTo(Integer value) {
            addCriterion("patientPhone <=", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneIn(List<Integer> values) {
            addCriterion("patientPhone in", values, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneNotIn(List<Integer> values) {
            addCriterion("patientPhone not in", values, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneBetween(Integer value1, Integer value2) {
            addCriterion("patientPhone between", value1, value2, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("patientPhone not between", value1, value2, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientaddressIsNull() {
            addCriterion("patientAddress is null");
            return (Criteria) this;
        }

        public Criteria andPatientaddressIsNotNull() {
            addCriterion("patientAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPatientaddressEqualTo(String value) {
            addCriterion("patientAddress =", value, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressNotEqualTo(String value) {
            addCriterion("patientAddress <>", value, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressGreaterThan(String value) {
            addCriterion("patientAddress >", value, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressGreaterThanOrEqualTo(String value) {
            addCriterion("patientAddress >=", value, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressLessThan(String value) {
            addCriterion("patientAddress <", value, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressLessThanOrEqualTo(String value) {
            addCriterion("patientAddress <=", value, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressLike(String value) {
            addCriterion("patientAddress like", value, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressNotLike(String value) {
            addCriterion("patientAddress not like", value, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressIn(List<String> values) {
            addCriterion("patientAddress in", values, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressNotIn(List<String> values) {
            addCriterion("patientAddress not in", values, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressBetween(String value1, String value2) {
            addCriterion("patientAddress between", value1, value2, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientaddressNotBetween(String value1, String value2) {
            addCriterion("patientAddress not between", value1, value2, "patientaddress");
            return (Criteria) this;
        }

        public Criteria andPatientremarksIsNull() {
            addCriterion("patientRemarks is null");
            return (Criteria) this;
        }

        public Criteria andPatientremarksIsNotNull() {
            addCriterion("patientRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andPatientremarksEqualTo(String value) {
            addCriterion("patientRemarks =", value, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksNotEqualTo(String value) {
            addCriterion("patientRemarks <>", value, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksGreaterThan(String value) {
            addCriterion("patientRemarks >", value, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksGreaterThanOrEqualTo(String value) {
            addCriterion("patientRemarks >=", value, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksLessThan(String value) {
            addCriterion("patientRemarks <", value, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksLessThanOrEqualTo(String value) {
            addCriterion("patientRemarks <=", value, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksLike(String value) {
            addCriterion("patientRemarks like", value, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksNotLike(String value) {
            addCriterion("patientRemarks not like", value, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksIn(List<String> values) {
            addCriterion("patientRemarks in", values, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksNotIn(List<String> values) {
            addCriterion("patientRemarks not in", values, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksBetween(String value1, String value2) {
            addCriterion("patientRemarks between", value1, value2, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatientremarksNotBetween(String value1, String value2) {
            addCriterion("patientRemarks not between", value1, value2, "patientremarks");
            return (Criteria) this;
        }

        public Criteria andPatienttimeIsNull() {
            addCriterion("patientTime is null");
            return (Criteria) this;
        }

        public Criteria andPatienttimeIsNotNull() {
            addCriterion("patientTime is not null");
            return (Criteria) this;
        }

        public Criteria andPatienttimeEqualTo(Date value) {
            addCriterion("patientTime =", value, "patienttime");
            return (Criteria) this;
        }

        public Criteria andPatienttimeNotEqualTo(Date value) {
            addCriterion("patientTime <>", value, "patienttime");
            return (Criteria) this;
        }

        public Criteria andPatienttimeGreaterThan(Date value) {
            addCriterion("patientTime >", value, "patienttime");
            return (Criteria) this;
        }

        public Criteria andPatienttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("patientTime >=", value, "patienttime");
            return (Criteria) this;
        }

        public Criteria andPatienttimeLessThan(Date value) {
            addCriterion("patientTime <", value, "patienttime");
            return (Criteria) this;
        }

        public Criteria andPatienttimeLessThanOrEqualTo(Date value) {
            addCriterion("patientTime <=", value, "patienttime");
            return (Criteria) this;
        }

        public Criteria andPatienttimeIn(List<Date> values) {
            addCriterion("patientTime in", values, "patienttime");
            return (Criteria) this;
        }

        public Criteria andPatienttimeNotIn(List<Date> values) {
            addCriterion("patientTime not in", values, "patienttime");
            return (Criteria) this;
        }

        public Criteria andPatienttimeBetween(Date value1, Date value2) {
            addCriterion("patientTime between", value1, value2, "patienttime");
            return (Criteria) this;
        }

        public Criteria andPatienttimeNotBetween(Date value1, Date value2) {
            addCriterion("patientTime not between", value1, value2, "patienttime");
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
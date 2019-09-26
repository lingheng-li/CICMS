package com.cicms.pojo;

import java.util.ArrayList;
import java.util.List;

public class FamilyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FamilyExample() {
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

        public Criteria andHomenoIsNull() {
            addCriterion("homeNo is null");
            return (Criteria) this;
        }

        public Criteria andHomenoIsNotNull() {
            addCriterion("homeNo is not null");
            return (Criteria) this;
        }

        public Criteria andHomenoEqualTo(String value) {
            addCriterion("homeNo =", value, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoNotEqualTo(String value) {
            addCriterion("homeNo <>", value, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoGreaterThan(String value) {
            addCriterion("homeNo >", value, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoGreaterThanOrEqualTo(String value) {
            addCriterion("homeNo >=", value, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoLessThan(String value) {
            addCriterion("homeNo <", value, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoLessThanOrEqualTo(String value) {
            addCriterion("homeNo <=", value, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoLike(String value) {
            addCriterion("homeNo like", value, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoNotLike(String value) {
            addCriterion("homeNo not like", value, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoIn(List<String> values) {
            addCriterion("homeNo in", values, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoNotIn(List<String> values) {
            addCriterion("homeNo not in", values, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoBetween(String value1, String value2) {
            addCriterion("homeNo between", value1, value2, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenoNotBetween(String value1, String value2) {
            addCriterion("homeNo not between", value1, value2, "homeno");
            return (Criteria) this;
        }

        public Criteria andHomenameIsNull() {
            addCriterion("homeName is null");
            return (Criteria) this;
        }

        public Criteria andHomenameIsNotNull() {
            addCriterion("homeName is not null");
            return (Criteria) this;
        }

        public Criteria andHomenameEqualTo(String value) {
            addCriterion("homeName =", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameNotEqualTo(String value) {
            addCriterion("homeName <>", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameGreaterThan(String value) {
            addCriterion("homeName >", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameGreaterThanOrEqualTo(String value) {
            addCriterion("homeName >=", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameLessThan(String value) {
            addCriterion("homeName <", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameLessThanOrEqualTo(String value) {
            addCriterion("homeName <=", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameLike(String value) {
            addCriterion("homeName like", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameNotLike(String value) {
            addCriterion("homeName not like", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameIn(List<String> values) {
            addCriterion("homeName in", values, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameNotIn(List<String> values) {
            addCriterion("homeName not in", values, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameBetween(String value1, String value2) {
            addCriterion("homeName between", value1, value2, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameNotBetween(String value1, String value2) {
            addCriterion("homeName not between", value1, value2, "homename");
            return (Criteria) this;
        }

        public Criteria andHomephoneIsNull() {
            addCriterion("homePhone is null");
            return (Criteria) this;
        }

        public Criteria andHomephoneIsNotNull() {
            addCriterion("homePhone is not null");
            return (Criteria) this;
        }

        public Criteria andHomephoneEqualTo(Integer value) {
            addCriterion("homePhone =", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotEqualTo(Integer value) {
            addCriterion("homePhone <>", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneGreaterThan(Integer value) {
            addCriterion("homePhone >", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("homePhone >=", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneLessThan(Integer value) {
            addCriterion("homePhone <", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneLessThanOrEqualTo(Integer value) {
            addCriterion("homePhone <=", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneIn(List<Integer> values) {
            addCriterion("homePhone in", values, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotIn(List<Integer> values) {
            addCriterion("homePhone not in", values, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneBetween(Integer value1, Integer value2) {
            addCriterion("homePhone between", value1, value2, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotBetween(Integer value1, Integer value2) {
            addCriterion("homePhone not between", value1, value2, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("homeAddress is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("homeAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("homeAddress =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("homeAddress <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("homeAddress >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("homeAddress >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("homeAddress <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("homeAddress <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("homeAddress like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("homeAddress not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("homeAddress in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("homeAddress not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("homeAddress between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("homeAddress not between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andDoornumIsNull() {
            addCriterion("doorNum is null");
            return (Criteria) this;
        }

        public Criteria andDoornumIsNotNull() {
            addCriterion("doorNum is not null");
            return (Criteria) this;
        }

        public Criteria andDoornumEqualTo(Integer value) {
            addCriterion("doorNum =", value, "doornum");
            return (Criteria) this;
        }

        public Criteria andDoornumNotEqualTo(Integer value) {
            addCriterion("doorNum <>", value, "doornum");
            return (Criteria) this;
        }

        public Criteria andDoornumGreaterThan(Integer value) {
            addCriterion("doorNum >", value, "doornum");
            return (Criteria) this;
        }

        public Criteria andDoornumGreaterThanOrEqualTo(Integer value) {
            addCriterion("doorNum >=", value, "doornum");
            return (Criteria) this;
        }

        public Criteria andDoornumLessThan(Integer value) {
            addCriterion("doorNum <", value, "doornum");
            return (Criteria) this;
        }

        public Criteria andDoornumLessThanOrEqualTo(Integer value) {
            addCriterion("doorNum <=", value, "doornum");
            return (Criteria) this;
        }

        public Criteria andDoornumIn(List<Integer> values) {
            addCriterion("doorNum in", values, "doornum");
            return (Criteria) this;
        }

        public Criteria andDoornumNotIn(List<Integer> values) {
            addCriterion("doorNum not in", values, "doornum");
            return (Criteria) this;
        }

        public Criteria andDoornumBetween(Integer value1, Integer value2) {
            addCriterion("doorNum between", value1, value2, "doornum");
            return (Criteria) this;
        }

        public Criteria andDoornumNotBetween(Integer value1, Integer value2) {
            addCriterion("doorNum not between", value1, value2, "doornum");
            return (Criteria) this;
        }

        public Criteria andInformationIsNull() {
            addCriterion("information is null");
            return (Criteria) this;
        }

        public Criteria andInformationIsNotNull() {
            addCriterion("information is not null");
            return (Criteria) this;
        }

        public Criteria andInformationEqualTo(String value) {
            addCriterion("information =", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotEqualTo(String value) {
            addCriterion("information <>", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationGreaterThan(String value) {
            addCriterion("information >", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationGreaterThanOrEqualTo(String value) {
            addCriterion("information >=", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLessThan(String value) {
            addCriterion("information <", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLessThanOrEqualTo(String value) {
            addCriterion("information <=", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLike(String value) {
            addCriterion("information like", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotLike(String value) {
            addCriterion("information not like", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationIn(List<String> values) {
            addCriterion("information in", values, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotIn(List<String> values) {
            addCriterion("information not in", values, "information");
            return (Criteria) this;
        }

        public Criteria andInformationBetween(String value1, String value2) {
            addCriterion("information between", value1, value2, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotBetween(String value1, String value2) {
            addCriterion("information not between", value1, value2, "information");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("attention not between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andHomeremarksIsNull() {
            addCriterion("homeRemarks is null");
            return (Criteria) this;
        }

        public Criteria andHomeremarksIsNotNull() {
            addCriterion("homeRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andHomeremarksEqualTo(String value) {
            addCriterion("homeRemarks =", value, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksNotEqualTo(String value) {
            addCriterion("homeRemarks <>", value, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksGreaterThan(String value) {
            addCriterion("homeRemarks >", value, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksGreaterThanOrEqualTo(String value) {
            addCriterion("homeRemarks >=", value, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksLessThan(String value) {
            addCriterion("homeRemarks <", value, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksLessThanOrEqualTo(String value) {
            addCriterion("homeRemarks <=", value, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksLike(String value) {
            addCriterion("homeRemarks like", value, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksNotLike(String value) {
            addCriterion("homeRemarks not like", value, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksIn(List<String> values) {
            addCriterion("homeRemarks in", values, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksNotIn(List<String> values) {
            addCriterion("homeRemarks not in", values, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksBetween(String value1, String value2) {
            addCriterion("homeRemarks between", value1, value2, "homeremarks");
            return (Criteria) this;
        }

        public Criteria andHomeremarksNotBetween(String value1, String value2) {
            addCriterion("homeRemarks not between", value1, value2, "homeremarks");
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
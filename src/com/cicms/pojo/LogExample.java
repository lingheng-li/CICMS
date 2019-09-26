package com.cicms.pojo;

import java.util.ArrayList;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logid is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logid is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(Integer value) {
            addCriterion("logid =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(Integer value) {
            addCriterion("logid <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(Integer value) {
            addCriterion("logid >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logid >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(Integer value) {
            addCriterion("logid <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(Integer value) {
            addCriterion("logid <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<Integer> values) {
            addCriterion("logid in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<Integer> values) {
            addCriterion("logid not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(Integer value1, Integer value2) {
            addCriterion("logid between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("logid not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andMedicinenoIsNull() {
            addCriterion("medicineNo is null");
            return (Criteria) this;
        }

        public Criteria andMedicinenoIsNotNull() {
            addCriterion("medicineNo is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinenoEqualTo(String value) {
            addCriterion("medicineNo =", value, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoNotEqualTo(String value) {
            addCriterion("medicineNo <>", value, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoGreaterThan(String value) {
            addCriterion("medicineNo >", value, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoGreaterThanOrEqualTo(String value) {
            addCriterion("medicineNo >=", value, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoLessThan(String value) {
            addCriterion("medicineNo <", value, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoLessThanOrEqualTo(String value) {
            addCriterion("medicineNo <=", value, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoLike(String value) {
            addCriterion("medicineNo like", value, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoNotLike(String value) {
            addCriterion("medicineNo not like", value, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoIn(List<String> values) {
            addCriterion("medicineNo in", values, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoNotIn(List<String> values) {
            addCriterion("medicineNo not in", values, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoBetween(String value1, String value2) {
            addCriterion("medicineNo between", value1, value2, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenoNotBetween(String value1, String value2) {
            addCriterion("medicineNo not between", value1, value2, "medicineno");
            return (Criteria) this;
        }

        public Criteria andMedicinenameIsNull() {
            addCriterion("medicineName is null");
            return (Criteria) this;
        }

        public Criteria andMedicinenameIsNotNull() {
            addCriterion("medicineName is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinenameEqualTo(String value) {
            addCriterion("medicineName =", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameNotEqualTo(String value) {
            addCriterion("medicineName <>", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameGreaterThan(String value) {
            addCriterion("medicineName >", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameGreaterThanOrEqualTo(String value) {
            addCriterion("medicineName >=", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameLessThan(String value) {
            addCriterion("medicineName <", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameLessThanOrEqualTo(String value) {
            addCriterion("medicineName <=", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameLike(String value) {
            addCriterion("medicineName like", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameNotLike(String value) {
            addCriterion("medicineName not like", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameIn(List<String> values) {
            addCriterion("medicineName in", values, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameNotIn(List<String> values) {
            addCriterion("medicineName not in", values, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameBetween(String value1, String value2) {
            addCriterion("medicineName between", value1, value2, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameNotBetween(String value1, String value2) {
            addCriterion("medicineName not between", value1, value2, "medicinename");
            return (Criteria) this;
        }

        public Criteria andLogremarkIsNull() {
            addCriterion("logremark is null");
            return (Criteria) this;
        }

        public Criteria andLogremarkIsNotNull() {
            addCriterion("logremark is not null");
            return (Criteria) this;
        }

        public Criteria andLogremarkEqualTo(String value) {
            addCriterion("logremark =", value, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkNotEqualTo(String value) {
            addCriterion("logremark <>", value, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkGreaterThan(String value) {
            addCriterion("logremark >", value, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkGreaterThanOrEqualTo(String value) {
            addCriterion("logremark >=", value, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkLessThan(String value) {
            addCriterion("logremark <", value, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkLessThanOrEqualTo(String value) {
            addCriterion("logremark <=", value, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkLike(String value) {
            addCriterion("logremark like", value, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkNotLike(String value) {
            addCriterion("logremark not like", value, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkIn(List<String> values) {
            addCriterion("logremark in", values, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkNotIn(List<String> values) {
            addCriterion("logremark not in", values, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkBetween(String value1, String value2) {
            addCriterion("logremark between", value1, value2, "logremark");
            return (Criteria) this;
        }

        public Criteria andLogremarkNotBetween(String value1, String value2) {
            addCriterion("logremark not between", value1, value2, "logremark");
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
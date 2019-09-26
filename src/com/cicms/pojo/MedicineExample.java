package com.cicms.pojo;

import java.util.ArrayList;
import java.util.List;

public class MedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineExample() {
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

        public Criteria andMedicinespecIsNull() {
            addCriterion("medicineSpec is null");
            return (Criteria) this;
        }

        public Criteria andMedicinespecIsNotNull() {
            addCriterion("medicineSpec is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinespecEqualTo(String value) {
            addCriterion("medicineSpec =", value, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecNotEqualTo(String value) {
            addCriterion("medicineSpec <>", value, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecGreaterThan(String value) {
            addCriterion("medicineSpec >", value, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecGreaterThanOrEqualTo(String value) {
            addCriterion("medicineSpec >=", value, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecLessThan(String value) {
            addCriterion("medicineSpec <", value, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecLessThanOrEqualTo(String value) {
            addCriterion("medicineSpec <=", value, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecLike(String value) {
            addCriterion("medicineSpec like", value, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecNotLike(String value) {
            addCriterion("medicineSpec not like", value, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecIn(List<String> values) {
            addCriterion("medicineSpec in", values, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecNotIn(List<String> values) {
            addCriterion("medicineSpec not in", values, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecBetween(String value1, String value2) {
            addCriterion("medicineSpec between", value1, value2, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicinespecNotBetween(String value1, String value2) {
            addCriterion("medicineSpec not between", value1, value2, "medicinespec");
            return (Criteria) this;
        }

        public Criteria andMedicineunitIsNull() {
            addCriterion("medicineUnit is null");
            return (Criteria) this;
        }

        public Criteria andMedicineunitIsNotNull() {
            addCriterion("medicineUnit is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineunitEqualTo(String value) {
            addCriterion("medicineUnit =", value, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitNotEqualTo(String value) {
            addCriterion("medicineUnit <>", value, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitGreaterThan(String value) {
            addCriterion("medicineUnit >", value, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitGreaterThanOrEqualTo(String value) {
            addCriterion("medicineUnit >=", value, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitLessThan(String value) {
            addCriterion("medicineUnit <", value, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitLessThanOrEqualTo(String value) {
            addCriterion("medicineUnit <=", value, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitLike(String value) {
            addCriterion("medicineUnit like", value, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitNotLike(String value) {
            addCriterion("medicineUnit not like", value, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitIn(List<String> values) {
            addCriterion("medicineUnit in", values, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitNotIn(List<String> values) {
            addCriterion("medicineUnit not in", values, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitBetween(String value1, String value2) {
            addCriterion("medicineUnit between", value1, value2, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicineunitNotBetween(String value1, String value2) {
            addCriterion("medicineUnit not between", value1, value2, "medicineunit");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinIsNull() {
            addCriterion("medicineMadein is null");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinIsNotNull() {
            addCriterion("medicineMadein is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinEqualTo(String value) {
            addCriterion("medicineMadein =", value, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinNotEqualTo(String value) {
            addCriterion("medicineMadein <>", value, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinGreaterThan(String value) {
            addCriterion("medicineMadein >", value, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinGreaterThanOrEqualTo(String value) {
            addCriterion("medicineMadein >=", value, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinLessThan(String value) {
            addCriterion("medicineMadein <", value, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinLessThanOrEqualTo(String value) {
            addCriterion("medicineMadein <=", value, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinLike(String value) {
            addCriterion("medicineMadein like", value, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinNotLike(String value) {
            addCriterion("medicineMadein not like", value, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinIn(List<String> values) {
            addCriterion("medicineMadein in", values, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinNotIn(List<String> values) {
            addCriterion("medicineMadein not in", values, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinBetween(String value1, String value2) {
            addCriterion("medicineMadein between", value1, value2, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicinemadeinNotBetween(String value1, String value2) {
            addCriterion("medicineMadein not between", value1, value2, "medicinemadein");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceIsNull() {
            addCriterion("medicineInPrice is null");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceIsNotNull() {
            addCriterion("medicineInPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceEqualTo(Double value) {
            addCriterion("medicineInPrice =", value, "medicineinprice");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceNotEqualTo(Double value) {
            addCriterion("medicineInPrice <>", value, "medicineinprice");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceGreaterThan(Double value) {
            addCriterion("medicineInPrice >", value, "medicineinprice");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("medicineInPrice >=", value, "medicineinprice");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceLessThan(Double value) {
            addCriterion("medicineInPrice <", value, "medicineinprice");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceLessThanOrEqualTo(Double value) {
            addCriterion("medicineInPrice <=", value, "medicineinprice");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceIn(List<Double> values) {
            addCriterion("medicineInPrice in", values, "medicineinprice");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceNotIn(List<Double> values) {
            addCriterion("medicineInPrice not in", values, "medicineinprice");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceBetween(Double value1, Double value2) {
            addCriterion("medicineInPrice between", value1, value2, "medicineinprice");
            return (Criteria) this;
        }

        public Criteria andMedicineinpriceNotBetween(Double value1, Double value2) {
            addCriterion("medicineInPrice not between", value1, value2, "medicineinprice");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceIsNull() {
            addCriterion("medicinePrice is null");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceIsNotNull() {
            addCriterion("medicinePrice is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceEqualTo(Double value) {
            addCriterion("medicinePrice =", value, "medicineprice");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceNotEqualTo(Double value) {
            addCriterion("medicinePrice <>", value, "medicineprice");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceGreaterThan(Double value) {
            addCriterion("medicinePrice >", value, "medicineprice");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("medicinePrice >=", value, "medicineprice");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceLessThan(Double value) {
            addCriterion("medicinePrice <", value, "medicineprice");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceLessThanOrEqualTo(Double value) {
            addCriterion("medicinePrice <=", value, "medicineprice");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceIn(List<Double> values) {
            addCriterion("medicinePrice in", values, "medicineprice");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceNotIn(List<Double> values) {
            addCriterion("medicinePrice not in", values, "medicineprice");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceBetween(Double value1, Double value2) {
            addCriterion("medicinePrice between", value1, value2, "medicineprice");
            return (Criteria) this;
        }

        public Criteria andMedicinepriceNotBetween(Double value1, Double value2) {
            addCriterion("medicinePrice not between", value1, value2, "medicineprice");
            return (Criteria) this;
        }

        public Criteria andMedicinenumIsNull() {
            addCriterion("medicineNum is null");
            return (Criteria) this;
        }

        public Criteria andMedicinenumIsNotNull() {
            addCriterion("medicineNum is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinenumEqualTo(Integer value) {
            addCriterion("medicineNum =", value, "medicinenum");
            return (Criteria) this;
        }

        public Criteria andMedicinenumNotEqualTo(Integer value) {
            addCriterion("medicineNum <>", value, "medicinenum");
            return (Criteria) this;
        }

        public Criteria andMedicinenumGreaterThan(Integer value) {
            addCriterion("medicineNum >", value, "medicinenum");
            return (Criteria) this;
        }

        public Criteria andMedicinenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicineNum >=", value, "medicinenum");
            return (Criteria) this;
        }

        public Criteria andMedicinenumLessThan(Integer value) {
            addCriterion("medicineNum <", value, "medicinenum");
            return (Criteria) this;
        }

        public Criteria andMedicinenumLessThanOrEqualTo(Integer value) {
            addCriterion("medicineNum <=", value, "medicinenum");
            return (Criteria) this;
        }

        public Criteria andMedicinenumIn(List<Integer> values) {
            addCriterion("medicineNum in", values, "medicinenum");
            return (Criteria) this;
        }

        public Criteria andMedicinenumNotIn(List<Integer> values) {
            addCriterion("medicineNum not in", values, "medicinenum");
            return (Criteria) this;
        }

        public Criteria andMedicinenumBetween(Integer value1, Integer value2) {
            addCriterion("medicineNum between", value1, value2, "medicinenum");
            return (Criteria) this;
        }

        public Criteria andMedicinenumNotBetween(Integer value1, Integer value2) {
            addCriterion("medicineNum not between", value1, value2, "medicinenum");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeIsNull() {
            addCriterion("medicineType is null");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeIsNotNull() {
            addCriterion("medicineType is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeEqualTo(String value) {
            addCriterion("medicineType =", value, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeNotEqualTo(String value) {
            addCriterion("medicineType <>", value, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeGreaterThan(String value) {
            addCriterion("medicineType >", value, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeGreaterThanOrEqualTo(String value) {
            addCriterion("medicineType >=", value, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeLessThan(String value) {
            addCriterion("medicineType <", value, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeLessThanOrEqualTo(String value) {
            addCriterion("medicineType <=", value, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeLike(String value) {
            addCriterion("medicineType like", value, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeNotLike(String value) {
            addCriterion("medicineType not like", value, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeIn(List<String> values) {
            addCriterion("medicineType in", values, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeNotIn(List<String> values) {
            addCriterion("medicineType not in", values, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeBetween(String value1, String value2) {
            addCriterion("medicineType between", value1, value2, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicinetypeNotBetween(String value1, String value2) {
            addCriterion("medicineType not between", value1, value2, "medicinetype");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksIsNull() {
            addCriterion("medicineRemarks is null");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksIsNotNull() {
            addCriterion("medicineRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksEqualTo(String value) {
            addCriterion("medicineRemarks =", value, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksNotEqualTo(String value) {
            addCriterion("medicineRemarks <>", value, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksGreaterThan(String value) {
            addCriterion("medicineRemarks >", value, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksGreaterThanOrEqualTo(String value) {
            addCriterion("medicineRemarks >=", value, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksLessThan(String value) {
            addCriterion("medicineRemarks <", value, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksLessThanOrEqualTo(String value) {
            addCriterion("medicineRemarks <=", value, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksLike(String value) {
            addCriterion("medicineRemarks like", value, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksNotLike(String value) {
            addCriterion("medicineRemarks not like", value, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksIn(List<String> values) {
            addCriterion("medicineRemarks in", values, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksNotIn(List<String> values) {
            addCriterion("medicineRemarks not in", values, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksBetween(String value1, String value2) {
            addCriterion("medicineRemarks between", value1, value2, "medicineremarks");
            return (Criteria) this;
        }

        public Criteria andMedicineremarksNotBetween(String value1, String value2) {
            addCriterion("medicineRemarks not between", value1, value2, "medicineremarks");
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
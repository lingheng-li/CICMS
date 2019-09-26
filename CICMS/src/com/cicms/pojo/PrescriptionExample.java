package com.cicms.pojo;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrescriptionExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andTakenumIsNull() {
            addCriterion("takeNum is null");
            return (Criteria) this;
        }

        public Criteria andTakenumIsNotNull() {
            addCriterion("takeNum is not null");
            return (Criteria) this;
        }

        public Criteria andTakenumEqualTo(Integer value) {
            addCriterion("takeNum =", value, "takenum");
            return (Criteria) this;
        }

        public Criteria andTakenumNotEqualTo(Integer value) {
            addCriterion("takeNum <>", value, "takenum");
            return (Criteria) this;
        }

        public Criteria andTakenumGreaterThan(Integer value) {
            addCriterion("takeNum >", value, "takenum");
            return (Criteria) this;
        }

        public Criteria andTakenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("takeNum >=", value, "takenum");
            return (Criteria) this;
        }

        public Criteria andTakenumLessThan(Integer value) {
            addCriterion("takeNum <", value, "takenum");
            return (Criteria) this;
        }

        public Criteria andTakenumLessThanOrEqualTo(Integer value) {
            addCriterion("takeNum <=", value, "takenum");
            return (Criteria) this;
        }

        public Criteria andTakenumIn(List<Integer> values) {
            addCriterion("takeNum in", values, "takenum");
            return (Criteria) this;
        }

        public Criteria andTakenumNotIn(List<Integer> values) {
            addCriterion("takeNum not in", values, "takenum");
            return (Criteria) this;
        }

        public Criteria andTakenumBetween(Integer value1, Integer value2) {
            addCriterion("takeNum between", value1, value2, "takenum");
            return (Criteria) this;
        }

        public Criteria andTakenumNotBetween(Integer value1, Integer value2) {
            addCriterion("takeNum not between", value1, value2, "takenum");
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
package com.yamamoto.yuta.andres.infrastructure.repository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SampleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    public SampleExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFieldTextIsNull() {
            addCriterion("FIELD_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andFieldTextIsNotNull() {
            addCriterion("FIELD_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andFieldTextEqualTo(String value) {
            addCriterion("FIELD_TEXT =", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextNotEqualTo(String value) {
            addCriterion("FIELD_TEXT <>", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextGreaterThan(String value) {
            addCriterion("FIELD_TEXT >", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_TEXT >=", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextLessThan(String value) {
            addCriterion("FIELD_TEXT <", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextLessThanOrEqualTo(String value) {
            addCriterion("FIELD_TEXT <=", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextLike(String value) {
            addCriterion("FIELD_TEXT like", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextNotLike(String value) {
            addCriterion("FIELD_TEXT not like", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextIn(List<String> values) {
            addCriterion("FIELD_TEXT in", values, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextNotIn(List<String> values) {
            addCriterion("FIELD_TEXT not in", values, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextBetween(String value1, String value2) {
            addCriterion("FIELD_TEXT between", value1, value2, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextNotBetween(String value1, String value2) {
            addCriterion("FIELD_TEXT not between", value1, value2, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaIsNull() {
            addCriterion("FIELD_TEXTAREA is null");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaIsNotNull() {
            addCriterion("FIELD_TEXTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaEqualTo(String value) {
            addCriterion("FIELD_TEXTAREA =", value, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaNotEqualTo(String value) {
            addCriterion("FIELD_TEXTAREA <>", value, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaGreaterThan(String value) {
            addCriterion("FIELD_TEXTAREA >", value, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_TEXTAREA >=", value, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaLessThan(String value) {
            addCriterion("FIELD_TEXTAREA <", value, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaLessThanOrEqualTo(String value) {
            addCriterion("FIELD_TEXTAREA <=", value, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaLike(String value) {
            addCriterion("FIELD_TEXTAREA like", value, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaNotLike(String value) {
            addCriterion("FIELD_TEXTAREA not like", value, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaIn(List<String> values) {
            addCriterion("FIELD_TEXTAREA in", values, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaNotIn(List<String> values) {
            addCriterion("FIELD_TEXTAREA not in", values, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaBetween(String value1, String value2) {
            addCriterion("FIELD_TEXTAREA between", value1, value2, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldTextareaNotBetween(String value1, String value2) {
            addCriterion("FIELD_TEXTAREA not between", value1, value2, "fieldTextarea");
            return (Criteria) this;
        }

        public Criteria andFieldNumberIsNull() {
            addCriterion("FIELD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFieldNumberIsNotNull() {
            addCriterion("FIELD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNumberEqualTo(Integer value) {
            addCriterion("FIELD_NUMBER =", value, "fieldNumber");
            return (Criteria) this;
        }

        public Criteria andFieldNumberNotEqualTo(Integer value) {
            addCriterion("FIELD_NUMBER <>", value, "fieldNumber");
            return (Criteria) this;
        }

        public Criteria andFieldNumberGreaterThan(Integer value) {
            addCriterion("FIELD_NUMBER >", value, "fieldNumber");
            return (Criteria) this;
        }

        public Criteria andFieldNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIELD_NUMBER >=", value, "fieldNumber");
            return (Criteria) this;
        }

        public Criteria andFieldNumberLessThan(Integer value) {
            addCriterion("FIELD_NUMBER <", value, "fieldNumber");
            return (Criteria) this;
        }

        public Criteria andFieldNumberLessThanOrEqualTo(Integer value) {
            addCriterion("FIELD_NUMBER <=", value, "fieldNumber");
            return (Criteria) this;
        }

        public Criteria andFieldNumberIn(List<Integer> values) {
            addCriterion("FIELD_NUMBER in", values, "fieldNumber");
            return (Criteria) this;
        }

        public Criteria andFieldNumberNotIn(List<Integer> values) {
            addCriterion("FIELD_NUMBER not in", values, "fieldNumber");
            return (Criteria) this;
        }

        public Criteria andFieldNumberBetween(Integer value1, Integer value2) {
            addCriterion("FIELD_NUMBER between", value1, value2, "fieldNumber");
            return (Criteria) this;
        }

        public Criteria andFieldNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("FIELD_NUMBER not between", value1, value2, "fieldNumber");
            return (Criteria) this;
        }

        public Criteria andFieldDateIsNull() {
            addCriterion("FIELD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFieldDateIsNotNull() {
            addCriterion("FIELD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldDateEqualTo(Date value) {
            addCriterionForJDBCDate("FIELD_DATE =", value, "fieldDate");
            return (Criteria) this;
        }

        public Criteria andFieldDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FIELD_DATE <>", value, "fieldDate");
            return (Criteria) this;
        }

        public Criteria andFieldDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FIELD_DATE >", value, "fieldDate");
            return (Criteria) this;
        }

        public Criteria andFieldDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FIELD_DATE >=", value, "fieldDate");
            return (Criteria) this;
        }

        public Criteria andFieldDateLessThan(Date value) {
            addCriterionForJDBCDate("FIELD_DATE <", value, "fieldDate");
            return (Criteria) this;
        }

        public Criteria andFieldDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FIELD_DATE <=", value, "fieldDate");
            return (Criteria) this;
        }

        public Criteria andFieldDateIn(List<Date> values) {
            addCriterionForJDBCDate("FIELD_DATE in", values, "fieldDate");
            return (Criteria) this;
        }

        public Criteria andFieldDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FIELD_DATE not in", values, "fieldDate");
            return (Criteria) this;
        }

        public Criteria andFieldDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FIELD_DATE between", value1, value2, "fieldDate");
            return (Criteria) this;
        }

        public Criteria andFieldDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FIELD_DATE not between", value1, value2, "fieldDate");
            return (Criteria) this;
        }

        public Criteria andFieldSelectIsNull() {
            addCriterion("FIELD_SELECT is null");
            return (Criteria) this;
        }

        public Criteria andFieldSelectIsNotNull() {
            addCriterion("FIELD_SELECT is not null");
            return (Criteria) this;
        }

        public Criteria andFieldSelectEqualTo(Integer value) {
            addCriterion("FIELD_SELECT =", value, "fieldSelect");
            return (Criteria) this;
        }

        public Criteria andFieldSelectNotEqualTo(Integer value) {
            addCriterion("FIELD_SELECT <>", value, "fieldSelect");
            return (Criteria) this;
        }

        public Criteria andFieldSelectGreaterThan(Integer value) {
            addCriterion("FIELD_SELECT >", value, "fieldSelect");
            return (Criteria) this;
        }

        public Criteria andFieldSelectGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIELD_SELECT >=", value, "fieldSelect");
            return (Criteria) this;
        }

        public Criteria andFieldSelectLessThan(Integer value) {
            addCriterion("FIELD_SELECT <", value, "fieldSelect");
            return (Criteria) this;
        }

        public Criteria andFieldSelectLessThanOrEqualTo(Integer value) {
            addCriterion("FIELD_SELECT <=", value, "fieldSelect");
            return (Criteria) this;
        }

        public Criteria andFieldSelectIn(List<Integer> values) {
            addCriterion("FIELD_SELECT in", values, "fieldSelect");
            return (Criteria) this;
        }

        public Criteria andFieldSelectNotIn(List<Integer> values) {
            addCriterion("FIELD_SELECT not in", values, "fieldSelect");
            return (Criteria) this;
        }

        public Criteria andFieldSelectBetween(Integer value1, Integer value2) {
            addCriterion("FIELD_SELECT between", value1, value2, "fieldSelect");
            return (Criteria) this;
        }

        public Criteria andFieldSelectNotBetween(Integer value1, Integer value2) {
            addCriterion("FIELD_SELECT not between", value1, value2, "fieldSelect");
            return (Criteria) this;
        }

        public Criteria andFieldRadioIsNull() {
            addCriterion("FIELD_RADIO is null");
            return (Criteria) this;
        }

        public Criteria andFieldRadioIsNotNull() {
            addCriterion("FIELD_RADIO is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRadioEqualTo(Integer value) {
            addCriterion("FIELD_RADIO =", value, "fieldRadio");
            return (Criteria) this;
        }

        public Criteria andFieldRadioNotEqualTo(Integer value) {
            addCriterion("FIELD_RADIO <>", value, "fieldRadio");
            return (Criteria) this;
        }

        public Criteria andFieldRadioGreaterThan(Integer value) {
            addCriterion("FIELD_RADIO >", value, "fieldRadio");
            return (Criteria) this;
        }

        public Criteria andFieldRadioGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIELD_RADIO >=", value, "fieldRadio");
            return (Criteria) this;
        }

        public Criteria andFieldRadioLessThan(Integer value) {
            addCriterion("FIELD_RADIO <", value, "fieldRadio");
            return (Criteria) this;
        }

        public Criteria andFieldRadioLessThanOrEqualTo(Integer value) {
            addCriterion("FIELD_RADIO <=", value, "fieldRadio");
            return (Criteria) this;
        }

        public Criteria andFieldRadioIn(List<Integer> values) {
            addCriterion("FIELD_RADIO in", values, "fieldRadio");
            return (Criteria) this;
        }

        public Criteria andFieldRadioNotIn(List<Integer> values) {
            addCriterion("FIELD_RADIO not in", values, "fieldRadio");
            return (Criteria) this;
        }

        public Criteria andFieldRadioBetween(Integer value1, Integer value2) {
            addCriterion("FIELD_RADIO between", value1, value2, "fieldRadio");
            return (Criteria) this;
        }

        public Criteria andFieldRadioNotBetween(Integer value1, Integer value2) {
            addCriterion("FIELD_RADIO not between", value1, value2, "fieldRadio");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchIsNull() {
            addCriterion("FIELD_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchIsNotNull() {
            addCriterion("FIELD_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchEqualTo(Boolean value) {
            addCriterion("FIELD_SWITCH =", value, "fieldSwitch");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchNotEqualTo(Boolean value) {
            addCriterion("FIELD_SWITCH <>", value, "fieldSwitch");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchGreaterThan(Boolean value) {
            addCriterion("FIELD_SWITCH >", value, "fieldSwitch");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIELD_SWITCH >=", value, "fieldSwitch");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchLessThan(Boolean value) {
            addCriterion("FIELD_SWITCH <", value, "fieldSwitch");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchLessThanOrEqualTo(Boolean value) {
            addCriterion("FIELD_SWITCH <=", value, "fieldSwitch");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchIn(List<Boolean> values) {
            addCriterion("FIELD_SWITCH in", values, "fieldSwitch");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchNotIn(List<Boolean> values) {
            addCriterion("FIELD_SWITCH not in", values, "fieldSwitch");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchBetween(Boolean value1, Boolean value2) {
            addCriterion("FIELD_SWITCH between", value1, value2, "fieldSwitch");
            return (Criteria) this;
        }

        public Criteria andFieldSwitchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIELD_SWITCH not between", value1, value2, "fieldSwitch");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SAMPLE
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
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
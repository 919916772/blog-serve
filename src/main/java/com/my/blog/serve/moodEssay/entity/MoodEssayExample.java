package com.my.blog.serve.moodEssay.entity;

import java.util.ArrayList;
import java.util.List;

public class MoodEssayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoodEssayExample() {
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

        public Criteria andPk_moodEssayIsNull() {
            addCriterion("pk_moodEssay is null");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayIsNotNull() {
            addCriterion("pk_moodEssay is not null");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayEqualTo(Integer value) {
            addCriterion("pk_moodEssay =", value, "pk_moodEssay");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayNotEqualTo(Integer value) {
            addCriterion("pk_moodEssay <>", value, "pk_moodEssay");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayGreaterThan(Integer value) {
            addCriterion("pk_moodEssay >", value, "pk_moodEssay");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_moodEssay >=", value, "pk_moodEssay");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayLessThan(Integer value) {
            addCriterion("pk_moodEssay <", value, "pk_moodEssay");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayLessThanOrEqualTo(Integer value) {
            addCriterion("pk_moodEssay <=", value, "pk_moodEssay");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayIn(List<Integer> values) {
            addCriterion("pk_moodEssay in", values, "pk_moodEssay");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayNotIn(List<Integer> values) {
            addCriterion("pk_moodEssay not in", values, "pk_moodEssay");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayBetween(Integer value1, Integer value2) {
            addCriterion("pk_moodEssay between", value1, value2, "pk_moodEssay");
            return (Criteria) this;
        }

        public Criteria andPk_moodEssayNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_moodEssay not between", value1, value2, "pk_moodEssay");
            return (Criteria) this;
        }

        public Criteria andEssayTitleIsNull() {
            addCriterion("essayTitle is null");
            return (Criteria) this;
        }

        public Criteria andEssayTitleIsNotNull() {
            addCriterion("essayTitle is not null");
            return (Criteria) this;
        }

        public Criteria andEssayTitleEqualTo(String value) {
            addCriterion("essayTitle =", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotEqualTo(String value) {
            addCriterion("essayTitle <>", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleGreaterThan(String value) {
            addCriterion("essayTitle >", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleGreaterThanOrEqualTo(String value) {
            addCriterion("essayTitle >=", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleLessThan(String value) {
            addCriterion("essayTitle <", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleLessThanOrEqualTo(String value) {
            addCriterion("essayTitle <=", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleLike(String value) {
            addCriterion("essayTitle like", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotLike(String value) {
            addCriterion("essayTitle not like", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleIn(List<String> values) {
            addCriterion("essayTitle in", values, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotIn(List<String> values) {
            addCriterion("essayTitle not in", values, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleBetween(String value1, String value2) {
            addCriterion("essayTitle between", value1, value2, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotBetween(String value1, String value2) {
            addCriterion("essayTitle not between", value1, value2, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayContentIsNull() {
            addCriterion("essayContent is null");
            return (Criteria) this;
        }

        public Criteria andEssayContentIsNotNull() {
            addCriterion("essayContent is not null");
            return (Criteria) this;
        }

        public Criteria andEssayContentEqualTo(String value) {
            addCriterion("essayContent =", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotEqualTo(String value) {
            addCriterion("essayContent <>", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentGreaterThan(String value) {
            addCriterion("essayContent >", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentGreaterThanOrEqualTo(String value) {
            addCriterion("essayContent >=", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentLessThan(String value) {
            addCriterion("essayContent <", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentLessThanOrEqualTo(String value) {
            addCriterion("essayContent <=", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentLike(String value) {
            addCriterion("essayContent like", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotLike(String value) {
            addCriterion("essayContent not like", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentIn(List<String> values) {
            addCriterion("essayContent in", values, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotIn(List<String> values) {
            addCriterion("essayContent not in", values, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentBetween(String value1, String value2) {
            addCriterion("essayContent between", value1, value2, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotBetween(String value1, String value2) {
            addCriterion("essayContent not between", value1, value2, "essayContent");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(String value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(String value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(String value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(String value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(String value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(String value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLike(String value) {
            addCriterion("ts like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotLike(String value) {
            addCriterion("ts not like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<String> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<String> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(String value1, String value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(String value1, String value2) {
            addCriterion("ts not between", value1, value2, "ts");
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
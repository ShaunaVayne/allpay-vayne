package cn.vayne.datasource.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoDOExample {
    protected String orderByClause;

    protected Integer offSet;

    protected Integer length;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOffSet(Integer offSet) {
        this.offSet = offSet;
    }

    public Integer getOffSet() {
        return offSet;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getLength() {
         return length;
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("payment_type like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("payment_type not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(String value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("source_type like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("source_type not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<String> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameIsNull() {
            addCriterion("receiver_user_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameIsNotNull() {
            addCriterion("receiver_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameEqualTo(String value) {
            addCriterion("receiver_user_name =", value, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameNotEqualTo(String value) {
            addCriterion("receiver_user_name <>", value, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameGreaterThan(String value) {
            addCriterion("receiver_user_name >", value, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_user_name >=", value, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameLessThan(String value) {
            addCriterion("receiver_user_name <", value, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_user_name <=", value, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameLike(String value) {
            addCriterion("receiver_user_name like", value, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameNotLike(String value) {
            addCriterion("receiver_user_name not like", value, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameIn(List<String> values) {
            addCriterion("receiver_user_name in", values, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameNotIn(List<String> values) {
            addCriterion("receiver_user_name not in", values, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameBetween(String value1, String value2) {
            addCriterion("receiver_user_name between", value1, value2, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNameNotBetween(String value1, String value2) {
            addCriterion("receiver_user_name not between", value1, value2, "receiverUserName");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIn(List<String> values) {
            addCriterion("receiver_mobile in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotIn(List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIsNull() {
            addCriterion("coupon_details is null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIsNotNull() {
            addCriterion("coupon_details is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsEqualTo(String value) {
            addCriterion("coupon_details =", value, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsNotEqualTo(String value) {
            addCriterion("coupon_details <>", value, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsGreaterThan(String value) {
            addCriterion("coupon_details >", value, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_details >=", value, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsLessThan(String value) {
            addCriterion("coupon_details <", value, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsLessThanOrEqualTo(String value) {
            addCriterion("coupon_details <=", value, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsLike(String value) {
            addCriterion("coupon_details like", value, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsNotLike(String value) {
            addCriterion("coupon_details not like", value, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIn(List<String> values) {
            addCriterion("coupon_details in", values, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsNotIn(List<String> values) {
            addCriterion("coupon_details not in", values, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsBetween(String value1, String value2) {
            addCriterion("coupon_details between", value1, value2, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsNotBetween(String value1, String value2) {
            addCriterion("coupon_details not between", value1, value2, "couponDetails");
            return (Criteria) this;
        }

        public Criteria andItemAmountIsNull() {
            addCriterion("item_amount is null");
            return (Criteria) this;
        }

        public Criteria andItemAmountIsNotNull() {
            addCriterion("item_amount is not null");
            return (Criteria) this;
        }

        public Criteria andItemAmountEqualTo(Long value) {
            addCriterion("item_amount =", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotEqualTo(Long value) {
            addCriterion("item_amount <>", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountGreaterThan(Long value) {
            addCriterion("item_amount >", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("item_amount >=", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountLessThan(Long value) {
            addCriterion("item_amount <", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountLessThanOrEqualTo(Long value) {
            addCriterion("item_amount <=", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountIn(List<Long> values) {
            addCriterion("item_amount in", values, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotIn(List<Long> values) {
            addCriterion("item_amount not in", values, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountBetween(Long value1, Long value2) {
            addCriterion("item_amount between", value1, value2, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotBetween(Long value1, Long value2) {
            addCriterion("item_amount not between", value1, value2, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andActualPaymentIsNull() {
            addCriterion("actual_payment is null");
            return (Criteria) this;
        }

        public Criteria andActualPaymentIsNotNull() {
            addCriterion("actual_payment is not null");
            return (Criteria) this;
        }

        public Criteria andActualPaymentEqualTo(Long value) {
            addCriterion("actual_payment =", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentNotEqualTo(Long value) {
            addCriterion("actual_payment <>", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentGreaterThan(Long value) {
            addCriterion("actual_payment >", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("actual_payment >=", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentLessThan(Long value) {
            addCriterion("actual_payment <", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentLessThanOrEqualTo(Long value) {
            addCriterion("actual_payment <=", value, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentIn(List<Long> values) {
            addCriterion("actual_payment in", values, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentNotIn(List<Long> values) {
            addCriterion("actual_payment not in", values, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentBetween(Long value1, Long value2) {
            addCriterion("actual_payment between", value1, value2, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andActualPaymentNotBetween(Long value1, Long value2) {
            addCriterion("actual_payment not between", value1, value2, "actualPayment");
            return (Criteria) this;
        }

        public Criteria andInstallAmountIsNull() {
            addCriterion("install_amount is null");
            return (Criteria) this;
        }

        public Criteria andInstallAmountIsNotNull() {
            addCriterion("install_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInstallAmountEqualTo(Long value) {
            addCriterion("install_amount =", value, "installAmount");
            return (Criteria) this;
        }

        public Criteria andInstallAmountNotEqualTo(Long value) {
            addCriterion("install_amount <>", value, "installAmount");
            return (Criteria) this;
        }

        public Criteria andInstallAmountGreaterThan(Long value) {
            addCriterion("install_amount >", value, "installAmount");
            return (Criteria) this;
        }

        public Criteria andInstallAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("install_amount >=", value, "installAmount");
            return (Criteria) this;
        }

        public Criteria andInstallAmountLessThan(Long value) {
            addCriterion("install_amount <", value, "installAmount");
            return (Criteria) this;
        }

        public Criteria andInstallAmountLessThanOrEqualTo(Long value) {
            addCriterion("install_amount <=", value, "installAmount");
            return (Criteria) this;
        }

        public Criteria andInstallAmountIn(List<Long> values) {
            addCriterion("install_amount in", values, "installAmount");
            return (Criteria) this;
        }

        public Criteria andInstallAmountNotIn(List<Long> values) {
            addCriterion("install_amount not in", values, "installAmount");
            return (Criteria) this;
        }

        public Criteria andInstallAmountBetween(Long value1, Long value2) {
            addCriterion("install_amount between", value1, value2, "installAmount");
            return (Criteria) this;
        }

        public Criteria andInstallAmountNotBetween(Long value1, Long value2) {
            addCriterion("install_amount not between", value1, value2, "installAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIsNull() {
            addCriterion("freight_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIsNotNull() {
            addCriterion("freight_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountEqualTo(Long value) {
            addCriterion("freight_amount =", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotEqualTo(Long value) {
            addCriterion("freight_amount <>", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThan(Long value) {
            addCriterion("freight_amount >", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("freight_amount >=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThan(Long value) {
            addCriterion("freight_amount <", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThanOrEqualTo(Long value) {
            addCriterion("freight_amount <=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIn(List<Long> values) {
            addCriterion("freight_amount in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotIn(List<Long> values) {
            addCriterion("freight_amount not in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountBetween(Long value1, Long value2) {
            addCriterion("freight_amount between", value1, value2, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotBetween(Long value1, Long value2) {
            addCriterion("freight_amount not between", value1, value2, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIsNull() {
            addCriterion("promotion_amount is null");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIsNotNull() {
            addCriterion("promotion_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountEqualTo(Long value) {
            addCriterion("promotion_amount =", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotEqualTo(Long value) {
            addCriterion("promotion_amount <>", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountGreaterThan(Long value) {
            addCriterion("promotion_amount >", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("promotion_amount >=", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountLessThan(Long value) {
            addCriterion("promotion_amount <", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountLessThanOrEqualTo(Long value) {
            addCriterion("promotion_amount <=", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIn(List<Long> values) {
            addCriterion("promotion_amount in", values, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotIn(List<Long> values) {
            addCriterion("promotion_amount not in", values, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountBetween(Long value1, Long value2) {
            addCriterion("promotion_amount between", value1, value2, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotBetween(Long value1, Long value2) {
            addCriterion("promotion_amount not between", value1, value2, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(String value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(String value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(String value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(String value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(String value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLike(String value) {
            addCriterion("comment_status like", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotLike(String value) {
            addCriterion("comment_status not like", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<String> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<String> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(String value1, String value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(String value1, String value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIsNull() {
            addCriterion("service_status is null");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIsNotNull() {
            addCriterion("service_status is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStatusEqualTo(String value) {
            addCriterion("service_status =", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotEqualTo(String value) {
            addCriterion("service_status <>", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusGreaterThan(String value) {
            addCriterion("service_status >", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("service_status >=", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLessThan(String value) {
            addCriterion("service_status <", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLessThanOrEqualTo(String value) {
            addCriterion("service_status <=", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLike(String value) {
            addCriterion("service_status like", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotLike(String value) {
            addCriterion("service_status not like", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIn(List<String> values) {
            addCriterion("service_status in", values, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotIn(List<String> values) {
            addCriterion("service_status not in", values, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusBetween(String value1, String value2) {
            addCriterion("service_status between", value1, value2, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotBetween(String value1, String value2) {
            addCriterion("service_status not between", value1, value2, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeIsNull() {
            addCriterion("deliver_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeIsNotNull() {
            addCriterion("deliver_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeEqualTo(String value) {
            addCriterion("deliver_type =", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotEqualTo(String value) {
            addCriterion("deliver_type <>", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeGreaterThan(String value) {
            addCriterion("deliver_type >", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_type >=", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeLessThan(String value) {
            addCriterion("deliver_type <", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeLessThanOrEqualTo(String value) {
            addCriterion("deliver_type <=", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeLike(String value) {
            addCriterion("deliver_type like", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotLike(String value) {
            addCriterion("deliver_type not like", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeIn(List<String> values) {
            addCriterion("deliver_type in", values, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotIn(List<String> values) {
            addCriterion("deliver_type not in", values, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeBetween(String value1, String value2) {
            addCriterion("deliver_type between", value1, value2, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotBetween(String value1, String value2) {
            addCriterion("deliver_type not between", value1, value2, "deliverType");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNull() {
            addCriterion("is_gift is null");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNotNull() {
            addCriterion("is_gift is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiftEqualTo(String value) {
            addCriterion("is_gift =", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotEqualTo(String value) {
            addCriterion("is_gift <>", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThan(String value) {
            addCriterion("is_gift >", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThanOrEqualTo(String value) {
            addCriterion("is_gift >=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThan(String value) {
            addCriterion("is_gift <", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThanOrEqualTo(String value) {
            addCriterion("is_gift <=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLike(String value) {
            addCriterion("is_gift like", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotLike(String value) {
            addCriterion("is_gift not like", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftIn(List<String> values) {
            addCriterion("is_gift in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotIn(List<String> values) {
            addCriterion("is_gift not in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftBetween(String value1, String value2) {
            addCriterion("is_gift between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotBetween(String value1, String value2) {
            addCriterion("is_gift not between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Long value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Long value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Long value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Long value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Long value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Long> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Long> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Long value1, Long value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Long value1, Long value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNull() {
            addCriterion("car_model is null");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNotNull() {
            addCriterion("car_model is not null");
            return (Criteria) this;
        }

        public Criteria andCarModelEqualTo(String value) {
            addCriterion("car_model =", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotEqualTo(String value) {
            addCriterion("car_model <>", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThan(String value) {
            addCriterion("car_model >", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThanOrEqualTo(String value) {
            addCriterion("car_model >=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThan(String value) {
            addCriterion("car_model <", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThanOrEqualTo(String value) {
            addCriterion("car_model <=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLike(String value) {
            addCriterion("car_model like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotLike(String value) {
            addCriterion("car_model not like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelIn(List<String> values) {
            addCriterion("car_model in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotIn(List<String> values) {
            addCriterion("car_model not in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelBetween(String value1, String value2) {
            addCriterion("car_model between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotBetween(String value1, String value2) {
            addCriterion("car_model not between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andCarDetailIsNull() {
            addCriterion("car_detail is null");
            return (Criteria) this;
        }

        public Criteria andCarDetailIsNotNull() {
            addCriterion("car_detail is not null");
            return (Criteria) this;
        }

        public Criteria andCarDetailEqualTo(String value) {
            addCriterion("car_detail =", value, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailNotEqualTo(String value) {
            addCriterion("car_detail <>", value, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailGreaterThan(String value) {
            addCriterion("car_detail >", value, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailGreaterThanOrEqualTo(String value) {
            addCriterion("car_detail >=", value, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailLessThan(String value) {
            addCriterion("car_detail <", value, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailLessThanOrEqualTo(String value) {
            addCriterion("car_detail <=", value, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailLike(String value) {
            addCriterion("car_detail like", value, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailNotLike(String value) {
            addCriterion("car_detail not like", value, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailIn(List<String> values) {
            addCriterion("car_detail in", values, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailNotIn(List<String> values) {
            addCriterion("car_detail not in", values, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailBetween(String value1, String value2) {
            addCriterion("car_detail between", value1, value2, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCarDetailNotBetween(String value1, String value2) {
            addCriterion("car_detail not between", value1, value2, "carDetail");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andAdditionIsNull() {
            addCriterion("addition is null");
            return (Criteria) this;
        }

        public Criteria andAdditionIsNotNull() {
            addCriterion("addition is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionEqualTo(String value) {
            addCriterion("addition =", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotEqualTo(String value) {
            addCriterion("addition <>", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionGreaterThan(String value) {
            addCriterion("addition >", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionGreaterThanOrEqualTo(String value) {
            addCriterion("addition >=", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionLessThan(String value) {
            addCriterion("addition <", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionLessThanOrEqualTo(String value) {
            addCriterion("addition <=", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionLike(String value) {
            addCriterion("addition like", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotLike(String value) {
            addCriterion("addition not like", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionIn(List<String> values) {
            addCriterion("addition in", values, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotIn(List<String> values) {
            addCriterion("addition not in", values, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionBetween(String value1, String value2) {
            addCriterion("addition between", value1, value2, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotBetween(String value1, String value2) {
            addCriterion("addition not between", value1, value2, "addition");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedIsNull() {
            addCriterion("is_use_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedIsNotNull() {
            addCriterion("is_use_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedEqualTo(String value) {
            addCriterion("is_use_deleted =", value, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedNotEqualTo(String value) {
            addCriterion("is_use_deleted <>", value, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedGreaterThan(String value) {
            addCriterion("is_use_deleted >", value, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_use_deleted >=", value, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedLessThan(String value) {
            addCriterion("is_use_deleted <", value, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_use_deleted <=", value, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedLike(String value) {
            addCriterion("is_use_deleted like", value, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedNotLike(String value) {
            addCriterion("is_use_deleted not like", value, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedIn(List<String> values) {
            addCriterion("is_use_deleted in", values, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedNotIn(List<String> values) {
            addCriterion("is_use_deleted not in", values, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedBetween(String value1, String value2) {
            addCriterion("is_use_deleted between", value1, value2, "isUseDeleted");
            return (Criteria) this;
        }

        public Criteria andIsUseDeletedNotBetween(String value1, String value2) {
            addCriterion("is_use_deleted not between", value1, value2, "isUseDeleted");
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
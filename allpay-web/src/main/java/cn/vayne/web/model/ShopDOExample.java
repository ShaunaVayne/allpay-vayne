package cn.vayne.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopDOExample {
    protected String orderByClause;

    protected Integer offSet;

    protected Integer length;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopDOExample() {
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

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("manager like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("manager not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("manager not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andImgListIsNull() {
            addCriterion("img_list is null");
            return (Criteria) this;
        }

        public Criteria andImgListIsNotNull() {
            addCriterion("img_list is not null");
            return (Criteria) this;
        }

        public Criteria andImgListEqualTo(String value) {
            addCriterion("img_list =", value, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListNotEqualTo(String value) {
            addCriterion("img_list <>", value, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListGreaterThan(String value) {
            addCriterion("img_list >", value, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListGreaterThanOrEqualTo(String value) {
            addCriterion("img_list >=", value, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListLessThan(String value) {
            addCriterion("img_list <", value, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListLessThanOrEqualTo(String value) {
            addCriterion("img_list <=", value, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListLike(String value) {
            addCriterion("img_list like", value, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListNotLike(String value) {
            addCriterion("img_list not like", value, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListIn(List<String> values) {
            addCriterion("img_list in", values, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListNotIn(List<String> values) {
            addCriterion("img_list not in", values, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListBetween(String value1, String value2) {
            addCriterion("img_list between", value1, value2, "imgList");
            return (Criteria) this;
        }

        public Criteria andImgListNotBetween(String value1, String value2) {
            addCriterion("img_list not between", value1, value2, "imgList");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Boolean value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Boolean value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Boolean value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Boolean value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Boolean> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Boolean> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("work_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("work_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(String value) {
            addCriterion("work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(String value) {
            addCriterion("work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(String value) {
            addCriterion("work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(String value) {
            addCriterion("work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLike(String value) {
            addCriterion("work_time like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotLike(String value) {
            addCriterion("work_time not like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<String> values) {
            addCriterion("work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<String> values) {
            addCriterion("work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(String value1, String value2) {
            addCriterion("work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(String value1, String value2) {
            addCriterion("work_time not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIsNull() {
            addCriterion("alipay_account is null");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIsNotNull() {
            addCriterion("alipay_account is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountEqualTo(String value) {
            addCriterion("alipay_account =", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotEqualTo(String value) {
            addCriterion("alipay_account <>", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountGreaterThan(String value) {
            addCriterion("alipay_account >", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_account >=", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLessThan(String value) {
            addCriterion("alipay_account <", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLessThanOrEqualTo(String value) {
            addCriterion("alipay_account <=", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLike(String value) {
            addCriterion("alipay_account like", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotLike(String value) {
            addCriterion("alipay_account not like", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIn(List<String> values) {
            addCriterion("alipay_account in", values, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotIn(List<String> values) {
            addCriterion("alipay_account not in", values, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountBetween(String value1, String value2) {
            addCriterion("alipay_account between", value1, value2, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotBetween(String value1, String value2) {
            addCriterion("alipay_account not between", value1, value2, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymIsNull() {
            addCriterion("alipay_autoym is null");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymIsNotNull() {
            addCriterion("alipay_autoym is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymEqualTo(String value) {
            addCriterion("alipay_autoym =", value, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymNotEqualTo(String value) {
            addCriterion("alipay_autoym <>", value, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymGreaterThan(String value) {
            addCriterion("alipay_autoym >", value, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_autoym >=", value, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymLessThan(String value) {
            addCriterion("alipay_autoym <", value, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymLessThanOrEqualTo(String value) {
            addCriterion("alipay_autoym <=", value, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymLike(String value) {
            addCriterion("alipay_autoym like", value, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymNotLike(String value) {
            addCriterion("alipay_autoym not like", value, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymIn(List<String> values) {
            addCriterion("alipay_autoym in", values, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymNotIn(List<String> values) {
            addCriterion("alipay_autoym not in", values, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymBetween(String value1, String value2) {
            addCriterion("alipay_autoym between", value1, value2, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andAlipayAutoymNotBetween(String value1, String value2) {
            addCriterion("alipay_autoym not between", value1, value2, "alipayAutoym");
            return (Criteria) this;
        }

        public Criteria andCrmIsNull() {
            addCriterion("crm is null");
            return (Criteria) this;
        }

        public Criteria andCrmIsNotNull() {
            addCriterion("crm is not null");
            return (Criteria) this;
        }

        public Criteria andCrmEqualTo(String value) {
            addCriterion("crm =", value, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmNotEqualTo(String value) {
            addCriterion("crm <>", value, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmGreaterThan(String value) {
            addCriterion("crm >", value, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmGreaterThanOrEqualTo(String value) {
            addCriterion("crm >=", value, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmLessThan(String value) {
            addCriterion("crm <", value, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmLessThanOrEqualTo(String value) {
            addCriterion("crm <=", value, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmLike(String value) {
            addCriterion("crm like", value, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmNotLike(String value) {
            addCriterion("crm not like", value, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmIn(List<String> values) {
            addCriterion("crm in", values, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmNotIn(List<String> values) {
            addCriterion("crm not in", values, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmBetween(String value1, String value2) {
            addCriterion("crm between", value1, value2, "crm");
            return (Criteria) this;
        }

        public Criteria andCrmNotBetween(String value1, String value2) {
            addCriterion("crm not between", value1, value2, "crm");
            return (Criteria) this;
        }

        public Criteria andAsmIsNull() {
            addCriterion("asm is null");
            return (Criteria) this;
        }

        public Criteria andAsmIsNotNull() {
            addCriterion("asm is not null");
            return (Criteria) this;
        }

        public Criteria andAsmEqualTo(String value) {
            addCriterion("asm =", value, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmNotEqualTo(String value) {
            addCriterion("asm <>", value, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmGreaterThan(String value) {
            addCriterion("asm >", value, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmGreaterThanOrEqualTo(String value) {
            addCriterion("asm >=", value, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmLessThan(String value) {
            addCriterion("asm <", value, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmLessThanOrEqualTo(String value) {
            addCriterion("asm <=", value, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmLike(String value) {
            addCriterion("asm like", value, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmNotLike(String value) {
            addCriterion("asm not like", value, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmIn(List<String> values) {
            addCriterion("asm in", values, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmNotIn(List<String> values) {
            addCriterion("asm not in", values, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmBetween(String value1, String value2) {
            addCriterion("asm between", value1, value2, "asm");
            return (Criteria) this;
        }

        public Criteria andAsmNotBetween(String value1, String value2) {
            addCriterion("asm not between", value1, value2, "asm");
            return (Criteria) this;
        }

        public Criteria andSrIsNull() {
            addCriterion("sr is null");
            return (Criteria) this;
        }

        public Criteria andSrIsNotNull() {
            addCriterion("sr is not null");
            return (Criteria) this;
        }

        public Criteria andSrEqualTo(String value) {
            addCriterion("sr =", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrNotEqualTo(String value) {
            addCriterion("sr <>", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrGreaterThan(String value) {
            addCriterion("sr >", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrGreaterThanOrEqualTo(String value) {
            addCriterion("sr >=", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrLessThan(String value) {
            addCriterion("sr <", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrLessThanOrEqualTo(String value) {
            addCriterion("sr <=", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrLike(String value) {
            addCriterion("sr like", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrNotLike(String value) {
            addCriterion("sr not like", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrIn(List<String> values) {
            addCriterion("sr in", values, "sr");
            return (Criteria) this;
        }

        public Criteria andSrNotIn(List<String> values) {
            addCriterion("sr not in", values, "sr");
            return (Criteria) this;
        }

        public Criteria andSrBetween(String value1, String value2) {
            addCriterion("sr between", value1, value2, "sr");
            return (Criteria) this;
        }

        public Criteria andSrNotBetween(String value1, String value2) {
            addCriterion("sr not between", value1, value2, "sr");
            return (Criteria) this;
        }

        public Criteria andBdLonLatIsNull() {
            addCriterion("bd_lon_lat is null");
            return (Criteria) this;
        }

        public Criteria andBdLonLatIsNotNull() {
            addCriterion("bd_lon_lat is not null");
            return (Criteria) this;
        }

        public Criteria andBdLonLatEqualTo(String value) {
            addCriterion("bd_lon_lat =", value, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatNotEqualTo(String value) {
            addCriterion("bd_lon_lat <>", value, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatGreaterThan(String value) {
            addCriterion("bd_lon_lat >", value, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatGreaterThanOrEqualTo(String value) {
            addCriterion("bd_lon_lat >=", value, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatLessThan(String value) {
            addCriterion("bd_lon_lat <", value, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatLessThanOrEqualTo(String value) {
            addCriterion("bd_lon_lat <=", value, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatLike(String value) {
            addCriterion("bd_lon_lat like", value, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatNotLike(String value) {
            addCriterion("bd_lon_lat not like", value, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatIn(List<String> values) {
            addCriterion("bd_lon_lat in", values, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatNotIn(List<String> values) {
            addCriterion("bd_lon_lat not in", values, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatBetween(String value1, String value2) {
            addCriterion("bd_lon_lat between", value1, value2, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andBdLonLatNotBetween(String value1, String value2) {
            addCriterion("bd_lon_lat not between", value1, value2, "bdLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatIsNull() {
            addCriterion("tx_lon_lat is null");
            return (Criteria) this;
        }

        public Criteria andTxLonLatIsNotNull() {
            addCriterion("tx_lon_lat is not null");
            return (Criteria) this;
        }

        public Criteria andTxLonLatEqualTo(String value) {
            addCriterion("tx_lon_lat =", value, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatNotEqualTo(String value) {
            addCriterion("tx_lon_lat <>", value, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatGreaterThan(String value) {
            addCriterion("tx_lon_lat >", value, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatGreaterThanOrEqualTo(String value) {
            addCriterion("tx_lon_lat >=", value, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatLessThan(String value) {
            addCriterion("tx_lon_lat <", value, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatLessThanOrEqualTo(String value) {
            addCriterion("tx_lon_lat <=", value, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatLike(String value) {
            addCriterion("tx_lon_lat like", value, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatNotLike(String value) {
            addCriterion("tx_lon_lat not like", value, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatIn(List<String> values) {
            addCriterion("tx_lon_lat in", values, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatNotIn(List<String> values) {
            addCriterion("tx_lon_lat not in", values, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatBetween(String value1, String value2) {
            addCriterion("tx_lon_lat between", value1, value2, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andTxLonLatNotBetween(String value1, String value2) {
            addCriterion("tx_lon_lat not between", value1, value2, "txLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatIsNull() {
            addCriterion("gd_lon_lat is null");
            return (Criteria) this;
        }

        public Criteria andGdLonLatIsNotNull() {
            addCriterion("gd_lon_lat is not null");
            return (Criteria) this;
        }

        public Criteria andGdLonLatEqualTo(String value) {
            addCriterion("gd_lon_lat =", value, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatNotEqualTo(String value) {
            addCriterion("gd_lon_lat <>", value, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatGreaterThan(String value) {
            addCriterion("gd_lon_lat >", value, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatGreaterThanOrEqualTo(String value) {
            addCriterion("gd_lon_lat >=", value, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatLessThan(String value) {
            addCriterion("gd_lon_lat <", value, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatLessThanOrEqualTo(String value) {
            addCriterion("gd_lon_lat <=", value, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatLike(String value) {
            addCriterion("gd_lon_lat like", value, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatNotLike(String value) {
            addCriterion("gd_lon_lat not like", value, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatIn(List<String> values) {
            addCriterion("gd_lon_lat in", values, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatNotIn(List<String> values) {
            addCriterion("gd_lon_lat not in", values, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatBetween(String value1, String value2) {
            addCriterion("gd_lon_lat between", value1, value2, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andGdLonLatNotBetween(String value1, String value2) {
            addCriterion("gd_lon_lat not between", value1, value2, "gdLonLat");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(int value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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
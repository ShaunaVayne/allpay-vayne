package cn.vayne.web.utils;

import cn.vayne.web.model.ItemSumDo;
import cn.vayne.web.model.ShopDO;
import cn.vayne.web.model.SkuItemDo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @Author: WangKun
 * @Description: 数据缓存处理类
 * @Date: Created in 2018/6/26 下午5:43
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Slf4j
@Component
public class CacheUtils {


	@CachePut(value = "shopDOs", key = "#shopDO.id")
	public ShopDO shopDOToCache(ShopDO shopDO) {
		return shopDO;
	}

	@Cacheable(value = "shopDOs", key = "#shopDO.id")
	public ShopDO getShopDOForCache(ShopDO shopDO) {
		return shopDO;
	}

	@CachePut(value = "itemSumDOs", key = "#itemSumDo.orderId")
	public ItemSumDo itemsNumToCache(ItemSumDo itemSumDo) {
		return itemSumDo;
	}

	@Cacheable(value = "itemSumDOs", key = "#itemSumDo.orderId")
	public ItemSumDo getItemsNumForCache(ItemSumDo itemSumDo) {
		return itemSumDo;
	}

	@CachePut(value = "skuItems", key = "#e.orderId")
	public SkuItemDo skuItemsToCache(SkuItemDo e) {
		return e;
	}

	@Cacheable(value = "skuItems", key = "#e.orderId")
	public SkuItemDo getSkuItemsForCache(SkuItemDo e) {
		return e;
	}

	@CacheEvict(value = "itemSumDOs")
	public void removeItemSumCache(String orderId) { }

	@CacheEvict(value = "skuItems")
	public void removeSkuItemCache(String orderId) {}

	@CacheEvict(value = "shopDOs")
	public void removeShopCache(Long id) {}
}

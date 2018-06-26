package cn.vayne.web.utils;

import cn.vayne.web.model.ItemDO;
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
 * @Description:
 * @Date: Created in 2018/6/26 下午5:43
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Slf4j
@Component
public class CacheUtils {

	@Cacheable(value = "itemDOs", key = "#itemDO.orderId")
	public ItemDO getitemDOForCache(ItemDO itemDO) {
		return itemDO;
	}

	@CachePut(value = "itemDOs", key = "#itemDO.orderId")
	public ItemDO itemsDOToCache(ItemDO itemDO) {
		return itemDO;
	}

	@CachePut(value = "shopDOs", key = "#shopDO.id")
	public ShopDO shopDOToCache(ShopDO shopDO) {
		return shopDO;
	}

	@Cacheable(value = "shopDOs", key = "#shopDO.id")
	public ShopDO getShopDOForCache(ShopDO shopDO) {
		return shopDO;
	}

	@CacheEvict(value = "itemDOs")
	public void removeItemsCache(String orderId) {}

	@CacheEvict(value = "shopDOs")
	public void removeShopCache(Long id) {}

	@CachePut(value = "itemSumDOs", key = "#itemSumDo.orderId")
	public ItemSumDo itemsNumToCache(ItemSumDo itemSumDo) {
		return itemSumDo;
	}

	@CachePut(value = "itemSumDOs", key = "#itemSumDo.orderId")
	public ItemSumDo getItemsNumForCache(ItemSumDo itemSumDo) {
		return itemSumDo;
	}

	@CachePut(value = "skuItems", key = "#e.orderId")
	public SkuItemDo skuItemsToCache(SkuItemDo e) {
		return e;
	}

	@CachePut(value = "skuItems", key = "#e.orderId")
	public SkuItemDo getSkuItemsForCache(SkuItemDo e) {
		return e;
	}
}

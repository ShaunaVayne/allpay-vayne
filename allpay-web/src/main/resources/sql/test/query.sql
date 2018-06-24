select * from order_info where created_time >= '2018-06-15 00:00:01' and created_time <= '2018-06-19 00:00:01';

select count(1) from order_info where created_time >= '2018-06-15 00:00:01' and created_time <= '2018-06-19 00:00:01';

select * from shop where is_delete <> '1';

select count(1) from shop where is_delete <> '1';

select count(1) from shop;

select count(1) from order_info where created_time >= '2018-06-15 00:00:01' and created_time <= '2018-06-19 00:00:01' and finish_time is null;

select * from order_items order by created_time desc;

select t2.* from order_info t1 LEFT JOIN order_items t2 on t1.id = t2.order_id where t1.id='103006';

select * from order_info where id='103220';

select count(1) from order_items where order_id = '103006';

select * from order_items where order_id='101516';

-- 商品数量
select sum(item_nums) '商品数量', order_id '订单id' from order_items where order_id = '103006';
SELECT count(1) FROM order_info WHERE created_time >= '2018-06-15 00:00:01'
	AND created_time <= '2018-06-19 00:00:01' ;

-- 101538	101541	101543
SELECT id FROM order_info WHERE created_time >= '2018-06-15 00:00:01'
	AND created_time <= '2018-06-19 00:00:01';
select * from order_items where order_id = '101538';
-- 数据有问题, 存在数据为在主表中有数据, 子表中暂无

select count(1) from (SELECT sum(item_nums) '商品数量', order_id '订单id' FROM order_items WHERE order_id IN ( SELECT id FROM order_info WHERE created_time >= '2018-06-15 00:00:01'
	AND created_time <= '2018-06-19 00:00:01'
) GROUP BY order_id) t;


SELECT sum(item_nums) '商品数量', order_id '订单id' FROM order_items WHERE order_id IN ( SELECT id FROM order_info WHERE created_time >= '2018-06-15 00:00:01'
	AND created_time <= '2018-06-19 00:00:01'
) GROUP BY order_id;
-- 商品 id


-- 商品名称

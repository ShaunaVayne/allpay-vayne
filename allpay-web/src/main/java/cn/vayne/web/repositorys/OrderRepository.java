package cn.vayne.web.repositorys;

import cn.vayne.web.domain.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/20 下午2:19
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
public interface OrderRepository extends JpaRepository<OrderInfo, Long> {


}

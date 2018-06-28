package cn.vayne.web.service;

import cn.vayne.web.domain.DTO.ExcelPoiReq;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/28 下午5:17
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@Component("excelPoiTask")
@Slf4j
@Scope("prototype")
public class ExcelPoiTask extends Thread {

	private ExcelPoiReq excelPoiReq;

	@Resource(name = "excelPoiService")
	private ExcelPoiService excelPoiService;

	@Override
	public void run() {
		log.info("线程名 {}, 参数 {}", Thread.currentThread().getName(), excelPoiReq);
	}
}

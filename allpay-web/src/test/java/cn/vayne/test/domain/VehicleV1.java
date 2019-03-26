package cn.vayne.test.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/9/28 下午3:18
 * @ProjectName: saas-crm
 * @Version: 1.0.0
 */
@Data
public class VehicleV1 {

	/**
	 * 车辆id
	 */
	private Long id;
	/**
	 * 车牌
	 */
	@NotBlank(message = "licensePlateNumber不能为空")
	private String licensePlateNumber;

	/**
	 * 车牌省份标识
	 */
	@NotBlank(message = "licensePlateFlag不能为空")
	private String licensePlateFlag;

	/**
	 * 车型
	 */
	@NotBlank(message = "vehicleModel不能为空")
	private String vehicleModel;
	/**
	 * 颜色
	 */
	private String color;

	@Size(max = 17)
	private String vin;

	/**
	 * 车辆分类
	 */
	private String vehicleType;

	/**
	 * 发动机型号
	 */
	@Size(max = 20)
	private String engine;

	/**
	 * 上次保养日期
	 */
	private Date LastMaintenanceDate;

	/**
	 * 下次保养日期
	 */
	private Date nextMaintenanceDate;

	/**
	 * 保险公司
	 */
	@Size(max = 30)
	private String insuranceCompany;

	/**
	 * 保险生效时间
	 */
	private Date effectiveDate;

	/**
	 * 保险到期日
	 */
	private Date expiryDate;

	/**
	 * 保险描述
	 */
	private String description;

	/**
	 * 备注
	 */
	private String remark;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof VehicleV1)) return false;
		VehicleV1 vehicleV1 = (VehicleV1) o;
		if (vehicleV1.licensePlateFlag == this.licensePlateFlag
				&& vehicleV1.licensePlateNumber == this.licensePlateNumber && vehicleV1.vehicleModel == this.vehicleModel){
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {

		return Objects.hash(getLicensePlateNumber(), getLicensePlateFlag(), getVehicleModel());
	}
}

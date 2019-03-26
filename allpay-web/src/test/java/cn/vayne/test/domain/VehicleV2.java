package cn.vayne.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/10/18 下午2:26
 * @ProjectName: saas-crm
 * @Version: 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleV2 {

	private Long id;

	private String licensePlateNumber;

	private String licensePlateFlag;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof VehicleV2)) return false;
		VehicleV2 vehicleV2 = (VehicleV2) o;
		if (vehicleV2.licensePlateFlag == this.licensePlateFlag
				&& vehicleV2.licensePlateNumber == this.licensePlateNumber){
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {

		return Objects.hash(getLicensePlateNumber(), getLicensePlateFlag());
	}
}

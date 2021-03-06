package com.hsic.bean;

public class UserXJInfo {
	//===============基本信息============================//

	/// <summary>
	/// 售气交易号
	/// </summary>
	public String saleid;

	/// <summary>
	/// 送气编号[新卡号]
	/// </summary>
	public String userid;

	/// <summary>
	/// 送气编号
	/// </summary>
	public String Remark;

	/// <summary>
	/// 用户卡状态
	/// </summary>
	public String userCardStatus;

	/// <summary>
	/// 用户卡ID[卡TagID]
	/// </summary>
	public String userCardID;//

	/// <summary>
	/// 用户姓名
	/// </summary>
	public String username;

	/// <summary>
	/// 固定电话
	/// </summary>
	public String telephone;

	/// <summary>
	/// 手机
	/// </summary>
	public String handphone;


	/// <summary>
	/// 默认0。0：新用户，1：老用户
	/// </summary>
	public int IsNew;

	/// <summary>
	/// 用户类型
	/// </summary>
	public String CustomerType;


	/// <summary>
	/// 用户类型描述
	/// </summary>
	public String CustomerTypeName;


	//===============巡检信息============================//

	/// <summary>
	/// 巡检状态 0-不存在隐患 1-存在一般隐患 2-存在严重隐患
	/// </summary>
	public String InspectionStatus;

	/// <summary>
	/// 严重隐患 - 调压器泄漏 1-存在 0-不存在
	/// </summary>
	public String StopSupplyType1;

	/// <summary>
	/// 严重隐患 - 热水器无烟道或烟道安装不规范 1-存在 0-不存在
	/// </summary>
	public String StopSupplyType2;

	/// <summary>
	/// 严重隐患 - 使用场所不规范 1-存在 0-不存在
	/// </summary>
	public String StopSupplyType3;

	/// <summary>
	/// 严重隐患 - 未按规定安装使用泄漏报警器 1-存在 0-不存在
	/// </summary>
	public String StopSupplyType4;

	/// <summary>
	/// 严重隐患 - 调压器使用不规范 1-存在 0-不存在
	/// </summary>
	public String StopSupplyType5;

	/// <summary>
	/// 严重隐患 - 商业餐饮用户未按规定设瓶组间或无瓶库 1-存在 0-不存在
	/// </summary>
	public String StopSupplyType6;

	/// <summary>
	/// 严重隐患 - 同室使用二种及以上气源 1-存在 0-不存在
	/// </summary>
	public String StopSupplyType7;

	/// <summary>
	/// 严重隐患 - 其他严重隐患 1-存在 0-不存在
	/// </summary>
	public String StopSupplyType8;

	/// <summary>
	/// 一般隐患 - 使用非强制排风热水器 1-存在 0-不存在
	/// </summary>
	public String UnInstallType1;

	/// <summary>
	/// 一般隐患 - 热水器烟道未通至户外(已取消) 1-存在 0-不存在
	/// </summary>
	public String UnInstallType2;

	/// <summary>
	/// 一般隐患 - 使用非安全型灶具 1-存在 0-不存在
	/// </summary>
	public String UnInstallType3;

	/// <summary>
	/// 一般隐患 - 使用场所排风不畅 1-存在 0-不存在
	/// </summary>
	public String UnInstallType4;

	/// <summary>
	/// 一般隐患 - 调压器老化(已取消) 1-存在 0-不存在
	/// </summary>
	public String UnInstallType5;

	/// <summary>
	/// 一般隐患 - 橡胶管使用不规范 1-存在 0-不存在
	/// </summary>
	public String UnInstallType6;

	/// <summary>
	/// 一般隐患 - 橡胶管老化(已取消) 1-存在 0-不存在
	/// </summary>
	public String UnInstallType7;

	/// <summary>
	/// 一般隐患 - 设施连接未装夹箍(已取消) 1-存在 0-不存在
	/// </summary>
	public String UnInstallType8;

	/// <summary>
	/// 一般隐患 - 燃气具故障 1-存在 0-不存在
	/// </summary>
	public String UnInstallType9;

	/// <summary>
	/// 一般隐患 - 强制使用液化气(已取消) 1-存在 0-不存在
	/// </summary>
	public String UnInstallType10;

	/// <summary>
	/// 一般隐患 - 餐饮用户灶位排烟设施不全 1-存在 0-不存在
	/// </summary>
	public String UnInstallType11;

	/// <summary>
	/// 一般隐患 - 其他隐患 1-存在 0-不存在
	/// </summary>
	public String UnInstallType12;

	/// <summary>
	/// 是否备用瓶 0表示一般瓶 1表示备用瓶
	/// </summary>
	public String IsBackup;

	//===============手持机返回信息============================//

	/// <summary>
	/// 站点编号
	/// </summary>
	public String stationcode;

	/// <summary>
	/// 操作时间
	/// </summary>
	public String InspectionDate;

	/// <summary>
	/// 操作人编号
	/// </summary>
	public String InspectionMan;

	/// <summary>
	/// 关联ID
	/// </summary>
	public String AttachID;



	//===============20170510新增整改信息============================//

	/// <summary>
	/// 整改状态
	/// </summary>
	public String RectifyStatus;

	//===============20170522用于确定整改流水状态============================//

	/// <summary>
	/// 上次巡检状态
	/// </summary>
	public String Last_InspectionStatus;

	//===============20170522优惠灶具============================//

	/// <summary>
	/// 灶具状态 0未赠送 1已赠送
	/// </summary>
	public String SaleCookieStatus;

	/// <summary>
	/// 灶具赠送日期
	/// </summary>
	public String SaleCookieDate;

	/// <summary>
	/// 灶具型号
	/// </summary>
	public String SaleCookieType;

	//===============20170622增加安检项目============================//

	/// <summary>
	/// 拒绝安检  1表示拒绝
	/// </summary>
	public String RefuseInspection;

	/// <summary>
	/// 用户地址不对  1表示不对
	/// </summary>
	public String ErrorAddress;

	/// <summary>
	/// 用户性质不符  1表示不符
	/// </summary>
	public String ErrorNature;

	/// <summary>
	/// 用户性质不符  1表示不符
	/// </summary>
	public String NoAlarm;


	/// <summary>
	/// 未归还气瓶号
	/// </summary>
	public String whpqk;
	public String IsInspected;
	public String deliveraddress;
	public String CustomerCardID;
	public String getSaleid() {
		return saleid;
	}

	public void setSaleid(String saleid) {
		this.saleid = saleid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getUserCardStatus() {
		return userCardStatus;
	}

	public void setUserCardStatus(String userCardStatus) {
		this.userCardStatus = userCardStatus;
	}

	public String getUserCardID() {
		return userCardID;
	}

	public void setUserCardID(String userCardID) {
		this.userCardID = userCardID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getHandphone() {
		return handphone;
	}

	public void setHandphone(String handphone) {
		this.handphone = handphone;
	}

	public int getIsNew() {
		return IsNew;
	}

	public void setIsNew(int isNew) {
		IsNew = isNew;
	}

	public String getCustomerType() {
		return CustomerType;
	}

	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}

	public String getCustomerTypeName() {
		return CustomerTypeName;
	}

	public void setCustomerTypeName(String customerTypeName) {
		CustomerTypeName = customerTypeName;
	}

	public String getInspectionStatus() {
		return InspectionStatus;
	}

	public void setInspectionStatus(String inspectionStatus) {
		InspectionStatus = inspectionStatus;
	}

	public String getStopSupplyType1() {
		return StopSupplyType1;
	}

	public void setStopSupplyType1(String stopSupplyType1) {
		StopSupplyType1 = stopSupplyType1;
	}

	public String getStopSupplyType2() {
		return StopSupplyType2;
	}

	public void setStopSupplyType2(String stopSupplyType2) {
		StopSupplyType2 = stopSupplyType2;
	}

	public String getStopSupplyType3() {
		return StopSupplyType3;
	}

	public void setStopSupplyType3(String stopSupplyType3) {
		StopSupplyType3 = stopSupplyType3;
	}

	public String getStopSupplyType4() {
		return StopSupplyType4;
	}

	public void setStopSupplyType4(String stopSupplyType4) {
		StopSupplyType4 = stopSupplyType4;
	}

	public String getStopSupplyType5() {
		return StopSupplyType5;
	}

	public void setStopSupplyType5(String stopSupplyType5) {
		StopSupplyType5 = stopSupplyType5;
	}

	public String getStopSupplyType6() {
		return StopSupplyType6;
	}

	public void setStopSupplyType6(String stopSupplyType6) {
		StopSupplyType6 = stopSupplyType6;
	}

	public String getStopSupplyType7() {
		return StopSupplyType7;
	}

	public void setStopSupplyType7(String stopSupplyType7) {
		StopSupplyType7 = stopSupplyType7;
	}

	public String getStopSupplyType8() {
		return StopSupplyType8;
	}

	public void setStopSupplyType8(String stopSupplyType8) {
		StopSupplyType8 = stopSupplyType8;
	}

	public String getUnInstallType1() {
		return UnInstallType1;
	}

	public void setUnInstallType1(String unInstallType1) {
		UnInstallType1 = unInstallType1;
	}

	public String getUnInstallType2() {
		return UnInstallType2;
	}

	public void setUnInstallType2(String unInstallType2) {
		UnInstallType2 = unInstallType2;
	}

	public String getUnInstallType3() {
		return UnInstallType3;
	}

	public void setUnInstallType3(String unInstallType3) {
		UnInstallType3 = unInstallType3;
	}

	public String getUnInstallType4() {
		return UnInstallType4;
	}

	public void setUnInstallType4(String unInstallType4) {
		UnInstallType4 = unInstallType4;
	}

	public String getUnInstallType5() {
		return UnInstallType5;
	}

	public void setUnInstallType5(String unInstallType5) {
		UnInstallType5 = unInstallType5;
	}

	public String getUnInstallType6() {
		return UnInstallType6;
	}

	public void setUnInstallType6(String unInstallType6) {
		UnInstallType6 = unInstallType6;
	}

	public String getUnInstallType7() {
		return UnInstallType7;
	}

	public void setUnInstallType7(String unInstallType7) {
		UnInstallType7 = unInstallType7;
	}

	public String getUnInstallType8() {
		return UnInstallType8;
	}

	public void setUnInstallType8(String unInstallType8) {
		UnInstallType8 = unInstallType8;
	}

	public String getUnInstallType9() {
		return UnInstallType9;
	}

	public void setUnInstallType9(String unInstallType9) {
		UnInstallType9 = unInstallType9;
	}

	public String getUnInstallType10() {
		return UnInstallType10;
	}

	public void setUnInstallType10(String unInstallType10) {
		UnInstallType10 = unInstallType10;
	}

	public String getUnInstallType11() {
		return UnInstallType11;
	}

	public void setUnInstallType11(String unInstallType11) {
		UnInstallType11 = unInstallType11;
	}

	public String getUnInstallType12() {
		return UnInstallType12;
	}

	public void setUnInstallType12(String unInstallType12) {
		UnInstallType12 = unInstallType12;
	}

	public String getIsBackup() {
		return IsBackup;
	}

	public void setIsBackup(String isBackup) {
		IsBackup = isBackup;
	}

	public String getStationcode() {
		return stationcode;
	}

	public void setStationcode(String stationcode) {
		this.stationcode = stationcode;
	}

	public String getInspectionDate() {
		return InspectionDate;
	}

	public void setInspectionDate(String inspectionDate) {
		InspectionDate = inspectionDate;
	}

	public String getInspectionMan() {
		return InspectionMan;
	}

	public void setInspectionMan(String inspectionMan) {
		InspectionMan = inspectionMan;
	}

	public String getAttachID() {
		return AttachID;
	}

	public void setAttachID(String attachID) {
		AttachID = attachID;
	}

	public String getRectifyStatus() {
		return RectifyStatus;
	}

	public void setRectifyStatus(String rectifyStatus) {
		RectifyStatus = rectifyStatus;
	}

	public String getLast_InspectionStatus() {
		return Last_InspectionStatus;
	}

	public void setLast_InspectionStatus(String last_InspectionStatus) {
		Last_InspectionStatus = last_InspectionStatus;
	}

	public String getSaleCookieStatus() {
		return SaleCookieStatus;
	}

	public void setSaleCookieStatus(String saleCookieStatus) {
		SaleCookieStatus = saleCookieStatus;
	}

	public String getSaleCookieDate() {
		return SaleCookieDate;
	}

	public void setSaleCookieDate(String saleCookieDate) {
		SaleCookieDate = saleCookieDate;
	}

	public String getSaleCookieType() {
		return SaleCookieType;
	}

	public void setSaleCookieType(String saleCookieType) {
		SaleCookieType = saleCookieType;
	}

	public String getRefuseInspection() {
		return RefuseInspection;
	}

	public void setRefuseInspection(String refuseInspection) {
		RefuseInspection = refuseInspection;
	}

	public String getErrorAddress() {
		return ErrorAddress;
	}

	public void setErrorAddress(String errorAddress) {
		ErrorAddress = errorAddress;
	}

	public String getErrorNature() {
		return ErrorNature;
	}

	public void setErrorNature(String errorNature) {
		ErrorNature = errorNature;
	}

	public String getNoAlarm() {
		return NoAlarm;
	}

	public void setNoAlarm(String noAlarm) {
		NoAlarm = noAlarm;
	}

	public String getWhpqk() {
		return whpqk;
	}

	public void setWhpqk(String whpqk) {
		this.whpqk = whpqk;
	}

	public String getIsInspected() {
		return IsInspected;
	}

	public void setIsInspected(String isInspected) {
		IsInspected = isInspected;
	}

	public String getDeliveraddress() {
		return deliveraddress;
	}

	public void setDeliveraddress(String deliveraddress) {
		this.deliveraddress = deliveraddress;
	}

	public String getCustomerCardID() {
		return CustomerCardID;
	}

	public void setCustomerCardID(String customerCardID) {
		CustomerCardID = customerCardID;
	}
}

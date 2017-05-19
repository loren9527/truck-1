package com.bysj.rj.util;

import com.bysj.rj.service.TruckProduceDtoScervice;
import com.bysj.rj.entity.TruckProduceDto;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 龙 on 2017/5/17.
 */
@Component
public class CreateUtil implements Runnable {
    @Resource
    private TruckProduceDtoScervice dtoScervice;

    public void creat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        List<TruckProduceDto> truckProduceDtoList = new ArrayList<TruckProduceDto>();
        for (int i = 1; i <=50; i++) {
            TruckProduceDto truckProduceDto1 = new TruckProduceDto();
            truckProduceDto1.setEmployeeName("张胜利");
            truckProduceDto1.setEmployeeGrade("中级技工");
            truckProduceDto1.setEmployeePlace("工位1");
            truckProduceDto1.setTruckNumber(ConstantString.ABCSubway_TRUCK + i);
            truckProduceDto1.setState("正常");
            truckProduceDto1.setDate(simpleDateFormat.format(System.currentTimeMillis()));
            truckProduceDto1.setCurrentOperation("步骤1：扫描架构识别码");
            truckProduceDto1.setTrucktype(ConstantString.TYPE_ABCSubway_TRUCK);

            TruckProduceDto truckProduceDto2 = new TruckProduceDto();
            truckProduceDto2.setEmployeeName("杨硕");
            truckProduceDto2.setEmployeeGrade("高级技工");
            truckProduceDto2.setEmployeePlace("工位2");
            truckProduceDto2.setTruckNumber(ConstantString.ABCSubway_TRUCK + i);
            truckProduceDto2.setState("正常");
            truckProduceDto2.setDate(simpleDateFormat.format(System.currentTimeMillis()));
            truckProduceDto2.setCurrentOperation("步骤2：扫描差压阀识别码");
            truckProduceDto2.setTrucktype(ConstantString.TYPE_ABCSubway_TRUCK);

            TruckProduceDto truckProduceDto3 = new TruckProduceDto();
            truckProduceDto3.setEmployeeName("胡志远");
            truckProduceDto3.setEmployeeGrade("高级技工");
            truckProduceDto3.setEmployeePlace("工位3");
            truckProduceDto3.setTruckNumber(ConstantString.ABCSubway_TRUCK + i);
            truckProduceDto3.setState("正常");
            truckProduceDto3.setDate(simpleDateFormat.format(System.currentTimeMillis()));
            truckProduceDto3.setCurrentOperation("步骤3：清洁车差压阀及差压阀座表面灰尘");
            truckProduceDto3.setTrucktype(ConstantString.TYPE_ABCSubway_TRUCK);

            TruckProduceDto truckProduceDto4 = new TruckProduceDto();
            truckProduceDto4.setEmployeeName("沈明");
            truckProduceDto4.setEmployeeGrade("中级技工");
            truckProduceDto4.setEmployeePlace("工位4");
            truckProduceDto4.setTruckNumber(ConstantString.ABCSubway_TRUCK + i);
            truckProduceDto4.setState("正常");
            truckProduceDto4.setDate(simpleDateFormat.format(System.currentTimeMillis()));
            truckProduceDto4.setCurrentOperation("步骤4：拆除差压阀及差压阀座防护");
            truckProduceDto4.setTrucktype(ConstantString.TYPE_ABCSubway_TRUCK);

            TruckProduceDto truckProduceDto5 = new TruckProduceDto();
            truckProduceDto5.setEmployeeName("张兵");
            truckProduceDto5.setEmployeeGrade("中级技工");
            truckProduceDto5.setEmployeePlace("工位5");
            truckProduceDto5.setTruckNumber(ConstantString.ABCSubway_TRUCK + i);
            truckProduceDto5.setState("正常");
            truckProduceDto5.setDate(simpleDateFormat.format(System.currentTimeMillis()));
            truckProduceDto5.setCurrentOperation("步骤5：清洁差压阀座螺纹孔");
            truckProduceDto5.setTrucktype(ConstantString.TYPE_ABCSubway_TRUCK);

            TruckProduceDto truckProduceDto6 = new TruckProduceDto();
            truckProduceDto6.setEmployeeName("王利");
            truckProduceDto6.setEmployeeGrade("中级技工");
            truckProduceDto6.setEmployeePlace("工位6");
            truckProduceDto6.setTruckNumber(ConstantString.ABCSubway_TRUCK + i);
            truckProduceDto6.setState("正常");
            truckProduceDto6.setDate(simpleDateFormat.format(System.currentTimeMillis()));
            truckProduceDto6.setCurrentOperation("步骤6：清洁螺栓");
            truckProduceDto6.setTrucktype(ConstantString.TYPE_ABCSubway_TRUCK);

            TruckProduceDto truckProduceDto7 = new TruckProduceDto();
            truckProduceDto7.setEmployeeName("张亮");
            truckProduceDto7.setEmployeeGrade("高级技工");
            truckProduceDto7.setEmployeePlace("工位7");
            truckProduceDto7.setTruckNumber(ConstantString.ABCSubway_TRUCK + i);
            truckProduceDto7.setState("正常");
            truckProduceDto7.setDate(simpleDateFormat.format(System.currentTimeMillis()));
            truckProduceDto7.setCurrentOperation("步骤7：螺栓涂抹螺纹锁固胶");
            truckProduceDto7.setTrucktype(ConstantString.TYPE_ABCSubway_TRUCK);

            TruckProduceDto truckProduceDto8 = new TruckProduceDto();
            truckProduceDto8.setEmployeeName("李志明");
            truckProduceDto8.setEmployeeGrade("中级技工");
            truckProduceDto8.setEmployeePlace("工位8");
            truckProduceDto8.setTruckNumber(ConstantString.ABCSubway_TRUCK + i);
            truckProduceDto8.setState("正常");
            truckProduceDto8.setDate(simpleDateFormat.format(System.currentTimeMillis()));
            truckProduceDto8.setCurrentOperation("步骤8：预安装差压阀");
            truckProduceDto8.setTrucktype(ConstantString.TYPE_ABCSubway_TRUCK);

            TruckProduceDto truckProduceDto9 = new TruckProduceDto();
            truckProduceDto9.setEmployeeName("杨志利");
            truckProduceDto9.setEmployeeGrade("高级技工");
            truckProduceDto9.setEmployeePlace("工位9");
            truckProduceDto9.setTruckNumber(ConstantString.ABCSubway_TRUCK + i);
            truckProduceDto9.setState("正常");
            truckProduceDto9.setDate(simpleDateFormat.format(System.currentTimeMillis()));
            truckProduceDto9.setCurrentOperation("步骤9：禁锢差压阀-力矩45Nm");
            truckProduceDto9.setTrucktype(ConstantString.TYPE_ABCSubway_TRUCK);

            TruckProduceDto truckProduceDto10 = new TruckProduceDto();
            truckProduceDto10.setEmployeeName("王刚");
            truckProduceDto10.setEmployeeGrade("高级技工");
            truckProduceDto10.setEmployeePlace("工位10");
            truckProduceDto10.setTruckNumber(ConstantString.ABCSubway_TRUCK + i);
            truckProduceDto10.setState("正常");
            truckProduceDto10.setDate(simpleDateFormat.format(System.currentTimeMillis()));
            truckProduceDto10.setCurrentOperation("步骤10：涂打防松标记");
            truckProduceDto10.setTrucktype(ConstantString.TYPE_ABCSubway_TRUCK);

            truckProduceDtoList.add(truckProduceDto1);
            truckProduceDtoList.add(truckProduceDto2);
            truckProduceDtoList.add(truckProduceDto3);
            truckProduceDtoList.add(truckProduceDto4);
            truckProduceDtoList.add(truckProduceDto5);
            truckProduceDtoList.add(truckProduceDto6);
            truckProduceDtoList.add(truckProduceDto7);
            truckProduceDtoList.add(truckProduceDto8);
            truckProduceDtoList.add(truckProduceDto9);
            truckProduceDtoList.add(truckProduceDto10);
            dtoScervice.insertBatch(truckProduceDtoList);
        }

    }

    public void run() {
        creat();
    }
}

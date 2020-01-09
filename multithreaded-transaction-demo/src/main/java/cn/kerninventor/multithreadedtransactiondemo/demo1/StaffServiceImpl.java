package cn.kerninventor.multithreadedtransactiondemo.demo1;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title: StaffServiceImpl
 * @ProjectName demos
 * @PackageName cn.kerninventor.multithreadedtransactiondemo
 * @Author Kern
 * @Date 2019/12/19 17:38
 * @Description: TODO
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Resource
    private StaffDAO staffDAO;

    @Override
    public void save(List<StaffBO> staffs) {
        for (StaffBO staffBO : staffs){
            new AsynInsertTask<StaffBO>(staffDAO, staffBO).run();
        }
    }


}

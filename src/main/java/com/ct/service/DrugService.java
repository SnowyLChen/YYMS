package com.ct.service;

import com.ct.pojo.*;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 其他用户
 */
public interface DrugService {

    /**
     * 药品添加
     */
    boolean addDrugs(Medicine medicine, Address address);

    /**
     * 查询所有药品
     * @return
     */

    String queryAllDrugs(@Param("offset") int offset, @Param("pagesize") int pageSize);

    /**
     * 按商品名查询
     */
    String queryDrug(String name);

    /**
     * 查询所有商品分类
     */
    String queryType();

    /**
     * 添加商品分类
     * @return
     */
    boolean addType(MedicineType medicineType);

    String queryAllInfo(int parseInt, int parseInt1);

    String queryBetweenTime(String start, String end);

    boolean deleteDrug(int miId);

    String queryByName(String name,String queryData);

    boolean inReposi(int msStock,int miId);
}

package com.sunshine.designpatterns.template;

/**
 * @ClassName UpdateSubjectTemplate
 * @Description TODO
 * @Author wangtao
 * @Date 2018-09-16 0:35
 * @Version 1.0
 **/
public abstract class UpdateSubjectTemplate {

    public void updateSubject() {
        //step 1: 查询esg数据
         step1();
        // step 2: 查询threadHolding
        step2();
        // step 3: 更新单笔数据
        
        step3();
        // step 4: 告警数据
        step4();
        

    }

    protected abstract void step4();

    protected abstract void step3();

    protected abstract void step2();

    protected abstract void step1();
}

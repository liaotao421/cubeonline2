package cn.taoblog421.common.metaobjecthandler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author liaotao
 * @Date 2020/11/4 21:28
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    //使用mp进行插入操作时，这个方法执行
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("gmtCreate",new Date(),metaObject);
        this.setFieldValByName("gmtModified",new Date(),metaObject);
    }

    ////使用mp进行修改操作时，这个方法执行
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("gmtModified",new Date(),metaObject);
    }
}
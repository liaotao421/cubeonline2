package cn.taoblog421.comp.service.impl;

import cn.taoblog421.comp.entity.Event;
import cn.taoblog421.comp.mapper.EventMapper;
import cn.taoblog421.comp.service.EventService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liaotao
 * @since 2021-03-09
 */
@Service
public class EventServiceImpl extends ServiceImpl<EventMapper, Event> implements EventService {

}

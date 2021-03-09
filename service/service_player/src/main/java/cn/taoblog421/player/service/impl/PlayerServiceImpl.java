package cn.taoblog421.player.service.impl;

import cn.taoblog421.player.entity.Player;
import cn.taoblog421.player.mapper.PlayerMapper;
import cn.taoblog421.player.service.PlayerService;
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
public class PlayerServiceImpl extends ServiceImpl<PlayerMapper, Player> implements PlayerService {

}

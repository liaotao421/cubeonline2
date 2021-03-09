package cn.taoblog421.admin.test;

import cn.taoblog421.admin.entity.Admin;
import cn.taoblog421.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author liaotao
 * @Date 2021/3/9 20:45
 */
public class Test {

    @Autowired
    private static AdminService adminService;

    public static void main(String[] args) {
        List<Admin> list = adminService.list(null);
        for (Admin admin : list) {
            System.out.println(admin);
        }
    }
}

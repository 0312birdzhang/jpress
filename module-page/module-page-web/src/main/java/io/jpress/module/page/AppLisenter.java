package io.jpress.module.page;

import io.jpress.JPressAppListener;
import io.jpress.core.module.Modules;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Title: 应用启动监听器
 * @Package io.jpress.module.page
 */
public class AppLisenter implements JPressAppListener {


    @Override
    public void onConfigModule(Modules modules) {
        modules.add(PageModule.me());
    }
}

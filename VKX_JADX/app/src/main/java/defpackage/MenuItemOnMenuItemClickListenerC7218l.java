package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؚّٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC7218l implements MenuItem.OnMenuItemClickListener {
    public static final Class[] amazon = {MenuItem.class};
    public Object crashlytics;
    public Object loadAd;
    public final /* synthetic */ int yandex = 0;

    public MenuItemOnMenuItemClickListenerC7218l(MenuItemC12957l menuItemC12957l, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.crashlytics = menuItemC12957l;
        this.loadAd = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.yandex) {
            case 0:
                Object obj = this.loadAd;
                Method method = (Method) this.crashlytics;
                boolean zBooleanValue = false;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        zBooleanValue = true;
                    }
                    break;
                } catch (Exception e) {
                    C11467l.metrica(e);
                }
                return zBooleanValue;
            default:
                return ((MenuItem.OnMenuItemClickListener) this.loadAd).onMenuItemClick(((MenuItemC12957l) this.crashlytics).m4255l(menuItem));
        }
    }

    public /* synthetic */ MenuItemOnMenuItemClickListenerC7218l() {
    }
}

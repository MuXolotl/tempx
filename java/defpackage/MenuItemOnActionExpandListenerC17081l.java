package defpackage;

import android.view.MenuItem;

/* JADX INFO: renamed from: lًّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC17081l implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ MenuItemC12957l loadAd;
    public final MenuItem.OnActionExpandListener yandex;

    public MenuItemOnActionExpandListenerC17081l(MenuItemC12957l menuItemC12957l, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.loadAd = menuItemC12957l;
        this.yandex = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.yandex.onMenuItemActionCollapse(this.loadAd.m4255l(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.yandex.onMenuItemActionExpand(this.loadAd.m4255l(menuItem));
    }
}

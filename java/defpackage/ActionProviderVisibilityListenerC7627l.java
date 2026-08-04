package defpackage;

import android.view.ActionProvider;

/* JADX INFO: renamed from: lؚۤۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC7627l implements ActionProvider.VisibilityListener {
    public final ActionProvider loadAd;
    public C13161l yandex;

    public ActionProviderVisibilityListenerC7627l(MenuItemC12957l menuItemC12957l, ActionProvider actionProvider) {
        this.loadAd = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C13161l c13161l = this.yandex;
        if (c13161l != null) {
            MenuC4984l menuC4984l = ((C17858l) c13161l.f25776l).f34819l;
            menuC4984l.f10193l = true;
            menuC4984l.startapp(true);
        }
    }
}

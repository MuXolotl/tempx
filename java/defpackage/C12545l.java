package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* JADX INFO: renamed from: lُِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12545l {
    public final C5008l amazon;
    public final boolean crashlytics;
    public final ArrayList loadAd = new ArrayList();
    public C4300l purchase;
    public final AbstractC3621l yandex;

    public C12545l(AbstractC3621l abstractC3621l, boolean z) {
        this.yandex = abstractC3621l;
        this.amazon = abstractC3621l.f7556l;
        this.crashlytics = z;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.amazon.f10245l).getPackageName() + " }";
    }
}

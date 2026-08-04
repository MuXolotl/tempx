package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lُۥؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11468l implements InterfaceC13945l {
    public static final C11468l crashlytics = new C11468l(null);
    public final String loadAd;

    public /* synthetic */ C11468l(String str) {
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11468l) {
            return AbstractC7236l.amazon(this.loadAd, ((C11468l) obj).loadAd);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.loadAd});
    }
}

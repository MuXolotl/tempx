package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lَؑؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10005l implements InterfaceC5373l {
    public static final C7279l crashlytics = new C7279l(AbstractC18202l.yandex.loadAd(C10005l.class));
    public final ArrayList loadAd = new ArrayList();
    public boolean yandex;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C10005l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C10005l c10005l = (C10005l) obj;
        return this.yandex == c10005l.yandex && AbstractC8576l.yandex(this.loadAd, c10005l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + ((this.yandex ? 1231 : 1237) * 31);
    }

    @Override // defpackage.InterfaceC5373l
    public final C7279l yandex() {
        return crashlytics;
    }
}

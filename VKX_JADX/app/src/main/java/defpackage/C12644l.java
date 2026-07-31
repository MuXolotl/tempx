package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lّٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12644l {
    public final boolean crashlytics;
    public final boolean loadAd;
    public final HashMap yandex;

    public C12644l(HashMap map, boolean z, boolean z2) {
        this.yandex = map;
        this.loadAd = z;
        this.crashlytics = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12644l)) {
            return false;
        }
        C12644l c12644l = (C12644l) obj;
        return this.yandex.equals(c12644l.yandex) && this.loadAd == c12644l.loadAd && this.crashlytics == c12644l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237)) * 31) + (this.crashlytics ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FakeOverrideMembers(members=");
        sb.append(this.yandex);
        sb.append(", containsInheritedStatics=");
        sb.append(this.loadAd);
        sb.append(", containsPackagePrivate=");
        return AbstractC0653l.tapsense(sb, this.crashlytics, ')');
    }
}

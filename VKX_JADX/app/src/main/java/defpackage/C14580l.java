package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْٓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14580l {
    public static final C7512l Companion = new C7512l();
    public static final InterfaceC1220l[] purchase = {null, null, AbstractC9968l.crashlytics(2, new C8631l(23)), null};
    public final C12219l amazon;
    public final List crashlytics;
    public final C9806l loadAd;
    public final int yandex;

    public /* synthetic */ C14580l(int i, int i2, C9806l c9806l, List list, C12219l c12219l) {
        this.yandex = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = c9806l;
        }
        if ((i & 4) == 0) {
            this.crashlytics = C2580l.f5619l;
        } else {
            this.crashlytics = list;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = c12219l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14580l)) {
            return false;
        }
        C14580l c14580l = (C14580l) obj;
        return this.yandex == c14580l.yandex && AbstractC8576l.yandex(this.loadAd, c14580l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c14580l.crashlytics) && AbstractC8576l.yandex(this.amazon, c14580l.amazon);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        C9806l c9806l = this.loadAd;
        int iAdmob = AbstractC14814l.admob((i + (c9806l == null ? 0 : c9806l.hashCode())) * 31, 31, this.crashlytics);
        C12219l c12219l = this.amazon;
        return iAdmob + (c12219l != null ? c12219l.hashCode() : 0);
    }

    public final String toString() {
        return "AuthProcessAuthCodeResponseDto(status=" + this.yandex + ", authInfo=" + this.loadAd + ", errors=" + this.crashlytics + ", profile=" + this.amazon + ')';
    }
}

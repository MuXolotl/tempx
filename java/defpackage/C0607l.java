package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؑۜۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0607l {
    public final Throwable loadAd;
    public final C10712l yandex;

    public C0607l(C10712l c10712l) {
        this.yandex = c10712l;
        this.loadAd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0607l)) {
            return false;
        }
        C0607l c0607l = (C0607l) obj;
        C10712l c10712l = this.yandex;
        if (c10712l != null && c10712l == c0607l.yandex) {
            return true;
        }
        Throwable th = this.loadAd;
        if (th == null || c0607l.loadAd == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.yandex, this.loadAd});
    }

    public C0607l(Throwable th) {
        this.loadAd = th;
        this.yandex = null;
    }
}

package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lَۗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10510l {
    public final C9138l loadAd;
    public final C7800l yandex;

    public /* synthetic */ C10510l(C7800l c7800l, C9138l c9138l) {
        this.yandex = c7800l;
        this.loadAd = c9138l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10510l)) {
            return false;
        }
        C10510l c10510l = (C10510l) obj;
        return AbstractC7236l.amazon(this.yandex, c10510l.yandex) && AbstractC7236l.amazon(this.loadAd, c10510l.loadAd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.yandex, this.loadAd});
    }

    public final String toString() {
        C13568l c13568l = new C13568l(this);
        c13568l.loadAd(this.yandex, "key");
        c13568l.loadAd(this.loadAd, "feature");
        return c13568l.toString();
    }
}

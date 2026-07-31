package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lؙّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1673l extends AbstractC7778l {
    public static final String amazon;
    public static final String purchase;
    public final boolean crashlytics;
    public final boolean loadAd;

    static {
        String str = AbstractC15323l.yandex;
        amazon = Integer.toString(1, 36);
        purchase = Integer.toString(2, 36);
    }

    public C1673l() {
        this.loadAd = false;
        this.crashlytics = false;
    }

    @Override // defpackage.AbstractC7778l
    public final Bundle crashlytics() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC7778l.yandex, 0);
        bundle.putBoolean(amazon, this.loadAd);
        bundle.putBoolean(purchase, this.crashlytics);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1673l)) {
            return false;
        }
        C1673l c1673l = (C1673l) obj;
        return this.crashlytics == c1673l.crashlytics && this.loadAd == c1673l.loadAd;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.loadAd), Boolean.valueOf(this.crashlytics));
    }

    @Override // defpackage.AbstractC7778l
    public final boolean loadAd() {
        return this.loadAd;
    }

    public C1673l(boolean z) {
        this.loadAd = true;
        this.crashlytics = z;
    }
}

package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: l٘ؐۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17602l implements InterfaceC3074l {
    public final C13698l amazon;
    public final C7091l crashlytics;
    public final C1336l loadAd;
    public final C5866l yandex;

    public C17602l(C5866l c5866l, C1336l c1336l, C7091l c7091l, C13698l c13698l) {
        this.yandex = c5866l;
        this.loadAd = c1336l;
        this.crashlytics = c7091l;
        this.amazon = c13698l;
    }

    @Override // defpackage.InterfaceC3074l
    public final void amazon(int i, Object obj, C6956l c6956l, int i2) {
        c6956l.m2133new(-462424778);
        int i3 = 4;
        int i4 = (c6956l.amazon(i) ? 4 : 2) | i2 | (c6956l.admob(obj) ? 32 : 16) | (c6956l.billing(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i4 & 1, (i4 & 147) != 146)) {
            AbstractC15497l.yandex(obj, i, this.yandex.subscription, AbstractC14566l.amazon(-824725566, new C1674l(this, i, i3), c6956l), c6956l, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(this, i, obj, i2, 10);
        }
    }

    @Override // defpackage.InterfaceC3074l
    public final Object crashlytics(int i) {
        return this.loadAd.purchase(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17602l)) {
            return false;
        }
        return AbstractC8576l.yandex(this.loadAd, ((C17602l) obj).loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode();
    }

    @Override // defpackage.InterfaceC3074l
    public final Object loadAd(int i) {
        Object objAppmetrica = this.amazon.appmetrica(i);
        return objAppmetrica == null ? this.loadAd.mopub(i) : objAppmetrica;
    }

    @Override // defpackage.InterfaceC3074l
    public final int purchase(Object obj) {
        return this.amazon.premium(obj);
    }

    @Override // defpackage.InterfaceC3074l
    public final int yandex() {
        return this.loadAd.billing().f26744l;
    }
}

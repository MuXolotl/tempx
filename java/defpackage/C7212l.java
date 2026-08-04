package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍؚّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7212l implements InterfaceC3074l {
    public final C13698l crashlytics;
    public final AbstractC2219l loadAd;
    public final AbstractC13264l yandex;

    public C7212l(AbstractC13264l abstractC13264l, C1843l c1843l, C13698l c13698l) {
        this.yandex = abstractC13264l;
        this.loadAd = c1843l;
        this.crashlytics = c13698l;
    }

    @Override // defpackage.InterfaceC3074l
    public final void amazon(int i, Object obj, C6956l c6956l, int i2) {
        c6956l.m2133new(-1201380429);
        int i3 = (c6956l.amazon(i) ? 4 : 2) | i2 | (c6956l.admob(obj) ? 32 : 16) | (c6956l.billing(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            AbstractC15497l.yandex(obj, i, this.yandex.isVip, AbstractC14566l.amazon(1142237095, new C1674l(this, i, 11), c6956l), c6956l, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(this, i, obj, i2, 15);
        }
    }

    @Override // defpackage.InterfaceC3074l
    public final /* synthetic */ Object crashlytics(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7212l)) {
            return false;
        }
        return AbstractC8576l.yandex(this.loadAd, ((C7212l) obj).loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode();
    }

    @Override // defpackage.InterfaceC3074l
    public final Object loadAd(int i) {
        Object objAppmetrica = this.crashlytics.appmetrica(i);
        return objAppmetrica == null ? this.loadAd.mopub(i) : objAppmetrica;
    }

    @Override // defpackage.InterfaceC3074l
    public final int purchase(Object obj) {
        return this.crashlytics.premium(obj);
    }

    @Override // defpackage.InterfaceC3074l
    public final int yandex() {
        return this.loadAd.billing().f26744l;
    }
}

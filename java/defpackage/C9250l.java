package defpackage;

/* JADX INFO: renamed from: lٍؘؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9250l implements InterfaceC4945l {
    public final String yandex;

    public C9250l(String str) {
        this.yandex = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9250l) && this.yandex.equals(((C9250l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("Header(title="), this.yandex, ')');
    }

    @Override // defpackage.InterfaceC4945l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(1226162337);
        int i2 = i | (c6956l.billing(interfaceC17242l) ? 4 : 2) | (c6956l.billing(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC11282l.loadAd(this.yandex, AbstractC3605l.startapp(AbstractC3605l.vip(interfaceC17242l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(AbstractC3459l.yandex)).mopub, c6956l, 0, 0, 65532);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2736l(this, interfaceC17242l, i, 27);
        }
    }
}

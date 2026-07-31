package defpackage;

/* JADX INFO: renamed from: lِْۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13315l implements InterfaceC17807l {
    public final Object crashlytics;
    public final float loadAd;
    public final float yandex;

    public C13315l(float f, float f2, Object obj) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13315l) {
            C13315l c13315l = (C13315l) obj;
            if (c13315l.yandex == this.yandex && c13315l.loadAd == this.loadAd && AbstractC8576l.yandex(c13315l.crashlytics, this.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.crashlytics;
        return Float.floatToIntBits(this.loadAd) + AbstractC9029l.mopub((obj != null ? obj.hashCode() : 0) * 31, this.yandex, 31);
    }

    @Override // defpackage.InterfaceC1489l
    public final InterfaceC15930l yandex(C0010l c0010l) {
        InterfaceC13221l c7026l;
        Object obj = this.crashlytics;
        AbstractC2249l abstractC2249l = obj == null ? null : (AbstractC2249l) c0010l.yandex.invoke(obj);
        int[] iArr = AbstractC6503l.yandex;
        float f = this.yandex;
        float f2 = this.loadAd;
        if (abstractC2249l != null) {
            C15053l c15053l = new C15053l();
            int iLoadAd = abstractC2249l.loadAd();
            C9081l[] c9081lArr = new C9081l[iLoadAd];
            for (int i = 0; i < iLoadAd; i++) {
                c9081lArr[i] = new C9081l(f, f2, abstractC2249l.yandex(i));
            }
            c15053l.f29576l = c9081lArr;
            c7026l = c15053l;
        } else {
            c7026l = new C7026l(f, f2);
        }
        C10685l c10685l = new C10685l();
        c10685l.f21690l = new C12014l(c7026l);
        return c10685l;
    }

    public /* synthetic */ C13315l(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}

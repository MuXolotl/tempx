package defpackage;

/* JADX INFO: renamed from: lََٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10210l implements InterfaceC2186l {
    public final long crashlytics;
    public final float loadAd;
    public final boolean yandex;

    public C10210l(boolean z, float f, long j) {
        this.yandex = z;
        this.loadAd = f;
        this.crashlytics = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10210l)) {
            return false;
        }
        C10210l c10210l = (C10210l) obj;
        if (this.yandex == c10210l.yandex && C14467l.loadAd(this.loadAd, c10210l.loadAd)) {
            return C9735l.crashlytics(this.crashlytics, c10210l.crashlytics);
        }
        return false;
    }

    @Override // defpackage.InterfaceC2186l
    public final int hashCode() {
        int iMopub = AbstractC9029l.mopub((this.yandex ? 1231 : 1237) * 31, this.loadAd, 961);
        int i = C9735l.smaato;
        return C10882l.yandex(this.crashlytics) + iMopub;
    }

    @Override // defpackage.InterfaceC2186l
    public final InterfaceC8605l loadAd(C2403l c2403l) {
        return new C2037l(c2403l, this.yandex, this.loadAd, new C9007l(2, this));
    }

    @Override // defpackage.InterfaceC2186l
    public final void yandex(C2403l c2403l, C6956l c6956l) {
        c6956l.m2123default(1257603829);
        c6956l.startapp(false);
    }
}

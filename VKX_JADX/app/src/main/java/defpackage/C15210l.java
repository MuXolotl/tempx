package defpackage;

/* JADX INFO: renamed from: lٔ۟ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15210l implements Comparable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f29807l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f29808l;

    public C15210l(C5978l c5978l, int i) {
        this.f29808l = (c5978l.purchase & 1) != 0;
        this.f29807l = AbstractC4338l.tapsense(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C15210l c15210l = (C15210l) obj;
        return AbstractC12716l.yandex.crashlytics(this.f29807l, c15210l.f29807l).crashlytics(this.f29808l, c15210l.f29808l).purchase();
    }
}

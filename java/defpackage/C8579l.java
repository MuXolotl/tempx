package defpackage;

/* JADX INFO: renamed from: lٌؗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8579l extends AbstractC10759l {
    public static final Object isPro = new Object();
    public final C7828l admob;
    public final boolean billing;
    public final boolean mopub;
    public final C2427l purchase;
    public final long subs;

    public C8579l(C18602l c18602l) {
        this.purchase = c18602l.mo2778l();
        this.billing = c18602l.mo2793l();
        this.mopub = c18602l.mo2789l();
        this.admob = c18602l.mo2777l() ? C7828l.billing : null;
        this.subs = AbstractC15323l.m3962continue(c18602l.pro());
    }

    @Override // defpackage.AbstractC10759l
    public final int admob() {
        return 1;
    }

    @Override // defpackage.AbstractC10759l
    public final C3904l billing(int i, C3904l c3904l, boolean z) {
        c3904l.getClass();
        C12869l c12869l = C12869l.billing;
        Object obj = isPro;
        c3904l.subs(obj, obj, 0, this.subs, 0L, c12869l, false);
        c3904l.billing = false;
        return c3904l;
    }

    @Override // defpackage.AbstractC10759l
    public final int loadAd(Object obj) {
        return isPro != obj ? -1 : 0;
    }

    @Override // defpackage.AbstractC10759l
    public final int metrica() {
        return 1;
    }

    @Override // defpackage.AbstractC10759l
    public final C4322l remoteconfig(int i, C4322l c4322l, long j) {
        c4322l.loadAd(isPro, this.purchase, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.billing, this.mopub, this.admob, 0L, this.subs, 0, 0, 0L);
        c4322l.firebase = false;
        return c4322l;
    }

    @Override // defpackage.AbstractC10759l
    public final Object smaato(int i) {
        return isPro;
    }
}

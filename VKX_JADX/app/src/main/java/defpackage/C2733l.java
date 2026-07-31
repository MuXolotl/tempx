package defpackage;

/* JADX INFO: renamed from: lؔٚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2733l extends AbstractC16808l {
    public final C2427l billing;

    public C2733l(AbstractC10759l abstractC10759l, C2427l c2427l) {
        super(abstractC10759l);
        this.billing = c2427l;
    }

    @Override // defpackage.AbstractC16808l, defpackage.AbstractC10759l
    public final C4322l remoteconfig(int i, C4322l c4322l, long j) {
        super.remoteconfig(i, c4322l, j);
        C2427l c2427l = this.billing;
        c4322l.crashlytics = c2427l;
        C17805l c17805l = c2427l.loadAd;
        c4322l.loadAd = c17805l != null ? c17805l.admob : null;
        return c4322l;
    }
}

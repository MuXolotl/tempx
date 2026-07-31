package defpackage;

/* JADX INFO: renamed from: lٌٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8567l extends AbstractC10759l {
    public final C2427l purchase;

    public C8567l(C2427l c2427l) {
        this.purchase = c2427l;
    }

    @Override // defpackage.AbstractC10759l
    public final int admob() {
        return 1;
    }

    @Override // defpackage.AbstractC10759l
    public final C3904l billing(int i, C3904l c3904l, boolean z) {
        c3904l.subs(z ? 0 : null, z ? C10298l.admob : null, 0, -9223372036854775807L, 0L, C12869l.billing, true);
        return c3904l;
    }

    @Override // defpackage.AbstractC10759l
    public final int loadAd(Object obj) {
        return obj == C10298l.admob ? 0 : -1;
    }

    @Override // defpackage.AbstractC10759l
    public final int metrica() {
        return 1;
    }

    @Override // defpackage.AbstractC10759l
    public final C4322l remoteconfig(int i, C4322l c4322l, long j) {
        c4322l.loadAd(C4322l.adcel, this.purchase, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        c4322l.firebase = true;
        return c4322l;
    }

    @Override // defpackage.AbstractC10759l
    public final Object smaato(int i) {
        return C10298l.admob;
    }
}

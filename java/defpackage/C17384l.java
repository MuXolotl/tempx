package defpackage;

/* JADX INFO: renamed from: lٗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17384l extends AbstractC15165l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C6756l f33847l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f33848l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17384l(C6756l c6756l, int i) {
        super(c6756l, (byte) 0);
        this.f33848l = i;
        this.f33847l = c6756l;
    }

    @Override // defpackage.AbstractC15165l
    public final Object loadAd(int i) {
        int i2 = this.f33848l;
        C6756l c6756l = this.f33847l;
        switch (i2) {
            case 0:
                Object obj = C6756l.f14155l;
                return c6756l.vip()[i];
            case 1:
                return new C6447l(c6756l, i);
            default:
                Object obj2 = C6756l.f14155l;
                return c6756l.metrica()[i];
        }
    }
}

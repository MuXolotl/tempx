package defpackage;

/* JADX INFO: renamed from: lٖؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2873l extends AbstractC15165l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C6756l f6236l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f6237l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2873l(C6756l c6756l, int i) {
        super(c6756l);
        this.f6237l = i;
        this.f6236l = c6756l;
    }

    @Override // defpackage.AbstractC15165l
    public final Object yandex(int i) {
        int i2 = this.f6237l;
        C6756l c6756l = this.f6236l;
        switch (i2) {
            case 0:
                return c6756l.isPro()[i];
            case 1:
                return new C2054l(c6756l, i);
            default:
                return c6756l.firebase()[i];
        }
    }
}

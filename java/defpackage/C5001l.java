package defpackage;

/* JADX INFO: renamed from: lٖؗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5001l extends AbstractC9397l implements InterfaceC0974l {
    public final void admob(EnumC9483l enumC9483l) {
        purchase();
        C13608l.isVip((C13608l) this.f19242l, enumC9483l);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return amazon();
    }

    public final void isPro(AbstractC15257l abstractC15257l) {
        purchase();
        C13608l.premium((C13608l) this.f19242l, abstractC15257l);
    }

    @Override // defpackage.InterfaceC0974l
    public final AbstractC13399l loadAd() {
        return this.f19243l;
    }

    public final void subs(String str) {
        purchase();
        C13608l.signatures((C13608l) this.f19242l, str);
    }
}

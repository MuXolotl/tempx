package defpackage;

/* JADX INFO: renamed from: lَٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17178l {
    public final /* synthetic */ AbstractC11801l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C17178l(AbstractC11801l abstractC11801l, int i) {
        this.yandex = i;
        this.loadAd = abstractC11801l;
    }

    public final void yandex(C10373l c10373l) {
        switch (this.yandex) {
            case 0:
                if (c10373l.f21170l != 3) {
                    C18730l c18730l = ((C18014l) this.loadAd).f35207l;
                    InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c18730l.purchase(c10373l.f21171l);
                    if (interfaceC7042l != null) {
                        interfaceC7042l.ads(null);
                        c18730l.mopub(c10373l.f21171l);
                    }
                }
                break;
        }
    }

    private final void loadAd(C10373l c10373l) {
    }
}

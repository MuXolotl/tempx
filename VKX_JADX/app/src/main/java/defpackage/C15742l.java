package defpackage;

/* JADX INFO: renamed from: lٕٗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15742l implements InterfaceC7658l {
    public final /* synthetic */ int yandex;

    public final String toString() {
        switch (this.yandex) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7658l
    public final boolean yandex(AbstractC12707l abstractC12707l) {
        switch (this.yandex) {
            case 0:
                return !(abstractC12707l instanceof InterfaceC0308l) || ((InterfaceC0308l) abstractC12707l).getChildren().size() == 0;
            case 1:
                return abstractC12707l.loadAd == null;
            default:
                return false;
        }
    }
}

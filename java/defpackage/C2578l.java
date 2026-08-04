package defpackage;

/* JADX INFO: renamed from: lّؔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2578l implements InterfaceC13342l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f5614l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5615l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5616l;

    public /* synthetic */ C2578l(Object obj, Object obj2, int i) {
        this.f5616l = i;
        this.f5615l = obj;
        this.f5614l = obj2;
    }

    @Override // defpackage.InterfaceC13342l
    public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
        int i = this.f5616l;
        Object obj = this.f5614l;
        Object obj2 = this.f5615l;
        switch (i) {
            case 0:
                AbstractActivityC14666l.billing((C16390l) obj2, (AbstractActivityC14666l) obj, enumC14812l);
                break;
            default:
                C2832l c2832l = (C2832l) obj;
                if (enumC14812l == ((EnumC14812l) obj2) && !AbstractC8576l.yandex(c2832l.amazon(), C17306l.yandex)) {
                    c2832l.amazon.setValue(c2832l.yandex());
                    break;
                }
                break;
        }
    }
}

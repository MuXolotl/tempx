package defpackage;

/* JADX INFO: renamed from: lٕؐؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15356l implements InterfaceC13342l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f30032l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30033l;

    public /* synthetic */ C15356l(int i, Object obj) {
        this.f30033l = i;
        this.f30032l = obj;
    }

    @Override // defpackage.InterfaceC13342l
    public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
        int i = this.f30033l;
        Object obj = this.f30032l;
        switch (i) {
            case 0:
                C17464l c17464l = (C17464l) obj;
                if (enumC14812l == EnumC14812l.ON_START) {
                    c17464l.crashlytics = true;
                } else if (enumC14812l == EnumC14812l.ON_STOP) {
                    c17464l.crashlytics = false;
                }
                break;
            default:
                AbstractC15391l abstractC15391l = (AbstractC15391l) obj;
                if (enumC14812l == EnumC14812l.ON_DESTROY) {
                    abstractC15391l.purchase();
                }
                break;
        }
    }
}

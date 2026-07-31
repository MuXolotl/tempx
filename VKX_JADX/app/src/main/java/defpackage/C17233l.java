package defpackage;

/* JADX INFO: renamed from: lۣٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17233l implements InterfaceC15209l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7292l f33445l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f33446l;

    public C17233l(C7292l c7292l, long j) {
        this.f33445l = c7292l;
        this.f33446l = j;
    }

    @Override // defpackage.InterfaceC15209l
    /* JADX INFO: renamed from: default */
    public final C2863l mo1544default() {
        return AbstractC11048l.loadAd(this.f33445l);
    }

    @Override // defpackage.InterfaceC15209l
    public final C8896l metrica(InterfaceC18212l interfaceC18212l) {
        return AbstractC7470l.isPro(smaato(interfaceC18212l), 0L);
    }

    @Override // defpackage.InterfaceC15209l
    public final long smaato(InterfaceC18212l interfaceC18212l) {
        InterfaceC18212l interfaceC18212l2 = (InterfaceC18212l) this.f33445l.f15142l.getValue();
        if (interfaceC18212l2 != null) {
            if (interfaceC18212l2.mopub()) {
                return interfaceC18212l.mo2590package(interfaceC18212l2.startapp(this.f33446l));
            }
            return 0L;
        }
        AbstractC14825l.amazon("Tried to open context menu before the anchor was placed.");
        C17132l.firebase();
        return 0L;
    }
}

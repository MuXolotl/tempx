package defpackage;

/* JADX INFO: renamed from: lؘؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3009l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6518l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f6519l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6520l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f6521l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f6522l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f6523l;

    public /* synthetic */ RunnableC3009l(C9716l c9716l, C13572l c13572l, C16543l c16543l, boolean z, C5807l c5807l) {
        this.f6518l = c9716l;
        this.f6522l = c13572l;
        this.f6521l = c16543l;
        this.f6519l = z;
        this.f6523l = c5807l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6520l;
        Object obj = this.f6523l;
        Object obj2 = this.f6521l;
        Object obj3 = this.f6522l;
        Object obj4 = this.f6518l;
        switch (i) {
            case 0:
                C5807l c5807l = (C5807l) obj;
                try {
                    ((C9716l) obj4).purchase((C13572l) obj3, (C16543l) obj2, this.f6519l);
                    c5807l.loadAd(null);
                    return;
                } catch (IllegalStateException e) {
                    c5807l.amazon(e);
                    return;
                }
            default:
                BinderC7189l binderC7189l = (BinderC7189l) obj4;
                InterfaceC1087l interfaceC1087l = (InterfaceC1087l) obj3;
                C16701l c16701l = (C16701l) obj2;
                C0176l c0176l = (C0176l) obj;
                boolean z = this.f6519l;
                binderC7189l.mopub.remove(interfaceC1087l);
                try {
                    try {
                        AbstractServiceC3639l abstractServiceC3639l = (AbstractServiceC3639l) binderC7189l.purchase.get();
                        if (abstractServiceC3639l != null) {
                            int i2 = c0176l.yandex;
                            int i3 = c0176l.loadAd;
                            C6499l c6499l = new C6499l(c16701l, i2, i3, z, new C1300l(interfaceC1087l, i3), c0176l.purchase);
                            C13572l c13572lSubs = abstractServiceC3639l.subs(c6499l);
                            if (c13572lSubs != null) {
                                abstractServiceC3639l.amazon(c13572lSubs);
                                c13572lSubs.yandex.mopub.crashlytics(interfaceC1087l, c6499l);
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        AbstractC2632l.purchase(interfaceC1087l);
                        throw th;
                    }
                } catch (Exception e2) {
                    AbstractC6427l.metrica("MSessionService", "Failed to add a session to session service", e2);
                    break;
                }
                AbstractC2632l.purchase(interfaceC1087l);
                return;
        }
    }

    public /* synthetic */ RunnableC3009l(BinderC7189l binderC7189l, InterfaceC1087l interfaceC1087l, C16701l c16701l, C0176l c0176l, boolean z) {
        this.f6518l = binderC7189l;
        this.f6522l = interfaceC1087l;
        this.f6521l = c16701l;
        this.f6523l = c0176l;
        this.f6519l = z;
    }
}

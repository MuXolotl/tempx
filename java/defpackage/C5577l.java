package defpackage;

/* JADX INFO: renamed from: lٍؘۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5577l implements InterfaceC11381l {
    public final /* synthetic */ AbstractC11801l amazon;
    public final /* synthetic */ InterfaceC8533l crashlytics;
    public final /* synthetic */ C10178l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C5577l(C10178l c10178l, InterfaceC8533l interfaceC8533l, AbstractC11801l abstractC11801l, int i) {
        this.yandex = i;
        this.loadAd = c10178l;
        this.crashlytics = interfaceC8533l;
        this.amazon = abstractC11801l;
    }

    @Override // defpackage.InterfaceC11381l
    public final void yandex(C15803l c15803l) {
        int i = this.yandex;
        AbstractC11801l abstractC11801l = this.amazon;
        InterfaceC8533l interfaceC8533l = this.crashlytics;
        C10178l c10178l = this.loadAd;
        switch (i) {
            case 0:
                C16854l c16854l = (C16854l) abstractC11801l;
                c15803l.invoke();
                if (c10178l.loadAd().f12057l.length() > 0) {
                    if (interfaceC8533l != null) {
                        ((C4666l) interfaceC8533l).yandex();
                    }
                    String string = c10178l.loadAd().f12057l.toString();
                    c16854l.m4203public(true);
                    c16854l.m4202instanceof("");
                    AbstractC10999l.mopub(AbstractC11990l.firebase(c16854l), null, 0, new C18731l(c16854l, string, null, 19), 3);
                }
                break;
            case 1:
                C4560l c4560l = (C4560l) abstractC11801l;
                c15803l.invoke();
                if (c10178l.loadAd().f12057l.length() > 0) {
                    if (interfaceC8533l != null) {
                        ((C4666l) interfaceC8533l).yandex();
                    }
                    String string2 = c10178l.loadAd().f12057l.toString();
                    c4560l.f9230l.setValue(Boolean.TRUE);
                    c4560l.f9236l.setValue("");
                    AbstractC10999l.mopub(AbstractC11990l.firebase(c4560l), null, 0, new C18731l(c4560l, string2, null, 20), 3);
                }
                break;
            default:
                C0996l c0996l = (C0996l) abstractC11801l;
                c15803l.invoke();
                if (c10178l.loadAd().f12057l.length() > 0) {
                    if (interfaceC8533l != null) {
                        ((C4666l) interfaceC8533l).yandex();
                    }
                    String string3 = c10178l.loadAd().f12057l.toString();
                    c0996l.f2743l.setValue(Boolean.TRUE);
                    c0996l.f2742l.setValue("");
                    AbstractC10999l.mopub(AbstractC11990l.firebase(c0996l), null, 0, new C18731l(c0996l, string3, null, 21), 3);
                }
                break;
        }
    }
}

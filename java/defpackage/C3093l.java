package defpackage;

/* JADX INFO: renamed from: lؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3093l implements InterfaceC1555l {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C3093l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }

    @Override // defpackage.InterfaceC1555l
    public final float yandex(float f) {
        int i = this.yandex;
        Object obj = this.crashlytics;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                C10987l c10987l = (C10987l) obj2;
                float fIsPro = c10987l.f22135l.isPro(f);
                float fAdmob = fIsPro - ((C13765l) c10987l.f22135l.subs).admob();
                ((C14061l) obj).yandex(fIsPro, 0.0f);
                return fAdmob;
            case 1:
                C4154l c4154l = (C4154l) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) c4154l.admob.invoke()).booleanValue()) {
                    return c4154l.purchase(c4154l.admob(((C15222l) obj).yandex(2, c4154l.billing(c4154l.subs(f)))));
                }
                throw new C16696l("The fling animation was cancelled", 0);
            default:
                C15389l c15389l = ((C8954l) obj2).mopub;
                float fAmazon = AbstractC8576l.amazon((Float.isNaN(((C13765l) c15389l.subs).admob()) ? 0.0f : ((C13765l) c15389l.subs).admob()) + f, c15389l.subs().purchase(), c15389l.subs().amazon());
                float fAdmob2 = fAmazon - ((C13765l) c15389l.subs).admob();
                ((C14061l) obj).yandex(fAmazon, 0.0f);
                return fAdmob2;
        }
    }
}

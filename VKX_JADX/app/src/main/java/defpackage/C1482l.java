package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؒۦٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1482l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15736l f3687l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3688l;

    public /* synthetic */ C1482l(C15736l c15736l, int i) {
        this.f3688l = i;
        this.f3687l = c15736l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zPurchase;
        int i = this.f3688l;
        C15736l c15736l = this.f3687l;
        switch (i) {
            case 0:
                zPurchase = AbstractC7000l.purchase(c15736l);
                break;
            default:
                C11905l c11905l = InterfaceC5389l.admob;
                InterfaceC5389l interfaceC5389l = c15736l.loadAd;
                c11905l.getClass();
                zPurchase = C11905l.loadAd(interfaceC5389l);
                break;
        }
        return Boolean.valueOf(zPurchase);
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْٚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13485l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ float f26480l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f26481l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26482l;

    public /* synthetic */ C13485l(Object obj, float f, int i) {
        this.f26482l = i;
        this.f26481l = obj;
        this.f26480l = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1372l c1372lBilling;
        C1372l c1372lBilling2;
        int i = this.f26482l;
        float f = this.f26480l;
        Object obj = this.f26481l;
        switch (i) {
            case 0:
                C16076l c16076l = (C16076l) obj;
                C16811l c16811l = c16076l.f31499l;
                if (c16811l == null || (c1372lBilling = c16811l.billing()) == null) {
                    return null;
                }
                C16811l c16811l2 = c16076l.f31499l;
                if (c16811l2 != null) {
                    c16811l2.loadAd(new C1372l(f, c1372lBilling.loadAd));
                }
                return Unit.INSTANCE;
            case 1:
                C16076l c16076l2 = (C16076l) obj;
                C16811l c16811l3 = c16076l2.f31499l;
                if (c16811l3 == null || (c1372lBilling2 = c16811l3.billing()) == null) {
                    return null;
                }
                C16811l c16811l4 = c16076l2.f31499l;
                if (c16811l4 != null) {
                    c16811l4.loadAd(new C1372l(c1372lBilling2.yandex, f));
                }
                return Unit.INSTANCE;
            default:
                return ((InterfaceC6407l) obj).yandex(f, C4565l.subs);
        }
    }
}

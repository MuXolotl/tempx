package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍٖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16285l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC12055l f31885l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31886l;

    public /* synthetic */ C16285l(AbstractC12055l abstractC12055l, int i) {
        this.f31886l = i;
        this.f31885l = abstractC12055l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C3827l c3827l;
        int i = this.f31886l;
        AbstractC12055l abstractC12055l = this.f31885l;
        switch (i) {
            case 0:
                AbstractC12055l abstractC12055l2 = this.f31885l;
                C6084l c6084l = abstractC12055l2.f23985l;
                return AbstractC4107l.loadAd(abstractC12055l2, c6084l.admob, c6084l.billing, C2580l.f5619l, (C12843l) abstractC12055l2.f23987l.getValue(), true);
            case 1:
                AbstractC12055l abstractC12055l3 = this.f31885l;
                if (!AbstractC7572l.admob(abstractC12055l3)) {
                    return abstractC12055l3.admob();
                }
                C6084l c6084l2 = abstractC12055l3.f23985l;
                return AbstractC4107l.loadAd(abstractC12055l3, c6084l2.admob, c6084l2.billing, C2580l.f5619l, (C12843l) abstractC12055l3.f23987l.getValue(), false);
            case 2:
                C4258l c4258l = abstractC12055l.f23985l.isPro;
                if (c4258l == null) {
                    c4258l = null;
                }
                return AbstractC10392l.metrica(c4258l, abstractC12055l.f23983l.mo1730private().getClassLoader(), (C12843l) abstractC12055l.f23987l.getValue(), AbstractC0601l.f2039l.amazon(abstractC12055l.loadAd()) ? null : new C16285l(abstractC12055l, 5));
            case 3:
                AbstractC0601l abstractC0601l = abstractC12055l.f23983l;
                C5160l c5160l = abstractC0601l instanceof C5160l ? (C5160l) abstractC0601l : null;
                C12843l c12843lCrashlytics = c5160l != null ? ((C16024l) c5160l.f11211l.getValue()).crashlytics() : null;
                C12843l c12843l = C12843l.amazon;
                return AbstractC17828l.crashlytics(abstractC12055l.f23985l.purchase, c12843lCrashlytics, abstractC12055l, abstractC0601l.mo1730private().getClassLoader());
            case 4:
                if (AbstractC0601l.f2039l.amazon(abstractC12055l.loadAd()) || (c3827l = AbstractC10565l.admob(abstractC12055l.f23985l).loadAd) == null) {
                    return null;
                }
                AbstractC0601l abstractC0601l2 = abstractC12055l.f23983l;
                if (abstractC0601l2 instanceof C9539l) {
                    try {
                        return ((C9539l) abstractC0601l2).f19443l.getDeclaredField(c3827l.loadAd);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                C8936l.smaato(abstractC12055l, "javaField is only supported for top-level properties for now: ");
                return null;
            default:
                return abstractC12055l.isPro().smaato();
        }
    }
}

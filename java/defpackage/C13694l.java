package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍْ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13694l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0867l f26735l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26736l;

    public /* synthetic */ C13694l(C0867l c0867l, int i) {
        this.f26736l = i;
        this.f26735l = c0867l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f26736l;
        C0867l c0867l = this.f26735l;
        C6806l c6806l = (C6806l) obj;
        switch (i) {
            case 0:
                c0867l.getClass();
                C17535l c17535l = c6806l.billing;
                C11911l c11911l = AbstractC3180l.loadAd;
                Unit unit = Unit.INSTANCE;
                c17535l.mopub(c11911l, unit);
                return unit;
            default:
                c0867l.getClass();
                C17535l c17535l2 = c6806l.billing;
                C11911l c11911l2 = AbstractC3180l.loadAd;
                Unit unit2 = Unit.INSTANCE;
                c17535l2.mopub(c11911l2, unit2);
                return unit2;
        }
    }
}

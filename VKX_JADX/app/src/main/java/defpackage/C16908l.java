package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟٗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16908l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f32973l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13550l f32974l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32975l;

    public /* synthetic */ C16908l(C13550l c13550l, int i, int i2) {
        this.f32975l = i2;
        this.f32974l = c13550l;
        this.f32973l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f32975l;
        int i2 = this.f32973l;
        C13550l c13550l = this.f32974l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c13550l.subs(c6956l, AbstractC0545l.purchase(i2 | 1));
                break;
            case 1:
                c13550l.isPro(c6956l, AbstractC0545l.purchase(i2 | 1));
                break;
            default:
                c13550l.admob(c6956l, AbstractC0545l.purchase(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

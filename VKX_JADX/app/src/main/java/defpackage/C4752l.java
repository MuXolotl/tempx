package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4752l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f9775l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13494l f9776l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9777l;

    public /* synthetic */ C4752l(C13494l c13494l, C15578l c15578l, int i) {
        this.f9777l = i;
        this.f9776l = c13494l;
        this.f9775l = c15578l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f9777l;
        C15578l c15578l = this.f9775l;
        C13494l c13494l = this.f9776l;
        int i2 = 1;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC8681l.yandex(AbstractC14566l.amazon(-241536773, new C4752l(c13494l, c15578l, i2), c6956l), c6956l, 6);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.yandex(c13494l.isPro, c15578l, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

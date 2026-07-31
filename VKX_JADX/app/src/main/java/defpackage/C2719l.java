package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔٙۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2719l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f5906l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f5907l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5908l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f5909l;

    public /* synthetic */ C2719l(C15578l c15578l, C15578l c15578l2, Function2 function2) {
        this.f5907l = c15578l;
        this.f5906l = c15578l2;
        this.f5909l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5908l;
        Function2 function2 = this.f5909l;
        C15578l c15578l = this.f5906l;
        C15578l c15578l2 = this.f5907l;
        C6956l c6956l = (C6956l) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC10464l.loadAd(c15578l2, c15578l, function2, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                num.getClass();
                AbstractC10464l.loadAd(c15578l2, c15578l, function2, c6956l, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C2719l(C15578l c15578l, C15578l c15578l2, Function2 function2, int i) {
        this.f5907l = c15578l;
        this.f5906l = c15578l2;
        this.f5909l = function2;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17979l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f35145l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f35146l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35147l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f35148l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f35149l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Function2 f35150l;

    public /* synthetic */ C17979l(C15578l c15578l, C15578l c15578l2, C15578l c15578l3, C15578l c15578l4, C15578l c15578l5) {
        this.f35146l = c15578l;
        this.f35145l = c15578l2;
        this.f35149l = c15578l3;
        this.f35148l = c15578l4;
        this.f35150l = c15578l5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35147l) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13319l.loadAd(this.f35146l, this.f35145l, this.f35149l, this.f35148l, this.f35150l, c6956l, 384);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC13319l.loadAd(this.f35146l, this.f35145l, this.f35149l, this.f35148l, this.f35150l, (C6956l) obj, AbstractC0545l.purchase(385));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C17979l(Function2 function2, Function2 function3, C15578l c15578l, Function2 function4, Function2 function5, int i) {
        this.f35146l = function2;
        this.f35145l = function3;
        this.f35149l = c15578l;
        this.f35148l = function4;
        this.f35150l = function5;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؓٝ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1993l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f4503l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16173l f4504l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4505l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f4506l;

    public /* synthetic */ C1993l(C16173l c16173l, C15578l c15578l, int i, int i2) {
        this.f4505l = i2;
        this.f4504l = c16173l;
        this.f4503l = c15578l;
        this.f4506l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4505l;
        int i2 = this.f4506l;
        C15578l c15578l = this.f4503l;
        C16173l c16173l = this.f4504l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC16763l.loadAd(c16173l, c15578l, c6956l, AbstractC0545l.purchase(i2 | 1));
                break;
            default:
                AbstractC1896l.loadAd(c16173l, c15578l, c6956l, AbstractC0545l.purchase(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

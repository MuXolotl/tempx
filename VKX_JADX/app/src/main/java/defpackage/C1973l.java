package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٜؓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1973l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4483l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f4484l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4485l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f4486l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f4487l;

    public /* synthetic */ C1973l(C12217l c12217l, boolean z, C15578l c15578l, int i, int i2) {
        this.f4485l = i2;
        this.f4484l = c12217l;
        this.f4483l = z;
        this.f4487l = c15578l;
        this.f4486l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4485l;
        int i2 = this.f4486l;
        C15578l c15578l = this.f4487l;
        boolean z = this.f4483l;
        C12217l c12217l = this.f4484l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC16763l.crashlytics(c12217l, z, c15578l, c6956l, AbstractC0545l.purchase(i2 | 1));
                break;
            default:
                AbstractC1896l.crashlytics(c12217l, z, c15578l, c6956l, AbstractC0545l.purchase(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

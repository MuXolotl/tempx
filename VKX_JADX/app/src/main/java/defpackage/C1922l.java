package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1922l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f4377l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C11194l f4378l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C14855l f4379l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4380l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4381l = 1;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f4382l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ long f4383l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f4384l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ int f4385l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f4386l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ float f4387l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f4388l;

    public /* synthetic */ C1922l(int i, InterfaceC17242l interfaceC17242l, long j, long j2, float f, C11194l c11194l, C14855l c14855l, C15578l c15578l, C15578l c15578l2, C15578l c15578l3, int i2) {
        this.f4380l = i;
        this.f4377l = interfaceC17242l;
        this.f4384l = j;
        this.f4383l = j2;
        this.f4387l = f;
        this.f4378l = c11194l;
        this.f4379l = c14855l;
        this.f4386l = c15578l;
        this.f4382l = c15578l2;
        this.f4388l = c15578l3;
        this.f4385l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4381l;
        int i2 = this.f4385l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                AbstractC6282l.yandex(this.f4387l, this.f4380l, iPurchase, this.f4384l, this.f4383l, this.f4379l, this.f4386l, this.f4382l, this.f4388l, (C6956l) obj, this.f4377l, this.f4378l);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                AbstractC6282l.loadAd(this.f4387l, this.f4380l, iPurchase2, this.f4384l, this.f4383l, this.f4379l, this.f4386l, this.f4382l, this.f4388l, (C6956l) obj, this.f4377l, this.f4378l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1922l(int i, InterfaceC17242l interfaceC17242l, C11194l c11194l, long j, long j2, float f, C14855l c14855l, C15578l c15578l, C15578l c15578l2, C15578l c15578l3, int i2) {
        this.f4380l = i;
        this.f4377l = interfaceC17242l;
        this.f4378l = c11194l;
        this.f4384l = j;
        this.f4383l = j2;
        this.f4387l = f;
        this.f4379l = c14855l;
        this.f4386l = c15578l;
        this.f4382l = c15578l2;
        this.f4388l = c15578l3;
        this.f4385l = i2;
    }
}

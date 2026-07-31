package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14067l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C14783l f27421l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ float f27422l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f27423l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f27424l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27425l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6347l f27426l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C11194l f27427l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f27428l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ long f27429l;

    public /* synthetic */ C14067l(InterfaceC17242l interfaceC17242l, C14783l c14783l, C12310l c12310l, C11194l c11194l, InterfaceC6347l interfaceC6347l, long j, float f, C15578l c15578l) {
        this.f27424l = interfaceC17242l;
        this.f27421l = c14783l;
        this.f27428l = c12310l;
        this.f27427l = c11194l;
        this.f27426l = interfaceC6347l;
        this.f27429l = j;
        this.f27422l = f;
        this.f27423l = c15578l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f27425l;
        Object obj3 = this.f27428l;
        switch (i) {
            case 0:
                C12310l c12310l = (C12310l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBilling = c6956l.billing(c12310l);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == C1867l.yandex) {
                        objM2132native = new C9636l(5, c12310l);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC14744l.yandex(this.f27424l, this.f27421l, (Function0) objM2132native, this.f27427l, this.f27426l, this.f27429l, this.f27422l, this.f27423l, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC14744l.yandex(this.f27424l, this.f27421l, (Function0) obj3, this.f27427l, this.f27426l, this.f27429l, this.f27422l, this.f27423l, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14067l(InterfaceC17242l interfaceC17242l, C14783l c14783l, Function0 function0, C11194l c11194l, InterfaceC6347l interfaceC6347l, long j, float f, C15578l c15578l, int i) {
        this.f27424l = interfaceC17242l;
        this.f27421l = c14783l;
        this.f27428l = function0;
        this.f27427l = c11194l;
        this.f27426l = interfaceC6347l;
        this.f27429l = j;
        this.f27422l = f;
        this.f27423l = c15578l;
    }
}

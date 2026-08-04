package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُؖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4046l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8332l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f8333l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f8334l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8335l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8336l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f8337l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f8338l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ int f8339l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f8340l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f8341l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4046l(C7091l c7091l, C5056l c5056l, Object obj, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC17242l interfaceC17242l2, C15578l c15578l, int i, int i2) {
        super(2);
        this.f8335l = 2;
        this.f8341l = c7091l;
        this.f8337l = c5056l;
        this.f8340l = obj;
        this.f8338l = interfaceC17242l;
        this.f8332l = z;
        this.f8333l = interfaceC17242l2;
        this.f8334l = c15578l;
        this.f8339l = i;
        this.f8336l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8335l;
        Object obj3 = this.f8340l;
        int i2 = this.f8339l;
        Object obj4 = this.f8333l;
        Object obj5 = this.f8337l;
        Object obj6 = this.f8341l;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                int i3 = this.f8336l;
                boolean z = this.f8332l;
                InterfaceC17242l interfaceC17242l = this.f8338l;
                AbstractC3308l.crashlytics((InterfaceC15451l) obj6, z, interfaceC17242l, (C3000l) obj5, (C0274l) obj3, (String) obj4, this.f8334l, (C6956l) obj, iPurchase, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                int i4 = this.f8336l;
                boolean z2 = this.f8332l;
                InterfaceC17242l interfaceC17242l2 = this.f8338l;
                AbstractC3308l.loadAd((C0397l) obj6, z2, interfaceC17242l2, (C3000l) obj5, (C0274l) obj3, (String) obj4, this.f8334l, (C6956l) obj, iPurchase2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iPurchase3 = AbstractC0545l.purchase(i2 | 1);
                int i5 = this.f8336l;
                Object obj7 = this.f8340l;
                InterfaceC17242l interfaceC17242l3 = this.f8338l;
                boolean z3 = this.f8332l;
                AbstractC12953l.admob((C7091l) obj6, (C5056l) obj5, obj7, interfaceC17242l3, z3, (InterfaceC17242l) obj4, this.f8334l, (C6956l) obj, iPurchase3, i5);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4046l(Object obj, boolean z, InterfaceC17242l interfaceC17242l, C3000l c3000l, C0274l c0274l, String str, C15578l c15578l, int i, int i2, int i3) {
        super(2);
        this.f8335l = i3;
        this.f8341l = obj;
        this.f8332l = z;
        this.f8338l = interfaceC17242l;
        this.f8337l = c3000l;
        this.f8340l = c0274l;
        this.f8333l = str;
        this.f8334l = c15578l;
        this.f8339l = i;
        this.f8336l = i2;
    }
}

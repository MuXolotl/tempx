package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙؚۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7109l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f14878l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f14879l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14880l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f14881l;

    public /* synthetic */ C7109l(float f, EnumC9931l enumC9931l, C15578l c15578l) {
        this.f14879l = f;
        this.f14878l = enumC9931l;
        this.f14881l = c15578l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f14880l;
        Object obj3 = this.f14881l;
        float f = this.f14879l;
        Object obj4 = this.f14878l;
        int i2 = 2;
        switch (i) {
            case 0:
                EnumC9931l enumC9931l = (EnumC9931l) obj4;
                C15578l c15578l = (C15578l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7039l.amazon(null, new C7537l(8.0f, true, new C8339l(12)), new C7537l(f, true, new C8339l(12)), null, 0, 0, AbstractC14566l.amazon(879927511, new C7442l(enumC9931l, c15578l, 4), c6956l), c6956l, 1572864, 57);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C18113l c18113l = (C18113l) obj4;
                C11749l c11749l = (C11749l) obj3;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    long j = C9735l.isPro;
                    long j2 = C9735l.purchase;
                    C14282l c14282lBilling = AbstractC0831l.billing(j, 0L, j2, j2, j2, c6956l2, 34);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                    boolean zCrashlytics = c6956l2.crashlytics(f);
                    Object objM2132native = c6956l2.m2132native();
                    if (zCrashlytics || objM2132native == C1867l.yandex) {
                        objM2132native = new C14157l(i2, f);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC18079l.amazon(AbstractC1214l.yandex, AbstractC6710l.mopub(interfaceC17242lAmazon, c18113l, (Function1) objM2132native), AbstractC14566l.amazon(1437092090, new C8973l(c11749l), c6956l2), null, 0.0f, null, c14282lBilling, null, null, c6956l2, 390, 440);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C7109l(C18113l c18113l, float f, C11749l c11749l) {
        this.f14878l = c18113l;
        this.f14879l = f;
        this.f14881l = c11749l;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؓۗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2050l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f4582l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f4583l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4584l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f4585l;

    public /* synthetic */ C2050l(C6473l c6473l, InterfaceC17242l interfaceC17242l, long j, int i) {
        this.f4584l = 5;
        this.f4582l = c6473l;
        this.f4585l = interfaceC17242l;
        this.f4583l = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4584l;
        boolean z = false;
        Object obj3 = this.f4585l;
        Object obj4 = this.f4582l;
        switch (i) {
            case 0:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj4;
                Function3 function3 = (Function3) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC3383l.billing(this.f4583l, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.remoteconfig, AbstractC14566l.amazon(417635459, new C7393l(interfaceC11780l, function3, z ? 1 : 0), c6956l), c6956l, 384);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj4;
                C15578l c15578l = (C15578l) obj3;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC3383l.billing(this.f4583l, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.remoteconfig, AbstractC14566l.amazon(-2115100680, new Cpublic(interfaceC11780l2, c15578l, 26), c6956l2), c6956l2, 384);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC9962l.yandex((C7473l) obj4, this.f4583l, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(385));
                break;
            case 3:
                C15851l c15851l = (C15851l) obj4;
                String str = (String) obj3;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C17253l c17253l = C12719l.yandex;
                    C13412l c13412lSubs = C12719l.subs(this.f4583l, 0L, c6956l3, 13);
                    boolean zBilling = c6956l3.billing(c15851l);
                    Object objM2132native = c6956l3.m2132native();
                    if (zBilling || objM2132native == C1867l.yandex) {
                        objM2132native = new C8905l(c15851l, 1);
                        c6956l3.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, c13412lSubs, null, AbstractC14566l.amazon(521110564, new C12273l(str, 4), c6956l3), c6956l3, 805306368, 494);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((C0675l) obj4).m666import(this.f4583l, (String) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C6473l) obj4).m2017import(AbstractC0545l.purchase(3073), this.f4583l, (C6956l) obj, (InterfaceC17242l) obj3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C2050l(int i, long j, Object obj, Object obj2) {
        this.f4584l = i;
        this.f4583l = j;
        this.f4582l = obj;
        this.f4585l = obj2;
    }

    public /* synthetic */ C2050l(Object obj, long j, Object obj2, int i, int i2) {
        this.f4584l = i2;
        this.f4582l = obj;
        this.f4583l = j;
        this.f4585l = obj2;
    }
}

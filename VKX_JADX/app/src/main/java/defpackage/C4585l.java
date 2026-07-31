package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4585l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C14089l f9317l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13264l f9318l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9319l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f9320l;

    public /* synthetic */ C4585l(C14089l c14089l, AbstractC13264l abstractC13264l, InterfaceC2262l interfaceC2262l) {
        this.f9319l = 2;
        this.f9317l = c14089l;
        this.f9318l = abstractC13264l;
        this.f9320l = interfaceC2262l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f9319l;
        InterfaceC2262l interfaceC2262l = this.f9320l;
        AbstractC13264l abstractC13264l = this.f9318l;
        C14089l c14089l = this.f9317l;
        boolean z = false;
        int i2 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    AbstractC18079l.amazon(AbstractC14566l.amazon(1442820650, new C4585l(abstractC13264l, c14089l, interfaceC2262l, i2), c6956l), null, AbstractC14566l.amazon(626773420, new C2295l(c14089l), c6956l), AbstractC17828l.crashlytics, 0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).purchase(c6956l), AbstractC0831l.billing(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp, 0L, 0L, 0L, 0L, c6956l, 62), null, null, c6956l, 3462, 402);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC6282l.yandex(16.0f, ((C15308l) abstractC13264l.amazon.f32506l).admob(), 918752256, C9735l.isPro, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel, C18450l.f36043l, AbstractC14566l.amazon(-665590852, new C8005l(abstractC13264l, i2), c6956l2), AbstractC17828l.yandex, AbstractC14566l.amazon(-1755123617, new C4585l(c14089l, abstractC13264l, interfaceC2262l), c6956l2), c6956l2, AbstractC15042l.adcel(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), AbstractC15042l.Signature()), null);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int i3 = 0;
                    for (Object obj3 : c14089l.f27450l) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC14055l.subscription();
                            throw null;
                        }
                        int iIntValue4 = ((Number) obj3).intValue();
                        boolean z2 = ((C15308l) abstractC13264l.amazon.f32506l).admob() == i3;
                        long j = ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).yandex.yandex;
                        long j2 = ((C9735l) c6956l3.isPro(AbstractC12502l.yandex)).yandex;
                        boolean zAdmob = c6956l3.admob(interfaceC2262l) | c6956l3.billing(abstractC13264l) | c6956l3.amazon(i3);
                        Object objM2132native = c6956l3.m2132native();
                        if (zAdmob || objM2132native == C1867l.yandex) {
                            objM2132native = new C18695l(interfaceC2262l, abstractC13264l, i3);
                            c6956l3.m2147try(objM2132native);
                        }
                        AbstractC12853l.loadAd(z2, (Function0) objM2132native, null, false, AbstractC14566l.amazon(-431782259, new C4314l(iIntValue4, 23, z ? (byte) 1 : (byte) 0), c6956l3), j, j2, c6956l3, 24576);
                        i3 = i4;
                    }
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C4585l(AbstractC13264l abstractC13264l, C14089l c14089l, InterfaceC2262l interfaceC2262l, int i) {
        this.f9319l = i;
        this.f9318l = abstractC13264l;
        this.f9317l = c14089l;
        this.f9320l = interfaceC2262l;
    }
}

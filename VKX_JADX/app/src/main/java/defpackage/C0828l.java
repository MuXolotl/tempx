package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؒؕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0828l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f2469l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f2470l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2471l;

    public /* synthetic */ C0828l(InterfaceC2262l interfaceC2262l, InterfaceC8714l interfaceC8714l, int i) {
        this.f2471l = i;
        this.f2470l = interfaceC2262l;
        this.f2469l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f2471l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        InterfaceC8714l interfaceC8714l = this.f2469l;
        InterfaceC2262l interfaceC2262l = this.f2470l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.billing(interfaceC8714l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new Ctry(interfaceC2262l, interfaceC8714l, 9);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13319l.yandex(AbstractC0837l.firebase, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, AbstractC0837l.smaato, null, AbstractC14566l.amazon(-610687611, new Cpublic(interfaceC2262l, interfaceC8714l, 7), c6956l), null, c6956l, 199686, 468);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z = ((C4700l) interfaceC8714l.getValue()).f9550l;
                    boolean zAdmob2 = c6956l2.admob(interfaceC2262l) | c6956l2.billing(interfaceC8714l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C3005l(interfaceC2262l, interfaceC8714l, 6);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC13402l.yandex(z, (Function1) objM2132native2, AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), c6956l2, 384);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌۚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9035l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f18595l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18596l;

    public /* synthetic */ C9035l(long j, int i) {
        this.f18596l = i;
        this.f18595l = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f18596l) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                ((Integer) obj3).getClass();
                AbstractC1544l.admob(this.f18595l, c6956l);
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC8020l.smaato(null);
                    c6956l.m2147try(objM2132native);
                }
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                long j = c6956l.f14595continue;
                int i = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, C4346l.f8873l);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i), C3438l.isPro);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                Function2 function2 = (Function2) interfaceC8714l.getValue();
                if (function2 == null) {
                    c6956l.m2123default(-657207800);
                } else {
                    c6956l.m2123default(671536409);
                    function2.invoke(c6956l, 0);
                }
                c6956l.startapp(false);
                c6956l.startapp(true);
                break;
            default:
                C15851l c15851l = (C15851l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l2.billing(c15851l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    C10707l c10707l = AbstractC5992l.yandex;
                    AbstractC13106l.crashlytics(c15851l, null, null, this.f18595l, ((C18718l) c6956l2.isPro(c10707l)).loadAd, ((C18718l) c6956l2.isPro(c10707l)).yandex, ((C18718l) c6956l2.isPro(c10707l)).yandex, ((C18718l) c6956l2.isPro(c10707l)).loadAd, c6956l2, iIntValue & 14, 14);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9525l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11390l f19424l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19425l;

    public /* synthetic */ C9525l(C11390l c11390l, int i) {
        this.f19425l = i;
        this.f19424l = c11390l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        C4346l c4346l;
        int i;
        int i2 = this.f19425l;
        C11390l c11390l = this.f19424l;
        int i3 = 2;
        switch (i2) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i4 = 1;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7876l.yandex(null, AbstractC14566l.amazon(-1231840507, new C9525l(c11390l, i4), c6956l), c6956l, 48, 1);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
                    long j = c6956l2.f14595continue;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    C4346l c4346l2 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    C11362l c11362l = c11390l.mopub;
                    boolean z = c11390l.crashlytics;
                    if (c11362l.isEmpty()) {
                        f = 1.0f;
                        c4346l = c4346l2;
                        i = -730848217;
                        c6956l2.m2123default(-730848217);
                    } else {
                        c6956l2.m2123default(-728126417);
                        long j2 = C9735l.isPro;
                        long j3 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        int iAdmob = c11390l.billing.admob();
                        C14855l c14855l = z ? C18450l.f36035l : C18450l.f36043l;
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l2, 1.0f);
                        C15578l c15578lAmazon = AbstractC14566l.amazon(-1430438936, new C1350l(5, c11390l), c6956l2);
                        C15578l c15578lAmazon2 = AbstractC14566l.amazon(-1193519669, new C9525l(c11390l, i3), c6956l2);
                        i = -730848217;
                        c4346l = c4346l2;
                        f = 1.0f;
                        AbstractC6282l.yandex(16.0f, iAdmob, 906169392, j2, j3, c14855l, c15578lAmazon, AbstractC3352l.yandex, c15578lAmazon2, c6956l2, interfaceC17242lAmazon, null);
                        c6956l2 = c6956l2;
                    }
                    c6956l2.startapp(false);
                    if (z) {
                        c6956l2.m2123default(-726154662);
                        AbstractC0555l.loadAd(AbstractC0080l.amazon(c4346l, f), 0.0f, 0L, c6956l2, 6, 6);
                    } else {
                        c6956l2.m2123default(i);
                    }
                    c6956l2.startapp(false);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ListIterator listIterator = c11390l.mopub.listIterator();
                    int i6 = 0;
                    while (true) {
                        C13376l c13376l = (C13376l) listIterator;
                        if (c13376l.hasNext()) {
                            Object next = c13376l.next();
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                AbstractC14055l.subscription();
                                throw null;
                            }
                            String str = (String) next;
                            boolean z2 = c11390l.billing.admob() == i6;
                            long j4 = ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).yandex.yandex;
                            long j5 = ((C9735l) c6956l3.isPro(AbstractC12502l.yandex)).yandex;
                            boolean zAdmob = c6956l3.admob(c11390l) | c6956l3.amazon(i6);
                            Object objM2132native = c6956l3.m2132native();
                            if (zAdmob || objM2132native == C1867l.yandex) {
                                objM2132native = new C8803l(c11390l, i6, i3);
                                c6956l3.m2147try(objM2132native);
                            }
                            AbstractC12853l.loadAd(z2, (Function0) objM2132native, null, false, AbstractC14566l.amazon(-1128372481, new C4210l(str, 4), c6956l3), j4, j5, c6956l3, 24576);
                            i6 = i7;
                        }
                    }
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}

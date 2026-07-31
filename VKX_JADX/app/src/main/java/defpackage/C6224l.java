package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؙؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6224l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f13155l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13156l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13157l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f13158l;

    public /* synthetic */ C6224l(long j, C11090l c11090l, Function2 function2) {
        this.f13157l = 2;
        this.f13158l = j;
        this.f13156l = c11090l;
        this.f13155l = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f13157l;
        C16589l c16589l = C16589l.yandex;
        long j = this.f13158l;
        int i2 = 2;
        int i3 = 0;
        Object obj4 = this.f13155l;
        Object obj5 = this.f13156l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                ((Integer) obj3).getClass();
                AbstractC1889l.yandex(AbstractC13542l.loadAd(c6956l), C9224l.billing, AbstractC14566l.amazon(-545459298, new C14560l((Bitmap) obj5, i3), c6956l), c6956l, 384, 0);
                AbstractC7370l.yandex(AbstractC17307l.isPro(((C15922l) obj).yandex(new C4538l(c16589l)), AbstractC13542l.loadAd, 2), AbstractC14566l.amazon(421449350, new C17862l((C3259l) obj4, j, i3), c6956l), c6956l, 3072);
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                AbstractC1889l.yandex(new C4538l(C1617l.yandex), C9224l.purchase, AbstractC14566l.amazon(-960187136, new C14560l((Bitmap) obj5, i2), c6956l2), c6956l2, 384, 0);
                AbstractC7370l.yandex(AbstractC17307l.firebase(new C8079l(c16589l), AbstractC13542l.loadAd, 13), AbstractC14566l.amazon(-2101296664, new C17862l((C3259l) obj4, j, 3), c6956l2), c6956l2, 3072);
                break;
            default:
                C11090l c11090l = (C11090l) obj5;
                Function2 function2 = (Function2) obj4;
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l3.billing(interfaceC17242l) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j2 = c6956l3.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC15042l.purchase(this.f13158l, c11090l, function2, c6956l3, 0);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6224l(Bitmap bitmap, C3259l c3259l, long j, int i) {
        this.f13157l = i;
        this.f13156l = bitmap;
        this.f13155l = c3259l;
        this.f13158l = j;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑٔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0325l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f1369l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1370l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1371l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f1372l;

    public /* synthetic */ C0325l(C1774l c1774l, int i, InterfaceC8714l interfaceC8714l) {
        this.f1369l = c1774l;
        this.f1370l = i;
        this.f1372l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f1371l;
        C13863l c13863l = C1867l.yandex;
        int i2 = this.f1370l;
        Object obj4 = this.f1372l;
        Object obj5 = this.f1369l;
        int i3 = 0;
        switch (i) {
            case 0:
                C1774l c1774l = (C1774l) obj5;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zAdmob = c6956l.admob(c1774l) | c6956l.amazon(AbstractC5020l.inmobi(i2)) | c6956l.billing(interfaceC12244l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C8608l(c1774l, i2, interfaceC12244l, i3);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(null, null, interfaceC11780l, null, null, null, false, null, (Function1) objM2132native, c6956l, (iIntValue << 6) & 896, 507);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                String str = (String) obj5;
                String str2 = (String) obj4;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
                    long j = c6956l2.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_article_outline_28, 0, c6956l2);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, c6956l2, 56, 4);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = "8.14.1_pub (100136) -> " + str2 + " (" + i2 + ')';
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC13010l.loadAd((String) objM2132native2, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.firebase, c6956l2, 6, 0, 131066);
                    c6956l2.startapp(true);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
                    AbstractC13010l.loadAd(str, AbstractC13841l.purchase(AbstractC3605l.smaato(c4346l, 16.0f), AbstractC13841l.crashlytics(c6956l2), true), ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.firebase, c6956l2, 0, 0, 131064);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0325l(String str, int i, String str2) {
        this.f1369l = str;
        this.f1372l = str2;
        this.f1370l = i;
    }
}

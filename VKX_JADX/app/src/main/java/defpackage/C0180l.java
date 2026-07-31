package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0180l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f1129l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5803l f1130l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1131l;

    public /* synthetic */ C0180l(C5803l c5803l, InterfaceC12244l interfaceC12244l, int i) {
        this.f1131l = i;
        this.f1130l = c5803l;
        this.f1129l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1131l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        InterfaceC12244l interfaceC12244l = this.f1129l;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C10707l c10707l = AbstractC16964l.yandex;
                    long j = ((C14370l) c6956l.isPro(c10707l)).yandex.startapp;
                    C9946l c9946l = AbstractC16837l.yandex;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(c4346l, j, c9946l);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
                    long j2 = c6956l.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    C5587l c5587l = AbstractC10439l.yandex;
                    C5803l c5803l = this.f1130l;
                    AbstractC18079l.amazon(AbstractC10704l.yandex, null, AbstractC14566l.amazon(-1585825304, new C6790l(c5803l, i2), c6956l), null, 0.0f, c5587l, null, null, null, c6956l, 196998, 474);
                    String str = (String) interfaceC12244l.getValue();
                    boolean zAdmob = c6956l.admob(c5803l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C15406l c15406l = new C15406l(1, c5803l, C5803l.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 13);
                        c6956l.m2147try(c15406l);
                        objM2132native = c15406l;
                    }
                    AbstractC10704l.purchase(str, (Function1) ((InterfaceC5059l) objM2132native), null, AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC0080l.amazon(AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), ((C14370l) c6956l.isPro(c10707l)).crashlytics.crashlytics), ((C14370l) c6956l.isPro(c10707l)).yandex.ads, c9946l), null, AbstractC10704l.crashlytics, AbstractC10704l.amazon, AbstractC14566l.amazon(-148507510, new C0180l(c5803l, interfaceC12244l, i3), c6956l), null, null, c6956l, 14352384, 788);
                    AbstractC0555l.loadAd(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0L, c6956l, 6, 6);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (((String) interfaceC12244l.getValue()).length() > 0) {
                        c6956l2.m2123default(-370851513);
                        AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_cancel_outline_28, 0, c6956l2);
                        InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 20.0f);
                        C5803l c5803l2 = this.f1130l;
                        boolean zAdmob2 = c6956l2.admob(c5803l2);
                        Object objM2132native2 = c6956l2.m2132native();
                        if (zAdmob2 || objM2132native2 == c13863l) {
                            objM2132native2 = new C10740l(16, c5803l2);
                            c6956l2.m2147try(objM2132native2);
                        }
                        AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC9151l.loadAd(interfaceC17242lIsPro, false, null, (Function0) objM2132native2, 15), 0L, c6956l2, 56, 8);
                    } else {
                        c6956l2.m2123default(-375202952);
                    }
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

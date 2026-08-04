package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُۗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11261l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C18297l f22689l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f22690l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C0228l f22691l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1234l f22692l;

    public C11261l(C0228l c0228l, String str, C18297l c18297l, InterfaceC1234l interfaceC1234l) {
        this.f22691l = c0228l;
        this.f22690l = str;
        this.f22689l = c18297l;
        this.f22692l = interfaceC1234l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(24.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j = c6956l.f14595continue;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C0228l c0228l = this.f22691l;
            C12376l c12376l = c0228l.f1205l;
            String str = this.f22690l;
            Object obj4 = c12376l.get(str);
            EnumC11199l enumC11199l = EnumC11199l.f22550l;
            C13863l c13863l = C1867l.yandex;
            if (obj4 == enumC11199l) {
                c6956l.m2123default(1445906834);
                AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_add, 0, c6956l);
                long j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 18.0f);
                boolean zAdmob = c6956l.admob(c0228l) | c6956l.billing(str);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == c13863l) {
                    objM2132native = new C6560l(c0228l, str, 0);
                    c6956l.m2147try(objM2132native);
                }
                AbstractC4597l.loadAd(abstractC14165lCrashlytics, "Undo", AbstractC9151l.loadAd(interfaceC17242lIsPro, false, null, (Function0) objM2132native, 15), j2, c6956l, 56, 0);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(1446698264);
                AbstractC14165l abstractC14165lCrashlytics2 = AbstractC16759l.crashlytics(R.drawable.ic_delete_outline_android_28, 0, c6956l);
                long j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                InterfaceC17242l interfaceC17242lIsPro2 = AbstractC0080l.isPro(c4346l, 18.0f);
                boolean zAdmob2 = c6956l.admob(c0228l) | c6956l.billing(str);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob2 || objM2132native2 == c13863l) {
                    objM2132native2 = new C6560l(c0228l, str, 1);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC4597l.loadAd(abstractC14165lCrashlytics2, "Delete", AbstractC9151l.loadAd(interfaceC17242lIsPro2, false, null, (Function0) objM2132native2, 15), j3, c6956l, 56, 0);
                c6956l.startapp(false);
            }
            InterfaceC1234l interfaceC1234l = this.f22692l;
            boolean zAdmob3 = c6956l.admob(interfaceC1234l);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob3 || objM2132native3 == c13863l) {
                objM2132native3 = new C7991l(interfaceC1234l, 0);
                c6956l.m2147try(objM2132native3);
            }
            Function1 function1 = (Function1) objM2132native3;
            boolean zAdmob4 = c6956l.admob(interfaceC1234l);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob4 || objM2132native4 == c13863l) {
                objM2132native4 = new C11985l(interfaceC1234l, 0);
                c6956l.m2147try(objM2132native4);
            }
            InterfaceC17242l interfaceC17242lSubs = AbstractC14055l.subs(this.f22689l, null, function1, (Function0) objM2132native4, 19);
            Object objM2132native5 = c6956l.m2132native();
            if (objM2132native5 == c13863l) {
                objM2132native5 = C15152l.f29729l;
                c6956l.m2147try(objM2132native5);
            }
            AbstractC7470l.billing((Function0) objM2132native5, interfaceC17242lSubs, false, null, null, null, AbstractC11184l.tapsense, c6956l, 1572870, 60);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}

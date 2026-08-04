package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16270l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C14267l f31838l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0483l f31839l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31840l;

    public /* synthetic */ C16270l(C0483l c0483l, C14267l c14267l, int i) {
        this.f31840l = i;
        this.f31839l = c0483l;
        this.f31838l = c14267l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31840l;
        C13863l c13863l = C1867l.yandex;
        C0483l c0483l = this.f31839l;
        C14267l c14267l = this.f31838l;
        int i2 = 2;
        int i3 = 0;
        switch (i) {
            case 0:
                boolean z = false;
                C9879l c9879l = c0483l.yandex;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    z = true;
                }
                if (c6956l.m2127for(1 & iIntValue, z)) {
                    int i4 = c14267l.vip;
                    int i5 = c14267l.metrica;
                    C11362l c11362l = c9879l.remoteconfig;
                    boolean zAdmob = c6956l.admob(c9879l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C2176l c2176l = new C2176l(1, c9879l, C9879l.class, "setVolume", "setVolume(I)V", 0, 0, 10);
                        c6956l.m2147try(c2176l);
                        objM2132native = c2176l;
                    }
                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native;
                    boolean zAdmob2 = c6956l.admob(c9879l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        Cconst cconst = new Cconst(0, c9879l, C9879l.class, "volumeDown", "volumeDown()V", 0, 0, 12);
                        c6956l.m2147try(cconst);
                        objM2132native2 = cconst;
                    }
                    InterfaceC5059l interfaceC5059l2 = (InterfaceC5059l) objM2132native2;
                    boolean zAdmob3 = c6956l.admob(c9879l);
                    Object objM2132native3 = c6956l.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        Cconst cconst2 = new Cconst(0, c9879l, C9879l.class, "volumeUp", "volumeUp()V", 0, 0, 13);
                        c6956l.m2147try(cconst2);
                        objM2132native3 = cconst2;
                    }
                    InterfaceC5059l interfaceC5059l3 = (InterfaceC5059l) objM2132native3;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(C4346l.f8873l, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    boolean zAdmob4 = c6956l.admob(c0483l);
                    Object objM2132native4 = c6956l.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C0742l(c0483l, i2);
                        c6956l.m2147try(objM2132native4);
                    }
                    Function1 function1 = (Function1) objM2132native4;
                    boolean zAdmob5 = c6956l.admob(c0483l);
                    Object objM2132native5 = c6956l.m2132native();
                    if (zAdmob5 || objM2132native5 == c13863l) {
                        objM2132native5 = new C1657l(c0483l, 4);
                        c6956l.m2147try(objM2132native5);
                    }
                    AbstractC5578l.yandex(i4, i5, c11362l, function1, (Function0) objM2132native5, (Function0) interfaceC5059l2, (Function1) interfaceC5059l, (Function0) interfaceC5059l3, interfaceC17242lStartapp, c6956l, 100663296);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0483l c0483l2 = this.f31839l;
                    c0483l2.firebase(c0483l2.vip(), c14267l.isPro, c14267l.firebase != null, c14267l.smaato, c0483l2.yandex.firebase, c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zAdmob6 = c6956l3.admob(c0483l);
                    Object objM2132native6 = c6956l3.m2132native();
                    if (zAdmob6 || objM2132native6 == c13863l) {
                        objM2132native6 = new C1657l(c0483l, i3);
                        c6956l3.m2147try(objM2132native6);
                    }
                    C5795l.loadAd((Function0) objM2132native6, AbstractC14566l.amazon(1544765338, new C15707l(0, c14267l), c6956l3), AbstractC14566l.amazon(1601578779, new C8096l(c0483l, i3), c6956l3), AbstractC3605l.vip(C16170l.yandex.yandex(C4346l.f8873l, C18450l.f36017l), 16.0f, 0.0f, 2), c6956l3, 432);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (c14267l.subs) {
                        c6956l4.m2123default(-1262661644);
                    } else {
                        c6956l4.m2123default(-1245150922);
                        c0483l.billing(c0483l.yandex.subs(), c6956l4, 0);
                    }
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C16270l(C14267l c14267l, C0483l c0483l, int i) {
        this.f31840l = i;
        this.f31838l = c14267l;
        this.f31839l = c0483l;
    }
}

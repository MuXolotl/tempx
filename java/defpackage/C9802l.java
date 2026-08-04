package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍۚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9802l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9879l f19980l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19981l;

    public /* synthetic */ C9802l(C9879l c9879l, int i) {
        this.f19981l = 4;
        this.f19980l = c9879l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19981l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        C9879l c9879l = this.f19980l;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c9879l.loadAd(AbstractC0080l.crashlytics(c4346l, 1.0f), c6956l, 6);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zAdmob = c6956l2.admob(c9879l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C1224l(c9879l, i3);
                        c6956l2.m2147try(objM2132native);
                    }
                    Function0 function0 = (Function0) objM2132native;
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(AbstractC0080l.amazon(c4346l, 1.0f), 2.0f);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = new C4100l(12);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC4332l.loadAd(function0, interfaceC17242lPurchase, 0L, 0L, 2, 0.0f, (Function1) objM2132native2, c6956l2, 1769520, 12);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zAdmob2 = c6956l3.admob(c9879l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C1224l(c9879l, i2);
                        c6956l3.m2147try(objM2132native3);
                    }
                    Function0 function1 = (Function0) objM2132native3;
                    InterfaceC17242l interfaceC17242lPurchase2 = AbstractC0080l.purchase(AbstractC0080l.amazon(c4346l, 1.0f), 2.0f);
                    Object objM2132native4 = c6956l3.m2132native();
                    if (objM2132native4 == c13863l) {
                        objM2132native4 = new C4100l(13);
                        c6956l3.m2147try(objM2132native4);
                    }
                    AbstractC4332l.loadAd(function1, interfaceC17242lPurchase2, 0L, 0L, 2, 0.0f, (Function1) objM2132native4, c6956l3, 1769520, 12);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C9879l c9879l2 = this.f19980l;
                    boolean zAdmob3 = c6956l4.admob(c9879l2);
                    Object objM2132native5 = c6956l4.m2132native();
                    if (zAdmob3 || objM2132native5 == c13863l) {
                        C6335l c6335l = new C6335l(0, c9879l2, C9879l.class, "discardQueueRestoration", "discardQueueRestoration()V", 0, 0, 12);
                        c6956l4.m2147try(c6335l);
                        objM2132native5 = c6335l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native5), null, false, null, null, null, AbstractC9637l.loadAd, c6956l4, 1572864, 62);
                } else {
                    c6956l4.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c9879l.amazon((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C9802l(C9879l c9879l, int i, byte b) {
        this.f19981l = i;
        this.f19980l = c9879l;
    }
}

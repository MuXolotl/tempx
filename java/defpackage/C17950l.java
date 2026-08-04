package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17950l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f34936l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9430l f34937l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34938l;

    public /* synthetic */ C17950l(C9430l c9430l, InterfaceC12244l interfaceC12244l, int i) {
        this.f34938l = i;
        this.f34937l = c9430l;
        this.f34936l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34938l;
        C13863l c13863l = C1867l.yandex;
        InterfaceC12244l interfaceC12244l = this.f34936l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = (String) interfaceC12244l.getValue();
                    C9430l c9430l = this.f34937l;
                    boolean zAdmob = c6956l.admob(c9430l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C2176l c2176l = new C2176l(1, c9430l, C9430l.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 20);
                        c6956l.m2147try(c2176l);
                        objM2132native = c2176l;
                    }
                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native;
                    boolean zAdmob2 = c6956l.admob(c9430l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        C2176l c2176l2 = new C2176l(1, c9430l, C9430l.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 21);
                        c6956l.m2147try(c2176l2);
                        objM2132native2 = c2176l2;
                    }
                    c9430l.m2655transient(str, (Function1) interfaceC5059l, (Function1) ((InterfaceC5059l) objM2132native2), AbstractC3605l.startapp(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).crashlytics(c6956l), 0.0f, 0.0f, 13), false, AbstractC6974l.yandex, AbstractC14566l.amazon(1372346255, new C16809l(c9430l), c6956l), C8565l.remoteconfig(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c6956l, 2147483646, 4095), null, c6956l, 1769472);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean z = ((C16187l) interfaceC12244l.getValue()).amazon;
                    C9430l c9430l2 = this.f34937l;
                    if (z) {
                        c6956l2.m2123default(1183672186);
                        c9430l2.m2653public(c6956l2, 0);
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(1183807687);
                        C17253l c17253lLoadAd = AbstractC3605l.loadAd(0.0f, 12.0f, 1);
                        boolean zBilling = c6956l2.billing(interfaceC12244l) | c6956l2.admob(c9430l2);
                        Object objM2132native3 = c6956l2.m2132native();
                        if (zBilling || objM2132native3 == c13863l) {
                            objM2132native3 = new C0464l(interfaceC12244l, c9430l2, 25);
                            c6956l2.m2147try(objM2132native3);
                        }
                        AbstractC16336l.yandex(C4346l.f8873l, null, c17253lLoadAd, null, null, null, false, null, (Function1) objM2132native3, c6956l2, 390, 506);
                        c6956l2.startapp(false);
                    }
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

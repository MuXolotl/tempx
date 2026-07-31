package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;

/* JADX INFO: renamed from: lؕ۟ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3672l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9554l f7733l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Block f7734l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7735l;

    public /* synthetic */ C3672l(Catalog2Block catalog2Block, C9554l c9554l, int i) {
        this.f7735l = i;
        this.f7734l = catalog2Block;
        this.f7733l = c9554l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7735l;
        Catalog2Block catalog2Block = this.f7734l;
        C13863l c13863l = C1867l.yandex;
        C9554l c9554l = this.f7733l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C6408l c6408l = AbstractC3030l.loadAd;
                    boolean zBilling = c6956l.billing(catalog2Block);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        objM2132native = new C11027l(catalog2Block, 0);
                        c6956l.m2147try(objM2132native);
                    }
                    Function0 function0 = (Function0) objM2132native;
                    boolean zAdmob = c6956l.admob(c9554l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob || objM2132native2 == c13863l) {
                        objM2132native2 = new C13668l(c9554l, 0);
                        c6956l.m2147try(objM2132native2);
                    }
                    c6408l.crashlytics(false, function0, (Function0) objM2132native2, c6956l, 3078);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C6408l c6408l2 = AbstractC3030l.loadAd;
                    boolean zBilling2 = c6956l2.billing(catalog2Block);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zBilling2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C11027l(catalog2Block, 1);
                        c6956l2.m2147try(objM2132native3);
                    }
                    Function0 function1 = (Function0) objM2132native3;
                    boolean zAdmob2 = c6956l2.admob(c9554l);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native4 == c13863l) {
                        objM2132native4 = new C13668l(c9554l, 1);
                        c6956l2.m2147try(objM2132native4);
                    }
                    c6408l2.crashlytics(true, function1, (Function0) objM2132native4, c6956l2, 3078);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C6408l c6408l3 = AbstractC3030l.loadAd;
                    boolean zBilling3 = c6956l3.billing(catalog2Block);
                    Object objM2132native5 = c6956l3.m2132native();
                    if (zBilling3 || objM2132native5 == c13863l) {
                        objM2132native5 = new C11027l(catalog2Block, 3);
                        c6956l3.m2147try(objM2132native5);
                    }
                    Function0 function2 = (Function0) objM2132native5;
                    boolean zAdmob3 = c6956l3.admob(c9554l);
                    Object objM2132native6 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native6 == c13863l) {
                        objM2132native6 = new C13668l(c9554l, 4);
                        c6956l3.m2147try(objM2132native6);
                    }
                    c6408l3.amazon(function2, (Function0) objM2132native6, c6956l3, 384);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

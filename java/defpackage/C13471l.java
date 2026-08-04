package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;

/* JADX INFO: renamed from: lْٚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13471l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9554l f26442l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Block f26443l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26444l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f26445l;

    public /* synthetic */ C13471l(Catalog2Block catalog2Block, C9554l c9554l, AbstractC9694l abstractC9694l, int i) {
        this.f26444l = i;
        this.f26443l = catalog2Block;
        this.f26442l = c9554l;
        this.f26445l = abstractC9694l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f26444l;
        C13863l c13863l = C1867l.yandex;
        Catalog2Block catalog2Block = this.f26443l;
        C9554l c9554l = this.f26442l;
        AbstractC9694l abstractC9694l = this.f26445l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C6408l c6408l = AbstractC3030l.loadAd;
                    boolean zBilling = c6956l.billing(catalog2Block);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        objM2132native = new C11027l(catalog2Block, 2);
                        c6956l.m2147try(objM2132native);
                    }
                    Function0 function0 = (Function0) objM2132native;
                    boolean zAdmob = c6956l.admob(c9554l);
                    Object objM2132native2 = c6956l.m2132native();
                    int i2 = 3;
                    if (zAdmob || objM2132native2 == c13863l) {
                        objM2132native2 = new C13668l(c9554l, 3);
                        c6956l.m2147try(objM2132native2);
                    }
                    Function0 function1 = (Function0) objM2132native2;
                    boolean zAdmob2 = c6956l.admob(abstractC9694l);
                    Object objM2132native3 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C11998l(abstractC9694l, i2);
                        c6956l.m2147try(objM2132native3);
                    }
                    c6408l.loadAd(function0, function1, (Function0) objM2132native3, c6956l, 3072);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C6408l c6408l2 = AbstractC3030l.loadAd;
                    boolean zBilling2 = c6956l2.billing(catalog2Block);
                    Object objM2132native4 = c6956l2.m2132native();
                    int i3 = 4;
                    if (zBilling2 || objM2132native4 == c13863l) {
                        objM2132native4 = new C11027l(catalog2Block, 4);
                        c6956l2.m2147try(objM2132native4);
                    }
                    Function0 function2 = (Function0) objM2132native4;
                    boolean zAdmob3 = c6956l2.admob(c9554l);
                    Object objM2132native5 = c6956l2.m2132native();
                    if (zAdmob3 || objM2132native5 == c13863l) {
                        objM2132native5 = new C13668l(c9554l, 5);
                        c6956l2.m2147try(objM2132native5);
                    }
                    Function0 function3 = (Function0) objM2132native5;
                    boolean zAdmob4 = c6956l2.admob(abstractC9694l);
                    Object objM2132native6 = c6956l2.m2132native();
                    if (zAdmob4 || objM2132native6 == c13863l) {
                        objM2132native6 = new C11998l(abstractC9694l, i3);
                        c6956l2.m2147try(objM2132native6);
                    }
                    c6408l2.yandex(function2, function3, (Function0) objM2132native6, c6956l2, 3072);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

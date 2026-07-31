package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8529l extends AbstractC11801l {
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2326import(final int i, final int i2, C6956l c6956l, final int i3) {
        c6956l.m2133new(-378375937);
        int i4 = (c6956l.amazon(i2) ? 32 : 16) | i3;
        byte b = 0;
        int i5 = 1;
        if (c6956l.m2127for(i4 & 1, (i4 & 19) != 18)) {
            AbstractC13319l.yandex(AbstractC14566l.amazon(1275655005, new C4314l(i2, b, b), c6956l), AbstractC0080l.amazon(C4346l.f8873l, 1.0f), null, null, AbstractC14566l.amazon(-1539796895, new C4314l(i, i5, b), c6956l), null, null, c6956l, 24630, 492);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(i, i2, i3) { // from class: lؔٝ٘

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ int f6029l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ int f6030l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(7);
                    this.f6031l.m2326import(this.f6030l, this.f6029l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-2067202460);
        int i2 = 2;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        int i4 = 0;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                Cconst cconst = new Cconst(0, this, C8529l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 21);
                c6956l.m2147try(cconst);
                objM2132native = cconst;
            }
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C1907l(this, i4);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC7837l.yandex(AbstractC9027l.yandex, function0, null, (Function1) objM2132native2, c6956l, 6, 4);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15707l(this, i, i2);
        }
    }
}

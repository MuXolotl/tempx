package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَْۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10264l extends AbstractC11801l {
    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        C10264l c10264l;
        C6956l c6956l2;
        c6956l.m2133new(843108158);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                c10264l = this;
                C5834l c5834l = new C5834l(0, c10264l, C10264l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 1);
                c6956l.m2147try(c5834l);
                objM2132native = c5834l;
            } else {
                c10264l = this;
            }
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C8578l(3);
                c6956l.m2147try(objM2132native2);
            }
            c6956l2 = c6956l;
            AbstractC7837l.yandex(AbstractC6159l.yandex, function0, null, (Function1) objM2132native2, c6956l2, 3078, 4);
        } else {
            c10264l = this;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1645l(c10264l, i, 29);
        }
    }
}

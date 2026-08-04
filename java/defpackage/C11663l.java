package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘِٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11663l extends AbstractC11801l {
    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-876270554);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                C13246l c13246l = new C13246l(0, this, C11663l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 20);
                c6956l.m2147try(c13246l);
                objM2132native = c13246l;
            }
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C9490l(this, i3);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC7837l.yandex(AbstractC14775l.yandex, function0, null, (Function1) objM2132native2, c6956l, 6, 4);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4951l(this, i, 1);
        }
    }
}

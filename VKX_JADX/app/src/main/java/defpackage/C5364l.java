package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5364l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f11500l;

    public C5364l() {
        super(0);
        C3544l c3544l = C3544l.yandex;
        this.f11500l = AbstractC8020l.smaato(C3544l.loadAd());
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        C5364l c5364l;
        C6956l c6956l2;
        c6956l.m2133new(-1726512290);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                c5364l = this;
                C6814l c6814l = new C6814l(0, c5364l, C5364l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 27);
                c6956l.m2147try(c6814l);
                objM2132native = c6814l;
            } else {
                c5364l = this;
            }
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            boolean zAdmob2 = c6956l.admob(c5364l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C0783l(24, c5364l);
                c6956l.m2147try(objM2132native2);
            }
            c6956l2 = c6956l;
            AbstractC7837l.yandex(C5883l.loadAd, function0, null, (Function1) objM2132native2, c6956l2, 6, 4);
        } else {
            c5364l = this;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6161l(c5364l, i);
        }
    }
}

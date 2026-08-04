package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْؖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13138l {
    public final C17893l yandex = new C17893l(0, new C8456l[16]);
    public final C10086l loadAd = AbstractC8020l.smaato(Boolean.FALSE);
    public long crashlytics = Long.MIN_VALUE;
    public final C10086l amazon = AbstractC8020l.smaato(Boolean.TRUE);

    public final void yandex(C6956l c6956l, int i) {
        c6956l.m2133new(-318043801);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            InterfaceC14029l interfaceC14029l = null;
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC8020l.smaato(null);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            if (((Boolean) this.amazon.getValue()).booleanValue() || ((Boolean) this.loadAd.getValue()).booleanValue()) {
                c6956l.m2123default(-144841960);
                boolean zAdmob = c6956l.admob(this);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob || objM2132native2 == c13863l) {
                    objM2132native2 = new C0384l(interfaceC8714l, this, interfaceC14029l, 23);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC12311l.amazon(c6956l, this, (Function2) objM2132native2);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-143455237);
                c6956l.startapp(false);
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4951l(this, i, i3);
        }
    }
}

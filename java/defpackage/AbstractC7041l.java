package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lؚؖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7041l {
    public static final InterfaceC1220l yandex = AbstractC9968l.crashlytics(3, new C3321l(17));

    public static final AbstractC14165l yandex(Drawable drawable, C6956l c6956l) {
        c6956l.m2123default(1756822313);
        c6956l.m2123default(289266787);
        boolean zBilling = c6956l.billing(drawable);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            if (drawable == null) {
                objM2132native = C18622l.f36393l;
            } else {
                objM2132native = drawable instanceof ColorDrawable ? new C18627l(AbstractC12953l.loadAd(((ColorDrawable) drawable).getColor())) : new C13466l(drawable.mutate());
            }
            c6956l.m2147try(objM2132native);
        }
        AbstractC14165l abstractC14165l = (AbstractC14165l) objM2132native;
        c6956l.startapp(false);
        c6956l.startapp(false);
        return abstractC14165l;
    }
}

package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4077l extends AbstractC5097l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f8378l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public boolean f8379l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final Function1 f8380l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final Function0 f8381l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final Map f8382l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f8383l;

    public C4077l(String str, Map map, Function0 function0, Function1 function1) {
        super(false, 3);
        this.f8382l = map;
        this.f8381l = function0;
        this.f8380l = function1;
        this.f8378l = AbstractC8020l.smaato(str);
        this.f8383l = AbstractC8020l.smaato("");
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(-692447896);
        int i2 = 2;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                C6523l c6523l = C6523l.loadAd;
                objM2132native = C7122l.yandex;
                c6956l.m2147try(objM2132native);
            }
            ((C7122l) objM2132native).getClass();
            C6523l c6523l2 = new C6523l();
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(200869421, new C9772l(this, c6523l2, i2), c6956l), c6956l, 12582912, 127);
            Unit unit = Unit.INSTANCE;
            boolean zBilling = c6956l.billing(c6523l2);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == c13863l) {
                objM2132native2 = new C14951l(c6523l2, null, 8);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15707l(this, i, 10);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void smaato() {
        super.smaato();
        if (this.f8379l) {
            return;
        }
        this.f8381l.invoke();
    }
}

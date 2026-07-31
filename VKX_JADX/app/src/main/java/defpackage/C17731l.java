package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17731l extends AbstractC5097l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final Function0 f34549l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final Function0 f34550l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final List f34551l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f34552l;

    public C17731l(int i, List list, Function0 function0, C6335l c6335l) {
        super(false, 3);
        this.f34552l = i;
        this.f34551l = list;
        this.f34550l = function0;
        this.f34549l = c6335l;
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(1989624628);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-770847687, new C4951l(3, this), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1674l(this, i, 6);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void purchase() {
        super.purchase();
        this.f34550l.invoke();
    }

    public /* synthetic */ C17731l(int i, List list) {
        this(i, list, new C1990l(15), null);
    }
}

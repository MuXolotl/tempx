package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؓؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1647l extends AbstractC10437l {
    public final C13156l applovin;
    public final C18103l appmetrica;
    public final C16649l premium;

    public C1647l(C9950l c9950l, C4913l c4913l, C13156l c13156l, C10712l c10712l) {
        super(c9950l, c4913l);
        this.applovin = c13156l;
        C16649l c16649l = new C16649l(c9950l, this, new C1075l("__container", c4913l.yandex, false), c10712l);
        this.premium = c16649l;
        List list = Collections.EMPTY_LIST;
        c16649l.loadAd(list, list);
        C11644l c11644l = this.startapp.ad;
        if (c11644l != null) {
            this.appmetrica = new C18103l(this, this, c11644l);
        }
    }

    @Override // defpackage.AbstractC10437l, defpackage.InterfaceC15345l
    public final void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        super.crashlytics(rectF, matrix, z);
        this.premium.crashlytics(rectF, this.vip, z);
    }

    @Override // defpackage.AbstractC10437l
    public final C5138l isPro() {
        C5138l c5138l = this.startapp.pro;
        return c5138l != null ? c5138l : this.applovin.startapp.pro;
    }

    @Override // defpackage.AbstractC10437l
    public final void subs(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        C18103l c18103l = this.appmetrica;
        if (c18103l != null) {
            c15480l = c18103l.loadAd(matrix, i);
        }
        this.premium.billing(canvas, matrix, i, c15480l);
    }
}

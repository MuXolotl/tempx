package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16688l implements InterfaceC1286l {
    public final Drawable yandex;

    public C16688l(Drawable drawable) {
        this.yandex = drawable;
    }

    @Override // defpackage.InterfaceC1286l
    public final boolean admob() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16688l) && AbstractC8576l.yandex(this.yandex, ((C16688l) obj).yandex);
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + 1237;
    }

    @Override // defpackage.InterfaceC1286l
    public final int loadAd() {
        return AbstractC4032l.yandex(this.yandex);
    }

    @Override // defpackage.InterfaceC1286l
    public final long mopub() {
        Drawable drawable = this.yandex;
        long jLoadAd = ((long) AbstractC4032l.loadAd(drawable)) * 4 * ((long) AbstractC4032l.yandex(drawable));
        if (jLoadAd < 0) {
            return 0L;
        }
        return jLoadAd;
    }

    @Override // defpackage.InterfaceC1286l
    public final int purchase() {
        return AbstractC4032l.loadAd(this.yandex);
    }

    @Override // defpackage.InterfaceC1286l
    public final void subs(Canvas canvas) {
        this.yandex.draw(canvas);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.yandex + ", shareable=false)";
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: lّۨۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13028l implements InterfaceC1286l {
    public final Bitmap yandex;

    public C13028l(Bitmap bitmap) {
        this.yandex = bitmap;
    }

    @Override // defpackage.InterfaceC1286l
    public final boolean admob() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13028l) && AbstractC8576l.yandex(this.yandex, ((C13028l) obj).yandex);
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + 1231;
    }

    @Override // defpackage.InterfaceC1286l
    public final int loadAd() {
        return this.yandex.getHeight();
    }

    @Override // defpackage.InterfaceC1286l
    public final long mopub() {
        return AbstractC5941l.advert(this.yandex);
    }

    @Override // defpackage.InterfaceC1286l
    public final int purchase() {
        return this.yandex.getWidth();
    }

    @Override // defpackage.InterfaceC1286l
    public final void subs(Canvas canvas) {
        canvas.drawBitmap(this.yandex, 0.0f, 0.0f, (Paint) null);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.yandex + ", shareable=true)";
    }
}

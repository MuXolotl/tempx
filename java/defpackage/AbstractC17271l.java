package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: renamed from: lؚٗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17271l {
    public C6361l yandex;

    public final void yandex(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.yandex.yandex();
        C13509l c13509l = (C13509l) this;
        float fWidth = rect.width() / c13509l.amazon();
        float fHeight = rect.height() / c13509l.amazon();
        C6361l c6361l = c13509l.yandex;
        float f2 = (c6361l.admob / 2.0f) + c6361l.subs;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (c6361l.isPro != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        int i = c6361l.yandex;
        int i2 = i / 2;
        int i3 = c6361l.loadAd;
        c13509l.purchase = i2 <= i3;
        c13509l.loadAd = i * f;
        c13509l.crashlytics = Math.min(i2, i3) * f;
        int i4 = c6361l.admob;
        int i5 = c6361l.yandex;
        float f4 = (i4 - i5) / 2.0f;
        c13509l.amazon = f4;
        if (z || z2) {
            if ((z && c6361l.purchase == 2) || (z2 && c6361l.billing == 1)) {
                c13509l.amazon = (((1.0f - f) * i5) / 2.0f) + f4;
            } else if ((z && c6361l.purchase == 1) || (z2 && c6361l.billing == 2)) {
                c13509l.amazon = f4 - (((1.0f - f) * i5) / 2.0f);
            }
        }
        if (z2 && c6361l.billing == 3) {
            c13509l.billing = f;
        } else {
            c13509l.billing = 1.0f;
        }
    }
}

package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lؒۧۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1505l {
    public float amazon;
    public final WeakReference billing;
    public float crashlytics;
    public C1085l mopub;
    public final TextPaint yandex = new TextPaint(1);
    public final C6325l loadAd = new C6325l(this);
    public boolean purchase = true;

    public C1505l(C1664l c1664l) {
        this.billing = new WeakReference(null);
        this.billing = new WeakReference(c1664l);
    }

    public final void yandex(String str) {
        TextPaint textPaint = this.yandex;
        this.crashlytics = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.amazon = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.purchase = false;
    }
}

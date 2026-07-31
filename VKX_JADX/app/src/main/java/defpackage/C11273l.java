package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: lًُۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11273l {
    public float admob;
    public float billing;
    public int firebase;
    public float isPro;
    public final C6536l loadAd;
    public boolean mopub;
    public float purchase;
    public boolean remoteconfig;
    public final GestureDetector smaato;
    public float subs;
    public final int yandex;
    public final boolean crashlytics = true;
    public final boolean amazon = true;

    public C11273l(Context context, C6536l c6536l) {
        this.yandex = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.loadAd = c6536l;
        this.smaato = new GestureDetector(context, new C11629l(2, this));
    }

    public final boolean loadAd() {
        return this.firebase != 0;
    }

    public final float yandex() {
        if (!loadAd()) {
            float f = this.billing;
            if (f > 0.0f) {
                return this.purchase / f;
            }
            return 1.0f;
        }
        boolean z = this.remoteconfig;
        boolean z2 = (z && this.purchase < this.billing) || (!z && this.purchase > this.billing);
        float fAbs = Math.abs(1.0f - (this.purchase / this.billing)) * 0.5f;
        if (this.billing <= this.yandex) {
            return 1.0f;
        }
        return z2 ? fAbs + 1.0f : 1.0f - fAbs;
    }
}

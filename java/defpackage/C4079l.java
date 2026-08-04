package defpackage;

import android.content.Context;
import android.graphics.Color;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4079l {
    public static final int billing = (int) Math.round(5.1000000000000005d);
    public final int amazon;
    public final int crashlytics;
    public final int loadAd;
    public final float purchase;
    public final boolean yandex;

    public C4079l(Context context) {
        boolean zAdmob = AbstractC17463l.admob(context, R.attr.elevationOverlayEnabled, false);
        int iVip = AbstractC6689l.vip(context, R.attr.elevationOverlayColor, 0);
        int iVip2 = AbstractC6689l.vip(context, R.attr.elevationOverlayAccentColor, 0);
        int iVip3 = AbstractC6689l.vip(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.yandex = zAdmob;
        this.loadAd = iVip;
        this.crashlytics = iVip2;
        this.amazon = iVip3;
        this.purchase = f;
    }

    public final int yandex(int i, float f) {
        int i2;
        if (!this.yandex || AbstractC14093l.subs(i, 255) != this.amazon) {
            return i;
        }
        float f2 = this.purchase;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iStartapp = AbstractC6689l.startapp(AbstractC14093l.subs(i, 255), fMin, this.loadAd);
        if (fMin > 0.0f && (i2 = this.crashlytics) != 0) {
            iStartapp = AbstractC14093l.mopub(AbstractC14093l.subs(i2, billing), iStartapp);
        }
        return AbstractC14093l.subs(iStartapp, iAlpha);
    }
}

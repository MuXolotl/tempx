package defpackage;

import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؒۙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1291l {
    public CharSequence crashlytics;
    public long yandex = 0;
    public long loadAd = 0;
    public int amazon = 2;
    public float purchase = -3.4028235E38f;
    public int billing = 1;
    public int mopub = 0;
    public float admob = -3.4028235E38f;
    public int subs = RecyclerView.UNDEFINED_DURATION;
    public float isPro = 1.0f;
    public int firebase = RecyclerView.UNDEFINED_DURATION;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    public final C13116l yandex() {
        Layout.Alignment alignment;
        float f = this.admob;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.amazon;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.subs;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.amazon;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        C13116l c13116l = new C13116l();
        int i4 = this.amazon;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            AbstractC12900l.subscription("Unknown textAlignment: ", i4, "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c13116l.crashlytics = alignment;
        float f3 = this.purchase;
        int i5 = this.billing;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        c13116l.purchase = f2;
        c13116l.billing = i5;
        c13116l.mopub = this.mopub;
        c13116l.admob = f;
        c13116l.subs = i2;
        float f4 = this.isPro;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            C8339l.smaato(String.valueOf(i2));
            return null;
        }
        c13116l.smaato = Math.min(f4, f);
        c13116l.startapp = this.firebase;
        CharSequence charSequence = this.crashlytics;
        if (charSequence != null) {
            c13116l.yandex = charSequence;
            c13116l.loadAd = null;
        }
        return c13116l;
    }
}

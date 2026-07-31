package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: renamed from: lْٟٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13562l {
    public int admob;
    public final int amazon;
    public boolean billing;
    public final int crashlytics;
    public final int loadAd;
    public int mopub;
    public final int purchase;
    public float[] subs;
    public final int yandex;

    public C13562l(int i, int i2) {
        this.yandex = Color.red(i);
        this.loadAd = Color.green(i);
        this.crashlytics = Color.blue(i);
        this.amazon = i;
        this.purchase = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13562l.class == obj.getClass()) {
            C13562l c13562l = (C13562l) obj;
            if (this.purchase == c13562l.purchase && this.amazon == c13562l.amazon) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.amazon * 31) + this.purchase;
    }

    public final float[] loadAd() {
        if (this.subs == null) {
            this.subs = new float[3];
        }
        AbstractC14093l.yandex(this.yandex, this.loadAd, this.crashlytics, this.subs);
        return this.subs;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C13562l.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.amazon));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(loadAd()));
        sb.append("] [Population: ");
        sb.append(this.purchase);
        sb.append("] [Title Text: #");
        yandex();
        sb.append(Integer.toHexString(this.mopub));
        sb.append("] [Body Text: #");
        yandex();
        sb.append(Integer.toHexString(this.admob));
        sb.append(']');
        return sb.toString();
    }

    public final void yandex() {
        if (this.billing) {
            return;
        }
        int i = this.amazon;
        int iBilling = AbstractC14093l.billing(-1, 4.5f, i);
        int iBilling2 = AbstractC14093l.billing(-1, 3.0f, i);
        if (iBilling != -1 && iBilling2 != -1) {
            this.admob = AbstractC14093l.subs(-1, iBilling);
            this.mopub = AbstractC14093l.subs(-1, iBilling2);
            this.billing = true;
            return;
        }
        int iBilling3 = AbstractC14093l.billing(-16777216, 4.5f, i);
        int iBilling4 = AbstractC14093l.billing(-16777216, 3.0f, i);
        if (iBilling3 == -1 || iBilling4 == -1) {
            this.admob = iBilling != -1 ? AbstractC14093l.subs(-1, iBilling) : AbstractC14093l.subs(-16777216, iBilling3);
            this.mopub = iBilling2 != -1 ? AbstractC14093l.subs(-1, iBilling2) : AbstractC14093l.subs(-16777216, iBilling4);
            this.billing = true;
        } else {
            this.admob = AbstractC14093l.subs(-16777216, iBilling3);
            this.mopub = AbstractC14093l.subs(-16777216, iBilling4);
            this.billing = true;
        }
    }
}

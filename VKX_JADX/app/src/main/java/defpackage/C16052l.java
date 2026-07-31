package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: lٕۥٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16052l {
    public final View yandex;
    public final List loadAd = C2580l.f5619l;
    public final int crashlytics = 3;
    public final int amazon = 2;

    public C16052l(View view) {
        this.yandex = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16052l)) {
            return false;
        }
        C16052l c16052l = (C16052l) obj;
        return AbstractC8576l.yandex(this.yandex, c16052l.yandex) && this.loadAd.equals(c16052l.loadAd) && this.crashlytics == c16052l.crashlytics && this.amazon == c16052l.amazon;
    }

    public final int hashCode() {
        return AbstractC0653l.firebase(this.amazon, AbstractC0653l.firebase(this.crashlytics, AbstractC14814l.admob(this.yandex.hashCode() * 31, 31, this.loadAd), 29791), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BalloonPlacement(anchor=");
        sb.append(this.yandex);
        sb.append(", subAnchors=");
        sb.append(this.loadAd);
        sb.append(", align=");
        String str2 = "null";
        int i = this.crashlytics;
        if (i == 1) {
            str = "START";
        } else if (i == 2) {
            str = "END";
        } else if (i != 3) {
            str = i != 4 ? "null" : "BOTTOM";
        } else {
            str = "TOP";
        }
        sb.append(str);
        sb.append(", xOff=0, yOff=0, type=");
        int i2 = this.amazon;
        if (i2 == 1) {
            str2 = "ALIGNMENT";
        } else if (i2 == 2) {
            str2 = "DROPDOWN";
        } else if (i2 == 3) {
            str2 = "CENTER";
        }
        sb.append(str2);
        sb.append(", width=0, height=0)");
        return sb.toString();
    }
}

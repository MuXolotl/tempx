package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٖۦۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16781l {
    public static final C3498l purchase = C3498l.mopub("<root>");
    public transient C3498l amazon;
    public transient C16781l crashlytics;
    public transient C2312l loadAd;
    public final String yandex;

    static {
        Pattern.compile("\\.");
    }

    public C16781l(String str, C16781l c16781l, C3498l c3498l) {
        this.yandex = str;
        this.crashlytics = c16781l;
        this.amazon = c3498l;
    }

    public static final List billing(C16781l c16781l) {
        if (c16781l.crashlytics()) {
            return new ArrayList();
        }
        List listBilling = billing(c16781l.purchase());
        listBilling.add(c16781l.mopub());
        return listBilling;
    }

    public final boolean admob(C3498l c3498l) {
        if (!crashlytics()) {
            String str = this.yandex;
            int iM3321extends = AbstractC12024l.m3321extends(str, '.', 0, 6);
            if (iM3321extends == -1) {
                iM3321extends = str.length();
            }
            String strLoadAd = c3498l.loadAd();
            if (iM3321extends == strLoadAd.length() && str.regionMatches(0, strLoadAd, 0, iM3321extends)) {
                return true;
            }
        }
        return false;
    }

    public final boolean amazon() {
        return this.loadAd != null || AbstractC12024l.m3321extends(this.yandex, '<', 0, 6) < 0;
    }

    public final boolean crashlytics() {
        return this.yandex.length() == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16781l) {
            return AbstractC8576l.yandex(this.yandex, ((C16781l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final void loadAd() {
        String str = this.yandex;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                break;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length >= 0) {
            this.amazon = C3498l.amazon(str.substring(length + 1));
            this.crashlytics = new C16781l(str.substring(0, length));
        } else {
            this.amazon = C3498l.amazon(str);
            this.crashlytics = C2312l.crashlytics.yandex;
        }
    }

    public final C3498l mopub() {
        C3498l c3498l = this.amazon;
        if (c3498l != null) {
            return c3498l;
        }
        if (crashlytics()) {
            C8339l.smaato("root");
            return null;
        }
        loadAd();
        return this.amazon;
    }

    public final C16781l purchase() {
        C16781l c16781l = this.crashlytics;
        if (c16781l != null) {
            return c16781l;
        }
        if (crashlytics()) {
            C8339l.smaato("root");
            return null;
        }
        loadAd();
        return this.crashlytics;
    }

    public final C2312l subs() {
        C2312l c2312l = this.loadAd;
        if (c2312l != null) {
            return c2312l;
        }
        C2312l c2312l2 = new C2312l(this);
        this.loadAd = c2312l2;
        return c2312l2;
    }

    public final String toString() {
        return crashlytics() ? purchase.loadAd() : this.yandex;
    }

    public final C16781l yandex(C3498l c3498l) {
        String strLoadAd;
        if (crashlytics()) {
            strLoadAd = c3498l.loadAd();
        } else {
            strLoadAd = this.yandex + '.' + c3498l.loadAd();
        }
        return new C16781l(strLoadAd, this, c3498l);
    }

    public C16781l(String str) {
        this.yandex = str;
    }

    public C16781l(C2312l c2312l, String str) {
        this.yandex = str;
        this.loadAd = c2312l;
    }
}

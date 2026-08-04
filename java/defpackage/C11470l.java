package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lُۥؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11470l {
    public static final C11470l amazon = new C11470l(new C0554l());
    public static final String billing;
    public static final String mopub;
    public static final String purchase;
    public final Bundle crashlytics;
    public final String loadAd;
    public final Uri yandex;

    static {
        String str = AbstractC15323l.yandex;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
        mopub = Integer.toString(2, 36);
    }

    public C11470l(C0554l c0554l) {
        this.yandex = (Uri) c0554l.f1958l;
        this.loadAd = (String) c0554l.f1957l;
        this.crashlytics = (Bundle) c0554l.f1956l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11470l)) {
            return false;
        }
        C11470l c11470l = (C11470l) obj;
        if (Objects.equals(this.yandex, c11470l.yandex) && Objects.equals(this.loadAd, c11470l.loadAd)) {
            if ((this.crashlytics == null) == (c11470l.crashlytics == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.yandex;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.loadAd;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.crashlytics != null ? 1 : 0);
    }
}

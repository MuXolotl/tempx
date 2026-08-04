package defpackage;

import android.util.Size;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: lۤٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18680l {
    public static final C18680l admob;
    public static final C18680l billing;
    public static final C18680l firebase;
    public static final C18680l isPro;
    public static final C18680l mopub;
    public static final C18680l purchase;
    public static final List remoteconfig;
    public static final HashSet smaato;
    public static final C18680l subs;
    public final List amazon;
    public final String crashlytics;
    public final int loadAd;
    public final int yandex;

    static {
        C18680l c18680l = new C18680l(4, 2002, "SD", DesugarCollections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        purchase = c18680l;
        C18680l c18680l2 = new C18680l(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        billing = c18680l2;
        C18680l c18680l3 = new C18680l(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        mopub = c18680l3;
        C18680l c18680l4 = new C18680l(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        admob = c18680l4;
        List list = Collections.EMPTY_LIST;
        C18680l c18680l5 = new C18680l(0, 2000, "LOWEST", list);
        subs = c18680l5;
        C18680l c18680l6 = new C18680l(1, 2001, "HIGHEST", list);
        isPro = c18680l6;
        firebase = new C18680l(-1, -1, "NONE", list);
        smaato = new HashSet(Arrays.asList(c18680l5, c18680l6, c18680l, c18680l2, c18680l3, c18680l4));
        remoteconfig = Arrays.asList(c18680l4, c18680l3, c18680l2, c18680l);
    }

    public C18680l(int i, int i2, String str, List list) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = str;
        if (list != null) {
            this.amazon = list;
        } else {
            C6541l.subs("Null typicalSizes");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18680l)) {
            return false;
        }
        C18680l c18680l = (C18680l) obj;
        return this.yandex == c18680l.yandex && this.loadAd == c18680l.loadAd && this.crashlytics.equals(c18680l.crashlytics) && this.amazon.equals(c18680l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() ^ ((((((this.yandex ^ 1000003) * 1000003) ^ this.loadAd) * 1000003) ^ this.crashlytics.hashCode()) * 1000003);
    }

    public final String toString() {
        return "ConstantQuality{value=" + this.yandex + ", highSpeedValue=" + this.loadAd + ", name=" + this.crashlytics + ", typicalSizes=" + this.amazon + "}";
    }

    public final int yandex(int i) {
        if (i == 1) {
            return this.yandex;
        }
        if (i == 2) {
            return this.loadAd;
        }
        C8339l.subs(AbstractC0653l.vip(i, "Unknown quality source: "));
        return 0;
    }
}

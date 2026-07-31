package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًٌۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7877l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f16423l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16424l;

    public /* synthetic */ AbstractC7877l(int i, int i2) {
        this.f16424l = i2;
        this.f16423l = i;
    }

    public static String loadAd(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public abstract int admob();

    public abstract int amazon();

    public abstract int billing();

    public boolean crashlytics(int i) {
        return (this.f16423l & i) == i;
    }

    public List isPro() {
        return C2580l.f5619l;
    }

    public abstract int mopub();

    public abstract String smaato();

    public abstract int subs();

    public String toString() {
        switch (this.f16424l) {
            case 3:
                return loadAd(this.f16423l);
            default:
                return super.toString();
        }
    }

    public void yandex(int i) {
        this.f16423l = i | this.f16423l;
    }
}

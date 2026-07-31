package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: lؑۧٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0726l {
    public final C10975l crashlytics;
    public int loadAd = 0;
    public final XmlPullParser yandex;

    public C0726l(XmlResourceParser xmlResourceParser) {
        this.yandex = xmlResourceParser;
        C10975l c10975l = new C10975l(20, false);
        c10975l.f22121l = new float[64];
        this.crashlytics = c10975l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0726l)) {
            return false;
        }
        C0726l c0726l = (C0726l) obj;
        return AbstractC8576l.yandex(this.yandex, c0726l.yandex) && this.loadAd == c0726l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final void loadAd(int i) {
        this.loadAd = i | this.loadAd;
    }

    public final String toString() {
        return "AndroidVectorParser(xmlParser=" + this.yandex + ", config=" + this.loadAd + ")";
    }

    public final float yandex(TypedArray typedArray, String str, int i, float f) {
        if (AbstractC10310l.startapp(this.yandex, str)) {
            f = typedArray.getFloat(i, f);
        }
        loadAd(typedArray.getChangingConfigurations());
        return f;
    }
}

package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؙّۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6696l {
    public static final C6696l purchase = new C6696l(-1, -1, -1);
    public final int amazon;
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    public C6696l(int i, int i2, int i3) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = AbstractC15323l.m3968for(i3) ? AbstractC15323l.license(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6696l)) {
            return false;
        }
        C6696l c6696l = (C6696l) obj;
        return this.yandex == c6696l.yandex && this.loadAd == c6696l.loadAd && this.crashlytics == c6696l.crashlytics;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.yandex), Integer.valueOf(this.loadAd), Integer.valueOf(this.crashlytics));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.yandex);
        sb.append(", channelCount=");
        sb.append(this.loadAd);
        sb.append(", encoding=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ']');
    }
}

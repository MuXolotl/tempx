package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lْ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18036l {
    public List crashlytics;
    public String loadAd;
    public String yandex;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18036l)) {
            return false;
        }
        C18036l c18036l = (C18036l) obj;
        return Objects.equals(this.yandex, c18036l.yandex) && Objects.equals(this.loadAd, c18036l.loadAd) && Objects.equals(this.crashlytics, c18036l.crashlytics);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd, this.crashlytics);
    }
}

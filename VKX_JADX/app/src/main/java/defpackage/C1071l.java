package defpackage;

import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lٕؒۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1071l {
    public final Set crashlytics;
    public final Set loadAd;
    public final boolean yandex;

    public C1071l(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.yandex = z;
        this.loadAd = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.crashlytics = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1071l)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C1071l c1071l = (C1071l) obj;
        return this.yandex == c1071l.yandex && Objects.equals(this.loadAd, c1071l.loadAd) && Objects.equals(this.crashlytics, c1071l.crashlytics);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.yandex), this.loadAd, this.crashlytics);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.yandex + ", forceEnabledQuirks=" + this.loadAd + ", forceDisabledQuirks=" + this.crashlytics + '}';
    }

    public final boolean yandex(Class cls, boolean z) {
        if (this.loadAd.contains(cls)) {
            return true;
        }
        return !this.crashlytics.contains(cls) && this.yandex && z;
    }
}

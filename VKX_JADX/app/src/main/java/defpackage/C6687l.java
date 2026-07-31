package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lؙۗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6687l {
    public final C1990l crashlytics;
    public final Set loadAd;
    public final Integer yandex = 5;

    public C6687l(Set set, C1990l c1990l) {
        this.loadAd = set;
        this.crashlytics = c1990l;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C6687l;
    }

    public final int hashCode() {
        return 398591036;
    }

    public final String toString() {
        Integer num = this.yandex;
        if (num == null) {
            return "398591036 without alias";
        }
        return "398591036 with alias " + num.intValue();
    }
}

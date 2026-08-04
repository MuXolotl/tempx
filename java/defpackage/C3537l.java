package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lٜؕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3537l {
    public final Map loadAd;
    public final String yandex;

    public C3537l(String str, Map map) {
        this.yandex = str;
        this.loadAd = map;
    }

    public static C3537l crashlytics(String str) {
        return new C3537l(str, Collections.EMPTY_MAP);
    }

    public static C0458l yandex(String str) {
        return new C0458l(22, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3537l)) {
            return false;
        }
        C3537l c3537l = (C3537l) obj;
        return this.yandex.equals(c3537l.yandex) && this.loadAd.equals(c3537l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final Annotation loadAd(Class cls) {
        return (Annotation) this.loadAd.get(cls);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.yandex + ", properties=" + this.loadAd.values() + "}";
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lْۦۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13807l {
    public final boolean amazon;
    public final Map crashlytics = C14054l.f27396l;
    public final EnumC5244l loadAd;
    public final EnumC5244l yandex;

    public C13807l(EnumC5244l enumC5244l, EnumC5244l enumC5244l2) {
        this.yandex = enumC5244l;
        this.loadAd = enumC5244l2;
        EnumC5244l enumC5244l3 = EnumC5244l.f11322l;
        this.amazon = enumC5244l == enumC5244l3 && enumC5244l2 == enumC5244l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13807l)) {
            return false;
        }
        C13807l c13807l = (C13807l) obj;
        return this.yandex == c13807l.yandex && this.loadAd == c13807l.loadAd && this.crashlytics.equals(c13807l.crashlytics);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        EnumC5244l enumC5244l = this.loadAd;
        return this.crashlytics.hashCode() + ((iHashCode + (enumC5244l == null ? 0 : enumC5244l.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.yandex + ", migrationLevel=" + this.loadAd + ", userDefinedLevelForSpecificAnnotation=" + this.crashlytics + ')';
    }
}

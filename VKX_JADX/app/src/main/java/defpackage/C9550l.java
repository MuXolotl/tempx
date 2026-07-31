package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٍٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9550l implements InterfaceC15313l {
    public final List amazon;
    public final List crashlytics;
    public final int loadAd;
    public final int yandex;

    public C9550l(int i, int i2, List list, List list2) {
        this.yandex = i;
        this.loadAd = i2;
        if (list == null) {
            C6541l.subs("Null audioProfiles");
            throw null;
        }
        this.crashlytics = list;
        if (list2 != null) {
            this.amazon = list2;
        } else {
            C6541l.subs("Null videoProfiles");
            throw null;
        }
    }

    public static C9550l purchase(int i, int i2, List list, List list2) {
        return new C9550l(i, i2, DesugarCollections.unmodifiableList(new ArrayList(list)), DesugarCollections.unmodifiableList(new ArrayList(list2)));
    }

    @Override // defpackage.InterfaceC15313l
    public final List amazon() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC15313l
    public final List crashlytics() {
        return this.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9550l) {
            C9550l c9550l = (C9550l) obj;
            if (this.yandex == c9550l.yandex && this.loadAd == c9550l.loadAd && this.crashlytics.equals(c9550l.crashlytics) && this.amazon.equals(c9550l.amazon)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.amazon.hashCode() ^ ((((((this.yandex ^ 1000003) * 1000003) ^ this.loadAd) * 1000003) ^ this.crashlytics.hashCode()) * 1000003);
    }

    @Override // defpackage.InterfaceC15313l
    public final int loadAd() {
        return this.loadAd;
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.yandex + ", recommendedFileFormat=" + this.loadAd + ", audioProfiles=" + this.crashlytics + ", videoProfiles=" + this.amazon + "}";
    }

    @Override // defpackage.InterfaceC15313l
    public final int yandex() {
        return this.yandex;
    }
}

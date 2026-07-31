package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lؖٝۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4273l {
    public final String amazon;
    public final List crashlytics;
    public final String loadAd;
    public final List purchase;
    public final EnumC17267l yandex;

    public C4273l(EnumC17267l enumC17267l, String str, List list, String str2, List list2) {
        this.yandex = enumC17267l;
        this.loadAd = str;
        this.crashlytics = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.amazon = str2;
        this.purchase = list2 != null ? DesugarCollections.unmodifiableList(list2) : null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4273l)) {
            return false;
        }
        C4273l c4273l = (C4273l) obj;
        return Objects.equals(this.crashlytics, c4273l.crashlytics) && Objects.equals(this.amazon, c4273l.amazon) && Objects.equals(this.purchase, c4273l.purchase) && Objects.equals(this.yandex, c4273l.yandex) && Objects.equals(this.loadAd, c4273l.loadAd);
    }

    public final int hashCode() {
        return Objects.hash(this.crashlytics, this.amazon, this.purchase, this.yandex, this.loadAd);
    }
}

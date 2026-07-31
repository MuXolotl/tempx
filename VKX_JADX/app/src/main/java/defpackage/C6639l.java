package defpackage;

/* JADX INFO: renamed from: lؙٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6639l {
    public final boolean loadAd;
    public final Object yandex;

    public C6639l(Object obj, boolean z) {
        this.yandex = obj;
        this.loadAd = z;
    }

    public static C6639l yandex(C6639l c6639l, EnumC10249l enumC10249l, boolean z, int i) {
        Object obj = enumC10249l;
        if ((i & 1) != 0) {
            obj = c6639l.yandex;
        }
        if ((i & 2) != 0) {
            z = c6639l.loadAd;
        }
        c6639l.getClass();
        return new C6639l(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6639l)) {
            return false;
        }
        C6639l c6639l = (C6639l) obj;
        return AbstractC8576l.yandex(this.yandex, c6639l.yandex) && this.loadAd == c6639l.loadAd;
    }

    public final int hashCode() {
        Object obj = this.yandex;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + (this.loadAd ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithMigrationStatus(qualifier=");
        sb.append(this.yandex);
        sb.append(", isForWarningOnly=");
        return AbstractC0653l.tapsense(sb, this.loadAd, ')');
    }
}

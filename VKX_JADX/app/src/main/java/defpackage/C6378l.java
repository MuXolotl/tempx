package defpackage;

/* JADX INFO: renamed from: lَؙۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6378l {
    public static final C6378l purchase = new C6378l(new int[0], new Object[0], false);
    public boolean amazon;
    public int crashlytics = -1;
    public final Object[] loadAd;
    public final int[] yandex;

    public C6378l(int[] iArr, Object[] objArr, boolean z) {
        this.yandex = iArr;
        this.loadAd = objArr;
        this.amazon = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6378l)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 506991;
    }
}

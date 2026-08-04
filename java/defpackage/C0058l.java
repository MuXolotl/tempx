package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lؑؓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0058l extends AbstractC9743l implements Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f958l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C0058l f957l = new C0058l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C0058l f956l = new C0058l(1);

    public /* synthetic */ C0058l(int i) {
        this.f958l = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f958l) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f958l) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }

    @Override // defpackage.AbstractC9743l
    public final AbstractC9743l yandex() {
        switch (this.f958l) {
            case 0:
                return f956l;
            default:
                return f957l;
        }
    }
}

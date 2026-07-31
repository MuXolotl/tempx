package defpackage;

import java.util.HashSet;

/* JADX INFO: renamed from: lَٝۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10448l implements InterfaceC9750l {
    public final boolean loadAd;
    public final int yandex;

    public C10448l(String str, boolean z, int i) {
        this.yandex = i;
        this.loadAd = z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.yandex;
        if (i == 1) {
            str = "MERGE";
        } else if (i == 2) {
            str = "ADD";
        } else if (i == 3) {
            str = "SUBTRACT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        if (((HashSet) c9950l.f20282l.f29576l).contains(EnumC17795l.f34660l)) {
            return new C14523l(this);
        }
        AbstractC17968l.loadAd("Animation contains merge paths but they are disabled.");
        return null;
    }
}

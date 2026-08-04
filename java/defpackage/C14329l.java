package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٟٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14329l {
    public final List loadAd;
    public final List yandex;

    public C14329l(List list, List list2) {
        this.yandex = list;
        this.loadAd = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC16901l.m4210case(this.yandex, ", ", null, null, null, 62));
        sb.append('(');
        return AbstractC2812l.tapsense(sb, AbstractC16901l.m4210case(this.loadAd, ";", null, null, null, 62), ')');
    }
}

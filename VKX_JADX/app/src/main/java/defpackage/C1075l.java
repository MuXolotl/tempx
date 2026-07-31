package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lٕؒۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1075l implements InterfaceC9750l {
    public final boolean crashlytics;
    public final List loadAd;
    public final String yandex;

    public C1075l(String str, List list, boolean z) {
        this.yandex = str;
        this.loadAd = list;
        this.crashlytics = z;
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.yandex + "' Shapes: " + Arrays.toString(this.loadAd.toArray()) + '}';
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        return new C16649l(c9950l, abstractC10437l, this, c10712l);
    }
}

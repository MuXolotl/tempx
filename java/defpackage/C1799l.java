package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lِؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1799l {
    public static final List loadAd = AbstractC14055l.remoteconfig(new C1799l(0), new C1799l(1), new C1799l(6), new C1799l(5), new C1799l(2), new C1799l(3), new C1799l(8), new C1799l(7));
    public final int yandex;

    public /* synthetic */ C1799l(int i) {
        this.yandex = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1799l) {
            return this.yandex == ((C1799l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return AbstractC12589l.appmetrica("AwbMode(value=", this.yandex, ')');
    }
}

package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lؔٔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2620l implements InterfaceC15725l {
    public final int yandex;

    public C2620l(int i) {
        this.yandex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2620l) && this.yandex == ((C2620l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return AbstractC0653l.adcel(new StringBuilder("ResourceColorProvider(resId="), this.yandex, ')');
    }

    @Override // defpackage.InterfaceC15725l
    public final long yandex(Context context) {
        return AbstractC12953l.loadAd(context.getColor(this.yandex));
    }
}

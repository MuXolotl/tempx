package defpackage;

import java.util.Comparator;

/* JADX INFO: renamed from: lٍٙ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9645l extends AbstractC12716l {
    public static AbstractC12716l billing(int i) {
        if (i < 0) {
            return AbstractC12716l.loadAd;
        }
        return i > 0 ? AbstractC12716l.crashlytics : AbstractC12716l.yandex;
    }

    @Override // defpackage.AbstractC12716l
    public final AbstractC12716l amazon(boolean z, boolean z2) {
        return billing(Boolean.compare(z2, z));
    }

    @Override // defpackage.AbstractC12716l
    public final AbstractC12716l crashlytics(boolean z, boolean z2) {
        return billing(Boolean.compare(z, z2));
    }

    @Override // defpackage.AbstractC12716l
    public final AbstractC12716l loadAd(Object obj, Object obj2, Comparator comparator) {
        return billing(comparator.compare(obj, obj2));
    }

    @Override // defpackage.AbstractC12716l
    public final int purchase() {
        return 0;
    }

    @Override // defpackage.AbstractC12716l
    public final AbstractC12716l yandex(int i, int i2) {
        return billing(Integer.compare(i, i2));
    }
}

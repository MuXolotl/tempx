package defpackage;

import android.widget.Magnifier;

/* JADX INFO: renamed from: lؘؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C3061l implements InterfaceC14104l {
    public final Magnifier yandex;

    public C3061l(Magnifier magnifier) {
        this.yandex = magnifier;
    }

    public final void amazon() {
        this.yandex.update();
    }

    public final long crashlytics() {
        return (((long) this.yandex.getWidth()) << 32) | (((long) this.yandex.getHeight()) & 4294967295L);
    }

    public final void loadAd() {
        this.yandex.dismiss();
    }

    @Override // defpackage.InterfaceC14104l
    public void yandex(long j, long j2, float f) {
        this.yandex.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}

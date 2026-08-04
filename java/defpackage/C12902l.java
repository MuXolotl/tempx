package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: lَّ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12902l {
    public AbstractC13141l yandex;

    public C12902l(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.yandex = new C13499l(AbstractC14817l.loadAd(i, interpolator, j));
        } else {
            this.yandex = new C12441l(i, interpolator, j);
        }
    }
}

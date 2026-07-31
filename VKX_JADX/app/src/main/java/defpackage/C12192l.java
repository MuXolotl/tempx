package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: lِِۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12192l implements InterfaceC3114l {
    public final ViewConfiguration yandex;

    public C12192l(ViewConfiguration viewConfiguration) {
        this.yandex = viewConfiguration;
    }

    @Override // defpackage.InterfaceC3114l
    public final long amazon() {
        return AbstractC9027l.yandex(48.0f, 48.0f);
    }

    @Override // defpackage.InterfaceC3114l
    public final float billing() {
        return this.yandex.getScaledTouchSlop();
    }

    @Override // defpackage.InterfaceC3114l
    public final float crashlytics() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC5917l.startapp(this.yandex);
        }
        return 2.0f;
    }

    @Override // defpackage.InterfaceC3114l
    public final long loadAd() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.InterfaceC3114l
    public final float mopub() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC5917l.metrica(this.yandex);
        }
        return 16.0f;
    }

    @Override // defpackage.InterfaceC3114l
    public final float purchase() {
        return this.yandex.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.InterfaceC3114l
    public final long yandex() {
        return ViewConfiguration.getDoubleTapTimeout();
    }
}

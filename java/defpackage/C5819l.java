package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: renamed from: lؘٜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5819l implements InterfaceC12918l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Surface f12261l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final OutputConfiguration f12262l;

    public C5819l(OutputConfiguration outputConfiguration) {
        this.f12262l = outputConfiguration;
        this.f12261l = outputConfiguration.getSurface();
    }

    public final String toString() {
        return this.f12262l.toString();
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        if (interfaceC1388l.equals(AbstractC18202l.yandex.loadAd(C13502l.amazon()))) {
            return this.f12262l;
        }
        return null;
    }

    public final void yandex(Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            C8936l.subs(AbstractC15560l.tapsense("addSurface is not supported on API ", i, " (requires API 26)"));
        } else if (i >= 26) {
            AbstractC5941l.yandex(this.f12262l, surface);
        }
    }
}

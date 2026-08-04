package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: lْؕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3201l implements InterfaceC0553l {
    public static final C15053l yandex = new C15053l(new C3201l());
    public static final Set loadAd = Collections.singleton(C15421l.amazon);

    @Override // defpackage.InterfaceC0553l
    public final Set crashlytics(C15421l c15421l) {
        AbstractC5641l.loadAd(C15421l.amazon.equals(c15421l), "DynamicRange is not supported: " + c15421l);
        return loadAd;
    }

    @Override // defpackage.InterfaceC0553l
    public final Set loadAd() {
        return loadAd;
    }

    @Override // defpackage.InterfaceC0553l
    public final DynamicRangeProfiles yandex() {
        return null;
    }
}

package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: lؔٙؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2705l implements InterfaceC3335l {
    public final C8688l amazon;
    public Bundle crashlytics;
    public boolean loadAd;
    public final C18396l yandex;

    public C2705l(C18396l c18396l, InterfaceC0798l interfaceC0798l) {
        this.yandex = c18396l;
        this.amazon = new C8688l(new C5767l(1, interfaceC0798l));
    }

    public final void loadAd() {
        if (this.loadAd) {
            return;
        }
        Bundle bundleTapsense = this.yandex.tapsense("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleLoadAd = AbstractC1315l.loadAd((C8195l[]) Arrays.copyOf(new C8195l[0], 0));
        Bundle bundle = this.crashlytics;
        if (bundle != null) {
            bundleLoadAd.putAll(bundle);
        }
        if (bundleTapsense != null) {
            bundleLoadAd.putAll(bundleTapsense);
        }
        this.crashlytics = bundleLoadAd;
        this.loadAd = true;
    }

    @Override // defpackage.InterfaceC3335l
    public final Bundle yandex() {
        Bundle bundleLoadAd = AbstractC1315l.loadAd((C8195l[]) Arrays.copyOf(new C8195l[0], 0));
        Bundle bundle = this.crashlytics;
        if (bundle != null) {
            bundleLoadAd.putAll(bundle);
        }
        for (Map.Entry entry : ((C16482l) this.amazon.getValue()).loadAd.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleYandex = ((C8955l) ((C1453l) entry.getValue()).yandex.f7481l).yandex();
            if (!bundleYandex.isEmpty()) {
                bundleLoadAd.putBundle(str, bundleYandex);
            }
        }
        this.loadAd = false;
        return bundleLoadAd;
    }
}

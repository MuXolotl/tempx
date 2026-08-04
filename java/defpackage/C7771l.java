package defpackage;

import java.io.File;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًؕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7771l extends AbstractC0085l {
    public final C8688l loadAd = new C8688l(new C7703l(21));
    public final C8688l crashlytics = new C8688l(new C7703l(22));

    @Override // defpackage.AbstractC0085l
    public final int amazon() {
        return R.string.storage_internal;
    }

    @Override // defpackage.AbstractC0085l
    public final File crashlytics() {
        return (File) this.crashlytics.getValue();
    }

    @Override // defpackage.AbstractC0085l
    public final File loadAd() {
        return (File) this.loadAd.getValue();
    }

    @Override // defpackage.AbstractC0085l
    public final int yandex() {
        return 0;
    }
}

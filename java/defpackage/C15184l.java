package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: lّٔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15184l implements InterfaceC4310l {
    public final C14724l loadAd;
    public final Intent yandex;

    public C15184l(Intent intent, C14724l c14724l) {
        this.yandex = intent;
        this.loadAd = c14724l;
    }

    @Override // defpackage.InterfaceC4310l
    public final C14724l getParameters() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC4310l
    public final Bundle yandex() {
        return null;
    }
}

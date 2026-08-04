package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lٌٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14031l implements InterfaceC17714l {
    @Override // defpackage.InterfaceC17714l
    public final InterfaceC3525l yandex() {
        return Build.VERSION.SDK_INT >= 28 ? new C5686l() : new C12667l();
    }
}

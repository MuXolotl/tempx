package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lَؙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6375l {
    public final C11349l yandex = new C11349l();
    public final C11349l loadAd = new C11349l();

    public final void yandex(InterfaceC0980l interfaceC0980l) {
        String name = interfaceC0980l.getName();
        this.yandex.put(interfaceC0980l, name.toLowerCase(Locale.ROOT));
        this.loadAd.remove(name);
    }
}

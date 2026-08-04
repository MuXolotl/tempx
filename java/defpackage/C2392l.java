package defpackage;

/* JADX INFO: renamed from: lؔؕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2392l {
    public InterfaceC13342l loadAd;
    public EnumC8981l yandex;

    public final void yandex(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
        EnumC8981l enumC8981lYandex = enumC14812l.yandex();
        EnumC8981l enumC8981l = this.yandex;
        if (enumC8981lYandex.compareTo(enumC8981l) < 0) {
            enumC8981l = enumC8981lYandex;
        }
        this.yandex = enumC8981l;
        this.loadAd.ads(interfaceC3177l, enumC14812l);
        this.yandex = enumC8981lYandex;
    }
}

package defpackage;

/* JADX INFO: renamed from: lٕۡ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15995l extends AbstractC5387l {
    public final InterfaceC2413l yandex;

    public C15995l(InterfaceC2413l interfaceC2413l) {
        this.yandex = interfaceC2413l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15995l) && this.yandex.equals(((C15995l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "CameraStateOpen(cameraDevice=" + this.yandex + ')';
    }
}

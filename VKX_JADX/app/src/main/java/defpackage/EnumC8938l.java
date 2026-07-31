package defpackage;

/* JADX INFO: renamed from: lٌٝٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8938l implements InterfaceC10402l {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f18417l;

    EnumC8938l(int i) {
        this.f18417l = i;
    }

    public final int yandex() {
        if (this != UNRECOGNIZED) {
            return this.f18417l;
        }
        C8339l.metrica("Can't get the number of an unknown enum value.");
        return 0;
    }
}

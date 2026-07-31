package defpackage;

/* JADX INFO: renamed from: lؖٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4164l implements InterfaceC12882l {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f8548l;

    EnumC4164l(int i) {
        this.f8548l = i;
    }

    public final int yandex() {
        if (this != UNRECOGNIZED) {
            return this.f8548l;
        }
        C8339l.metrica("Can't get the number of an unknown enum value.");
        return 0;
    }
}

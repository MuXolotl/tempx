package defpackage;

/* JADX INFO: renamed from: lَؚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7004l implements InterfaceC10402l {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f14676l;

    EnumC7004l(int i) {
        this.f14676l = i;
    }

    public static EnumC7004l yandex(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    public final int loadAd() {
        if (this != UNRECOGNIZED) {
            return this.f14676l;
        }
        C8339l.metrica("Can't get the number of an unknown enum value.");
        return 0;
    }
}

package defpackage;

/* JADX INFO: renamed from: lًِؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1704l implements InterfaceC6759l {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f4096l;

    EnumC1704l(int i) {
        this.f4096l = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f4096l);
    }

    @Override // defpackage.InterfaceC6759l
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f4096l;
        }
        C8339l.metrica("Can't get the number of an unknown enum value.");
        return 0;
    }
}

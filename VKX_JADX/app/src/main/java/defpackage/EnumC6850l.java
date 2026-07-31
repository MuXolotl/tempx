package defpackage;

/* JADX INFO: renamed from: lؙۣۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6850l implements InterfaceC10660l {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f14325l;

    EnumC6850l(int i) {
        this.f14325l = i;
    }

    @Override // defpackage.InterfaceC10660l
    public final int zza() {
        return this.f14325l;
    }
}

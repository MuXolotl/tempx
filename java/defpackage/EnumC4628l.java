package defpackage;

/* JADX INFO: renamed from: lؗؔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4628l implements InterfaceC1084l {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f9411l;

    EnumC4628l(int i) {
        this.f9411l = i;
    }

    @Override // defpackage.InterfaceC1084l
    public final int yandex() {
        return this.f9411l;
    }
}

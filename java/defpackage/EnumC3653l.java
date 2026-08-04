package defpackage;

/* JADX INFO: renamed from: lٌؕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3653l implements InterfaceC10660l {
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    /* JADX INFO: Fake field, exist only in values array */
    DATABAR(14),
    /* JADX INFO: Fake field, exist only in values array */
    TEZ_CODE(16);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f7663l;

    EnumC3653l(int i) {
        this.f7663l = i;
    }

    @Override // defpackage.InterfaceC10660l
    public final int zza() {
        return this.f7663l;
    }
}

package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُّۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12536l implements InterfaceC10660l {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(PSKKeyManager.MAX_KEY_LENGTH_BYTES),
    FORMAT_UPC_A(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f24711l;

    EnumC12536l(int i) {
        this.f24711l = i;
    }

    @Override // defpackage.InterfaceC10660l
    public final int zza() {
        return this.f24711l;
    }
}

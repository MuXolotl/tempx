package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٔۚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15145l extends C1597l {
    public final char[] billing;

    public C15145l(C18455l c18455l) {
        super(c18455l, (Character) null);
        this.billing = new char[AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE];
        char[] cArr = c18455l.loadAd;
        AbstractC12442l.admob(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.billing;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | PSKKeyManager.MAX_KEY_LENGTH_BYTES] = cArr[i & 15];
        }
    }

    @Override // defpackage.C1597l
    public final void crashlytics(StringBuilder sb, byte[] bArr, int i) {
        AbstractC12442l.adcel(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.billing;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES]);
        }
    }
}

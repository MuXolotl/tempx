package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: lًَؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7792l implements InterfaceC11416l {
    public final byte[] loadAd;
    public final InterfaceC11416l yandex;

    public C7792l(InterfaceC11416l interfaceC11416l, byte[] bArr) {
        this.yandex = interfaceC11416l;
        this.loadAd = bArr;
    }

    @Override // defpackage.InterfaceC11416l
    public final byte[] yandex(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.loadAd;
        int length = bArr2.length;
        InterfaceC11416l interfaceC11416l = this.yandex;
        if (length == 0) {
            return interfaceC11416l.yandex(bArr);
        }
        if (AbstractC0647l.yandex(bArr2, bArr)) {
            return interfaceC11416l.yandex(Arrays.copyOfRange(bArr, bArr2.length, bArr.length));
        }
        C18262l.ads("Invalid ciphertext (output prefix mismatch)");
        return null;
    }
}

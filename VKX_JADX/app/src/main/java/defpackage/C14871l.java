package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lْٟٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14871l implements InterfaceC10634l {
    public final C18675l yandex;

    public C14871l(C18675l c18675l) {
        this.yandex = c18675l;
    }

    @Override // defpackage.InterfaceC10634l
    public final byte[] yandex(byte[] bArr) throws GeneralSecurityException {
        InterfaceC10634l interfaceC10634l = (InterfaceC10634l) this.yandex.f36444l;
        if (interfaceC10634l == null) {
            C18262l.ads("keyset without primary key");
            return null;
        }
        byte[] bArrYandex = interfaceC10634l.yandex(bArr);
        int length = bArr.length;
        return bArrYandex;
    }
}

package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: renamed from: lؘۦٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6102l implements InterfaceC10135l {
    public final C2308l loadAd;
    public final C12864l yandex;

    public C6102l(C12864l c12864l, C2308l c2308l) {
        this.yandex = c12864l;
        this.loadAd = c2308l;
    }

    @Override // defpackage.InterfaceC10135l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.loadAd.yandex(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((C12864l) it.next()).yandex.loadAd(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        C18262l.ads("decryption failed");
        return null;
    }

    @Override // defpackage.InterfaceC10135l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) {
        byte[] bArrYandex = this.yandex.yandex.yandex(bArr, bArr2);
        int length = bArr.length;
        return bArrYandex;
    }
}

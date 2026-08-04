package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙؔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6231l implements InterfaceC11416l {
    public final C2308l yandex;

    public C6231l(C2308l c2308l) {
        this.yandex = c2308l;
    }

    @Override // defpackage.InterfaceC11416l
    public final byte[] yandex(byte[] bArr) throws GeneralSecurityException {
        Iterator it = this.yandex.yandex(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((C9587l) it.next()).yandex.yandex(bArr);
            } catch (GeneralSecurityException unused) {
            }
        }
        C18262l.ads("decryption failed");
        return null;
    }
}

package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lۣؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1438l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C6254l f3620l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f3621l;

    public C1438l(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f3621l = bArr;
        if (bArr.length == 32) {
            secureRandom.nextBytes(bArr);
        } else {
            C8339l.metrica("k");
            throw null;
        }
    }

    public final C6254l yandex() {
        C6254l c6254l;
        synchronized (this.f3621l) {
            try {
                if (this.f3620l == null) {
                    this.f3620l = new C6254l(AbstractC13041l.billing(this.f3621l));
                }
                c6254l = this.f3620l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6254l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1438l(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length == 32) {
        } else {
            C8339l.metrica("'buf' must have length 32");
            throw null;
        }
    }

    public C1438l(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.f3621l = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }
}

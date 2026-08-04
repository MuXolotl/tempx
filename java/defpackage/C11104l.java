package defpackage;

/* JADX INFO: renamed from: lُِ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11104l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C7972l f22309l;

    public C11104l(byte[] bArr, int i) {
        C7972l c7972l;
        super(false);
        byte[] bArr2 = new byte[57];
        System.arraycopy(bArr, i, bArr2, 0, 57);
        if ((bArr2[56] & 127) == 0) {
            int iCrashlytics = AbstractC16655l.crashlytics(52, bArr2);
            int[] iArr = AbstractC15960l.loadAd;
            int i2 = iArr[13] ^ iCrashlytics;
            int i3 = 12;
            while (true) {
                if (i3 <= 0) {
                    int iCrashlytics2 = AbstractC16655l.crashlytics(0, bArr2);
                    if ((iCrashlytics != 0 || AbstractC14289l.admob(iCrashlytics2, 1) > 0) && (i2 != 0 || AbstractC14289l.admob(iCrashlytics2, iArr[0] - 1) < 0)) {
                        C12507l c12507l = new C12507l(1);
                        if (!AbstractC15960l.amazon(bArr2, false, c12507l)) {
                            break;
                        }
                        int[] iArr2 = new int[32];
                        AbstractC6791l.billing(0, 0, c12507l.f24647l, iArr2);
                        AbstractC6791l.billing(0, 16, c12507l.f24646l, iArr2);
                        c7972l = new C7972l(10, iArr2);
                        break;
                    }
                } else {
                    int iCrashlytics3 = AbstractC16655l.crashlytics(i3 * 4, bArr2);
                    if (i2 != 0 || AbstractC14289l.admob(iCrashlytics3, iArr[i3]) <= 0) {
                        iCrashlytics |= iCrashlytics3;
                        i2 |= iCrashlytics3 ^ iArr[i3];
                        i3--;
                    }
                }
                c7972l = null;
                break;
            }
        } else {
            c7972l = null;
            break;
        }
        if (c7972l != null) {
            this.f22309l = c7972l;
        } else {
            C8339l.metrica("invalid public key");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11104l(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length == 57) {
        } else {
            C8339l.metrica("'buf' must have length 57");
            throw null;
        }
    }

    public C11104l(C7972l c7972l) {
        super(false);
        this.f22309l = c7972l;
    }
}

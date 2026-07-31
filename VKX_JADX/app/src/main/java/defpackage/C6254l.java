package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lؙٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6254l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13161l f13200l;

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    public C6254l(byte[] bArr, int i) {
        boolean z;
        C13161l c13161l;
        super(false);
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, i, bArr2, 0, 32);
        int iCrashlytics = AbstractC16655l.crashlytics(28, bArr2) & Alert.DURATION_SHOW_INDEFINITELY;
        int[] iArr = AbstractC13041l.yandex;
        int i2 = iArr[7] ^ iCrashlytics;
        int[] iArr2 = AbstractC13041l.loadAd;
        int i3 = iArr2[7] ^ iCrashlytics;
        int[] iArr3 = AbstractC13041l.crashlytics;
        int i4 = iArr3[7] ^ iCrashlytics;
        for (int i5 = 6; i5 > 0; i5--) {
            int iCrashlytics2 = AbstractC16655l.crashlytics(i5 * 4, bArr2);
            iCrashlytics |= iCrashlytics2;
            i2 |= iArr[i5] ^ iCrashlytics2;
            i3 |= iArr2[i5] ^ iCrashlytics2;
            i4 |= iCrashlytics2 ^ iArr3[i5];
        }
        int iCrashlytics3 = AbstractC16655l.crashlytics(0, bArr2);
        if ((iCrashlytics != 0 || AbstractC14289l.admob(iCrashlytics3, 1) > 0) && (i2 != 0 || AbstractC14289l.admob(iCrashlytics3, iArr[0] - 1) < 0)) {
            z = (((iArr2[0] ^ iCrashlytics3) | i3) != 0) & (((iArr3[0] ^ iCrashlytics3) | i4) != 0);
        } else {
            z = false;
        }
        if (z) {
            C10023l c10023l = new C10023l(19);
            if (AbstractC13041l.amazon(bArr2, false, c10023l)) {
                int[] iArr4 = new int[20];
                AbstractC11397l.isPro(0, 0, (int[]) c10023l.f20419l, iArr4);
                AbstractC11397l.isPro(0, 10, (int[]) c10023l.f20418l, iArr4);
                c13161l = new C13161l(iArr4);
            } else {
                c13161l = null;
            }
        } else {
            c13161l = null;
        }
        if (c13161l == null) {
            C8339l.metrica("invalid public key");
            throw null;
        }
        this.f13200l = c13161l;
    }

    public final byte[] getEncoded() {
        byte[] bArr = new byte[32];
        AbstractC13041l.purchase(this.f13200l, bArr, 0);
        return bArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6254l(byte[] bArr) {
        this(bArr, 0);
        if (bArr.length == 32) {
        } else {
            C8339l.metrica("'buf' must have length 32");
            throw null;
        }
    }

    public C6254l(C13161l c13161l) {
        super(false);
        this.f13200l = c13161l;
    }
}

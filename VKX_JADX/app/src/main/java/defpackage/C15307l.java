package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٔۦؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15307l {
    public final int admob;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final float firebase;
    public final int isPro;
    public final int loadAd;
    public final int mopub;
    public final int purchase;
    public final String smaato;
    public final int subs;
    public final ArrayList yandex;

    public C15307l(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.yandex = arrayList;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = i4;
        this.billing = i5;
        this.mopub = i6;
        this.admob = i7;
        this.subs = i8;
        this.isPro = i9;
        this.firebase = f;
        this.smaato = str;
    }

    public static C15307l yandex(C13143l c13143l) throws C17655l {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            c13143l.m3568throw(4);
            int iSignatures = (c13143l.signatures() & 3) + 1;
            if (iSignatures == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iSignatures2 = c13143l.signatures() & 31;
            for (int i9 = 0; i9 < iSignatures2; i9++) {
                int iM3567synchronized = c13143l.m3567synchronized();
                int i10 = c13143l.loadAd;
                c13143l.m3568throw(iM3567synchronized);
                byte[] bArr = c13143l.yandex;
                byte[] bArr2 = new byte[iM3567synchronized + 4];
                System.arraycopy(AbstractC14501l.yandex, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iM3567synchronized);
                arrayList.add(bArr2);
            }
            int iSignatures3 = c13143l.signatures();
            for (int i11 = 0; i11 < iSignatures3; i11++) {
                int iM3567synchronized2 = c13143l.m3567synchronized();
                int i12 = c13143l.loadAd;
                c13143l.m3568throw(iM3567synchronized2);
                byte[] bArr3 = c13143l.yandex;
                byte[] bArr4 = new byte[iM3567synchronized2 + 4];
                System.arraycopy(AbstractC14501l.yandex, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iM3567synchronized2);
                arrayList.add(bArr4);
            }
            if (iSignatures2 > 0) {
                C15055l c15055lTapsense = AbstractC16763l.tapsense(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = c15055lTapsense.purchase;
                int i14 = c15055lTapsense.billing;
                int i15 = c15055lTapsense.admob + 8;
                int i16 = c15055lTapsense.subs + 8;
                int i17 = c15055lTapsense.startapp;
                int i18 = c15055lTapsense.adcel;
                int i19 = c15055lTapsense.ads;
                int i20 = c15055lTapsense.subscription;
                float f2 = c15055lTapsense.mopub;
                int i21 = c15055lTapsense.yandex;
                int i22 = c15055lTapsense.loadAd;
                int i23 = c15055lTapsense.crashlytics;
                byte[] bArr5 = AbstractC14501l.yandex;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i6 = i20;
                f = f2;
                i7 = i18;
                i8 = i19;
                i4 = i16;
                i5 = i17;
                i2 = i14;
                i3 = i15;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new C15307l(arrayList, iSignatures, i, i2, i3, i4, i5, i7, i8, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C17655l.yandex(e, "Error parsing AVC config");
        }
    }
}

package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًً۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8312l {
    public final int loadAd;
    public final byte[] yandex;

    public C8312l(byte[] bArr, int i, int i2) {
        this.yandex = AbstractC14024l.crashlytics(bArr);
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8312l)) {
            return false;
        }
        C8312l c8312l = (C8312l) obj;
        if (c8312l.loadAd != this.loadAd) {
            return false;
        }
        return Arrays.equals(this.yandex, c8312l.yandex);
    }

    public final int hashCode() {
        return this.loadAd ^ AbstractC14024l.ads(this.yandex);
    }
}

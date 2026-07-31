package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٓۚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14396l {
    public final int loadAd;
    public final byte[] yandex;

    public C14396l(byte[] bArr, int i) {
        this.yandex = AbstractC14024l.crashlytics(bArr);
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14396l)) {
            return false;
        }
        C14396l c14396l = (C14396l) obj;
        if (c14396l.loadAd != this.loadAd) {
            return false;
        }
        return Arrays.equals(this.yandex, c14396l.yandex);
    }

    public final int hashCode() {
        return this.loadAd ^ AbstractC14024l.ads(this.yandex);
    }
}

package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: extends, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cextends {
    public final byte[] loadAd;
    public final int yandex;

    public Cextends(byte[] bArr) {
        this.yandex = AbstractC14024l.ads(bArr);
        this.loadAd = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cextends)) {
            return false;
        }
        return Arrays.equals(this.loadAd, ((Cextends) obj).loadAd);
    }

    public final int hashCode() {
        return this.yandex;
    }
}

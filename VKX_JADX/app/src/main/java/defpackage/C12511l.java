package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: lَؘّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12511l {
    public final List loadAd;
    public final File yandex;

    public C12511l(File file, List list) {
        this.yandex = file;
        this.loadAd = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12511l)) {
            return false;
        }
        C12511l c12511l = (C12511l) obj;
        return this.yandex.equals(c12511l.yandex) && this.loadAd.equals(c12511l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.yandex);
        sb.append(", segments=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}

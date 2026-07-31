package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lؚّؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7210l {
    public final boolean yandex;

    public C7210l(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            C6541l.subs("Null osRelease");
            throw null;
        }
        if (str2 != null) {
            this.yandex = z;
        } else {
            C6541l.subs("Null osCodeName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7210l)) {
            return false;
        }
        C7210l c7210l = (C7210l) obj;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.yandex == c7210l.yandex;
    }

    public final int hashCode() {
        return (this.yandex ? 1231 : 1237) ^ ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", osCodeName=");
        sb.append(Build.VERSION.CODENAME);
        sb.append(", isRooted=");
        return AbstractC5020l.Signature(sb, this.yandex, "}");
    }
}

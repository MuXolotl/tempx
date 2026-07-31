package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: lؘؖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3879l extends AbstractC6273l {
    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public static final boolean m1444l(String str) {
        String str2 = (String) AbstractC5981l.tapsense.yandex(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public final String m1445l(String str) {
        C8315l c8315l = this.f13233l.f14460l;
        C6901l.m2082case(c8315l);
        String strM2313l = c8315l.m2313l(str);
        if (TextUtils.isEmpty(strM2313l)) {
            return (String) AbstractC5981l.ads.yandex(null);
        }
        Uri uri = Uri.parse((String) AbstractC5981l.ads.yandex(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strM2313l).length() + 1 + String.valueOf(authority).length());
        sb.append(strM2313l);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.m1786strictfp().tapsense()) goto L28;
     */
    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C7835l m1446l(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3879l.m1446l(java.lang.String):lًؙۛ");
    }
}

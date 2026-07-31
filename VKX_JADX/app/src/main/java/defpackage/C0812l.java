package defpackage;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؒؔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0812l implements Comparable {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Pattern f2432l = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Pattern f2433l = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final Pattern f2434l = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f2435l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f2436l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f2437l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final File f2438l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f2439l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f2440l;

    public C0812l(String str, long j, long j2, long j3, File file) {
        this.f2437l = str;
        this.f2436l = j;
        this.f2435l = j2;
        this.f2439l = file != null;
        this.f2438l = file;
        this.f2440l = j3;
    }

    public static File crashlytics(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, AbstractC15560l.ads(j2, ".v3.exo", sb));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f A[PHI: r2
  0x009f: PHI (r2v15 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0095, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    public static C0812l loadAd(File file, long j, long j2, C1424l c1424l) {
        File file2;
        long j3;
        String strGroup;
        File fileCrashlytics;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = f2433l.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                strGroup.getClass();
                String str = AbstractC15323l.yandex;
                int length = strGroup.length();
                int iEnd = 0;
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (strGroup.charAt(i2) == '%') {
                        i++;
                    }
                }
                if (i != 0) {
                    int i3 = length - (i * 2);
                    StringBuilder sb = new StringBuilder(i3);
                    Matcher matcher2 = AbstractC15323l.purchase.matcher(strGroup);
                    while (i > 0 && matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        char c = (char) Integer.parseInt(strGroup2, 16);
                        sb.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb.append(c);
                        iEnd = matcher2.end();
                        i--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb.length() != i3) {
                        strGroup = null;
                    } else {
                        strGroup = sb.toString();
                    }
                }
            } else {
                matcher = f2432l.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileCrashlytics = null;
            } else {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                int i4 = c1424l.m914instanceof(strGroup).yandex;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j4 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileCrashlytics = crashlytics(parentFile, i4, j4, Long.parseLong(strGroup4));
                if (!file.renameTo(fileCrashlytics)) {
                    fileCrashlytics = null;
                }
            }
            if (fileCrashlytics == null) {
                return null;
            }
            file2 = fileCrashlytics;
            name = fileCrashlytics.getName();
        }
        Matcher matcher3 = f2434l.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String strGroup5 = matcher3.group(1);
        strGroup5.getClass();
        String str2 = (String) ((SparseArray) c1424l.f3602l).get(Integer.parseInt(strGroup5));
        if (str2 == null) {
            return null;
        }
        long length2 = j == -1 ? file2.length() : j;
        if (length2 == 0) {
            return null;
        }
        String strGroup6 = matcher3.group(2);
        strGroup6.getClass();
        long j5 = Long.parseLong(strGroup6);
        if (j2 == -9223372036854775807L) {
            String strGroup7 = matcher3.group(3);
            strGroup7.getClass();
            j3 = Long.parseLong(strGroup7);
        } else {
            j3 = j2;
        }
        return new C0812l(str2, j5, length2, j3, file2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f2436l);
        sb.append(", ");
        return AbstractC15560l.ads(this.f2435l, "]", sb);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0812l c0812l) {
        String str = c0812l.f2437l;
        String str2 = this.f2437l;
        if (!str2.equals(str)) {
            return str2.compareTo(c0812l.f2437l);
        }
        long j = this.f2436l - c0812l.f2436l;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}

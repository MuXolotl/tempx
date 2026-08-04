package defpackage;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: lًِٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7943l implements Comparator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C7943l f16542l = new C7943l(2);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16543l;

    public /* synthetic */ C7943l(int i) {
        this.f16543l = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16543l) {
            case 0:
                int iCrashlytics = AbstractC9029l.crashlytics(obj);
                int iCrashlytics2 = AbstractC9029l.crashlytics(obj2);
                if (iCrashlytics != iCrashlytics2) {
                    return AbstractC5020l.subs(iCrashlytics, iCrashlytics2);
                }
                int iInmobi = AbstractC5020l.inmobi(iCrashlytics);
                if (iInmobi == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iInmobi == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iInmobi == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iInmobi == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 1:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}

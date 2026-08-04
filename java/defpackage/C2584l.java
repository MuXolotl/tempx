package defpackage;

/* JADX INFO: renamed from: lْؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2584l extends Exception {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f5629l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f5630l;

    public C2584l(int i, String str) {
        this.f5629l = i;
        this.f5630l = str;
    }

    public static C2584l yandex(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
        }
        if (str2 != null) {
            if (sb.length() > 0) {
                sb.append(" - ");
            }
            sb.append(str2);
        }
        return sb.length() > 0 ? new C2584l(i, sb.toString()) : new C2584l(i, null);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.f5630l;
        int i = this.f5629l;
        if (str == null) {
            return AbstractC15560l.smaato(i);
        }
        return AbstractC15560l.smaato(i) + ": " + str;
    }
}

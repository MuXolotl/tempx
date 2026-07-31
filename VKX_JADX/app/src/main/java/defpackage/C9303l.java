package defpackage;

/* JADX INFO: renamed from: lٍِؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9303l extends RuntimeException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f19114l;

    public C9303l(int i, String str, C3890l c3890l) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + str.length());
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, c3890l);
        this.f19114l = i;
    }
}

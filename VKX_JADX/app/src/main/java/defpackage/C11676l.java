package defpackage;

/* JADX INFO: renamed from: lٍؙِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11676l {
    public static final C11676l crashlytics = new C11676l();
    public final boolean yandex = true;
    public final boolean loadAd = true;

    public C11676l() {
        if (AbstractC17457l.admob("")) {
            return;
        }
        AbstractC17457l.admob("");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        yandex("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }

    public final void yandex(String str, StringBuilder sb) {
        AbstractC9361l.appmetrica(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }
}

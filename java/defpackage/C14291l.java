package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lٓٝٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14291l {
    public static final C14291l amazon = new C14291l();
    public final boolean crashlytics;
    public final boolean yandex = true;
    public final boolean loadAd = true;

    public C14291l() {
        boolean z = true;
        if (!AbstractC17457l.admob("  ") && !AbstractC17457l.admob("") && !AbstractC17457l.admob("") && !AbstractC17457l.admob("")) {
            z = false;
        }
        this.crashlytics = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        yandex("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }

    public final void yandex(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Alert.DURATION_SHOW_INDEFINITELY);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Alert.DURATION_SHOW_INDEFINITELY);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        AbstractC9361l.appmetrica(sb, str, "bytePrefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }
}

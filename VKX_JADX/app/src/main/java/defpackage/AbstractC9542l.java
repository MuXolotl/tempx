package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٍٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9542l implements Closeable {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final String[] f19444l = new String[128];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String[] f19445l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int[] f19446l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f19447l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int[] f19448l;

    static {
        for (int i = 0; i <= 31; i++) {
            f19444l[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f19444l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public final String adcel() {
        int i = this.f19447l;
        int[] iArr = this.f19446l;
        String[] strArr = this.f19445l;
        int[] iArr2 = this.f19448l;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean ads();

    public abstract void billing();

    /* JADX INFO: renamed from: continue */
    public abstract void mo1275continue();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m2682default(String str) throws C8413l {
        StringBuilder sbAdvert = AbstractC5020l.advert(str, " at path ");
        sbAdvert.append(adcel());
        throw new C8413l(sbAdvert.toString());
    }

    public abstract int inmobi();

    public abstract boolean isVip();

    public abstract void mopub();

    /* JADX INFO: renamed from: package */
    public abstract String mo1284package();

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m2683private(int i) {
        int i2 = this.f19447l;
        int[] iArr = this.f19446l;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new C6451l("Nesting too deep at ".concat(adcel()), 9, (byte) 0);
            }
            this.f19446l = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f19445l;
            this.f19445l = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f19448l;
            this.f19448l = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f19446l;
        int i3 = this.f19447l;
        this.f19447l = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract double signatures();

    /* JADX INFO: renamed from: switch */
    public abstract void mo1286switch();

    /* JADX INFO: renamed from: synchronized */
    public abstract int mo1287synchronized();

    /* JADX INFO: renamed from: throw */
    public abstract int mo1288throw(C3797l c3797l);

    public abstract void vip();

    public abstract void yandex();
}

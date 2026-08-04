package defpackage;

/* JADX INFO: renamed from: lّ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12671l implements Cloneable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f24958l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f24959l;

    public C12671l(float f) {
        this.f24959l = f;
        this.f24958l = 1;
    }

    public final boolean admob() {
        return this.f24959l == 0.0f;
    }

    public final float amazon(C1424l c1424l) {
        float textSize;
        int iInmobi = AbstractC5020l.inmobi(this.f24958l);
        float f = this.f24959l;
        switch (iInmobi) {
            case 1:
                textSize = ((C16539l) c1424l.f3601l).amazon.getTextSize();
                break;
            case 2:
                textSize = ((C16539l) c1424l.f3601l).amazon.getTextSize() / 2.0f;
                break;
            case 3:
                c1424l.getClass();
                return f * 96.0f;
            case 4:
                c1424l.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                c1424l.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                c1424l.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                c1424l.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                C16539l c16539l = (C16539l) c1424l.f3601l;
                C10006l c10006l = c16539l.mopub;
                if (c10006l == null) {
                    c10006l = c16539l.billing;
                }
                if (c10006l != null) {
                    return (f * c10006l.amazon) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final boolean billing() {
        return this.f24959l < 0.0f;
    }

    public final float crashlytics() {
        float f;
        float f2;
        int iInmobi = AbstractC5020l.inmobi(this.f24958l);
        float f3 = this.f24959l;
        if (iInmobi == 0) {
            return f3;
        }
        if (iInmobi == 3) {
            return f3 * 96.0f;
        }
        if (iInmobi == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (iInmobi == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (iInmobi == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (iInmobi != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final float loadAd(C1424l c1424l, float f) {
        return this.f24958l == 9 ? (this.f24959l * f) / 100.0f : amazon(c1424l);
    }

    public final float purchase(C1424l c1424l) {
        if (this.f24958l != 9) {
            return amazon(c1424l);
        }
        C16539l c16539l = (C16539l) c1424l.f3601l;
        C10006l c10006l = c16539l.mopub;
        if (c10006l == null) {
            c10006l = c16539l.billing;
        }
        float f = this.f24959l;
        return c10006l == null ? f : (f * c10006l.purchase) / 100.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f24959l));
        switch (this.f24958l) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public final float yandex(C1424l c1424l) {
        if (this.f24958l != 9) {
            return amazon(c1424l);
        }
        C16539l c16539l = (C16539l) c1424l.f3601l;
        C10006l c10006l = c16539l.mopub;
        if (c10006l == null) {
            c10006l = c16539l.billing;
        }
        float f = this.f24959l;
        if (c10006l == null) {
            return f;
        }
        float fSqrt = c10006l.amazon;
        float f2 = c10006l.purchase;
        if (fSqrt != f2) {
            fSqrt = (float) (Math.sqrt((f2 * f2) + (fSqrt * fSqrt)) / 1.414213562373095d);
        }
        return (f * fSqrt) / 100.0f;
    }

    public C12671l(int i, float f) {
        this.f24959l = f;
        this.f24958l = i;
    }
}

package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lؙٓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C6451l extends RuntimeException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13486l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6451l(String str, int i) {
        super(String.format(Locale.getDefault(), "Unable to find next atom because identifier is invalid %s, length:%d", str, Integer.valueOf(i)));
        this.f13486l = 7;
    }

    public static String amazon(int i, int i2, String str, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    public static C6451l crashlytics(String str, int i, String str2) {
        return new C6451l(amazon(i, i + 1, str, str2), 21, (byte) 0);
    }

    public static C6451l loadAd(int i, int i2, String str, String str2) {
        return new C6451l(amazon(i, i2, str, str2), 21, (byte) 0);
    }

    private final synchronized Throwable yandex() {
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f13486l) {
            case 21:
                yandex();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6451l(int i, String str, Throwable th) {
        super(str, th);
        this.f13486l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6451l(int i, Throwable th) {
        super(th);
        this.f13486l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6451l(String str, int i, byte b) {
        super(str);
        this.f13486l = i;
    }

    public /* synthetic */ C6451l(int i) {
        this.f13486l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6451l(Object[] objArr) {
        super(String.format(Locale.getDefault(), "DO not know how to create this atom type %s", objArr));
        this.f13486l = 18;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6451l() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f13486l = 17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6451l(String str) {
        super(str.toString());
        this.f13486l = 12;
    }
}

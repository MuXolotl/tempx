package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: lؕۚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3631l implements Closeable, Flushable {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final String[] f7571l = new String[128];

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC16805l f7573l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public String f7574l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int[] f7575l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f7576l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f7577l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String[] f7572l = new String[32];

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int[] f7578l = new int[32];

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7579l = -1;

    static {
        for (int i = 0; i <= 31; i++) {
            f7571l[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f7571l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C3631l(InterfaceC16805l interfaceC16805l) {
        this.f7576l = 0;
        int[] iArr = new int[32];
        this.f7575l = iArr;
        if (interfaceC16805l == null) {
            C6541l.subs("sink == null");
            throw null;
        }
        this.f7573l = interfaceC16805l;
        this.f7576l = 1;
        iArr[0] = 6;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static void m1363synchronized(InterfaceC16805l interfaceC16805l, String str) {
        String str2;
        interfaceC16805l.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = f7571l[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        interfaceC16805l.mo729return(i, i2, str);
                    }
                    interfaceC16805l.mo706finally(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    interfaceC16805l.mo729return(i, i2, str);
                }
                interfaceC16805l.mo706finally(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            interfaceC16805l.mo729return(i, length, str);
        }
        interfaceC16805l.writeByte(34);
    }

    public final C3631l adcel() {
        this.f7577l = false;
        vip(3, 5, '}');
        return this;
    }

    public final String ads() {
        return AbstractC10409l.amazon(this.f7576l, this.f7575l, this.f7572l, this.f7578l);
    }

    public final C3631l billing() {
        if (this.f7577l) {
            C8339l.smaato("Array cannot be used as a map key in JSON at path ".concat(ads()));
            return null;
        }
        m1366switch();
        inmobi(1, 2, '[');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7573l.close();
        int i = this.f7576l;
        if (i > 1 || (i == 1 && this.f7575l[i - 1] != 7)) {
            C18262l.metrica("Incomplete document");
        } else {
            this.f7576l = 0;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f7576l != 0) {
            this.f7573l.flush();
        } else {
            C8339l.smaato("JsonWriter is closed.");
        }
    }

    public final void inmobi(int i, int i2, char c) {
        int i3;
        int i4 = this.f7576l;
        int i5 = this.f7579l;
        if (i4 == i5 && ((i3 = this.f7575l[i4 - 1]) == i || i3 == i2)) {
            this.f7579l = ~i5;
            return;
        }
        yandex();
        int i6 = this.f7576l;
        int[] iArr = this.f7575l;
        byte b = 0;
        if (i6 == iArr.length) {
            if (i6 == 256) {
                throw new C6451l("Nesting too deep at " + ads() + ": circular reference?", 8, b);
            }
            this.f7575l = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f7572l;
            this.f7572l = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f7578l;
            this.f7578l = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f7575l;
        int i7 = this.f7576l;
        this.f7576l = i7 + 1;
        iArr3[i7] = i;
        this.f7578l[i7] = 0;
        this.f7573l.writeByte(c);
    }

    public final C3631l isVip(String str) {
        if (str == null) {
            C6541l.subs("name == null");
            return null;
        }
        if (this.f7576l == 0) {
            C8339l.smaato("JsonWriter is closed.");
            return null;
        }
        int iM1364package = m1364package();
        if ((iM1364package != 3 && iM1364package != 5) || this.f7574l != null || this.f7577l) {
            C8339l.smaato("Nesting problem.");
            return null;
        }
        this.f7574l = str;
        this.f7572l[this.f7576l - 1] = str;
        return this;
    }

    public final C3631l mopub() {
        if (this.f7577l) {
            C8339l.smaato("Object cannot be used as a map key in JSON at path ".concat(ads()));
            return null;
        }
        m1366switch();
        inmobi(3, 5, '{');
        return this;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final int m1364package() {
        int i = this.f7576l;
        if (i != 0) {
            return this.f7575l[i - 1];
        }
        C8339l.smaato("JsonWriter is closed.");
        return 0;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final C3631l m1365private(long j) {
        if (this.f7577l) {
            this.f7577l = false;
            isVip(Long.toString(j));
            return this;
        }
        m1366switch();
        yandex();
        this.f7573l.mo706finally(Long.toString(j));
        int[] iArr = this.f7578l;
        int i = this.f7576l - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final C3631l signatures() {
        if (this.f7577l) {
            C8339l.smaato("null cannot be used as a map key in JSON at path ".concat(ads()));
            return null;
        }
        if (this.f7574l != null) {
            this.f7574l = null;
            return this;
        }
        yandex();
        this.f7573l.mo706finally("null");
        int[] iArr = this.f7578l;
        int i = this.f7576l - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m1366switch() {
        if (this.f7574l != null) {
            int iM1364package = m1364package();
            InterfaceC16805l interfaceC16805l = this.f7573l;
            if (iM1364package == 5) {
                interfaceC16805l.writeByte(44);
            } else if (iM1364package != 3) {
                C8339l.smaato("Nesting problem.");
                return;
            }
            this.f7575l[this.f7576l - 1] = 4;
            m1363synchronized(interfaceC16805l, this.f7574l);
            this.f7574l = null;
        }
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final C3631l m1367throw(String str) {
        if (str == null) {
            signatures();
            return this;
        }
        if (this.f7577l) {
            this.f7577l = false;
            isVip(str);
            return this;
        }
        m1366switch();
        yandex();
        m1363synchronized(this.f7573l, str);
        int[] iArr = this.f7578l;
        int i = this.f7576l - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void vip(int i, int i2, char c) {
        int iM1364package = m1364package();
        if (iM1364package != i2 && iM1364package != i) {
            C8339l.smaato("Nesting problem.");
            return;
        }
        if (this.f7574l != null) {
            C1759l.isPro(this.f7574l, "Dangling name: ");
            return;
        }
        int i3 = this.f7576l;
        int i4 = ~this.f7579l;
        if (i3 == i4) {
            this.f7579l = i4;
            return;
        }
        int i5 = i3 - 1;
        this.f7576l = i5;
        this.f7572l[i5] = null;
        int[] iArr = this.f7578l;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f7573l.writeByte(c);
    }

    public final void yandex() {
        int iM1364package = m1364package();
        int i = 2;
        if (iM1364package != 1) {
            InterfaceC16805l interfaceC16805l = this.f7573l;
            if (iM1364package == 2) {
                interfaceC16805l.writeByte(44);
            } else if (iM1364package == 4) {
                interfaceC16805l.mo706finally(":");
                i = 5;
            } else if (iM1364package == 9) {
                C8339l.smaato("Sink from valueSink() was not closed");
                return;
            } else {
                if (iM1364package != 6) {
                    if (iM1364package != 7) {
                        C8339l.smaato("Nesting problem.");
                        return;
                    } else {
                        C8339l.smaato("JSON must have only one top-level value.");
                        return;
                    }
                }
                i = 7;
            }
        }
        this.f7575l[this.f7576l - 1] = i;
    }
}

package defpackage;

import java.util.Iterator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lَُؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10828l implements InterfaceC4930l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C10828l f21886l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C10828l f21887l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C10828l f21888l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f21889l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21890l;

    static {
        int i = 0;
        f21886l = new C10828l("TINK", i);
        f21888l = new C10828l("CRUNCHY", i);
        f21887l = new C10828l("NO_PREFIX", i);
    }

    public C10828l(String str) {
        this.f21890l = 1;
        this.f21889l = str;
        if (str.length() > 0) {
            return;
        }
        C8339l.smaato("Date parser pattern shouldn't be empty.");
        throw null;
    }

    public static void crashlytics(C1424l c1424l, char c, String str) {
        Object next;
        if (c != '*') {
            if (c == 'M') {
                Iterator it = EnumC7557l.f15554l.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((EnumC7557l) next).f15556l.equals(str));
                EnumC7557l enumC7557l = (EnumC7557l) next;
                if (enumC7557l != null) {
                    c1424l.f3604l = enumC7557l;
                    return;
                } else {
                    C18262l.subs("Invalid month: ".concat(str));
                    return;
                }
            }
            if (c == 'Y') {
                c1424l.f3606l = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'd') {
                c1424l.f3605l = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'h') {
                c1424l.f3601l = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'm') {
                c1424l.f3602l = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 's') {
                c1424l.f3603l = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'z') {
                if (str.equals("GMT")) {
                    return;
                }
                C8339l.smaato("Check failed.");
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != c) {
                        C8339l.smaato("Check failed.");
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC4930l
    public /* bridge */ /* synthetic */ void amazon(Object obj) {
    }

    public byte[] loadAd(byte[] bArr, byte[] bArr2) {
        InterfaceC16334l interfaceC16334l = C12437l.crashlytics.yandex;
        String str = this.f21889l;
        Mac mac = (Mac) interfaceC16334l.appmetrica(str);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        return mac.doFinal(bArr);
    }

    @Override // defpackage.InterfaceC4930l
    public void mopub(Throwable th) {
        AbstractC6427l.metrica("MediaNtfMng", "custom command " + this.f21889l + " produced an error: " + th.getMessage(), th);
    }

    public C8485l purchase(String str) {
        C1424l c1424l = new C1424l();
        String str2 = this.f21889l;
        char cCharAt = str2.charAt(0);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i2 < str2.length()) {
            try {
                if (str2.charAt(i2) == cCharAt) {
                    i2++;
                } else {
                    int i4 = (i + i2) - i3;
                    crashlytics(c1424l, cCharAt, str.substring(i, i4));
                    try {
                        cCharAt = str2.charAt(i2);
                        i3 = i2;
                        i2++;
                        i = i4;
                    } catch (Throwable unused) {
                        i = i4;
                        StringBuilder sb = new StringBuilder("Failed to parse date string: \"");
                        sb.append(str);
                        sb.append("\" at index ");
                        sb.append(i);
                        sb.append(". Pattern: \"");
                        throw new C4773l(AbstractC2812l.tapsense(sb, str2, '\"'));
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i < str.length()) {
            crashlytics(c1424l, cCharAt, str.substring(i));
        }
        int iIntValue = ((Integer) c1424l.f3603l).intValue();
        int iIntValue2 = ((Integer) c1424l.f3602l).intValue();
        int iIntValue3 = ((Integer) c1424l.f3601l).intValue();
        int iIntValue4 = ((Integer) c1424l.f3605l).intValue();
        EnumC7557l enumC7557l = (EnumC7557l) c1424l.f3604l;
        if (enumC7557l == null) {
            enumC7557l = null;
        }
        return AbstractC7973l.yandex(iIntValue, iIntValue2, iIntValue3, iIntValue4, enumC7557l, ((Integer) c1424l.f3606l).intValue());
    }

    public String toString() {
        int i = this.f21890l;
        String str = this.f21889l;
        switch (i) {
            case 0:
            case 4:
                return str;
            default:
                return super.toString();
        }
    }

    public byte[] yandex(byte[] bArr, int i, byte[] bArr2) {
        InterfaceC16334l interfaceC16334l = C12437l.crashlytics.yandex;
        String str = this.f21889l;
        Mac mac = (Mac) interfaceC16334l.appmetrica(str);
        if (i > mac.getMacLength() * 255) {
            C18262l.ads("size too large");
            return null;
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, i - length);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i2++;
        }
    }

    public /* synthetic */ C10828l(String str, int i) {
        this.f21890l = i;
        this.f21889l = str;
    }
}

package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lِۣؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2208l {
    public static final Set amazon;
    public static final ArrayList crashlytics;
    public static final Set loadAd;
    public static final ArrayList purchase;
    public static final Set yandex;

    static {
        ArrayList arrayListM4232new = AbstractC16901l.m4232new(AbstractC16901l.m4238static(new C13053l('a', 'z'), new C13053l('A', 'Z')), new C13053l('0', '9'));
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListM4232new, 10));
        Iterator it = arrayListM4232new.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        yandex = AbstractC16901l.m4229l(arrayList);
        loadAd = AbstractC16901l.m4229l(AbstractC16901l.m4232new(AbstractC16901l.m4238static(new C13053l('a', 'z'), new C13053l('A', 'Z')), new C13053l('0', '9')));
        AbstractC16901l.m4229l(AbstractC16901l.m4232new(AbstractC16901l.m4238static(new C13053l('a', 'f'), new C13053l('A', 'F')), new C13053l('0', '9')));
        Set setM2407import = AbstractC8669l.m2407import(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(setM2407import, 10));
        Iterator it2 = setM2407import.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        crashlytics = arrayList2;
        amazon = AbstractC8669l.m2407import(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        AbstractC9905l.mopub(loadAd, AbstractC8669l.m2407import(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listRemoteconfig = AbstractC14055l.remoteconfig('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(listRemoteconfig, 10));
        Iterator it3 = listRemoteconfig.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        purchase = arrayList3;
    }

    public static String amazon(int i, int i2, int i3, String str) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = AbstractC9050l.yandex;
        return loadAd(i, i2, str, z);
    }

    public static final String billing(String str) {
        StringBuilder sb = new StringBuilder();
        Charset charset = AbstractC9050l.yandex;
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (loadAd.contains(Character.valueOf(cCharAt)) || amazon.contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
                i++;
            } else {
                int i2 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                int i3 = i2 + i;
                C18476l c18476l = new C18476l();
                AbstractC15788l.crashlytics(charsetEncoderNewEncoder, c18476l, str, i, i3);
                while (!c18476l.subs()) {
                    while (!c18476l.subs()) {
                        sb.append(mopub(c18476l.readByte()));
                        Unit unit = Unit.INSTANCE;
                    }
                }
                i = i3;
            }
        }
        return sb.toString();
    }

    public static String crashlytics(int i, int i2, int i3, String str) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        Charset charset = AbstractC9050l.yandex;
        return loadAd(i, i2, str, false);
    }

    public static final String loadAd(int i, int i2, String str, boolean z) throws C1610l {
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (z && cCharAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char cCharAt2 = str.charAt(i3);
                    if (z && cCharAt2 == '+') {
                        sb.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 >= i2) {
                                StringBuilder sb2 = new StringBuilder("Incomplete trailing HEX escape: ");
                                sb2.append(str.subSequence(i3, str.length()).toString());
                                sb2.append(", in ");
                                sb2.append((Object) str);
                                throw new C1610l(AbstractC9361l.Signature(i3, " at ", sb2));
                            }
                            int i7 = i3 + 1;
                            int iYandex = yandex(str.charAt(i7));
                            int iYandex2 = yandex(str.charAt(i6));
                            if (iYandex == -1 || iYandex2 == -1) {
                                throw new C1610l("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((iYandex * 16) + iYandex2);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(AbstractC16648l.subscription(bArr, 0, i5, 4));
                    } else {
                        sb.append(cCharAt2);
                    }
                    i3++;
                }
                return sb.toString();
            }
            i3++;
        }
        return (i == 0 && i2 == str.length()) ? str.toString() : str.substring(i, i2);
    }

    public static final String mopub(byte b) {
        int i = (b & 255) >> 4;
        int i2 = b & 15;
        return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }

    public static final String purchase(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = AbstractC9050l.yandex.newEncoder();
        int length = str.length();
        C18476l c18476l = new C18476l();
        AbstractC15788l.crashlytics(charsetEncoderNewEncoder, c18476l, str, 0, length);
        while (!c18476l.subs()) {
            while (!c18476l.subs()) {
                byte b = c18476l.readByte();
                Byte bValueOf = Byte.valueOf(b);
                if (yandex.contains(bValueOf) || purchase.contains(bValueOf)) {
                    sb.append((char) b);
                } else if (z && b == 32) {
                    sb.append('+');
                } else {
                    sb.append(mopub(b));
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return sb.toString();
    }

    public static final int yandex(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }
}

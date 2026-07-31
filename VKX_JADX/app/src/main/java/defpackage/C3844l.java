package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: lؖؑۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C3844l implements Serializable, Comparable {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C3844l f7950l = new C3844l(new byte[0]);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient String f7951l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient int f7952l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f7953l;

    public C3844l(byte[] bArr) {
        this.f7953l = bArr;
    }

    public static C3844l adcel(C3844l c3844l, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = c3844l.purchase();
        }
        return c3844l.startapp(i, i2);
    }

    public static int admob(C3844l c3844l, C3844l c3844l2) {
        c3844l.getClass();
        return c3844l.mopub(0, c3844l2.subs());
    }

    public static int smaato(C3844l c3844l, C3844l c3844l2) {
        int iPurchase = c3844l.purchase();
        c3844l.getClass();
        return c3844l.firebase(iPurchase, c3844l2.subs());
    }

    public void Signature(C0869l c0869l, int i) {
        c0869l.write(this.f7953l, 0, i);
    }

    public C3844l ads() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f7953l;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C3844l(bArrCopyOf);
            }
            i++;
        }
    }

    public void amazon(byte[] bArr, int i, int i2, int i3) {
        AbstractC8669l.advert(this.f7953l, i2, i, bArr, i3 + i);
    }

    public String billing() {
        byte[] bArr = this.f7953l;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC2632l.loadAd;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: crashlytics, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3844l c3844l) {
        int iPurchase = purchase();
        int iPurchase2 = c3844l.purchase();
        int iMin = Math.min(iPurchase, iPurchase2);
        for (int i = 0; i < iMin; i++) {
            int iIsPro = isPro(i) & 255;
            int iIsPro2 = c3844l.isPro(i) & 255;
            if (iIsPro != iIsPro2) {
                return iIsPro < iIsPro2 ? -1 : 1;
            }
        }
        if (iPurchase == iPurchase2) {
            return 0;
        }
        return iPurchase < iPurchase2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3844l) {
            C3844l c3844l = (C3844l) obj;
            int iPurchase = c3844l.purchase();
            byte[] bArr = this.f7953l;
            if (iPurchase == bArr.length && c3844l.vip(bArr, 0, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int firebase(int i, byte[] bArr) {
        byte[] bArr2 = this.f7953l;
        for (int iMin = Math.min(i, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC9334l.loadAd(bArr2, iMin, 0, bArr, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i = this.f7952l;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f7953l);
        this.f7952l = iHashCode;
        return iHashCode;
    }

    public byte isPro(int i) {
        return this.f7953l[i];
    }

    public String loadAd() {
        return yandex.yandex(this.f7953l, yandex.yandex);
    }

    public String metrica(Charset charset) {
        return new String(this.f7953l, charset);
    }

    public int mopub(int i, byte[] bArr) {
        byte[] bArr2 = this.f7953l;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC9334l.loadAd(bArr2, iMax, 0, bArr, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int purchase() {
        return this.f7953l.length;
    }

    public boolean remoteconfig(int i, int i2, C3844l c3844l) {
        return c3844l.vip(this.f7953l, 0, i, i2);
    }

    public C3844l startapp(int i, int i2) {
        if (i < 0) {
            C8339l.metrica("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f7953l;
        if (i2 > bArr.length) {
            C10754l.metrica(AbstractC0653l.adcel(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new C3844l(AbstractC8669l.inmobi(i, i2, bArr));
        }
        C8339l.metrica("endIndex < beginIndex");
        return null;
    }

    public byte[] subs() {
        return this.f7953l;
    }

    public byte[] subscription() {
        byte[] bArr = this.f7953l;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String tapsense() {
        String str = this.f7951l;
        if (str != null) {
            return str;
        }
        String str2 = new String(subs(), AbstractC9050l.yandex);
        this.f7951l = str2;
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x01bf A[EDGE_INSN: B:180:0x01bf->B:181:0x01c0 BREAK  A[LOOP:0: B:7:0x000e->B:242:0x000e]] */
    public String toString() {
        byte b;
        int i;
        C3844l c3844l = this;
        byte[] bArr = c3844l.f7953l;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    Unit unit = Unit.INSTANCE;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                Unit unit2 = Unit.INSTANCE;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            Unit unit3 = Unit.INSTANCE;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        } else {
                            Unit unit4 = Unit.INSTANCE;
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strTapsense = c3844l.tapsense();
            String strAdvert = AbstractC16648l.advert(AbstractC16648l.advert(AbstractC16648l.advert(strTapsense.substring(0, i3), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i3 >= strTapsense.length()) {
                return AbstractC14814l.smaato(']', "[text=", strAdvert);
            }
            return "[size=" + bArr.length + " text=" + strAdvert + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c3844l.billing() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            C10754l.metrica(AbstractC0653l.adcel(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (64 != bArr.length) {
            c3844l = new C3844l(AbstractC8669l.inmobi(0, 64, bArr));
        }
        sb.append(c3844l.billing());
        sb.append("…]");
        return sb.toString();
    }

    public boolean vip(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f7953l;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && AbstractC9334l.loadAd(bArr2, i, i2, bArr, i3);
    }

    public ByteBuffer yandex() {
        return ByteBuffer.wrap(this.f7953l).asReadOnlyBuffer();
    }
}

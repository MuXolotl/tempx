package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: lٔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15176l {
    public static final byte[] crashlytics;
    public static final long[] loadAd;
    public static final C10685l yandex = AbstractC12396l.crashlytics(C17721l.firebase, new C8864l(5), new C3755l(7));

    static {
        long j;
        long j2;
        long j3;
        C8934l c8934l = new C8934l(0, 255, 1);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c8934l, 10));
        Iterator it = c8934l.iterator();
        while (true) {
            C16991l c16991l = (C16991l) it;
            if (!c16991l.f33123l) {
                break;
            }
            int iNextInt = c16991l.nextInt();
            if (48 > iNextInt || iNextInt >= 58) {
                j = iNextInt;
                if (j < 97 || j > 102) {
                    if (j < 65 || j > 70) {
                        j2 = -1;
                    } else {
                        j3 = 55;
                    }
                    arrayList.add(Long.valueOf(j2));
                } else {
                    j3 = 87;
                }
            } else {
                j = iNextInt;
                j3 = 48;
            }
            j2 = j - j3;
            arrayList.add(Long.valueOf(j2));
        }
        loadAd = AbstractC16901l.m4237return(arrayList);
        C8934l c8934l2 = new C8934l(0, 15, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(c8934l2, 10));
        Iterator it2 = c8934l2.iterator();
        while (true) {
            C16991l c16991l2 = (C16991l) it2;
            if (!c16991l2.f33123l) {
                crashlytics = AbstractC16901l.m4246transient(arrayList2);
                return;
            } else {
                int iNextInt2 = c16991l2.nextInt();
                arrayList2.add(Byte.valueOf((byte) (iNextInt2 < 10 ? iNextInt2 + 48 : (char) (((char) (iNextInt2 + 97)) - '\n'))));
            }
        }
    }

    public static final long amazon(CharSequence charSequence) {
        int length = charSequence.length();
        if (length > 19) {
            throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
        }
        int i = 0;
        if (length != 19) {
            long j = 0;
            while (i < length) {
                long jCharAt = ((long) charSequence.charAt(i)) - 48;
                if (jCharAt < 0 || jCharAt > 9) {
                    crashlytics(charSequence, i);
                    throw null;
                }
                j = (j << 3) + (j << 1) + jCharAt;
                i++;
            }
            return j;
        }
        int length2 = charSequence.length();
        long j2 = 0;
        while (i < length2) {
            long jCharAt2 = ((long) charSequence.charAt(i)) - 48;
            if (jCharAt2 < 0 || jCharAt2 > 9) {
                crashlytics(charSequence, i);
                throw null;
            }
            j2 = (j2 << 3) + (j2 << 1) + jCharAt2;
            if (j2 < 0) {
                throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
            }
            i++;
        }
        return j2;
    }

    public static final void crashlytics(CharSequence charSequence, int i) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i) + " at position " + i);
    }

    public static final int loadAd(int i, int i2, CharSequence charSequence) {
        int i3 = 0;
        while (i < i2) {
            int iCharAt = charSequence.charAt(i);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i3 = (i3 * 31) + iCharAt;
            i++;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object purchase(InterfaceC8639l interfaceC8639l, int i, AbstractC0283l abstractC0283l) {
        C16585l c16585l;
        int i2;
        int i3;
        byte[] bArr;
        if (abstractC0283l instanceof C16585l) {
            c16585l = (C16585l) abstractC0283l;
            int i4 = c16585l.f32555l;
            if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16585l.f32555l = i4 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16585l = new C16585l(abstractC0283l);
            }
        } else {
            c16585l = new C16585l(abstractC0283l);
        }
        Object obj = c16585l.f32558l;
        int i5 = c16585l.f32555l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i5 != 0) {
            if (i5 != 1 && i5 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = c16585l.f32554l;
            int i7 = c16585l.f32553l;
            int i8 = c16585l.f32559l;
            byte[] bArr2 = c16585l.f32556l;
            InterfaceC8639l interfaceC8639l2 = c16585l.f32557l;
            AbstractC2829l.crashlytics(obj);
            i2 = i7;
            i = i8;
            bArr = bArr2;
            i3 = i6;
            interfaceC8639l = interfaceC8639l2;
            break;
        }
        AbstractC2829l.crashlytics(obj);
        if (i <= 0) {
            C8339l.metrica("Does only work for positive numbers");
            return null;
        }
        int i9 = 0;
        i2 = i;
        while (true) {
            i3 = i9 + 1;
            bArr = crashlytics;
            if (i9 < 8) {
                int i10 = i2 >>> 28;
                i2 <<= 4;
                if (i10 != 0) {
                    byte b = bArr[i10];
                    c16585l.f32557l = interfaceC8639l;
                    c16585l.f32556l = bArr;
                    c16585l.f32559l = i;
                    c16585l.f32553l = i2;
                    c16585l.f32554l = i3;
                    c16585l.f32555l = 1;
                    if (AbstractC7572l.ads(interfaceC8639l, b, c16585l) != enumC9342l) {
                        break;
                    }
                } else {
                    i9 = i3;
                }
            }
            return enumC9342l;
        }
        while (true) {
            int i11 = i3 + 1;
            if (i3 >= 8) {
                return Unit.INSTANCE;
            }
            int i12 = i2 >>> 28;
            i2 <<= 4;
            byte b2 = bArr[i12];
            c16585l.f32557l = interfaceC8639l;
            c16585l.f32556l = bArr;
            c16585l.f32559l = i;
            c16585l.f32553l = i2;
            c16585l.f32554l = i11;
            c16585l.f32555l = 2;
            if (AbstractC7572l.ads(interfaceC8639l, b2, c16585l) == enumC9342l) {
                return enumC9342l;
            }
            i3 = i11;
        }
    }

    public static final boolean yandex(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 - i != charSequence2.length()) {
            return false;
        }
        for (int i3 = i; i3 < i2; i3++) {
            int iCharAt = charSequence.charAt(i3);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            int iCharAt2 = charSequence2.charAt(i3 - i);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 += 32;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
        }
        return true;
    }
}

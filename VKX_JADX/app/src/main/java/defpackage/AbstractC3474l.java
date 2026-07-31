package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؕٙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3474l {
    public static final C15578l yandex = new C15578l(-644856200, false, new C7614l(12));

    public static final boolean admob(C15730l c15730l, long j, long j2) {
        int i = c15730l.subs == 1 ? 1 : 0;
        long j3 = c15730l.crashlytics;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final boolean amazon(C15730l c15730l) {
        return !c15730l.admob && c15730l.amazon;
    }

    public static final boolean billing(C15730l c15730l) {
        return c15730l.admob && !c15730l.amazon;
    }

    public static final boolean crashlytics(C15730l c15730l) {
        return (c15730l.crashlytics() || c15730l.admob || !c15730l.amazon) ? false : true;
    }

    public static final C10882l firebase(String str) {
        int i = 10;
        AbstractC8576l.loadAd(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC8576l.subs(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            long j3 = j ^ Long.MIN_VALUE;
            int i3 = length;
            if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
                    return null;
                }
                j2 = 1844674407370955161L;
            }
            long j4 = j * 10;
            long j5 = (((long) iDigit) & 4294967295L) + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = j5;
            length = i3;
            i = 10;
        }
        return new C10882l(j);
    }

    public static final C12524l isPro(String str) {
        int i;
        AbstractC8576l.loadAd(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC8576l.subs(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i4 = i2 ^ RecyclerView.UNDEFINED_DURATION;
            if (Integer.compare(i4, i3 ^ RecyclerView.UNDEFINED_DURATION) > 0) {
                if (i3 != 119304647 || Integer.compare(i4, -1717986919) > 0) {
                    return null;
                }
                i3 = 429496729;
            }
            int i5 = i2 * 10;
            int i6 = iDigit + i5;
            if (Integer.compare(i6 ^ RecyclerView.UNDEFINED_DURATION, i5 ^ RecyclerView.UNDEFINED_DURATION) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new C12524l(i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(AbstractC10022l abstractC10022l, Charset charset, AbstractC0283l abstractC0283l) {
        C8263l c8263l;
        C5254l c5254lAdmob;
        InterfaceC13012l interfaceC13012lYandex;
        CharsetDecoder charsetDecoder;
        if (abstractC0283l instanceof C8263l) {
            c8263l = (C8263l) abstractC0283l;
            int i = c8263l.f17157l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8263l.f17157l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8263l = new C8263l(abstractC0283l);
            }
        } else {
            c8263l = new C8263l(abstractC0283l);
        }
        Object objYandex = c8263l.f17155l;
        int i2 = c8263l.f17157l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            String strSignatures = abstractC10022l.yandex().signatures("Content-Type");
            if (strSignatures != null) {
                C5254l c5254l = C5254l.f11335l;
                c5254lAdmob = AbstractC10033l.admob(strSignatures);
            } else {
                c5254lAdmob = null;
            }
            Charset charsetYandex = c5254lAdmob != null ? AbstractC15755l.yandex(c5254lAdmob) : null;
            if (charsetYandex != null) {
                charset = charsetYandex;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            C14249l c14249lLoadAd = abstractC10022l.loadAd();
            InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(InterfaceC14189l.class);
            try {
                interfaceC13012lYandex = AbstractC18202l.yandex(InterfaceC14189l.class);
            } catch (Throwable unused) {
                interfaceC13012lYandex = null;
            }
            C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex);
            c8263l.f17156l = charsetDecoderNewDecoder;
            c8263l.f17157l = 1;
            objYandex = c14249lLoadAd.yandex(c11310l, c8263l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
            charsetDecoder = charsetDecoderNewDecoder;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charsetDecoder = c8263l.f17156l;
            AbstractC2829l.crashlytics(objYandex);
        }
        if (objYandex != null) {
            return AbstractC15788l.loadAd(charsetDecoder, (InterfaceC14189l) objYandex);
        }
        C6541l.subs("null cannot be cast to non-null type kotlinx.io.Source");
        return null;
    }

    public static final InterfaceC1814l mopub(AbstractC10022l abstractC10022l) {
        InterfaceC1814l interfaceC1814l = abstractC10022l.loadAd().f27846l;
        if (interfaceC1814l != null) {
            return interfaceC1814l;
        }
        return null;
    }

    public static final boolean purchase(C15730l c15730l) {
        return (c15730l.crashlytics() || !c15730l.admob || c15730l.amazon) ? false : true;
    }

    public static final Object remoteconfig(InterfaceC8639l interfaceC8639l, ByteBuffer byteBuffer, AbstractC0283l abstractC0283l) {
        C18476l c18476lPurchase = interfaceC8639l.purchase();
        c18476lPurchase.crashlytics();
        long j = c18476lPurchase.f36079l;
        c18476lPurchase.crashlytics();
        int iRemaining = byteBuffer.remaining();
        while (iRemaining > 0) {
            C2139l c2139lInmobi = c18476lPurchase.inmobi(1);
            byte[] bArr = c2139lInmobi.yandex;
            int i = c2139lInmobi.crashlytics;
            int iMin = Math.min(iRemaining, bArr.length - i);
            byteBuffer.get(bArr, i, iMin);
            if (iMin == 1) {
                c2139lInmobi.crashlytics += iMin;
                c18476lPurchase.f36079l += (long) iMin;
            } else {
                if (iMin < 0 || iMin > c2139lInmobi.yandex()) {
                    StringBuilder sbSignature = AbstractC2812l.Signature("Invalid number of bytes written: ", iMin, ". Should be in 0..");
                    sbSignature.append(c2139lInmobi.yandex());
                    throw new IllegalStateException(sbSignature.toString().toString());
                }
                if (iMin != 0) {
                    c2139lInmobi.crashlytics += iMin;
                    c18476lPurchase.f36079l += (long) iMin;
                } else if (AbstractC2044l.billing(c2139lInmobi)) {
                    c18476lPurchase.adcel();
                }
            }
            iRemaining -= iMin;
        }
        c18476lPurchase.crashlytics();
        long j2 = c18476lPurchase.f36079l;
        Object objCrashlytics = interfaceC8639l.crashlytics(abstractC0283l);
        return objCrashlytics == EnumC9342l.f19165l ? objCrashlytics : Unit.INSTANCE;
    }

    public static Object smaato(InterfaceC8639l interfaceC8639l, Function1 function1, AbstractC0283l abstractC0283l) {
        C18476l c18476lPurchase = interfaceC8639l.purchase();
        c18476lPurchase.crashlytics();
        C2139l c2139lInmobi = c18476lPurchase.inmobi(1);
        byte[] bArr = c2139lInmobi.yandex;
        int i = c2139lInmobi.crashlytics;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, bArr.length - i);
        function1.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i;
        if (iPosition == 1) {
            c2139lInmobi.crashlytics += iPosition;
            c18476lPurchase.f36079l += (long) iPosition;
        } else {
            if (iPosition < 0 || iPosition > c2139lInmobi.yandex()) {
                StringBuilder sbSignature = AbstractC2812l.Signature("Invalid number of bytes written: ", iPosition, ". Should be in 0..");
                sbSignature.append(c2139lInmobi.yandex());
                throw new IllegalStateException(sbSignature.toString().toString());
            }
            if (iPosition != 0) {
                c2139lInmobi.crashlytics += iPosition;
                c18476lPurchase.f36079l += (long) iPosition;
            } else if (AbstractC2044l.billing(c2139lInmobi)) {
                c18476lPurchase.adcel();
            }
        }
        Object objCrashlytics = interfaceC8639l.crashlytics(abstractC0283l);
        return objCrashlytics == EnumC9342l.f19165l ? objCrashlytics : Unit.INSTANCE;
    }

    public static final long subs(C15730l c15730l, boolean z) {
        long jAdmob = C1187l.admob(c15730l.crashlytics, c15730l.mopub);
        if (z || !c15730l.crashlytics()) {
            return jAdmob;
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C3878l c3878l;
        InterfaceC13012l interfaceC13012lYandex;
        if (abstractC0283l instanceof C3878l) {
            c3878l = (C3878l) abstractC0283l;
            int i = c3878l.f8012l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3878l.f8012l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3878l = new C3878l(abstractC0283l);
            }
        } else {
            c3878l = new C3878l(abstractC0283l);
        }
        Object objYandex = c3878l.f8013l;
        int i2 = c3878l.f8012l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            C14249l c14249lLoadAd = abstractC10022l.loadAd();
            InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(InterfaceC9354l.class);
            try {
                interfaceC13012lYandex = AbstractC18202l.yandex(InterfaceC9354l.class);
            } catch (Throwable unused) {
                interfaceC13012lYandex = null;
            }
            C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex);
            c3878l.f8012l = 1;
            objYandex = c14249lLoadAd.yandex(c11310l, c3878l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objYandex);
        }
        if (objYandex != null) {
            return (InterfaceC9354l) objYandex;
        }
        C6541l.subs("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
        return null;
    }
}

package defpackage;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٗۥۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17541l {
    public static final StackTraceElement[] yandex = new StackTraceElement[0];

    public static final EnumC4737l admob(AbstractC8237l abstractC8237l, InterfaceC18035l interfaceC18035l) {
        AbstractC2021l abstractC2021lBilling = interfaceC18035l.billing();
        if (abstractC2021lBilling instanceof C0196l) {
            return EnumC4737l.POLY_OBJ;
        }
        if (!AbstractC8576l.yandex(abstractC2021lBilling, C9164l.amazon)) {
            if (!AbstractC8576l.yandex(abstractC2021lBilling, C2861l.amazon)) {
                return EnumC4737l.OBJ;
            }
            InterfaceC18035l interfaceC18035lYandex = yandex(interfaceC18035l.isPro(0), abstractC8237l.loadAd);
            AbstractC2021l abstractC2021lBilling2 = interfaceC18035lYandex.billing();
            if ((abstractC2021lBilling2 instanceof C15358l) || AbstractC8576l.yandex(abstractC2021lBilling2, C2374l.amazon)) {
                return EnumC4737l.MAP;
            }
            if (!abstractC8237l.yandex.amazon) {
                throw AbstractC2238l.yandex(interfaceC18035lYandex);
            }
        }
        return EnumC4737l.LIST;
    }

    public static C16834l amazon(C13291l c13291l, byte[] bArr) {
        int i;
        C13381l c13381l;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i2 = c13291l.f26080l.crashlytics;
        int iAmazon = c13291l.amazon();
        synchronized (c13291l) {
            i = c13291l.f26084l;
            if (i >= c13291l.f26085l) {
                throw new C17072l("ots private key exhausted", 4);
            }
            c13381l = c13291l.f26086l;
            bArr2 = c13291l.f26083l;
            bArr3 = c13291l.f26088l;
            c13291l.mopub();
        }
        int i3 = (1 << i2) + iAmazon;
        byte[][] bArr5 = new byte[i2][];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr5[i4] = c13291l.loadAd((i3 / (1 << i4)) ^ 1);
        }
        C17675l c17675l = c13291l.f26080l;
        int i5 = c13381l.loadAd;
        byte[] bArr6 = new byte[i5];
        C1577l c1577l = new C1577l(bArr2, bArr3, AbstractC9151l.purchase(i5, c13381l.billing));
        c1577l.f3898l = i;
        c1577l.f3897l = -3;
        c1577l.loadAd(0, false, bArr6);
        InterfaceC16922l interfaceC16922lPurchase = AbstractC9151l.purchase(c13381l.loadAd, c13381l.billing);
        interfaceC16922lPurchase.update(bArr2, 0, bArr2.length);
        AbstractC12366l.loadAd(i, interfaceC16922lPurchase);
        interfaceC16922lPurchase.update((byte) -127);
        interfaceC16922lPurchase.update((byte) -127);
        interfaceC16922lPurchase.update(bArr6, 0, i5);
        interfaceC16922lPurchase.update(bArr, 0, bArr.length);
        byte[] bArr7 = new byte[34];
        interfaceC16922lPurchase.doFinal(bArr7, 0);
        int i6 = c13381l.loadAd;
        int i7 = c13381l.amazon;
        int i8 = c13381l.crashlytics;
        byte[] bArr8 = new byte[i7 * i6];
        InterfaceC16922l interfaceC16922lPurchase2 = AbstractC9151l.purchase(i6, c13381l.billing);
        C1577l c1577l2 = new C1577l(bArr2, bArr3, AbstractC9151l.purchase(c13381l.loadAd, c13381l.billing));
        c1577l2.f3898l = i;
        int i9 = (1 << i8) - 1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            bArr4 = bArr7;
            if (i10 >= (i6 * 8) / i8) {
                break;
            }
            i11 = (i11 + i9) - ((bArr4[(i10 * i8) / 8] >>> (((~i10) & ((8 / i8) - 1)) * i8)) & i9);
            i10++;
            bArr7 = bArr4;
        }
        int i12 = i11 << c13381l.purchase;
        bArr4[i6] = (byte) ((i12 >>> 8) & 255);
        bArr4[i6 + 1] = (byte) i12;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write((byte) (i >>> 24));
            byteArrayOutputStream.write((byte) (i >>> 16));
            byteArrayOutputStream.write((byte) (i >>> 8));
            byteArrayOutputStream.write((byte) i);
            int i13 = i6 + 23;
            while (byteArrayOutputStream.size() < i13) {
                byteArrayOutputStream.write(0);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c1577l2.f3897l = 0;
            int i14 = 0;
            while (i14 < i7) {
                short s = (short) i14;
                int i15 = i9;
                byteArray[20] = (byte) (s >>> 8);
                byteArray[21] = (byte) s;
                c1577l2.loadAd(23, i14 < i7 + (-1), byteArray);
                int i16 = 0;
                for (int i17 = (bArr4[(i14 * i8) / 8] >>> (((~i14) & ((8 / i8) - 1)) * i8)) & i15; i16 < i17; i17 = i17) {
                    byteArray[22] = (byte) i16;
                    interfaceC16922lPurchase2.update(byteArray, 0, i13);
                    interfaceC16922lPurchase2.doFinal(byteArray, 23);
                    i16++;
                }
                System.arraycopy(byteArray, 23, bArr8, i6 * i14, i6);
                i14++;
                i9 = i15;
            }
            return new C16834l(i, new C5002l(c13381l, bArr6, bArr8), c17675l, bArr5);
        } catch (Exception e) {
            C18073l.Signature(e.getMessage(), e);
            return null;
        }
    }

    public static final InterfaceC17242l billing(C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        c6956l.m2123default(439770924);
        InterfaceC17242l interfaceC17242lPurchase = purchase(c6956l, interfaceC17242l);
        c6956l.startapp(false);
        return interfaceC17242lPurchase;
    }

    public static C13291l crashlytics(C17675l c17675l, C13381l c13381l, int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length >= c17675l.loadAd) {
            return new C13291l(c17675l, c13381l, i, bArr, 1 << c17675l.crashlytics, bArr2);
        }
        C10754l.smaato(c17675l.loadAd, "root seed is less than ");
        return null;
    }

    public static final InterfaceC17242l loadAd(InterfaceC17242l interfaceC17242l, Function3 function3) {
        return interfaceC17242l.premium(new C6085l(function3));
    }

    public static final String mopub(C2234l c2234l, C6096l c6096l) {
        String string;
        C2234l c2234l2 = c2234l.f4918l;
        String strMopub = c2234l2 != null ? mopub(c2234l2, c6096l) : null;
        Object obj = c2234l.f4915l;
        InterfaceC3488l interfaceC3488l = obj instanceof InterfaceC3488l ? (InterfaceC3488l) obj : null;
        if (interfaceC3488l == null) {
            return strMopub == null ? "" : strMopub;
        }
        if ((interfaceC3488l instanceof C5376l) || (interfaceC3488l instanceof C2023l) || (interfaceC3488l instanceof C8287l) || interfaceC3488l.equals(C8049l.loadAd) || (interfaceC3488l instanceof C9702l) || (interfaceC3488l instanceof C13219l)) {
            string = interfaceC3488l.toString();
        } else {
            if (!interfaceC3488l.equals(C18345l.loadAd)) {
                C18725l.billing();
                return null;
            }
            string = "/";
        }
        if (strMopub == null) {
            return string;
        }
        if (string.length() == 0) {
            return strMopub;
        }
        return (AbstractC12024l.m3344synchronized(strMopub, '/') || AbstractC12024l.m3349try(string, '/')) ? strMopub.concat(string) : AbstractC11043l.admob('/', strMopub, string);
    }

    public static final InterfaceC17242l purchase(C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        if (interfaceC17242l.mo1539protected(C11192l.f22529l)) {
            return interfaceC17242l;
        }
        c6956l.m2125final(1219399079);
        InterfaceC17242l interfaceC17242l2 = (InterfaceC17242l) interfaceC17242l.purchase(C4346l.f8873l, new C3956l(5, c6956l));
        c6956l.startapp(false);
        return interfaceC17242l2;
    }

    public static final InterfaceC18035l yandex(InterfaceC18035l interfaceC18035l, C13975l c13975l) {
        if (!AbstractC8576l.yandex(interfaceC18035l.billing(), C10155l.amazon)) {
            return interfaceC18035l.purchase() ? yandex(interfaceC18035l.isPro(0), c13975l) : interfaceC18035l;
        }
        AbstractC10114l.startapp(interfaceC18035l);
        return interfaceC18035l;
    }
}

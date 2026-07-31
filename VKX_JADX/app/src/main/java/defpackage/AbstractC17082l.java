package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17082l {
    public static final AbstractC7775l admob(C4207l c4207l, InterfaceC3588l interfaceC3588l) {
        boolean zBooleanValue = AbstractC1305l.f3393switch.purchase(c4207l.f8624l).booleanValue();
        EnumC16484l enumC16484l = c4207l.f8625l;
        if (zBooleanValue) {
            int i = enumC16484l != null ? AbstractC0706l.yandex[enumC16484l.ordinal()] : -1;
            if (i == 1) {
                return new C9514l((byte) c4207l.f8633l);
            }
            if (i == 2) {
                return new C12326l((short) c4207l.f8633l);
            }
            if (i == 3) {
                return new C2179l((int) c4207l.f8633l);
            }
            if (i == 4) {
                return new C8234l(c4207l.f8633l);
            }
            C11983l.advert(c4207l.f8625l, "Cannot read value of unsigned type: ");
            return null;
        }
        switch (enumC16484l != null ? AbstractC0706l.yandex[enumC16484l.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                C18725l.billing();
                return null;
            case 1:
                return new C10246l((byte) c4207l.f8633l);
            case 2:
                return new C9513l((short) c4207l.f8633l);
            case 3:
                return new C0999l((int) c4207l.f8633l);
            case 4:
                return new C3291l(c4207l.f8633l);
            case 5:
                return new C3847l((char) c4207l.f8633l);
            case 6:
                return new C9849l(c4207l.f8632l);
            case 7:
                return new C16306l(c4207l.f8636l);
            case 8:
                return new C9784l(c4207l.f8633l != 0);
            case 9:
                return new C0408l(interfaceC3588l.getString(c4207l.f8626l));
            case 10:
                String strPurchase = purchase(interfaceC3588l, c4207l.f8627l);
                int i2 = c4207l.f8634l;
                return i2 == 0 ? new C11898l(strPurchase) : new C5413l(strPurchase, i2);
            case 11:
                return new C11469l(purchase(interfaceC3588l, c4207l.f8627l), interfaceC3588l.getString(c4207l.f8635l));
            case 12:
                return new C1020l(mopub(c4207l.f8630l, interfaceC3588l));
            case 13:
                List list = c4207l.f8637l;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC7775l abstractC7775lAdmob = admob((C4207l) it.next(), interfaceC3588l);
                    if (abstractC7775lAdmob != null) {
                        arrayList.add(abstractC7775lAdmob);
                    }
                }
                return new C12909l(arrayList);
        }
    }

    public static C3865l amazon(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C3865l(AbstractC11829l.yandex(view));
        }
        return null;
    }

    public static InterfaceC14029l billing(InterfaceC14029l interfaceC14029l) {
        AbstractC0283l abstractC0283l = interfaceC14029l instanceof AbstractC0283l ? (AbstractC0283l) interfaceC14029l : null;
        if (abstractC0283l != null && (interfaceC14029l = abstractC0283l.f1294l) == null) {
            InterfaceC0273l interfaceC0273l = (InterfaceC0273l) abstractC0283l.metrica().mo245l(C6168l.f13001l);
            interfaceC14029l = interfaceC0273l != null ? interfaceC0273l.mo391package(abstractC0283l) : abstractC0283l;
            abstractC0283l.f1294l = interfaceC14029l;
        }
        return interfaceC14029l;
    }

    public static final InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, Function1 function1) {
        return interfaceC17242l.premium(new C16981l(new C4478l(function1)));
    }

    public static final byte[] loadAd(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            if (i == 0) {
                String str = (String) charSequence;
                if (i2 == str.length()) {
                    return str.getBytes(charsetEncoder.charset());
                }
            }
            return ((String) charSequence).substring(i, i2).getBytes(charsetEncoder.charset());
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final C15357l mopub(C7899l c7899l, InterfaceC3588l interfaceC3588l) {
        String strPurchase = purchase(interfaceC3588l, c7899l.f16472l);
        List<C14780l> list = c7899l.f16476l;
        ArrayList arrayList = new ArrayList();
        for (C14780l c14780l : list) {
            AbstractC7775l abstractC7775lAdmob = admob(c14780l.f28903l, interfaceC3588l);
            C8195l c8195l = abstractC7775lAdmob != null ? new C8195l(interfaceC3588l.getString(c14780l.f28899l), abstractC7775lAdmob) : null;
            if (c8195l != null) {
                arrayList.add(c8195l);
            }
        }
        return new C15357l(strPurchase, AbstractC8676l.subscription(arrayList));
    }

    public static final String purchase(InterfaceC3588l interfaceC3588l, int i) {
        String strYandex = interfaceC3588l.yandex(i);
        return interfaceC3588l.loadAd(i) ? AbstractC14814l.startapp(".", strYandex) : strYandex;
    }

    public static Object subs(Function2 function2, Object obj, InterfaceC14029l interfaceC14029l) {
        InterfaceC12932l interfaceC12932lMetrica = interfaceC14029l.metrica();
        AbstractC12050l c2508l = interfaceC12932lMetrica == C17218l.f33421l ? new C2508l(interfaceC14029l) : new C14912l(interfaceC14029l, interfaceC12932lMetrica);
        AbstractC9464l.purchase(2, function2);
        return function2.invoke(obj, c2508l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC14029l yandex(InterfaceC14029l interfaceC14029l, InterfaceC14029l interfaceC14029l2, Function2 function2) {
        if (function2 instanceof AbstractC12050l) {
            return ((AbstractC12050l) function2).ads(interfaceC14029l2, interfaceC14029l);
        }
        InterfaceC12932l interfaceC12932lMetrica = interfaceC14029l2.metrica();
        return interfaceC12932lMetrica == C17218l.f33421l ? new C18412l(interfaceC14029l2, interfaceC14029l, function2) : new C5658l(interfaceC14029l2, interfaceC12932lMetrica, function2, interfaceC14029l);
    }
}

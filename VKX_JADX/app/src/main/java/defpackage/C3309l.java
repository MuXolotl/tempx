package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lَؕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3309l implements InterfaceC16588l {
    public static final InterfaceC18035l crashlytics;
    public static final InterfaceC16588l loadAd;
    public static final C3309l yandex = new C3309l();

    static {
        InterfaceC16588l interfaceC16588lSerializer = C7616l.Companion.serializer();
        loadAd = interfaceC16588lSerializer;
        crashlytics = interfaceC16588lSerializer.purchase();
    }

    public static void billing(InterfaceC17739l interfaceC17739l, C13520l c13520l) {
        if (!(interfaceC17739l instanceof C16044l)) {
            C6541l.firebase(AbstractC12900l.isPro("Unknown encoder type: ", interfaceC17739l));
        } else {
            loadAd.crashlytics(interfaceC17739l, new C7616l(c13520l));
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final /* bridge */ /* synthetic */ void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        billing(interfaceC17739l, (C13520l) obj);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        CharSequence charSequenceSubSequence;
        if (!(interfaceC10726l instanceof InterfaceC17487l)) {
            C6541l.firebase(AbstractC12900l.subs("Unknown decoder type: ", interfaceC10726l));
            return null;
        }
        C3919l c3919l = ((C7616l) loadAd.loadAd(interfaceC10726l)).yandex;
        String str = c3919l.loadAd;
        AbstractC8576l.loadAd(16);
        byte b = (byte) Integer.parseInt(str, 16);
        int[] iArr = AbstractC15453l.yandex;
        String str2 = c3919l.yandex;
        char[] cArr = {'='};
        int length = str2.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            char cCharAt = str2.charAt(length);
            int i2 = 0;
            while (true) {
                if (i2 >= 1) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (!(i2 >= 0)) {
                charSequenceSubSequence = str2.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        byte[] bytes = charSequenceSubSequence.toString().getBytes(AbstractC9050l.yandex);
        ArrayList arrayList = new ArrayList();
        for (List list : AbstractC16901l.appmetrica(4, AbstractC8669l.m2404final(bytes))) {
            int i3 = 0;
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                i3 |= ((byte) (((byte) AbstractC15453l.yandex[((Number) obj).byteValue() & 255]) & 63)) << ((3 - i4) * 6);
                i4 = i5;
            }
            for (int size = list.size() - 1; size > 0; size--) {
                arrayList.add(Byte.valueOf((byte) ((16711680 & i3) >> 16)));
                i3 <<= 8;
            }
        }
        return new C13520l(b, AbstractC16901l.m4246transient(arrayList));
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return crashlytics;
    }
}

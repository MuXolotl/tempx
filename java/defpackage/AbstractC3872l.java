package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؖؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3872l {
    public static final InterfaceC16588l[] yandex = new InterfaceC16588l[0];

    public static C12007l amazon(C7502l c7502l, C12007l c12007l, C12007l c12007l2, AbstractC1859l abstractC1859l) {
        AbstractC1859l c13427l = abstractC1859l;
        if (c12007l == null) {
            C6541l.subs("left == null");
            return null;
        }
        int i = c12007l.f23928l;
        if (c12007l2 == null) {
            C6541l.subs("right == null");
            return null;
        }
        if (i != c12007l2.f23928l) {
            C8339l.smaato("height of both nodes must be equal");
            return null;
        }
        byte[] bArr = (byte[]) c7502l.f15512l;
        C14785l c14785l = (C14785l) c7502l.f15510l;
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
        if (c13427l instanceof C3834l) {
            C3834l c3834l = (C3834l) c13427l;
            C13549l c13549l = new C13549l(0);
            c13549l.crashlytics = c3834l.yandex;
            c13549l.loadAd = c3834l.loadAd;
            c13549l.purchase = c3834l.purchase;
            c13549l.billing = c3834l.billing;
            c13549l.mopub = c3834l.mopub;
            c13549l.amazon = 0;
            c13427l = new C3834l(c13549l);
        } else if (c13427l instanceof C13427l) {
            C13427l c13427l2 = (C13427l) c13427l;
            C16724l c16724l = new C16724l();
            c16724l.crashlytics = c13427l2.yandex;
            c16724l.loadAd = c13427l2.loadAd;
            c16724l.purchase = c13427l2.purchase;
            c16724l.billing = c13427l2.billing;
            c16724l.amazon = 0;
            c13427l = new C13427l(c16724l);
        }
        byte[] bArrMopub = c14785l.mopub(bArrCrashlytics, c13427l.yandex());
        if (c13427l instanceof C3834l) {
            C3834l c3834l2 = (C3834l) c13427l;
            C13549l c13549l2 = new C13549l(0);
            c13549l2.crashlytics = c3834l2.yandex;
            c13549l2.loadAd = c3834l2.loadAd;
            c13549l2.purchase = c3834l2.purchase;
            c13549l2.billing = c3834l2.billing;
            c13549l2.mopub = c3834l2.mopub;
            c13549l2.amazon = 1;
            c13427l = new C3834l(c13549l2);
        } else if (c13427l instanceof C13427l) {
            C13427l c13427l3 = (C13427l) c13427l;
            C16724l c16724l2 = new C16724l();
            c16724l2.crashlytics = c13427l3.yandex;
            c16724l2.loadAd = c13427l3.loadAd;
            c16724l2.purchase = c13427l3.purchase;
            c16724l2.billing = c13427l3.billing;
            c16724l2.amazon = 1;
            c13427l = new C13427l(c16724l2);
        }
        byte[] bArrMopub2 = c14785l.mopub(bArrCrashlytics, c13427l.yandex());
        if (c13427l instanceof C3834l) {
            C3834l c3834l3 = (C3834l) c13427l;
            C13549l c13549l3 = new C13549l(0);
            c13549l3.crashlytics = c3834l3.yandex;
            c13549l3.loadAd = c3834l3.loadAd;
            c13549l3.purchase = c3834l3.purchase;
            c13549l3.billing = c3834l3.billing;
            c13549l3.mopub = c3834l3.mopub;
            c13549l3.amazon = 2;
            c13427l = new C3834l(c13549l3);
        } else if (c13427l instanceof C13427l) {
            C13427l c13427l4 = (C13427l) c13427l;
            C16724l c16724l3 = new C16724l();
            c16724l3.crashlytics = c13427l4.yandex;
            c16724l3.loadAd = c13427l4.loadAd;
            c16724l3.purchase = c13427l4.purchase;
            c16724l3.billing = c13427l4.billing;
            c16724l3.amazon = 2;
            c13427l = new C13427l(c16724l3);
        }
        byte[] bArrMopub3 = c14785l.mopub(bArrCrashlytics, c13427l.yandex());
        int i2 = ((C12676l) c7502l.f15511l).loadAd;
        int i3 = i2 * 2;
        byte[] bArr2 = new byte[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) (AbstractC4047l.crashlytics(c12007l.f23927l)[i4] ^ bArrMopub2[i4]);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            bArr2[i5 + i2] = (byte) (AbstractC4047l.crashlytics(c12007l2.f23927l)[i5] ^ bArrMopub3[i5]);
        }
        int length = bArrMopub.length;
        int i6 = c14785l.f28908l;
        if (length != i6) {
            C8339l.metrica("wrong key length");
            return null;
        }
        if (i3 == i6 * 2) {
            return new C12007l(i, c14785l.subs(bArrMopub, 1, bArr2));
        }
        C8339l.metrica("wrong in length");
        return null;
    }

    public static C12007l crashlytics(C7502l c7502l, C5321l c5321l, C3834l c3834l) {
        int i;
        long j;
        double d;
        int i2;
        int i3;
        int i4;
        int iCeil = ((C12676l) c7502l.f15511l).amazon;
        byte[][] bArrAmazon = AbstractC4047l.amazon((byte[][]) c5321l.f11449l);
        C12007l[] c12007lArr = new C12007l[bArrAmazon.length];
        for (int i5 = 0; i5 < bArrAmazon.length; i5++) {
            c12007lArr[i5] = new C12007l(0, bArrAmazon[i5]);
        }
        C13549l c13549l = new C13549l(0);
        c13549l.crashlytics = c3834l.yandex;
        c13549l.loadAd = c3834l.loadAd;
        c13549l.purchase = c3834l.purchase;
        c13549l.billing = 0;
        c13549l.mopub = c3834l.mopub;
        c13549l.amazon = c3834l.amazon;
        C3834l c3834l2 = new C3834l(c13549l);
        while (iCeil > 1) {
            int i6 = 0;
            while (true) {
                i = c3834l2.amazon;
                j = c3834l2.loadAd;
                d = iCeil / 2;
                int iFloor = (int) Math.floor(d);
                i2 = c3834l2.billing;
                i3 = c3834l2.purchase;
                i4 = c3834l2.yandex;
                if (i6 >= iFloor) {
                    break;
                }
                C13549l c13549l2 = new C13549l(0);
                c13549l2.crashlytics = i4;
                c13549l2.loadAd = j;
                c13549l2.purchase = i3;
                c13549l2.billing = i2;
                c13549l2.mopub = i6;
                c13549l2.amazon = i;
                C3834l c3834l3 = new C3834l(c13549l2);
                int i7 = i6 * 2;
                c12007lArr[i6] = amazon(c7502l, c12007lArr[i7], c12007lArr[i7 + 1], c3834l3);
                i6++;
                c3834l2 = c3834l3;
            }
            if (iCeil % 2 == 1) {
                c12007lArr[(int) Math.floor(d)] = c12007lArr[iCeil - 1];
            }
            iCeil = (int) Math.ceil(((double) iCeil) / 2.0d);
            C13549l c13549l3 = new C13549l(0);
            c13549l3.crashlytics = i4;
            c13549l3.loadAd = j;
            c13549l3.purchase = i3;
            c13549l3.billing = i2 + 1;
            c13549l3.mopub = c3834l2.mopub;
            c13549l3.amazon = i;
            c3834l2 = new C3834l(c13549l3);
        }
        return c12007lArr[0];
    }

    public static final int loadAd(AbstractC11754l abstractC11754l, AbstractC12914l abstractC12914l) {
        AbstractC11754l abstractC11754lMo1001protected = abstractC11754l.mo1001protected();
        if (abstractC11754lMo1001protected == null) {
            AbstractC0081l.crashlytics("Child of " + abstractC11754l + " cannot be null when calculating alignment line");
        }
        if (abstractC11754l.mo1000l().yandex().containsKey(abstractC12914l)) {
            Integer num = (Integer) abstractC11754l.mo1000l().yandex().get(abstractC12914l);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iMo884throw = abstractC11754lMo1001protected.mo884throw(abstractC12914l);
            if (iMo884throw != Integer.MIN_VALUE) {
                boolean z = abstractC11754l.f23554l;
                boolean z2 = abstractC11754l.f23549l;
                abstractC11754lMo1001protected.f23554l = true;
                abstractC11754l.f23549l = true;
                abstractC11754l.mo997l();
                abstractC11754lMo1001protected.f23554l = z;
                abstractC11754l.f23549l = z2;
                return iMo884throw + ((int) (abstractC12914l instanceof C17857l ? abstractC11754lMo1001protected.mo999l() & 4294967295L : abstractC11754lMo1001protected.mo999l() >> 32));
            }
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public static final void yandex(InterfaceC12001l interfaceC12001l, int i, C15578l c15578l, C6956l c6956l, int i2, int i3) {
        int i4;
        int i5;
        c6956l.m2133new(-1208072102);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (c6956l.billing(interfaceC12001l) ? 4 : 2) | i2;
        }
        int i7 = i4 | 48;
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 = i4 | 432;
        } else {
            i5 = (c6956l.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | i7;
        }
        if ((i5 & 1171) == 1170 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            if (i6 != 0) {
                interfaceC12001l = C9885l.yandex;
            }
            if (i8 != 0) {
                i = 0;
            }
            c6956l.m2125final(1849434622);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C8556l.f17643l;
                c6956l.m2147try(objM2132native);
            }
            c6956l.startapp(false);
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            c6956l.m2125final(-683746039);
            c6956l.m2125final(-548224868);
            if (!(c6956l.yandex instanceof C2416l)) {
                AbstractC8238l.amazon();
                throw null;
            }
            c6956l.m2131interface();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC12001l, new C8163l(14));
            AbstractC8182l.billing(c6956l, new C15667l(i), new C8163l(15));
            AbstractC8182l.billing(c6956l, new C12347l(0), new C8163l(16));
            c15578l.invoke(C15922l.yandex, c6956l, 54);
            c6956l.startapp(true);
            c6956l.startapp(false);
            c6956l.startapp(false);
        }
        InterfaceC12001l interfaceC12001l2 = interfaceC12001l;
        int i9 = i;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9976l(interfaceC12001l2, i9, c15578l, i2, i3);
        }
    }
}

package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ۤۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18323l {
    public static final C15578l yandex = new C15578l(850733946, false, new C2464l(2));
    public static final C15578l loadAd = new C15578l(914678188, false, new C13982l(18));
    public static final C15578l crashlytics = new C15578l(40516442, false, new C13982l(19));
    public static final C15578l amazon = new C15578l(-1591578018, false, new C13982l(20));
    public static final C15578l purchase = new C15578l(-665249087, false, new C2464l(3));
    public static final C15578l billing = new C15578l(403009902, false, new C2464l(4));

    public static final int admob(int i, List list) {
        int i2;
        byte b;
        int i3 = ((C5048l) AbstractC16901l.m4214continue(list)).crashlytics;
        if (i > ((C5048l) AbstractC16901l.m4214continue(list)).crashlytics) {
            AbstractC1786l.yandex("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            C5048l c5048l = (C5048l) list.get(i2);
            if (c5048l.loadAd > i) {
                b = 1;
            } else {
                b = c5048l.crashlytics <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String strYandex = AbstractC2066l.yandex(list, null, new C18334l(27), 31);
        StringBuilder sbSubscription = AbstractC14814l.subscription(i2, size2, "Found paragraph index ", " should be in range [0, ", ").\nDebug info: index=");
        sbSubscription.append(i);
        sbSubscription.append(", paragraphs=[");
        sbSubscription.append(strYandex);
        sbSubscription.append("]");
        AbstractC1786l.yandex(sbSubscription.toString());
        return i2;
    }

    public static byte[] amazon(byte[] bArr) {
        if (bArr.length != 16) {
            C8339l.metrica("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static final byte[] billing(long j, int i, byte b) {
        byte[] bArr = new byte[i + 1];
        int i2 = (i * 8) - 8;
        int i3 = 0;
        bArr[0] = b;
        while (i3 < i) {
            int i4 = i3 + 1;
            bArr[i4] = (byte) ((j >>> (i2 - (i3 * 8))) & 255);
            i3 = i4;
        }
        return bArr;
    }

    public static C17029l crashlytics(AbstractC8831l abstractC8831l) throws IOException {
        if (abstractC8831l instanceof C13596l) {
            C13596l c13596l = (C13596l) abstractC8831l;
            return new C17029l(new C10198l(InterfaceC13726l.yandex, new C18507l(AbstractC3983l.amazon(c13596l.f25990l))), AbstractC14024l.crashlytics(c13596l.f26615l));
        }
        if (abstractC8831l instanceof C17794l) {
            return new C17029l(new C10198l(InterfaceC13726l.loadAd), AbstractC14024l.crashlytics(((C17794l) abstractC8831l).f34658l));
        }
        if (abstractC8831l instanceof C3952l) {
            C3952l c3952l = (C3952l) abstractC8831l;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(1);
            try {
                byteArrayOutputStream.write(c3952l.loadAd());
                return new C17029l(new C10198l(InterfaceC0543l.f1892l), byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                C18073l.Signature(e.getMessage(), e);
                return null;
            }
        }
        if (abstractC8831l instanceof C15082l) {
            C15082l c15082l = (C15082l) abstractC8831l;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i = c15082l.f29612l;
            byteArrayOutputStream2.write((byte) (i >>> 24));
            byteArrayOutputStream2.write((byte) (i >>> 16));
            byteArrayOutputStream2.write((byte) (i >>> 8));
            byteArrayOutputStream2.write((byte) i);
            try {
                byteArrayOutputStream2.write(c15082l.f29611l.loadAd());
                return new C17029l(new C10198l(InterfaceC0543l.f1892l), byteArrayOutputStream2.toByteArray());
            } catch (Exception e2) {
                C18073l.Signature(e2.getMessage(), e2);
                return null;
            }
        }
        if (abstractC8831l instanceof C8703l) {
            C8703l c8703l = (C8703l) abstractC8831l;
            C1561l c1561l = c8703l.f17904l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.f8179native.get((C7951l) c8703l.f16541l)), AbstractC14024l.mopub(c1561l.yandex, c1561l.loadAd));
        }
        if (abstractC8831l instanceof C0856l) {
            C0856l c0856l = (C0856l) abstractC8831l;
            C10237l c10237l = c0856l.f2509l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.metrica.get((C18535l) c0856l.f16541l)), AbstractC14024l.mopub(c10237l.yandex, c10237l.loadAd));
        }
        if (abstractC8831l instanceof C13410l) {
            C13410l c13410l = (C13410l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.remoteconfig.get((C6801l) c13410l.f16541l)), AbstractC14024l.crashlytics(c13410l.f26313l));
        }
        if (abstractC8831l instanceof C1671l) {
            C1671l c1671l = (C1671l) abstractC8831l;
            byte[] bArrCrashlytics = AbstractC4047l.crashlytics(c1671l.f4035l);
            byte[] bArrCrashlytics2 = AbstractC4047l.crashlytics(c1671l.f4033l);
            byte[] encoded = c1671l.getEncoded();
            return encoded.length > bArrCrashlytics.length + bArrCrashlytics2.length ? new C17029l(new C10198l(InterfaceC18562l.yandex), new C11327l(encoded)) : new C17029l(new C10198l(InterfaceC13726l.crashlytics, new C12115l(c1671l.f4032l.loadAd, AbstractC3983l.billing(c1671l.f25990l))), new C15142l(bArrCrashlytics, bArrCrashlytics2));
        }
        if (abstractC8831l instanceof C4492l) {
            C4492l c4492l = (C4492l) abstractC8831l;
            byte[] bArr = c4492l.f9132l;
            byte[] bArr2 = c4492l.f9134l;
            byte[] bArrCrashlytics3 = AbstractC4047l.crashlytics(bArr2);
            byte[] bArrCrashlytics4 = AbstractC4047l.crashlytics(bArr);
            byte[] bArrYandex = c4492l.yandex();
            if (bArrYandex.length > bArrCrashlytics3.length + bArrCrashlytics4.length) {
                return new C17029l(new C10198l(InterfaceC18562l.loadAd), new C11327l(bArrYandex));
            }
            Cfor cfor = InterfaceC13726l.amazon;
            C15509l c15509l = c4492l.f9131l;
            return new C17029l(new C10198l(cfor, new C13700l(c15509l.crashlytics, c15509l.amazon, AbstractC3983l.billing(c4492l.f25990l))), new C15529l(AbstractC4047l.crashlytics(bArr2), AbstractC4047l.crashlytics(bArr)));
        }
        if (abstractC8831l instanceof C14928l) {
            C14928l c14928l = (C14928l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.subs.get((C10512l) c14928l.f16541l)), new C11327l(AbstractC14024l.crashlytics(c14928l.f29381l)));
        }
        if (abstractC8831l instanceof C9355l) {
            C9355l c9355l = (C9355l) abstractC8831l;
            byte[] bArrCrashlytics5 = AbstractC14024l.crashlytics(c9355l.f19184l);
            C10198l c10198l = new C10198l((Cfor) AbstractC3983l.firebase.get((C15401l) c9355l.f16541l));
            C11138l c11138l = new C11138l(new C11327l(bArrCrashlytics5));
            c11138l.f22357l = -1;
            return new C17029l(c10198l, c11138l);
        }
        if (abstractC8831l instanceof C17871l) {
            C17871l c17871l = (C17871l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.mopub.get((C17615l) c17871l.f16541l)), new C11327l(AbstractC14024l.crashlytics(c17871l.f34832l)));
        }
        if (abstractC8831l instanceof C18069l) {
            C18069l c18069l = (C18069l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.adcel.get((C11258l) c18069l.f16541l)), AbstractC14024l.crashlytics(c18069l.f35362l));
        }
        if (abstractC8831l instanceof C9841l) {
            C9841l c9841l = (C9841l) abstractC8831l;
            C1738l c1738l = (C1738l) c9841l.f16541l;
            byte[] bArrCrashlytics6 = AbstractC14024l.crashlytics(c9841l.f20039l);
            C10198l c10198l2 = new C10198l((Cfor) AbstractC3983l.subscription.get(c1738l));
            byte[] bArr3 = new byte[bArrCrashlytics6.length + 1];
            bArr3[0] = (byte) c1738l.f4146l;
            System.arraycopy(bArrCrashlytics6, 0, bArr3, 1, bArrCrashlytics6.length);
            return new C17029l(c10198l2, bArr3);
        }
        if (abstractC8831l instanceof C18547l) {
            C18547l c18547l = (C18547l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.f8180package.get((C8719l) c18547l.f16541l)), AbstractC14024l.mopub(c18547l.f36211l, c18547l.f36212l));
        }
        if (abstractC8831l instanceof C7889l) {
            C7889l c7889l = (C7889l) abstractC8831l;
            C9818l c9818l = (C9818l) c7889l.f16541l;
            byte[] bArr4 = new byte[c9818l.f19999l];
            byte[] bArr5 = c7889l.f16458l;
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            byte[] bArr6 = c7889l.f16459l;
            System.arraycopy(bArr6, 0, bArr4, bArr5.length, bArr6.length);
            return new C17029l(new C10198l((Cfor) AbstractC3983l.Signature.get(c9818l)), new C11327l(bArr4));
        }
        if (abstractC8831l instanceof C8385l) {
            C8385l c8385l = (C8385l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.pro.get((C7684l) c8385l.f16541l)), new C11327l(AbstractC14024l.crashlytics(c8385l.f17342l)));
        }
        if (abstractC8831l instanceof C13671l) {
            C13671l c13671l = (C13671l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.advert.get((C18260l) c13671l.f16541l)), AbstractC14024l.mopub(c13671l.f26695l, c13671l.f26696l));
        }
        if (abstractC8831l instanceof C3427l) {
            C3427l c3427l = (C3427l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.f8182strictfp.get((C11196l) c3427l.f16541l)), AbstractC14024l.mopub(c3427l.f7284l, c3427l.f7285l));
        }
        if (abstractC8831l instanceof C13781l) {
            C13781l c13781l = (C13781l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.signatures.get((C13523l) c13781l.f16541l)), AbstractC14024l.crashlytics(c13781l.f26898l));
        }
        if (abstractC8831l instanceof C7006l) {
            C7006l c7006l = (C7006l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.applovin.get((C17145l) c7006l.f16541l)), AbstractC14024l.crashlytics(c7006l.f14695l));
        }
        if (abstractC8831l instanceof C6197l) {
            C6197l c6197l = (C6197l) abstractC8831l;
            C9566l c9566l = (C9566l) c6197l.f16541l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.inmobi.get(c9566l)), new C11327l(c9566l.f19499l != 1 ? AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(c6197l.f13069l, AbstractC3206l.subs(c6197l.f13068l, false)), AbstractC3206l.subs(c6197l.f13071l, true)), AbstractC3206l.subs(c6197l.f13066l, false)), AbstractC3206l.subs(c6197l.f13067l, true)), AbstractC3206l.subs(c6197l.f13070l, true)) : AbstractC3206l.subs(c6197l.f13065l, true)));
        }
        if (abstractC8831l instanceof C17099l) {
            C17099l c17099l = (C17099l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.f8177extends.get((C15183l) c17099l.f16541l)), new C11327l(AbstractC14024l.crashlytics(c17099l.f33270l)));
        }
        if (abstractC8831l instanceof C6676l) {
            C6676l c6676l = (C6676l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC3983l.f8184throw.get(c6676l.f14032l)), new C11327l(AbstractC14024l.crashlytics(c6676l.f14033l)));
        }
        if (!(abstractC8831l instanceof C17089l)) {
            C18262l.metrica("key parameters not recognized");
            return null;
        }
        C17089l c17089l = (C17089l) abstractC8831l;
        return new C17029l(new C10198l((Cfor) AbstractC3983l.f8176else.get((C0326l) c17089l.f16541l)), new C11327l(AbstractC14024l.crashlytics(c17089l.f33254l)));
    }

    public static final void firebase(ArrayList arrayList, long j, Function1 function1) {
        int size = arrayList.size();
        for (int iAdmob = admob(C12814l.mopub(j), arrayList); iAdmob < size; iAdmob++) {
            C5048l c5048l = (C5048l) arrayList.get(iAdmob);
            if (c5048l.loadAd >= C12814l.billing(j)) {
                return;
            }
            if (c5048l.loadAd != c5048l.crashlytics) {
                function1.invoke(c5048l);
            }
        }
    }

    public static final int isPro(ArrayList arrayList, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((C5048l) AbstractC16901l.m4214continue(arrayList)).mopub) {
            return AbstractC14055l.smaato(arrayList);
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C5048l c5048l = (C5048l) arrayList.get(i2);
            if (c5048l.billing > f) {
                b = 1;
            } else {
                b = c5048l.mopub <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void loadAd(C6129l c6129l, long j, int i) {
        if (AbstractC9307l.billing(j, 0L) >= 0 && AbstractC9307l.billing(j, 23L) <= 0) {
            c6129l.admob(((int) j) | i);
            return;
        }
        if (AbstractC9307l.billing(j, 24L) >= 0 && AbstractC9307l.billing(j, 255L) <= 0) {
            c6129l.admob(i | 24);
            c6129l.admob((int) j);
        } else if (AbstractC9307l.billing(j, 256L) >= 0 && AbstractC9307l.billing(j, 65535L) <= 0) {
            mopub(c6129l, j, 2, i | 25);
        } else if (AbstractC9307l.billing(j, 65536L) < 0 || AbstractC9307l.billing(j, 4294967295L) > 0) {
            mopub(c6129l, j, 8, i | 27);
        } else {
            mopub(c6129l, j, 4, i | 26);
        }
    }

    public static final void mopub(C6129l c6129l, long j, int i, int i2) {
        int i3 = (i * 8) - 8;
        c6129l.admob(i2);
        for (int i4 = 0; i4 < i; i4++) {
            c6129l.admob((int) ((j >>> (i3 - (i4 * 8))) & 255));
        }
    }

    public static final void purchase(C6129l c6129l, long j) {
        byte[] bArrYandex;
        if (j >= 0) {
            bArrYandex = yandex(j);
        } else {
            bArrYandex = yandex(j == Long.MIN_VALUE ? Long.MAX_VALUE : (-1) - j);
            bArrYandex[0] = (byte) (bArrYandex[0] | 32);
        }
        C6129l.subs(c6129l, bArrYandex, 0, 6);
    }

    public static final int subs(int i, List list) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C5048l c5048l = (C5048l) list.get(i3);
            if (c5048l.amazon > i) {
                b = 1;
            } else {
                b = c5048l.purchase <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final byte[] yandex(long j) {
        if (AbstractC9307l.billing(j, 0L) >= 0 && AbstractC9307l.billing(j, 23L) <= 0) {
            return new byte[]{(byte) j};
        }
        if (AbstractC9307l.billing(j, 24L) >= 0 && AbstractC9307l.billing(j, 255L) <= 0) {
            return new byte[]{24, (byte) j};
        }
        if (AbstractC9307l.billing(j, 256L) < 0 || AbstractC9307l.billing(j, 65535L) > 0) {
            return (AbstractC9307l.billing(j, 65536L) < 0 || AbstractC9307l.billing(j, 4294967295L) > 0) ? billing(j, 8, (byte) 27) : billing(j, 4, (byte) 26);
        }
        return billing(j, 2, (byte) 25);
    }
}

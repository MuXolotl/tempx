package defpackage;

import android.content.res.Resources;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٓٗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14205l {
    public static final C15578l yandex = new C15578l(225200472, false, new C4832l(13));
    public static final C15578l loadAd = new C15578l(1124137464, false, new C4832l(14));
    public static final C15578l crashlytics = new C15578l(257842041, false, new C13881l(1));
    public static final C15578l amazon = new C15578l(-360052666, false, new C4832l(15));

    public static String amazon(long j, boolean z) {
        if (z) {
            j /= 1000;
        }
        return j >= 3600 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60)}, 3)) : String.format(Locale.ROOT, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
    }

    public static C3746l billing(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            C18262l.metrica("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    C3746l c3746l = new C3746l();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c3746l.f31320l = byteBufferDuplicate;
                    c3746l.f31319l = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c3746l.f31318l = i6;
                    c3746l.f31317l = ((ByteBuffer) c3746l.f31320l).getShort(i6);
                    return c3746l;
                }
            }
        }
        C18262l.metrica("Cannot read metadata.");
        return null;
    }

    public static String crashlytics(long j) {
        long j2 = j / 1000;
        long j3 = (j % 1000) / 10;
        return j2 >= 3600 ? String.format(Locale.ROOT, "%02d:%02d:%02d.%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 3600), Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60), Long.valueOf(j3)}, 4)) : String.format(Locale.ROOT, "%02d:%02d.%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60), Long.valueOf(j3)}, 3));
    }

    public static final byte loadAd(char c) {
        if (c < '~') {
            return C9315l.loadAd[c];
        }
        return (byte) 0;
    }

    public static final String mopub(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }

    public static String purchase(Resources resources, int i, int i2) {
        Object c18435l;
        try {
            c18435l = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (C1171l.yandex(c18435l) != null) {
            c18435l = String.valueOf(i2);
        }
        return (String) c18435l;
    }

    public static final void yandex(C4964l c4964l, InterfaceC10807l interfaceC10807l, Function0 function0, InterfaceC2478l interfaceC2478l, Function1 function1, Function0 function2, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(449245700);
        int i2 = i | (c6956l2.billing(interfaceC10807l) ? 32 : 16) | (c6956l2.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l2.admob(interfaceC2478l) ? 2048 : 1024) | (c6956l2.admob(function1) ? 16384 : 8192) | (c6956l2.admob(function2) ? 131072 : 65536);
        if (c6956l2.m2127for(i2 & 1, (i2 & 74897) != 74896)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l2);
            int i3 = i2 >> 9;
            InterfaceC8714l interfaceC8714lAmazon = AbstractC3700l.amazon(interfaceC2478l, c6956l2, i3 & 14);
            boolean z = interfaceC10807l.equals(C5896l.yandex) || interfaceC10807l.equals(C6521l.yandex);
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC17541l.loadAd(AbstractC0080l.amazon(c4346l, 1.0f), new C11813l(27));
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.spark_payment_window_target_selector_title);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l2, 48, 0, 130040);
            AbstractC2130l.amazon((String) interfaceC8714lAmazon.getValue(), function1, AbstractC0080l.amazon(c4346l, 1.0f), false, null, AbstractC5170l.loadAd, null, z ? AbstractC5170l.yandex : null, AbstractC5170l.crashlytics, z, null, null, null, true, 0, 0, null, null, c6956l, (i3 & 112) | 1573248, 12582918, 8247736);
            c6956l2 = c6956l;
            boolean zAmazon = c6956l2.amazon(iAdmob);
            Object objM2132native = c6956l2.m2132native();
            if (zAmazon || objM2132native == C1867l.yandex) {
                objM2132native = new C2221l(iAdmob, 29);
                c6956l2.m2147try(objM2132native);
            }
            AbstractC7741l.loadAd(interfaceC10807l, null, (Function1) objM2132native, null, null, null, AbstractC5170l.amazon, c6956l2, ((i2 >> 3) & 14) | 1572864, 58);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l2, 0);
            long j2 = c6956l2.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            AbstractC17457l.mopub(function0, null, false, null, null, null, AbstractC5170l.purchase, c6956l2, ((i2 >> 6) & 14) | 805306368, 510);
            AbstractC9334l.yandex(c6956l2, new C9247l(1.0f, true));
            AbstractC17457l.loadAd(function2, null, interfaceC10807l instanceof C5185l, null, null, null, null, null, AbstractC5170l.billing, c6956l2, ((i2 >> 15) & 14) | 805306368, 506);
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8088l(c4964l, interfaceC10807l, function0, interfaceC2478l, function1, function2, i, 5);
        }
    }
}

package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؚؒؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6968l {
    public static final String[] yandex = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] loadAd = {44100, 48000, 32000};
    public static final int[] crashlytics = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] amazon = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] purchase = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] billing = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] mopub = {8000, AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static boolean admob(int i, C13143l c13143l, boolean z) throws C17655l {
        if (c13143l.yandex() < 7) {
            if (z) {
                return false;
            }
            throw C17655l.yandex(null, "too short header: " + c13143l.yandex());
        }
        if (c13143l.signatures() != i) {
            if (z) {
                return false;
            }
            throw C17655l.yandex(null, "expected header type " + Integer.toHexString(i));
        }
        if (c13143l.signatures() == 118 && c13143l.signatures() == 111 && c13143l.signatures() == 114 && c13143l.signatures() == 98 && c13143l.signatures() == 105 && c13143l.signatures() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw C17655l.yandex(null, "expected characters 'vorbis'");
    }

    public static C7417l billing(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = AbstractC15323l.yandex;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC6427l.vip("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C8694l.amazon(new C13143l(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC6427l.metrica("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C8897l(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7417l(arrayList);
    }

    public static int crashlytics(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = loadAd[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? crashlytics[i4 - 1] : amazon[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? purchase[i4 - 1] : billing[i4 - 1];
        } else {
            i6 = mopub[i4 - 1];
        }
        if (i2 == 3) {
            return AbstractC12900l.amazon(i6, 144, i7, i8);
        }
        return AbstractC12900l.amazon(i3 == 1 ? 72 : 144, i6, i7, i8);
    }

    public static /* synthetic */ Collection loadAd(InterfaceC7637l interfaceC7637l, C18186l c18186l, int i) {
        if ((i & 1) != 0) {
            c18186l = C18186l.remoteconfig;
        }
        InterfaceC7637l.yandex.getClass();
        return interfaceC7637l.crashlytics(c18186l, C1490l.f3722l);
    }

    public static C11440l mopub(C13143l c13143l, boolean z, boolean z2) throws C17655l {
        if (z) {
            admob(3, c13143l, false);
        }
        c13143l.advert((int) c13143l.ads(), StandardCharsets.UTF_8);
        long jAds = c13143l.ads();
        String[] strArr = new String[(int) jAds];
        for (int i = 0; i < jAds; i++) {
            strArr[i] = c13143l.advert((int) c13143l.ads(), StandardCharsets.UTF_8);
        }
        if (z2 && (c13143l.signatures() & 1) == 0) {
            throw C17655l.yandex(null, "framing bit expected to be set");
        }
        return new C11440l(strArr);
    }

    public static final Object yandex(InterfaceC14029l interfaceC14029l, InterfaceC9427l interfaceC9427l, Function0 function0, Function3 function3, InterfaceC6942l[] interfaceC6942lArr) {
        C3819l c3819l = new C3819l(null, interfaceC9427l, function0, function3, interfaceC6942lArr);
        C16063l c16063l = new C16063l(interfaceC14029l.metrica(), interfaceC14029l, 0);
        Object objBilling = AbstractC1163l.billing(c16063l, true, c16063l, c3819l);
        return objBilling == EnumC9342l.f19165l ? objBilling : Unit.INSTANCE;
    }

    public abstract Integer amazon();

    public abstract AbstractC3302l purchase();
}

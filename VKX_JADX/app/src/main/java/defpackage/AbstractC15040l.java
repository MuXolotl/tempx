package defpackage;

import android.util.Range;
import android.util.Rational;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٔٝٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15040l {
    public static final LinkedHashMap yandex;

    static {
        C8581l c8581l = C8581l.amazon;
        C8195l c8195l = new C8195l(1, c8581l);
        C8581l c8581l2 = C8581l.mopub;
        C8195l c8195l2 = new C8195l(2, c8581l2);
        C8581l c8581l3 = C8581l.admob;
        yandex = AbstractC8676l.vip(new C8195l("video/hevc", AbstractC8676l.remoteconfig(c8195l, c8195l2, new C8195l(4096, c8581l3), new C8195l(8192, c8581l3))), new C8195l("video/av01", AbstractC8676l.remoteconfig(new C8195l(1, c8581l), new C8195l(2, c8581l2), new C8195l(4096, c8581l3), new C8195l(8192, c8581l3))), new C8195l("video/x-vnd.on2.vp9", AbstractC8676l.remoteconfig(new C8195l(1, c8581l), new C8195l(4, c8581l2), new C8195l(4096, c8581l3), new C8195l(16384, c8581l3), new C8195l(2, c8581l), new C8195l(8, c8581l2), new C8195l(8192, c8581l3), new C8195l(32768, c8581l3))), new C8195l("video/dolby-vision", AbstractC8676l.remoteconfig(new C8195l(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES), c8581l2), new C8195l(Integer.valueOf(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE), C8581l.purchase))));
    }

    public static final int amazon(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        String string;
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        Rational rational3 = new Rational(i6, i7);
        Rational rational4 = new Rational(i8, i9);
        double dDoubleValue = rational.doubleValue();
        int iDoubleValue = (int) (rational4.doubleValue() * rational3.doubleValue() * rational2.doubleValue() * dDoubleValue * ((double) i));
        if (AbstractC5088l.firebase("VideoConfigUtil")) {
            StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "Base Bitrate(", "bps) * Bit Depth Ratio (", " / ");
            AbstractC12900l.tapsense(sbSubscription, i3, ") * Frame Rate Ratio(", i4, " / ");
            AbstractC12900l.tapsense(sbSubscription, i5, ") * Width Ratio(", i6, " / ");
            AbstractC12900l.tapsense(sbSubscription, i7, ") * Height Ratio(", i8, " / ");
            sbSubscription.append(i9);
            sbSubscription.append(") = ");
            sbSubscription.append(iDoubleValue);
            string = sbSubscription.toString();
        } else {
            string = "";
        }
        AbstractC5088l.yandex("VideoConfigUtil", string);
        return iDoubleValue;
    }

    public static final C9072l crashlytics(C1858l c1858l, C15421l c15421l, C5680l c5680l) {
        String str;
        C6410l c6410l;
        String str2;
        int i = c1858l.loadAd;
        int i2 = c15421l.yandex;
        if (!c15421l.loadAd()) {
            C17132l.smaato(93, c15421l, "Dynamic range must be a fully specified dynamic range [provided dynamic range: ");
            return null;
        }
        String str3 = i == 1 ? "video/x-vnd.on2.vp8" : "video/avc";
        if (c5680l == null) {
            str = null;
            c6410l = null;
        } else {
            Set set = (Set) AbstractC12637l.loadAd.get(Integer.valueOf(i2));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) AbstractC12637l.yandex.get(Integer.valueOf(c15421l.loadAd));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            Iterator it = c5680l.amazon.iterator();
            while (true) {
                if (it.hasNext()) {
                    c6410l = (C6410l) it.next();
                    str = null;
                    if (set.contains(Integer.valueOf(c6410l.isPro)) && set2.contains(Integer.valueOf(c6410l.admob))) {
                        String str4 = c6410l.loadAd;
                        if (str3.equals(str4)) {
                            AbstractC5088l.yandex("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str3 + ']');
                        } else if (i == -1) {
                            AbstractC5088l.yandex("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_UNSPECIFIED. Using CamcorderProfile to derive VIDEO settings [mime type: " + str3 + ", dynamic range: " + c15421l + ']');
                        }
                        str3 = str4;
                    }
                } else {
                    str = null;
                    c6410l = null;
                }
            }
        }
        if (c6410l == null) {
            if (i == -1) {
                if (i2 == 1) {
                    str2 = "video/avc";
                } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                    str2 = "video/hevc";
                } else {
                    str2 = i2 != 6 ? str : "video/dolby-vision";
                }
                if (str2 == null) {
                    throw new UnsupportedOperationException("Unsupported dynamic range: " + c15421l + "\nNo supported default mime type available.");
                }
                str3 = str2;
            }
            if (c5680l == null) {
                AbstractC5088l.yandex("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str3 + ", dynamic range: " + c15421l + ']');
            } else {
                AbstractC5088l.yandex("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str3 + ", dynamic range: " + c15421l + ']');
            }
        }
        return new C9072l(str3, c6410l);
    }

    public static C16672l loadAd(C16928l c16928l, Range range) {
        Range range2 = C15691l.adcel;
        int iIntValue = range.equals(range2) ? 30 : ((Number) range.getUpper()).intValue();
        StringBuilder sbSubscription = AbstractC14814l.subscription(iIntValue, iIntValue, "Resolved capture/encode frame rate ", "fps/", "fps, [Expected operating range: ");
        sbSubscription.append(range.equals(range2) ? "<UNSPECIFIED>" : String.valueOf(range));
        sbSubscription.append(']');
        AbstractC5088l.yandex("VideoConfigUtil", sbSubscription.toString());
        return new C16672l(iIntValue, iIntValue);
    }

    public static C8581l yandex(int i, String str) {
        C8581l c8581l;
        Map map = (Map) yandex.get(str);
        if (map != null && (c8581l = (C8581l) map.get(Integer.valueOf(i))) != null) {
            return c8581l;
        }
        AbstractC5088l.tapsense("VideoConfigUtil", "Unsupported mime type " + str + " or profile level " + i + ". Data space is unspecified.");
        return C8581l.amazon;
    }
}

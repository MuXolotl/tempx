package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؓۜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2133l {
    public static final C15578l yandex = new C15578l(1850954627, false, new C10673l(17));

    public AbstractC2133l() {
        new ConcurrentHashMap();
    }

    public static C12818l admob(long j) {
        double d;
        C18411l c18411lCrashlytics = C18411l.billing.crashlytics(C9735l.admob(j), C9735l.mopub(j), C9735l.purchase(j), C9735l.amazon(j));
        C18411l c18411lCrashlytics2 = c18411lCrashlytics.crashlytics(C14661l.loadAd);
        double d2 = c18411lCrashlytics2.yandex;
        double d3 = c18411lCrashlytics2.loadAd;
        double d4 = c18411lCrashlytics2.crashlytics;
        double dMin = Math.min(d2, Math.min(d3, d4));
        double dMax = Math.max(d2, Math.max(d3, d4));
        double d5 = dMax - dMin;
        if (d5 < 1.0E-7d) {
            d = Double.NaN;
        } else if (d2 == dMax) {
            d = (d3 - d4) / d5;
        } else if (d3 == dMax) {
            d = 2.0d + ((d4 - d2) / d5);
        } else {
            d = d4 == dMax ? ((d2 - d3) / d5) + 4.0d : 0.0d;
        }
        float f = (float) ((((d * 60.0d) % 360.0d) + 360.0d) % 360.0d);
        float f2 = (float) (dMax != 0.0d ? d5 / dMax : 0.0d);
        float f3 = (float) dMax;
        float f4 = c18411lCrashlytics.amazon;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        return new C12818l(f, f2, f3, f4);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C2427l loadAd(C10507l c10507l, Uri uri, String str) {
        String str2;
        int i;
        C0935l c0935l = new C0935l();
        C17464l c17464l = new C17464l();
        List list = Collections.EMPTY_LIST;
        C13708l c13708l = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        String str3 = c10507l.yandex;
        C3117l c3117l = new C3117l();
        StringBuilder sb = new StringBuilder();
        AbstractC18643l abstractC18643l = c10507l.loadAd;
        sb.append(abstractC18643l.getLoadAd());
        if (abstractC18643l instanceof AudioTrack) {
            AudioTrack audioTrack = (AudioTrack) abstractC18643l;
            if (AbstractC12024l.m3315catch(audioTrack.license()) || Build.VERSION.SDK_INT > 35) {
                str2 = "";
            } else {
                str2 = " (" + audioTrack.license() + ')';
            }
        } else {
            str2 = "";
        }
        sb.append(str2);
        boolean z = abstractC18643l instanceof InterfaceC16858l;
        sb.append((!z || !((InterfaceC16858l) abstractC18643l).getMopub() || ((Boolean) AbstractC8619l.billing.yandex()).booleanValue() || Build.VERSION.SDK_INT > 35) ? "" : " 🅴");
        c3117l.yandex = sb.toString();
        c3117l.loadAd = abstractC18643l.getYandex();
        c3117l.billing = abstractC18643l.getYandex();
        String strFirebase = abstractC18643l.firebase();
        c3117l.crashlytics = strFirebase != null ? strFirebase : "";
        String yandex2 = abstractC18643l.getYandex();
        c3117l.vip = ((Boolean) AbstractC8619l.startapp.yandex()).booleanValue() ? new Uri.Builder().scheme("content").authority("ua.itaysonlab.vkx.service.artwork").path("track").appendPath(yandex2).build() : new Uri.Builder().scheme("vkx-artwork").authority(yandex2).build();
        InterfaceC0042l interfaceC0042l = abstractC18643l instanceof InterfaceC0042l ? (InterfaceC0042l) abstractC18643l : null;
        int iPurchase = interfaceC0042l != null ? interfaceC0042l.purchase() : 0;
        int i2 = iPurchase == 0 ? -1 : AbstractC2166l.yandex[AbstractC5020l.inmobi(iPurchase)];
        if (i2 != 1) {
            i = i2 != 2 ? 1 : 4;
        } else {
            i = 3;
        }
        c3117l.f6662synchronized = Integer.valueOf(i);
        InterfaceC16858l interfaceC16858l = z ? (InterfaceC16858l) abstractC18643l : null;
        c3117l.f6661strictfp = AbstractC1315l.loadAd(new C8195l("android.media.IS_EXPLICIT", Long.valueOf((interfaceC16858l == null || !interfaceC16858l.getMopub()) ? 0L : 1L)), new C8195l("vkx.media_id", abstractC18643l.getYandex()));
        C3852l c3852l = new C3852l(c3117l);
        String strSubscription = abstractC18643l.subscription();
        AbstractC12442l.subscription(((Uri) c17464l.purchase) == null || ((UUID) c17464l.amazon) != null);
        return new C2427l(str3, new C9202l(c0935l), new C17805l(uri, str, ((UUID) c17464l.amazon) != null ? new C14227l(c17464l) : null, null, list, null, c13708l, strSubscription, -9223372036854775807L), new C7828l(c2410l), c3852l, c11470l);
    }

    public static C5882l mopub(C5882l[] c5882lArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C5882l c5882l = null;
        int i3 = Alert.DURATION_SHOW_INDEFINITELY;
        for (C5882l c5882l2 : c5882lArr) {
            int iAbs = (Math.abs(c5882l2.crashlytics - i2) * 2) + (c5882l2.amazon == z ? 0 : 1);
            if (c5882l == null || i3 > iAbs) {
                c5882l = c5882l2;
                i3 = iAbs;
            }
        }
        return c5882l;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object subs(InterfaceC9354l interfaceC9354l, ByteBuffer byteBuffer, AbstractC0283l abstractC0283l) throws EOFException {
        C16897l c16897l;
        C2139l c2139l;
        if (abstractC0283l instanceof C16897l) {
            c16897l = (C16897l) abstractC0283l;
            int i = c16897l.f32951l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16897l.f32951l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16897l = new C16897l(abstractC0283l);
            }
        } else {
            c16897l = new C16897l(abstractC0283l);
        }
        Object obj = c16897l.f32954l;
        int i2 = c16897l.f32951l;
        int iMin = -1;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (interfaceC9354l.admob()) {
                return new Integer(-1);
            }
            if (interfaceC9354l.mopub().subs()) {
                c16897l.f32953l = interfaceC9354l;
                c16897l.f32952l = byteBuffer;
                c16897l.f32951l = 1;
                int i3 = AbstractC3458l.yandex;
                Object objAmazon = interfaceC9354l.amazon(1, c16897l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objAmazon == enumC9342l) {
                    return enumC9342l;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            byteBuffer = c16897l.f32952l;
            interfaceC9354l = c16897l.f32953l;
            AbstractC2829l.crashlytics(obj);
        }
        if (interfaceC9354l.admob()) {
            return new Integer(-1);
        }
        C18476l c18476lMopub = interfaceC9354l.mopub();
        if (c18476lMopub.f36079l == 0) {
            c18476lMopub.request(8192L);
            if (c18476lMopub.f36079l != 0) {
                if (!c18476lMopub.subs()) {
                    if (!c18476lMopub.subs()) {
                        C8339l.metrica("Buffer is empty");
                        return null;
                    }
                    c2139l = c18476lMopub.f36081l;
                    byte[] bArr = c2139l.yandex;
                    int i4 = c2139l.loadAd;
                    iMin = Math.min(byteBuffer.remaining(), c2139l.crashlytics - i4);
                    byteBuffer.put(bArr, i4, iMin);
                    if (iMin != 0) {
                        if (iMin >= 0) {
                            C8339l.smaato("Returned negative read bytes count");
                            return null;
                        }
                        if (iMin <= c2139l.loadAd()) {
                            C8339l.smaato("Returned too many bytes");
                            return null;
                        }
                        c18476lMopub.skip(iMin);
                    }
                }
            }
        } else if (!c18476lMopub.subs()) {
            if (!c18476lMopub.subs()) {
                C8339l.metrica("Buffer is empty");
                return null;
            }
            c2139l = c18476lMopub.f36081l;
            byte[] bArr2 = c2139l.yandex;
            int i5 = c2139l.loadAd;
            iMin = Math.min(byteBuffer.remaining(), c2139l.crashlytics - i5);
            byteBuffer.put(bArr2, i5, iMin);
            if (iMin != 0) {
                if (iMin >= 0) {
                    C8339l.smaato("Returned negative read bytes count");
                    return null;
                }
                if (iMin <= c2139l.loadAd()) {
                    C8339l.smaato("Returned too many bytes");
                    return null;
                }
                c18476lMopub.skip(iMin);
            }
        }
        return new Integer(iMin);
    }

    public static final C2427l yandex(C10507l c10507l) {
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        return new C2427l(c10507l.yandex, new C9202l(c0935l), null, new C7828l(c2410l), C3852l.f7980private, C11470l.amazon);
    }

    public abstract Typeface amazon(Context context, C5882l[] c5882lArr, int i);

    public Typeface billing(Context context, Resources resources, int i, String str, int i2) {
        File fileCrashlytics = AbstractC1383l.crashlytics(context);
        if (fileCrashlytics == null) {
            return null;
        }
        try {
            if (AbstractC1383l.yandex(fileCrashlytics, resources, i)) {
                return Typeface.createFromFile(fileCrashlytics.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileCrashlytics.delete();
        }
    }

    public abstract Typeface crashlytics(Context context, C16926l c16926l, Resources resources, int i);

    public Typeface purchase(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }
}

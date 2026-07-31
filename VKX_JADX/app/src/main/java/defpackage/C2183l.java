package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lۣؓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C2183l implements InterfaceC0587l, InterfaceC2053l, InterfaceC17443l, InterfaceC7386l, InterfaceC11856l, InterfaceC9765l, InterfaceC15244l, InterfaceC14257l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C2183l f4823l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4828l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C2183l f4820l = new C2183l(16);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C2183l f4825l = new C2183l(17);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C2183l f4824l = new C2183l(18);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C2183l f4827l = new C2183l(19);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C2183l f4821l = new C2183l(21);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C2183l f4822l = new C2183l(22);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C2183l f4826l = new C2183l(23);

    public /* synthetic */ C2183l(int i) {
        this.f4828l = i;
    }

    public static C10282l loadAd(C2183l c2183l, List list, int i, int i2) {
        long j;
        List listPurchase;
        char c = ' ';
        long j2 = 4294967295L;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);
        float f = 360.0f;
        if ((i2 & 8) == 0) {
            C10227l c10227lAdmob = AbstractC14055l.admob();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                C17180l c17180l = (C17180l) list.get(i3);
                C2183l c2183l2 = AbstractC11052l.yandex;
                long j3 = j2;
                long jAdmob = C1187l.admob(c17180l.yandex, jFloatToRawIntBits);
                arrayList.add(Float.valueOf((((float) Math.atan2(Float.intBitsToFloat((int) (jAdmob & j3)), Float.intBitsToFloat((int) (jAdmob >> 32)))) * 180.0f) / 3.1415927f));
                i3++;
                j2 = j3;
            }
            j = j2;
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList2.add(Float.valueOf(C1187l.crashlytics(C1187l.admob(((C17180l) list.get(i4)).yandex, jFloatToRawIntBits))));
            }
            int i5 = i * 2;
            float f2 = 360.0f / i5;
            for (int i6 = 0; i6 < i5; i6++) {
                Iterator it = AbstractC14055l.firebase(list).iterator();
                while (true) {
                    C16991l c16991l = (C16991l) it;
                    if (c16991l.f33123l) {
                        int iNextInt = c16991l.nextInt();
                        int i7 = i6 % 2;
                        if (i7 != 0) {
                            iNextInt = AbstractC14055l.smaato(list) - iNextInt;
                        }
                        if (iNextInt > 0 || i7 == 0) {
                            C2183l c2183l3 = AbstractC11052l.yandex;
                            double dFloatValue = (((i6 * f2) + (i7 == 0 ? ((Number) arrayList.get(iNextInt)).floatValue() : (((Number) arrayList.get(0)).floatValue() * 2.0f) + (f2 - ((Number) arrayList.get(iNextInt)).floatValue()))) / f) * 2.0f * 3.1415927f;
                            c10227lAdmob.add(new C17180l(C1187l.subs(C1187l.isPro(((Number) arrayList2.get(iNextInt)).floatValue(), (((long) Float.floatToRawIntBits((float) Math.sin(dFloatValue))) & j) | (((long) Float.floatToRawIntBits((float) Math.cos(dFloatValue))) << 32)), jFloatToRawIntBits), ((C17180l) list.get(iNextInt)).loadAd));
                        }
                        f = f;
                    }
                }
            }
            listPurchase = AbstractC14055l.purchase(c10227lAdmob);
        } else {
            j = 4294967295L;
            int size3 = list.size();
            C8934l c8934lAdcel = AbstractC8576l.adcel(0, size3 * i);
            ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(c8934lAdcel, 10));
            Iterator it2 = c8934lAdcel.iterator();
            while (true) {
                C16991l c16991l2 = (C16991l) it2;
                if (!c16991l2.f33123l) {
                    break;
                }
                int iNextInt2 = c16991l2.nextInt();
                C2183l c2183l4 = AbstractC11052l.yandex;
                int i8 = iNextInt2 % size3;
                long jAdmob2 = C1187l.admob(((C17180l) list.get(i8)).yandex, jFloatToRawIntBits);
                int i9 = (int) (jAdmob2 >> c);
                double d = ((((iNextInt2 / size3) * 360.0f) / i) / 360.0f) * 2.0f * 3.1415927f;
                char c2 = c;
                long j4 = jFloatToRawIntBits;
                int i10 = (int) (jAdmob2 & 4294967295L);
                arrayList3.add(new C17180l(C1187l.subs((((long) Float.floatToRawIntBits((Float.intBitsToFloat(i10) * ((float) Math.cos(d))) + (Float.intBitsToFloat(i9) * ((float) Math.sin(d))))) & 4294967295L) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i9) * ((float) Math.cos(d))) - (Float.intBitsToFloat(i10) * ((float) Math.sin(d))))) << c2), j4), ((C17180l) list.get(i8)).loadAd));
                jFloatToRawIntBits = j4;
                c = c2;
            }
            listPurchase = arrayList3;
        }
        char c3 = c;
        long j5 = jFloatToRawIntBits;
        int size4 = listPurchase.size() * 2;
        float[] fArr = new float[size4];
        for (int i11 = 0; i11 < size4; i11++) {
            long j6 = ((C17180l) listPurchase.get(i11 / 2)).yandex;
            fArr[i11] = Float.intBitsToFloat((int) (i11 % 2 == 0 ? j6 >> c3 : j6 & j));
        }
        C10227l c10227lAdmob2 = AbstractC14055l.admob();
        Iterator it3 = listPurchase.iterator();
        while (it3.hasNext()) {
            c10227lAdmob2.add(((C17180l) it3.next()).loadAd);
        }
        Unit unit = Unit.INSTANCE;
        return AbstractC9498l.loadAd(fArr, C2428l.loadAd, AbstractC14055l.purchase(c10227lAdmob2), Float.intBitsToFloat((int) (j5 >> c3)), Float.intBitsToFloat((int) (j5 & j)));
    }

    public static long purchase(long j, C16535l c16535l, C6644l c6644l) {
        long jLoadAd;
        int i = C12814l.crashlytics;
        long jYandex = c16535l.yandex((int) (j >> 32), true);
        long jYandex2 = C12814l.amazon(j) ? jYandex : c16535l.yandex((int) (j & 4294967295L), true);
        int i2 = 0;
        int i3 = c6644l != null ? c6644l.yandex : 0;
        if (C12814l.amazon(j)) {
            i2 = i3;
        } else if (c6644l != null) {
            i2 = c6644l.loadAd;
        }
        if (i3 != 0 && !C12814l.amazon(jYandex)) {
            int iInmobi = AbstractC5020l.inmobi(i3);
            if (iInmobi == 0) {
                int i4 = (int) (jYandex >> 32);
                jYandex = AbstractC2296l.loadAd(i4, i4);
            } else {
                if (iInmobi != 1) {
                    C18725l.billing();
                    return 0L;
                }
                int i5 = (int) (jYandex & 4294967295L);
                jYandex = AbstractC2296l.loadAd(i5, i5);
            }
        }
        if (i2 != 0 && !C12814l.amazon(jYandex2)) {
            int iInmobi2 = AbstractC5020l.inmobi(i2);
            if (iInmobi2 == 0) {
                int i6 = (int) (jYandex2 >> 32);
                jLoadAd = AbstractC2296l.loadAd(i6, i6);
            } else {
                if (iInmobi2 != 1) {
                    C18725l.billing();
                    return 0L;
                }
                int i7 = (int) (jYandex2 & 4294967295L);
                jLoadAd = AbstractC2296l.loadAd(i7, i7);
            }
            jYandex2 = jLoadAd;
        }
        int iMin = Math.min(C12814l.mopub(jYandex), C12814l.mopub(jYandex2));
        int iMax = Math.max(C12814l.billing(jYandex), C12814l.billing(jYandex2));
        return C12814l.admob(j) ? AbstractC2296l.loadAd(iMax, iMin) : AbstractC2296l.loadAd(iMin, iMax);
    }

    public static MediaCodec yandex(C1424l c1424l) throws IOException {
        String str = ((C6403l) c1424l.f3603l).yandex;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    @Override // defpackage.InterfaceC6848l
    public C9902l admob(C9902l c9902l, float f, C4565l c4565l) {
        Path path = c9902l.yandex;
        float f2 = (f / 7.0f) * 1.0f;
        if (Float.isNaN(0.0f) || Float.isNaN(0.0f) || Float.isNaN(f) || Float.isNaN(f)) {
            AbstractC3478l.crashlytics("Invalid rectangle, make sure no value is NaN");
        }
        if (c9902l.loadAd == null) {
            c9902l.loadAd = new RectF();
        }
        c9902l.loadAd.set(0.0f, 0.0f, f, f);
        path.addRect(c9902l.loadAd, AbstractC3478l.loadAd(1));
        float f3 = f - f2;
        if (Float.isNaN(f2) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f3)) {
            AbstractC3478l.crashlytics("Invalid rectangle, make sure no value is NaN");
        }
        if (c9902l.loadAd == null) {
            c9902l.loadAd = new RectF();
        }
        c9902l.loadAd.set(f2, f2, f3, f3);
        path.addRect(c9902l.loadAd, AbstractC3478l.loadAd(1));
        return c9902l;
    }

    public void amazon(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public C10282l crashlytics() {
        C10282l c10282l = AbstractC11052l.remoteconfig;
        if (c10282l != null) {
            return c10282l;
        }
        C10282l c10282lLoadAd = loadAd(this, AbstractC14055l.remoteconfig(new C17180l((((long) Float.floatToRawIntBits(0.193f)) << 32) | (((long) Float.floatToRawIntBits(0.277f)) & 4294967295L), new C2428l(2, 0.053f)), new C17180l((((long) Float.floatToRawIntBits(0.176f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.055f))), new C2428l(2, 0.053f))), 10, 12).loadAd();
        AbstractC11052l.remoteconfig = c10282lLoadAd;
        return c10282lLoadAd;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        C6162l c6162l = new C6162l(14);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C6541l.subs("Null flags");
            return null;
        }
        map.put(EnumC14251l.f27853l, new C4807l(30000L, 86400000L, set));
        if (set == null) {
            C6541l.subs("Null flags");
            return null;
        }
        map.put(EnumC14251l.f27851l, new C4807l(1000L, 86400000L, set));
        if (set == null) {
            C6541l.subs("Null flags");
            return null;
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(EnumC2089l.f4679l)));
        if (setUnmodifiableSet == null) {
            C6541l.subs("Null flags");
            return null;
        }
        map.put(EnumC14251l.f27852l, new C4807l(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= EnumC14251l.values().length) {
            new HashMap();
            return new C6724l(c6162l, map);
        }
        C8339l.smaato("Not all priorities have been configured");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // defpackage.InterfaceC11856l
    public InterfaceC17529l isPro(C1424l c1424l) throws Throwable {
        MediaCodec mediaCodecYandex = null;
        try {
            mediaCodecYandex = yandex(c1424l);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) c1424l.f3605l;
            mediaCodecYandex.configure((MediaFormat) c1424l.f3602l, surface, (MediaCrypto) c1424l.f3604l, (surface == null && ((C6403l) c1424l.f3603l).admob && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecYandex.start();
            Trace.endSection();
            return new C2141l(mediaCodecYandex, (C16957l) c1424l.f3606l);
        } catch (IOException e) {
            e = e;
            if (mediaCodecYandex != null) {
                mediaCodecYandex.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodecYandex != null) {
                mediaCodecYandex.release();
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
  0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // defpackage.InterfaceC14257l
    public C15380l metrica(Context context, String str, InterfaceC6481l interfaceC6481l) {
        C15380l c15380l = new C15380l();
        c15380l.loadAd = interfaceC6481l.subs(context, str);
        int i = 1;
        int iBilling = interfaceC6481l.billing(context, str, true);
        c15380l.crashlytics = iBilling;
        int i2 = c15380l.loadAd;
        if (i2 == 0) {
            i2 = 0;
            if (iBilling == 0) {
                i = 0;
            } else if (i2 >= iBilling) {
                i = -1;
            }
        } else if (i2 >= iBilling) {
            i = -1;
        }
        c15380l.amazon = i;
        return c15380l;
    }

    @Override // defpackage.InterfaceC0587l
    public InterfaceC14090l pro() {
        return new C1337l(false);
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        C15445l c15445l = new C15445l();
        RunnableC10253l runnableC10253l = new RunnableC10253l(4);
        ReferenceQueue referenceQueue = c15445l.yandex;
        Set set = c15445l.loadAd;
        set.add(new C7345l(c15445l, referenceQueue, set, runnableC10253l));
        Thread thread = new Thread(new RunnableC9929l(referenceQueue, set, 26), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c15445l;
    }

    @Override // defpackage.InterfaceC2053l
    public InterfaceC8979l startapp(int i, int i2) {
        return new C6120l();
    }

    public String toString() {
        switch (this.f4828l) {
            case 14:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f4828l) {
            case 16:
                List list = AbstractC5981l.yandex;
                return (String) C12384l.crashlytics.get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(21600000L, 43, "measurement.sgtm.batch.retry_max_wait").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(60000L, 27, "measurement.alarm_manager.minimum_interval").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC5981l.yandex;
                C12737l.f25103l.get();
                return (String) C1801l.yandex.mopub("measurement.test.string_flag", 5, "---").get();
            case 20:
            default:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(100000L, 71, "measurement.upload.max_events_per_day").get()).longValue());
            case 21:
                List list6 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Boolean) C4515l.yandex.yandex("measurement.config.notify_trigger_uris_on_backgrounded", true, 31).get();
            case 22:
                List list7 = AbstractC5981l.yandex;
                return (Boolean) C15477l.yandex.get();
        }
    }

    @Override // defpackage.InterfaceC2053l
    public void firebase() {
    }

    @Override // defpackage.InterfaceC2053l
    public void tapsense(InterfaceC12703l interfaceC12703l) {
    }

    public void billing(C11941l c11941l, int i, int i2) {
    }
}

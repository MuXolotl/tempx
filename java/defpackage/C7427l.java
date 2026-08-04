package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lًؚٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7427l {
    public static final String Signature;
    public final C3723l adcel;
    public C15848l admob;
    public final C3723l ads;
    public final List amazon;
    public C10184l billing;
    public C4816l crashlytics;
    public final C3723l firebase;
    public final C3723l isPro;
    public final String loadAd;
    public final C3723l metrica;
    public Long mopub;
    public long purchase;
    public final C3723l remoteconfig;
    public final C3723l smaato;
    public final C3723l startapp;
    public int subs;
    public final C3723l subscription;
    public final C3723l tapsense;
    public final C3723l vip;
    public final C0022l yandex;

    static {
        Pattern pattern = AbstractC15091l.yandex;
        Signature = "urn:x-cast:com.google.cast.media";
    }

    public C7427l() {
        String str = Signature;
        AbstractC15091l.loadAd(str);
        this.loadAd = str;
        this.yandex = new C0022l("MediaControlChannel", null);
        this.amazon = DesugarCollections.synchronizedList(new ArrayList());
        this.subs = -1;
        C3723l c3723l = new C3723l(86400000L, "load");
        this.isPro = c3723l;
        C3723l c3723l2 = new C3723l(86400000L, "pause");
        this.firebase = c3723l2;
        C3723l c3723l3 = new C3723l(86400000L, "play");
        this.smaato = c3723l3;
        C3723l c3723l4 = new C3723l(86400000L, "stop");
        C3723l c3723l5 = new C3723l(10000L, "seek");
        this.remoteconfig = c3723l5;
        C3723l c3723l6 = new C3723l(86400000L, "volume");
        this.vip = c3723l6;
        C3723l c3723l7 = new C3723l(86400000L, "mute");
        this.metrica = c3723l7;
        C3723l c3723l8 = new C3723l(86400000L, "status");
        this.startapp = c3723l8;
        C3723l c3723l9 = new C3723l(86400000L, "activeTracks");
        C3723l c3723l10 = new C3723l(86400000L, "trackStyle");
        C3723l c3723l11 = new C3723l(86400000L, "queueInsert");
        C3723l c3723l12 = new C3723l(86400000L, "queueUpdate");
        this.adcel = c3723l12;
        C3723l c3723l13 = new C3723l(86400000L, "queueRemove");
        C3723l c3723l14 = new C3723l(86400000L, "queueReorder");
        C3723l c3723l15 = new C3723l(86400000L, "queueFetchItemIds");
        this.ads = c3723l15;
        C3723l c3723l16 = new C3723l(86400000L, "queueFetchItemRange");
        this.tapsense = c3723l16;
        this.subscription = new C3723l(86400000L, "queueFetchItems");
        C3723l c3723l17 = new C3723l(86400000L, "setPlaybackRate");
        C3723l c3723l18 = new C3723l(86400000L, "skipAd");
        smaato(c3723l);
        smaato(c3723l2);
        smaato(c3723l3);
        smaato(c3723l4);
        smaato(c3723l5);
        smaato(c3723l6);
        smaato(c3723l7);
        smaato(c3723l8);
        smaato(c3723l9);
        smaato(c3723l10);
        smaato(c3723l11);
        smaato(c3723l12);
        smaato(c3723l13);
        smaato(c3723l14);
        smaato(c3723l15);
        smaato(c3723l16);
        smaato(c3723l16);
        smaato(c3723l17);
        smaato(c3723l18);
        isPro();
    }

    public static C2183l firebase(JSONObject jSONObject) {
        MediaError.billing(jSONObject);
        C2183l c2183l = new C2183l(15);
        Pattern pattern = AbstractC15091l.yandex;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return c2183l;
    }

    public static int[] purchase(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public final void admob() {
        C15848l c15848l = this.admob;
        if (c15848l != null) {
            C17186l c17186l = (C17186l) c15848l.f31100l;
            Iterator it = c17186l.mopub.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            for (C7801l c7801l : c17186l.admob) {
                switch (c7801l.yandex) {
                    case 2:
                        ((C9937l) c7801l.loadAd).loadAd();
                        break;
                }
            }
        }
    }

    public final void amazon(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.subs = jSONObject.optInt("sequenceNumber", -1);
        } else {
            C0022l c0022l = this.yandex;
            Log.w(c0022l.yandex, c0022l.amazon(str.concat(" message is missing a sequence number."), new Object[0]));
        }
    }

    public final void billing() {
        C15848l c15848l = this.admob;
        if (c15848l != null) {
            C17186l c17186l = (C17186l) c15848l.f31100l;
            c17186l.getClass();
            Iterator it = c17186l.subs.values().iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    C18725l.loadAd();
                    return;
                } else {
                    if (!c17186l.billing() && c17186l.billing()) {
                        throw null;
                    }
                    throw null;
                }
            }
            Iterator it2 = c17186l.mopub.iterator();
            if (it2.hasNext()) {
                throw AbstractC15560l.adcel(it2);
            }
            for (C7801l c7801l : c17186l.admob) {
                switch (c7801l.yandex) {
                    case 0:
                        C13985l c13985l = (C13985l) c7801l.loadAd;
                        long jPurchase = c13985l.purchase();
                        if (jPurchase != c13985l.loadAd) {
                            c13985l.loadAd = jPurchase;
                            c13985l.yandex();
                            if (c13985l.loadAd != 0) {
                                c13985l.loadAd();
                            }
                        }
                        break;
                    case 1:
                        C0189l c0189l = (C0189l) c7801l.loadAd;
                        C17186l c17186l2 = c0189l.isPro;
                        C10184l c10184lCrashlytics = c17186l2 != null ? c17186l2.crashlytics() : null;
                        C7214l c7214l = c0189l.smaato;
                        if (c7214l != null && c10184lCrashlytics != null) {
                            C6643l c6643lIsPro = ((C3557l) c7214l.f15044l).isPro();
                            C0386l c0386l = new C0386l(new C14513l(c10184lCrashlytics));
                            C0386l c0386l2 = c6643lIsPro.remoteconfig;
                            if (c0386l2 == null || c0386l2.amazon != 2) {
                                c0386l.crashlytics = c6643lIsPro.admob;
                                c6643lIsPro.remoteconfig = c0386l;
                            }
                        }
                        break;
                    default:
                        ((C9937l) c7801l.loadAd).loadAd();
                        break;
                }
            }
        }
    }

    public final long crashlytics(double d, long j, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.purchase;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (jElapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    public final void isPro() {
        this.purchase = 0L;
        this.billing = null;
        Iterator it = this.amazon.iterator();
        while (it.hasNext()) {
            ((C3723l) it.next()).purchase(2002);
        }
    }

    public final long loadAd() throws C1330l {
        C10184l c10184l = this.billing;
        if (c10184l != null) {
            return c10184l.f20755l;
        }
        throw new C1330l();
    }

    public final void metrica() {
        List list = this.amazon;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C3723l) it.next()).purchase(2002);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        isPro();
    }

    public final void mopub() {
        C15848l c15848l = this.admob;
        if (c15848l != null) {
            C17186l c17186l = (C17186l) c15848l.f31100l;
            c17186l.getClass();
            Iterator it = c17186l.mopub.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            for (C7801l c7801l : c17186l.admob) {
                switch (c7801l.yandex) {
                    case 2:
                        ((C9937l) c7801l.loadAd).loadAd();
                        break;
                }
            }
        }
    }

    public final void remoteconfig(long j, String str) {
        int i = 0;
        Object[] objArr = {str, null};
        C0022l c0022l = this.yandex;
        c0022l.getClass();
        String str2 = c0022l.yandex;
        if (!Build.TYPE.equals("user") && c0022l.loadAd && Log.isLoggable(str2, 2)) {
            Log.v(str2, c0022l.amazon("Sending text message: %s to: %s", objArr));
        }
        C4816l c4816l = this.crashlytics;
        if (c4816l == null) {
            Log.e(str2, c0022l.amazon("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        C16014l c16014l = (C16014l) c4816l.f9860l;
        if (c16014l == null) {
            C8339l.smaato("Device is not connected");
            return;
        }
        String str3 = this.loadAd;
        AbstractC15091l.loadAd(str3);
        if (TextUtils.isEmpty(str)) {
            C8339l.metrica("The message payload cannot be null or empty");
            return;
        }
        if (str.length() > 524288) {
            C0022l c0022l2 = C16014l.f31391package;
            Log.w(c0022l2.yandex, c0022l2.amazon("Message send failed. Message exceeds maximum size", new Object[0]));
            C8339l.metrica("Message exceeds maximum size524288");
        } else {
            C10147l c10147lYandex = C8662l.yandex();
            c10147lYandex.yandex = new C2019l(c16014l, str3, str, i);
            c10147lYandex.purchase = 8405;
            c16014l.purchase(1, c10147lYandex.yandex()).crashlytics(new C3253l(c4816l, j, 7));
        }
    }

    public final void smaato(C3723l c3723l) {
        this.amazon.add(c3723l);
    }

    public final long startapp() {
        C8593l c8593l;
        C10184l c10184l = this.billing;
        MediaInfo mediaInfo = c10184l == null ? null : c10184l.f20756l;
        long jCrashlytics = 0;
        if (mediaInfo != null && c10184l != null) {
            Long l = this.mopub;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    C10184l c10184l2 = this.billing;
                    if (c10184l2.f20750l != null) {
                        long jLongValue = l.longValue();
                        C10184l c10184l3 = this.billing;
                        if (c10184l3 != null && (c8593l = c10184l3.f20750l) != null) {
                            long j = c8593l.f17712l;
                            jCrashlytics = !c8593l.f17714l ? crashlytics(1.0d, j, -1L) : j;
                        }
                        return Math.min(jLongValue, jCrashlytics);
                    }
                    MediaInfo mediaInfo2 = c10184l2 == null ? null : c10184l2.f20756l;
                    if ((mediaInfo2 != null ? mediaInfo2.f555l : 0L) >= 0) {
                        long jLongValue2 = l.longValue();
                        C10184l c10184l4 = this.billing;
                        MediaInfo mediaInfo3 = c10184l4 != null ? c10184l4.f20756l : null;
                        return Math.min(jLongValue2, mediaInfo3 != null ? mediaInfo3.f555l : 0L);
                    }
                }
                return l.longValue();
            }
            if (this.purchase != 0) {
                double d = c10184l.f20762l;
                long j2 = c10184l.f20749l;
                return (d == 0.0d || c10184l.f20761l != 2) ? j2 : crashlytics(d, j2, mediaInfo.f555l);
            }
        }
        return 0L;
    }

    public final void subs() {
        C15848l c15848l = this.admob;
        if (c15848l != null) {
            C17186l c17186l = (C17186l) c15848l.f31100l;
            Iterator it = c17186l.mopub.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            for (C7801l c7801l : c17186l.admob) {
                switch (c7801l.yandex) {
                    case 2:
                        ((C9937l) c7801l.loadAd).loadAd();
                        break;
                }
            }
        }
    }

    public final long vip() {
        C4816l c4816l = this.crashlytics;
        if (c4816l != null) {
            return ((AtomicLong) c4816l.f9859l).getAndIncrement();
        }
        C0022l c0022l = this.yandex;
        Log.e(c0022l.yandex, c0022l.amazon("Attempt to generate requestId without a sink", new Object[0]));
        return 0L;
    }

    public final void yandex(InterfaceC5194l interfaceC5194l, int i) {
        JSONObject jSONObject = new JSONObject();
        long jVip = vip();
        try {
            jSONObject.put("requestId", jVip);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", loadAd());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            int i2 = this.subs;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        remoteconfig(jVip, jSONObject.toString());
        this.adcel.yandex(jVip, new C5633l(this, interfaceC5194l));
    }
}

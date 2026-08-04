package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lۣٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17186l {
    public static final C0022l isPro = new C0022l("RemoteMediaClient", null);
    public final C4816l amazon;
    public C16014l billing;
    public final C7427l crashlytics;
    public final HandlerC4052l loadAd;
    public final C13985l purchase;
    public final ConcurrentHashMap subs;
    public final Object yandex;
    public final CopyOnWriteArrayList mopub = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList admob = new CopyOnWriteArrayList();

    static {
        String str = C7427l.Signature;
    }

    public C17186l(C7427l c7427l) {
        new ConcurrentHashMap();
        this.subs = new ConcurrentHashMap();
        this.yandex = new Object();
        this.loadAd = new HandlerC4052l(Looper.getMainLooper(), 6);
        C4816l c4816l = new C4816l(this);
        this.amazon = c4816l;
        this.crashlytics = c7427l;
        c7427l.admob = new C15848l(1, this);
        c7427l.crashlytics = c4816l;
        this.purchase = new C13985l(this);
    }

    public static final void ads(AbstractC0538l abstractC0538l) {
        try {
            abstractC0538l.smaato();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            abstractC0538l.billing(new C7983l(abstractC0538l, new Status(2100, null, null, null)));
        }
    }

    public static C14373l startapp() {
        C14373l c14373l = new C14373l();
        c14373l.billing(new C7983l(c14373l, new Status(17, null, null, null)));
        return c14373l;
    }

    public final boolean adcel() {
        return this.billing != null;
    }

    public final boolean admob() {
        AbstractC1051l.purchase("Must be called from the main thread.");
        C10184l c10184lCrashlytics = crashlytics();
        return (c10184lCrashlytics == null || c10184lCrashlytics.f20763l == 0) ? false : true;
    }

    public final int amazon() {
        int i;
        synchronized (this.yandex) {
            try {
                AbstractC1051l.purchase("Must be called from the main thread.");
                C10184l c10184lCrashlytics = crashlytics();
                i = c10184lCrashlytics != null ? c10184lCrashlytics.f20761l : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final boolean billing() {
        AbstractC1051l.purchase("Must be called from the main thread.");
        AbstractC1051l.purchase("Must be called from the main thread.");
        C10184l c10184lCrashlytics = crashlytics();
        if (c10184lCrashlytics != null && c10184lCrashlytics.f20761l == 4) {
            return true;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        C10184l c10184lCrashlytics2 = crashlytics();
        if (c10184lCrashlytics2 != null && c10184lCrashlytics2.f20761l == 5) {
            return true;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        C10184l c10184lCrashlytics3 = crashlytics();
        return (c10184lCrashlytics3 != null && c10184lCrashlytics3.f20761l == 2) || subs() || admob();
    }

    public final C10184l crashlytics() {
        C10184l c10184l;
        synchronized (this.yandex) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            c10184l = this.crashlytics.billing;
        }
        return c10184l;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void firebase(String str) {
        char c;
        int i;
        int iBilling;
        boolean z;
        C10184l c10184l;
        int[] iArrPurchase;
        C7427l c7427l = this.crashlytics;
        C3723l c3723l = c7427l.isPro;
        List list = c7427l.amazon;
        C0022l c0022l = c7427l.yandex;
        c0022l.loadAd("message received: %s", str);
        String str2 = c0022l.yandex;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long jOptLong = jSONObject.optLong("requestId", -1L);
            c = 1;
            try {
                switch (string.hashCode()) {
                    case -1830647528:
                        if (string.equals("LOAD_CANCELLED")) {
                            c3723l.amazon(jOptLong, 2101, C7427l.firebase(jSONObject));
                        }
                        break;
                    case -1790231854:
                        if (string.equals("QUEUE_ITEMS")) {
                            c7427l.subscription.amazon(jOptLong, 0, null);
                            c7427l.amazon(jSONObject, "QUEUE_ITEMS");
                            if (c7427l.admob != null) {
                                JSONArray jSONArray = jSONObject.getJSONArray("items");
                                C13328l[] c13328lArr = new C13328l[jSONArray.length()];
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    c13328lArr[i2] = new C5501l(jSONArray.getJSONObject(i2)).m1823protected();
                                }
                                Iterator it = ((C17186l) c7427l.admob.f31100l).admob.iterator();
                                while (it.hasNext()) {
                                    ((C7801l) it.next()).metrica(c13328lArr);
                                }
                            }
                        }
                        break;
                    case -1125000185:
                        if (string.equals("INVALID_REQUEST")) {
                            Log.w(str2, c0022l.amazon("received unexpected error: Invalid Request.", new Object[0]));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((C3723l) it2.next()).amazon(jOptLong, 2001, C7427l.firebase(jSONObject));
                            }
                        }
                        break;
                    case -262628938:
                        if (string.equals("LOAD_FAILED")) {
                            c3723l.amazon(jOptLong, 2100, C7427l.firebase(jSONObject));
                        }
                        break;
                    case 66247144:
                        if (string.equals("ERROR")) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                ((C3723l) it3.next()).amazon(jOptLong, 2100, C7427l.firebase(jSONObject));
                            }
                            if (c7427l.admob != null) {
                                MediaError.billing(jSONObject);
                                Iterator it4 = ((C17186l) c7427l.admob.f31100l).admob.iterator();
                                while (it4.hasNext()) {
                                    ((C7801l) it4.next()).getClass();
                                }
                            }
                        }
                        break;
                    case 154411710:
                        if (string.equals("QUEUE_CHANGE")) {
                            c7427l.tapsense.amazon(jOptLong, 0, null);
                            c7427l.amazon(jSONObject, "QUEUE_CHANGE");
                            if (c7427l.admob != null) {
                                String string2 = jSONObject.getString("changeType");
                                int[] iArrPurchase2 = C7427l.purchase(jSONObject.getJSONArray("itemIds"));
                                int iOptInt = jSONObject.optInt("insertBefore", 0);
                                if (iArrPurchase2 != null) {
                                    switch (string2.hashCode()) {
                                        case -2130463047:
                                            if (string2.equals("INSERT")) {
                                                Iterator it5 = ((C17186l) c7427l.admob.f31100l).admob.iterator();
                                                while (it5.hasNext()) {
                                                    ((C7801l) it5.next()).subs(iArrPurchase2, iOptInt);
                                                }
                                            }
                                            break;
                                        case -1881281404:
                                            if (string2.equals("REMOVE")) {
                                                Iterator it6 = ((C17186l) c7427l.admob.f31100l).admob.iterator();
                                                while (it6.hasNext()) {
                                                    ((C7801l) it6.next()).remoteconfig(iArrPurchase2);
                                                }
                                            }
                                            break;
                                        case -1785516855:
                                            if (string2.equals("UPDATE")) {
                                                int[] iArrPurchase3 = C7427l.purchase(jSONObject.getJSONArray("itemIds"));
                                                AbstractC1051l.isPro(iArrPurchase3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                                if (jSONArrayOptJSONArray != null) {
                                                    ArrayList arrayListPurchase = AbstractC15091l.purchase(iArrPurchase3);
                                                    int iOptInt2 = jSONObject.optInt("insertBefore", 0);
                                                    int[] iArrPurchase4 = C7427l.purchase(jSONArrayOptJSONArray);
                                                    AbstractC1051l.subs(iArrPurchase4);
                                                    ArrayList arrayListPurchase2 = AbstractC15091l.purchase(iArrPurchase4);
                                                    Iterator it7 = ((C17186l) c7427l.admob.f31100l).admob.iterator();
                                                    while (it7.hasNext()) {
                                                        ((C7801l) it7.next()).adcel(arrayListPurchase, arrayListPurchase2, iOptInt2);
                                                    }
                                                } else {
                                                    Iterator it8 = ((C17186l) c7427l.admob.f31100l).admob.iterator();
                                                    while (it8.hasNext()) {
                                                        ((C7801l) it8.next()).mopub(iArrPurchase3);
                                                    }
                                                }
                                            }
                                            break;
                                        case 1122976047:
                                            if (string2.equals("ITEMS_CHANGE")) {
                                                Iterator it9 = ((C17186l) c7427l.admob.f31100l).admob.iterator();
                                                while (it9.hasNext()) {
                                                    ((C7801l) it9.next()).firebase(iArrPurchase2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    case 431600379:
                        if (string.equals("INVALID_PLAYER_STATE")) {
                            Log.w(str2, c0022l.amazon("received unexpected error: Invalid Player State.", new Object[0]));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                ((C3723l) it10.next()).amazon(jOptLong, 2100, C7427l.firebase(jSONObject));
                            }
                        }
                        break;
                    case 823510221:
                        if (string.equals("MEDIA_STATUS")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                            if (jSONArray2.length() > 0) {
                                JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                                boolean zCrashlytics = c3723l.crashlytics(jOptLong);
                                C3723l c3723l2 = c7427l.vip;
                                if (!c3723l2.loadAd() || c3723l2.crashlytics(jOptLong)) {
                                    C3723l c3723l3 = c7427l.metrica;
                                    i = (!c3723l3.loadAd() || c3723l3.crashlytics(jOptLong)) ? 0 : 1;
                                }
                                if (zCrashlytics || (c10184l = c7427l.billing) == null) {
                                    C10184l c10184l2 = new C10184l(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                    c10184l2.billing(jSONObject2, 0);
                                    c7427l.billing = c10184l2;
                                    c7427l.purchase = SystemClock.elapsedRealtime();
                                    iBilling = 127;
                                } else {
                                    iBilling = c10184l.billing(jSONObject2, i);
                                }
                                if ((iBilling & 1) != 0) {
                                    c7427l.purchase = SystemClock.elapsedRealtime();
                                    c7427l.subs = -1;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if ((iBilling & 2) != 0) {
                                    c7427l.purchase = SystemClock.elapsedRealtime();
                                    z = true;
                                }
                                if ((iBilling & 128) != 0) {
                                    c7427l.purchase = SystemClock.elapsedRealtime();
                                }
                                if ((iBilling & 4) != 0) {
                                    c7427l.mopub();
                                }
                                if ((iBilling & 8) != 0) {
                                    c7427l.admob();
                                }
                                if ((iBilling & 16) != 0) {
                                    c7427l.subs();
                                }
                                if ((iBilling & 32) != 0) {
                                    c7427l.purchase = SystemClock.elapsedRealtime();
                                    C15848l c15848l = c7427l.admob;
                                    if (c15848l != null) {
                                        c15848l.yandex();
                                    }
                                }
                                if ((iBilling & 64) != 0) {
                                    c7427l.purchase = SystemClock.elapsedRealtime();
                                } else if (z) {
                                }
                                c7427l.billing();
                            } else {
                                c7427l.billing = null;
                                c7427l.billing();
                                c7427l.mopub();
                                c7427l.admob();
                                c7427l.subs();
                            }
                            Iterator it11 = list.iterator();
                            while (it11.hasNext()) {
                                ((C3723l) it11.next()).amazon(jOptLong, 0, null);
                            }
                        }
                        break;
                    case 2107149050:
                        if (string.equals("QUEUE_ITEM_IDS")) {
                            c7427l.ads.amazon(jOptLong, 0, null);
                            c7427l.amazon(jSONObject, "QUEUE_ITEM_IDS");
                            if (c7427l.admob != null && (iArrPurchase = C7427l.purchase(jSONObject.getJSONArray("itemIds"))) != null) {
                                Iterator it12 = ((C17186l) c7427l.admob.f31100l).admob.iterator();
                                while (it12.hasNext()) {
                                    ((C7801l) it12.next()).mopub(iArrPurchase);
                                }
                                break;
                            }
                        }
                        break;
                }
            } catch (JSONException e) {
                e = e;
                Object[] objArr = new Object[2];
                objArr[0] = e.getMessage();
                objArr[c] = str;
                Log.w(str2, c0022l.amazon("Message is malformed (%s); ignoring: %s", objArr));
            }
        } catch (JSONException e2) {
            e = e2;
            c = 1;
        }
    }

    public final boolean isPro() {
        AbstractC1051l.purchase("Must be called from the main thread.");
        C10184l c10184lCrashlytics = crashlytics();
        return c10184lCrashlytics != null && c10184lCrashlytics.f20768l;
    }

    public final MediaInfo loadAd() {
        MediaInfo mediaInfo;
        synchronized (this.yandex) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            C10184l c10184l = this.crashlytics.billing;
            mediaInfo = c10184l == null ? null : c10184l.f20756l;
        }
        return mediaInfo;
    }

    public final int metrica() {
        if (loadAd() == null || !billing()) {
            return 0;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        C10184l c10184lCrashlytics = crashlytics();
        if (c10184lCrashlytics != null && c10184lCrashlytics.f20761l == 4) {
            return 6;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        C10184l c10184lCrashlytics2 = crashlytics();
        if (c10184lCrashlytics2 != null && c10184lCrashlytics2.f20761l == 2) {
            return 3;
        }
        if (subs()) {
            return 2;
        }
        if (!admob()) {
            return 0;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        C10184l c10184lCrashlytics3 = crashlytics();
        C13328l c13328l = null;
        if (c10184lCrashlytics3 != null) {
            Integer num = (Integer) c10184lCrashlytics3.f20754l.get(c10184lCrashlytics3.f20763l);
            if (num != null) {
                c13328l = (C13328l) c10184lCrashlytics3.f20758l.get(num.intValue());
            }
        }
        return (c13328l == null || c13328l.f26162l == null) ? 0 : 6;
    }

    public final boolean mopub() {
        AbstractC1051l.purchase("Must be called from the main thread.");
        MediaInfo mediaInfoLoadAd = loadAd();
        return mediaInfoLoadAd != null && mediaInfoLoadAd.f550l == 2;
    }

    public final long purchase() {
        long j;
        synchronized (this.yandex) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            C10184l c10184l = this.crashlytics.billing;
            MediaInfo mediaInfo = c10184l == null ? null : c10184l.f20756l;
            j = mediaInfo != null ? mediaInfo.f555l : 0L;
        }
        return j;
    }

    public final void remoteconfig(C16014l c16014l) {
        C17186l c17186l;
        C16014l c16014l2 = this.billing;
        if (c16014l2 == c16014l) {
            return;
        }
        if (c16014l2 != null) {
            this.crashlytics.metrica();
            this.purchase.yandex();
            AbstractC1051l.purchase("Must be called from the main thread.");
            String str = this.crashlytics.loadAd;
            if (TextUtils.isEmpty(str)) {
                C8339l.metrica("Channel namespace cannot be null or empty");
                return;
            }
            HashMap map = c16014l2.applovin;
            synchronized (map) {
                c17186l = (C17186l) map.remove(str);
            }
            C10147l c10147lYandex = C8662l.yandex();
            c10147lYandex.yandex = new C5991l(c16014l2, c17186l, str, 14);
            c10147lYandex.purchase = 8414;
            c16014l2.purchase(1, c10147lYandex.yandex());
            this.amazon.f9860l = null;
            this.loadAd.removeCallbacksAndMessages(null);
        }
        this.billing = c16014l;
        if (c16014l != null) {
            this.amazon.f9860l = c16014l;
        }
    }

    public final void smaato() {
        AbstractC1051l.purchase("Must be called from the main thread.");
        int iAmazon = amazon();
        if (iAmazon == 4 || iAmazon == 2) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            if (adcel()) {
                ads(new C6528l(this, 3, false));
                return;
            } else {
                startapp();
                return;
            }
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        if (adcel()) {
            ads(new C6528l(this, 4, false));
        } else {
            startapp();
        }
    }

    public final boolean subs() {
        int i;
        AbstractC1051l.purchase("Must be called from the main thread.");
        C10184l c10184lCrashlytics = crashlytics();
        if (c10184lCrashlytics == null) {
            return false;
        }
        if (c10184lCrashlytics.f20761l == 3) {
            return true;
        }
        if (!mopub()) {
            return false;
        }
        synchronized (this.yandex) {
            try {
                AbstractC1051l.purchase("Must be called from the main thread.");
                C10184l c10184lCrashlytics2 = crashlytics();
                i = c10184lCrashlytics2 != null ? c10184lCrashlytics2.f20765l : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i == 2;
    }

    public final void vip() {
        C16014l c16014l = this.billing;
        if (c16014l == null) {
            return;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        String str = this.crashlytics.loadAd;
        AbstractC15091l.loadAd(str);
        HashMap map = c16014l.applovin;
        synchronized (map) {
            map.put(str, this);
        }
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.yandex = new C4816l(c16014l, str, this, 14);
        c10147lYandex.purchase = 8413;
        c16014l.purchase(1, c10147lYandex.yandex());
        AbstractC1051l.purchase("Must be called from the main thread.");
        if (adcel()) {
            ads(new C6528l(this, 5));
        } else {
            startapp();
        }
    }

    public final long yandex() {
        long jStartapp;
        synchronized (this.yandex) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            jStartapp = this.crashlytics.startapp();
        }
        return jStartapp;
    }
}

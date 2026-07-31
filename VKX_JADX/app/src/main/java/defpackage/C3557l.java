package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: lؕۖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3557l implements InterfaceC10466l, InterfaceC2743l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f7478l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f7479l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f7480l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f7481l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f7482l;

    public C3557l(C9005l c9005l, HashMap map, HashMap map2, HashMap map3) {
        this.f7480l = c9005l;
        this.f7482l = map2;
        this.f7481l = map3;
        this.f7478l = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        c9005l.amazon(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f7479l = jArr;
    }

    public static C3557l loadAd(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        C3557l c3557l = new C3557l();
        c3557l.f7482l = new ArrayDeque();
        c3557l.f7480l = sharedPreferences;
        c3557l.f7479l = "topic_operation_queue";
        c3557l.f7478l = ",";
        c3557l.f7481l = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) c3557l.f7482l)) {
            try {
                ((ArrayDeque) c3557l.f7482l).clear();
                String string = ((SharedPreferences) c3557l.f7480l).getString((String) c3557l.f7479l, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) c3557l.f7478l)) {
                    String[] strArrSplit = string.split((String) c3557l.f7478l, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) c3557l.f7482l).add(str);
                        }
                    }
                    return c3557l;
                }
                return c3557l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void admob(Uri uri) {
        int i;
        Context context = (Context) this.f7480l;
        if (uri == null) {
            subs();
            return;
        }
        if (uri.equals((Uri) this.f7478l)) {
            return;
        }
        subs();
        this.f7478l = uri;
        C4893l c4893l = (C4893l) this.f7479l;
        int i2 = c4893l.f9983l;
        if (i2 == 0 || (i = c4893l.f9982l) == 0) {
            this.f7482l = new AsyncTaskC13171l(context, 0, 0, this);
        } else {
            this.f7482l = new AsyncTaskC13171l(context, i2, i, this);
        }
        AsyncTaskC13171l asyncTaskC13171l = (AsyncTaskC13171l) this.f7482l;
        AbstractC1051l.subs(asyncTaskC13171l);
        Uri uri2 = (Uri) this.f7478l;
        AbstractC1051l.subs(uri2);
        asyncTaskC13171l.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public boolean amazon(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.f7482l)) {
            zRemove = ((ArrayDeque) this.f7482l).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.f7481l).execute(new RunnableC6665l(2, this));
            }
        }
        return zRemove;
    }

    public void billing(Object obj, String str) {
        ((LinkedHashMap) this.f7480l).put(str, obj);
        C1008l c1008l = (C1008l) ((LinkedHashMap) this.f7478l).get(str);
        if (c1008l != null) {
            c1008l.smaato(obj);
        }
        C1008l c1008l2 = (C1008l) ((LinkedHashMap) this.f7482l).get(str);
        if (c1008l2 != null) {
            c1008l2.smaato(obj);
        }
    }

    public String crashlytics() {
        String str;
        synchronized (((ArrayDeque) this.f7482l)) {
            str = (String) ((ArrayDeque) this.f7482l).peek();
        }
        return str;
    }

    @Override // defpackage.InterfaceC2743l
    public long firebase(int i) {
        return ((long[]) this.f7479l)[i];
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C17395l((C14184l) ((C14461l) this.f7480l).f28328l, (InterfaceC6095l) ((InterfaceC15897l) this.f7479l).get(), (C8137l) ((InterfaceC15897l) this.f7478l).get(), (C10287l) ((InterfaceC2661l) this.f7482l).get(), (InterfaceC12932l) ((InterfaceC15897l) this.f7481l).get());
    }

    public C6643l isPro() {
        if (((C6643l) this.f7482l) == null) {
            C6643l c6643l = new C6643l((C4039l) this.f7480l, (String) this.f7478l);
            this.f7482l = c6643l;
            c6643l.loadAd(1);
        }
        return (C6643l) this.f7482l;
    }

    @Override // defpackage.InterfaceC2743l
    public List metrica(long j) {
        C9005l c9005l = (C9005l) this.f7480l;
        Map map = (Map) this.f7478l;
        HashMap map2 = (HashMap) this.f7482l;
        HashMap map3 = (HashMap) this.f7481l;
        ArrayList<Pair> arrayList = new ArrayList();
        c9005l.mopub(j, c9005l.admob, arrayList);
        TreeMap treeMap = new TreeMap();
        c9005l.subs(j, false, c9005l.admob, treeMap);
        c9005l.admob(j, map, map2, c9005l.admob, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C10479l c10479l = (C10479l) map2.get(pair.first);
                c10479l.getClass();
                arrayList2.add(new C17456l(null, null, null, bitmapDecodeByteArray, c10479l.crashlytics, 0, c10479l.purchase, c10479l.loadAd, 0, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, c10479l.billing, c10479l.mopub, false, -16777216, c10479l.isPro, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C10479l c10479l2 = (C10479l) map2.get(entry.getKey());
            c10479l2.getClass();
            C13116l c13116l = (C13116l) entry.getValue();
            CharSequence charSequence = c13116l.yandex;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C2678l c2678l : (C2678l[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C2678l.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c2678l), spannableStringBuilder.getSpanEnd(c2678l), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = c10479l2.crashlytics;
            int i9 = c10479l2.amazon;
            c13116l.purchase = f;
            c13116l.billing = i9;
            c13116l.mopub = c10479l2.purchase;
            c13116l.admob = c10479l2.loadAd;
            c13116l.smaato = c10479l2.billing;
            float f2 = c10479l2.subs;
            int i10 = c10479l2.admob;
            c13116l.firebase = f2;
            c13116l.isPro = i10;
            c13116l.startapp = c10479l2.isPro;
            arrayList2.add(c13116l.yandex());
        }
        return arrayList2;
    }

    public void mopub(C6276l c6276l) {
        int i = c6276l.purchase;
        if (i == 2 && ((C6643l) this.f7482l) != null) {
            smaato();
        }
        if (i == 2) {
            this.f7482l = new C6643l((C4039l) this.f7480l, (String) this.f7478l);
        } else {
            this.f7482l = isPro();
        }
        C6643l c6643l = (C6643l) this.f7482l;
        AbstractC1051l.subs(c6643l);
        c6276l.amazon = c6643l.admob;
        c6643l.loadAd.add(c6276l);
    }

    @Override // defpackage.InterfaceC2743l
    public int purchase(long j) {
        long[] jArr = (long[]) this.f7479l;
        int iLoadAd = AbstractC15323l.loadAd(jArr, j, false);
        if (iLoadAd < jArr.length) {
            return iLoadAd;
        }
        return -1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void smaato() {
        int i;
        int i2;
        int i3;
        long jLongValue;
        C6643l c6643l = (C6643l) this.f7482l;
        if (c6643l != null) {
            C0189l c0189l = c6643l.isPro;
            if (c0189l != null) {
                c0189l.smaato = null;
                c6643l.isPro = null;
            }
            long j = c6643l.subs;
            C15010l c15010lRemoteconfig = C18278l.remoteconfig();
            c15010lRemoteconfig.yandex();
            ((C18278l) c15010lRemoteconfig.f3757l).metrica(j);
            String str = c6643l.smaato;
            if (str != null) {
                c15010lRemoteconfig.yandex();
                ((C18278l) c15010lRemoteconfig.f3757l).tapsense(str);
            }
            C10222l c10222lSmaato = C3057l.smaato();
            if (!TextUtils.isEmpty(c6643l.vip)) {
                String str2 = c6643l.vip;
                c15010lRemoteconfig.yandex();
                ((C18278l) c15010lRemoteconfig.f3757l).startapp(str2);
                String str3 = c6643l.vip;
                c10222lSmaato.yandex();
                ((C3057l) c10222lSmaato.f3757l).remoteconfig(str3);
            }
            if (!TextUtils.isEmpty(c6643l.metrica)) {
                String str4 = c6643l.metrica;
                c10222lSmaato.yandex();
                ((C3057l) c10222lSmaato.f3757l).vip(str4);
            }
            if (!TextUtils.isEmpty(c6643l.startapp)) {
                String str5 = c6643l.startapp;
                c10222lSmaato.yandex();
                ((C3057l) c10222lSmaato.f3757l).metrica(str5);
            }
            if (!TextUtils.isEmpty(c6643l.adcel)) {
                String str6 = c6643l.adcel;
                c10222lSmaato.yandex();
                ((C3057l) c10222lSmaato.f3757l).startapp(str6);
            }
            if (!TextUtils.isEmpty(c6643l.ads)) {
                String str7 = c6643l.ads;
                c10222lSmaato.yandex();
                ((C3057l) c10222lSmaato.f3757l).adcel(str7);
            }
            if (!TextUtils.isEmpty(c6643l.subscription)) {
                String str8 = c6643l.subscription;
                c10222lSmaato.yandex();
                ((C3057l) c10222lSmaato.f3757l).ads(str8);
            }
            int i4 = c6643l.tapsense;
            int i5 = 1;
            if (i4 == 1) {
                i = 2;
            } else if (i4 == 2) {
                i = 3;
            } else if (i4 == 3) {
                i = 4;
            } else if (i4 != 4) {
                i = i4 != 5 ? 1 : 6;
            } else {
                i = 5;
            }
            c10222lSmaato.yandex();
            ((C3057l) c10222lSmaato.f3757l).subscription(i);
            C3057l c3057l = (C3057l) c10222lSmaato.loadAd();
            c15010lRemoteconfig.yandex();
            ((C18278l) c15010lRemoteconfig.f3757l).isVip(c3057l);
            C11314l c11314lSmaato = C15809l.smaato();
            String str9 = C6643l.pro;
            c11314lSmaato.yandex();
            ((C15809l) c11314lSmaato.f3757l).vip(str9);
            String str10 = c6643l.mopub;
            c11314lSmaato.yandex();
            ((C15809l) c11314lSmaato.f3757l).remoteconfig(str10);
            C15809l c15809l = (C15809l) c11314lSmaato.loadAd();
            c15010lRemoteconfig.yandex();
            ((C18278l) c15010lRemoteconfig.f3757l).ad(c15809l);
            C5885l c5885l = c6643l.yandex;
            C17683l c17683lSmaato = C8451l.smaato();
            String str11 = (String) c5885l.zza();
            if (str11 != null) {
                C10695l c10695lSmaato = C18300l.smaato();
                c10695lSmaato.yandex();
                ((C18300l) c10695lSmaato.f3757l).remoteconfig(str11);
                C18300l c18300l = (C18300l) c10695lSmaato.loadAd();
                c17683lSmaato.yandex();
                ((C8451l) c17683lSmaato.f3757l).remoteconfig(c18300l);
            }
            String str12 = c6643l.firebase;
            int i6 = 16;
            if (str12 != null) {
                try {
                    String strReplace = str12.replace("-", "");
                    jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    C0022l c0022l = C6643l.license;
                    Log.w(c0022l.yandex, c0022l.amazon("receiverSessionId %s is not valid for hash", str12), e);
                    jLongValue = 0;
                }
                c17683lSmaato.yandex();
                ((C8451l) c17683lSmaato.f3757l).vip(jLongValue);
            }
            List<C6276l> list = c6643l.loadAd;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C6276l c6276l : list) {
                    c6276l.getClass();
                    C17369l c17369lSmaato = C1216l.smaato();
                    int i7 = c6276l.purchase;
                    c17369lSmaato.yandex();
                    ((C1216l) c17369lSmaato.f3757l).adcel(i7);
                    int i8 = (int) (c6276l.loadAd - c6276l.amazon);
                    c17369lSmaato.yandex();
                    ((C1216l) c17369lSmaato.f3757l).startapp(i8);
                    c17369lSmaato.yandex();
                    ((C1216l) c17369lSmaato.f3757l).remoteconfig(i8);
                    Integer num = c6276l.yandex;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        c17369lSmaato.yandex();
                        ((C1216l) c17369lSmaato.f3757l).vip(iIntValue);
                    }
                    Boolean bool = c6276l.crashlytics;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        c17369lSmaato.yandex();
                        ((C1216l) c17369lSmaato.f3757l).metrica(zBooleanValue);
                    }
                    arrayList.add((C1216l) c17369lSmaato.loadAd());
                }
                c17683lSmaato.yandex();
                ((C8451l) c17683lSmaato.f3757l).metrica(arrayList);
            }
            List list2 = c6643l.crashlytics;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                if (it.hasNext()) {
                    throw AbstractC15560l.adcel(it);
                }
                c17683lSmaato.yandex();
                ((C8451l) c17683lSmaato.f3757l).adcel(arrayList2);
            }
            List<C8477l> list3 = c6643l.amazon;
            if (!list3.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (C8477l c8477l : list3) {
                    String str13 = c8477l.yandex;
                    C8062l c8062lSmaato = C13528l.smaato();
                    switch (str13.hashCode()) {
                        case -1189611734:
                            if (str13.equals("queueInsert")) {
                                i5 = 13;
                            }
                            break;
                        case -1109843021:
                            if (str13.equals("launch")) {
                                i5 = 22;
                            }
                            break;
                        case -940430091:
                            if (str13.equals("queueRemove")) {
                                i5 = 15;
                            }
                            break;
                        case -936597225:
                            if (str13.equals("queueFetchItems")) {
                                i5 = 19;
                            }
                            break;
                        case -930425472:
                            if (str13.equals("setPlaybackDevices")) {
                                i5 = 23;
                            }
                            break;
                        case -921113364:
                            if (str13.equals("volume-mute")) {
                                i5 = 9;
                            }
                            break;
                        case -900560382:
                            if (str13.equals("skipAd")) {
                                i5 = 21;
                            }
                            break;
                        case -892481550:
                            if (str13.equals("status")) {
                                i5 = 10;
                            }
                            break;
                        case -844665542:
                            if (str13.equals("queueUpdate")) {
                                i5 = 14;
                            }
                            break;
                        case -810883302:
                            if (str13.equals("volume")) {
                                i5 = 7;
                            }
                            break;
                        case -402284771:
                            if (str13.equals("setPlaybackRate")) {
                                i5 = 20;
                            }
                            break;
                        case 3327206:
                            if (str13.equals("load")) {
                                i5 = 2;
                            }
                            break;
                        case 3363353:
                            if (str13.equals("mute")) {
                                i5 = 8;
                            }
                            break;
                        case 3443508:
                            if (str13.equals("play")) {
                                i5 = 3;
                            }
                            break;
                        case 3526264:
                            if (str13.equals("seek")) {
                                i5 = 6;
                            }
                            break;
                        case 3540994:
                            if (str13.equals("stop")) {
                                i5 = 5;
                            }
                            break;
                        case 106440182:
                            if (str13.equals("pause")) {
                                i5 = 4;
                            }
                            break;
                        case 525402049:
                            if (str13.equals("queueFetchItemRange")) {
                                i5 = 18;
                            }
                            break;
                        case 913357482:
                            if (str13.equals("queueReorder")) {
                                i5 = i6;
                            }
                            break;
                        case 1148867366:
                            if (str13.equals("trackStyle")) {
                                i5 = 12;
                            }
                            break;
                        case 1451542318:
                            if (str13.equals("activeTracks")) {
                                i5 = 11;
                            }
                            break;
                        case 1873161788:
                            if (str13.equals("queueFetchItemIds")) {
                                i5 = 17;
                            }
                            break;
                        default:
                            break;
                    }
                    c8062lSmaato.yandex();
                    ((C13528l) c8062lSmaato.f3757l).adcel(i5);
                    int i9 = (int) c8477l.loadAd;
                    c8062lSmaato.yandex();
                    ((C13528l) c8062lSmaato.f3757l).remoteconfig(i9);
                    int i10 = c8477l.crashlytics;
                    c8062lSmaato.yandex();
                    ((C13528l) c8062lSmaato.f3757l).vip(i10);
                    int i11 = (int) (c8477l.amazon - c8477l.billing);
                    c8062lSmaato.yandex();
                    ((C13528l) c8062lSmaato.f3757l).metrica(i11);
                    int i12 = (int) (c8477l.purchase - c8477l.billing);
                    c8062lSmaato.yandex();
                    ((C13528l) c8062lSmaato.f3757l).startapp(i12);
                    arrayList3.add((C13528l) c8062lSmaato.loadAd());
                    i5 = 1;
                    i6 = 16;
                }
                c17683lSmaato.yandex();
                ((C8451l) c17683lSmaato.f3757l).startapp(arrayList3);
            }
            if (c6643l.remoteconfig != null) {
                ArrayList arrayList4 = new ArrayList();
                C0386l c0386l = c6643l.remoteconfig;
                int i13 = c0386l.amazon;
                C17670l c17670lSmaato = C12979l.smaato();
                if (i13 != 1) {
                    if (i13 == 2) {
                        i2 = 3;
                    } else if (i13 != 3) {
                        i3 = i13 != 4 ? 1 : 5;
                    } else {
                        i3 = 4;
                    }
                    c17670lSmaato.yandex();
                    ((C12979l) c17670lSmaato.f3757l).vip(i3);
                    int i14 = (int) (c0386l.loadAd - c0386l.crashlytics);
                    c17670lSmaato.yandex();
                    ((C12979l) c17670lSmaato.f3757l).remoteconfig(i14);
                    arrayList4.add((C12979l) c17670lSmaato.loadAd());
                    c17683lSmaato.yandex();
                    ((C8451l) c17683lSmaato.f3757l).subscription(arrayList4);
                } else {
                    i2 = 2;
                }
                i3 = i2;
                c17670lSmaato.yandex();
                ((C12979l) c17670lSmaato.f3757l).vip(i3);
                int i15 = (int) (c0386l.loadAd - c0386l.crashlytics);
                c17670lSmaato.yandex();
                ((C12979l) c17670lSmaato.f3757l).remoteconfig(i15);
                arrayList4.add((C12979l) c17670lSmaato.loadAd());
                c17683lSmaato.yandex();
                ((C8451l) c17683lSmaato.f3757l).subscription(arrayList4);
            }
            Map map = c6643l.purchase;
            if (!map.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (C6075l c6075l : map.values()) {
                    c6075l.getClass();
                    C18458l c18458lSmaato = C0229l.smaato();
                    int i16 = c6075l.purchase;
                    c18458lSmaato.yandex();
                    ((C0229l) c18458lSmaato.f3757l).startapp(i16);
                    int i17 = c6075l.amazon.get();
                    c18458lSmaato.yandex();
                    ((C0229l) c18458lSmaato.f3757l).remoteconfig(i17);
                    int i18 = (int) (c6075l.yandex - c6075l.crashlytics);
                    c18458lSmaato.yandex();
                    ((C0229l) c18458lSmaato.f3757l).vip(i18);
                    int i19 = (int) (c6075l.loadAd - c6075l.crashlytics);
                    c18458lSmaato.yandex();
                    ((C0229l) c18458lSmaato.f3757l).metrica(i19);
                    arrayList5.add((C0229l) c18458lSmaato.loadAd());
                }
                c17683lSmaato.yandex();
                ((C8451l) c17683lSmaato.f3757l).ads(arrayList5);
            }
            int i20 = c6643l.Signature;
            c17683lSmaato.yandex();
            ((C8451l) c17683lSmaato.f3757l).tapsense(i20);
            C8451l c8451l = (C8451l) c17683lSmaato.loadAd();
            c15010lRemoteconfig.yandex();
            ((C18278l) c15010lRemoteconfig.f3757l).pro(c8451l);
            c6643l.billing.yandex((C18278l) c15010lRemoteconfig.loadAd(), 233);
            this.f7482l = null;
        }
    }

    public void subs() {
        AsyncTaskC13171l asyncTaskC13171l = (AsyncTaskC13171l) this.f7482l;
        if (asyncTaskC13171l != null) {
            asyncTaskC13171l.cancel(true);
            this.f7482l = null;
        }
        this.f7478l = null;
    }

    @Override // defpackage.InterfaceC2743l
    public int subscription() {
        return ((long[]) this.f7479l).length;
    }

    public C8509l yandex(InterfaceC11450l interfaceC11450l, Map map, Map map2) {
        C11969l c11969l = (C11969l) this.f7480l;
        C7931l c7931l = (C7931l) this.f7479l;
        int i = c7931l.subs;
        C5664l c5664l = (C5664l) this.f7478l;
        C7094l c7094l = (C7094l) this.f7481l;
        C8409l c8409l = (C8409l) this.f7482l;
        c8409l.loadAd.getClass();
        c7931l.metrica.getClass();
        C11905l c11905l = InterfaceC5389l.admob;
        InterfaceC5389l interfaceC5389lPurchase = ((C10596l) c8409l.yandex).purchase(c7931l.yandex);
        c11905l.getClass();
        return new C8509l(interfaceC11450l, c11969l, i, map, map2, c5664l, c7094l, C11905l.loadAd(interfaceC5389lPurchase));
    }

    public C3557l(Context context) {
        this(context, new C4893l(-1, 0, 0));
    }

    public C3557l(Context context, C4893l c4893l) {
        this.f7480l = context;
        this.f7479l = c4893l;
        subs();
    }

    public C3557l(Map map) {
        this.f7480l = new LinkedHashMap(map);
        this.f7479l = new LinkedHashMap();
        this.f7478l = new LinkedHashMap();
        this.f7482l = new LinkedHashMap();
        this.f7481l = new C8955l(4, this);
    }

    public /* synthetic */ C3557l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f7480l = obj;
        this.f7479l = obj2;
        this.f7478l = obj3;
        this.f7482l = obj4;
        this.f7481l = obj5;
    }
}

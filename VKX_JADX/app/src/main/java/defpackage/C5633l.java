package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؘّّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5633l implements InterfaceC2353l, InterfaceC0589l, InterfaceC17215l, InterfaceC11545l, InterfaceC5194l, InterfaceC17641l, InterfaceC4930l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f11985l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f11986l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11987l;

    public C5633l(int i) {
        this.f11987l = i;
        switch (i) {
            case 4:
                this.f11986l = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.f11985l = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            case 13:
                break;
            default:
                this.f11986l = new C13143l();
                this.f11985l = new C16540l();
                break;
        }
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        switch (this.f11987l) {
            case 5:
                BinderC8187l binderC8187l = new BinderC8187l((C7560l) this.f11986l, (C2350l) obj2, 1);
                C2333l c2333l = (C2333l) ((C8963l) obj).metrica();
                C7794l c7794l = (C7794l) this.f11985l;
                Parcel parcelCrashlytics = c2333l.crashlytics();
                int i = AbstractC1763l.yandex;
                parcelCrashlytics.writeStrongBinder(binderC8187l);
                AbstractC1763l.loadAd(parcelCrashlytics, c7794l);
                parcelCrashlytics.writeStrongBinder(null);
                c2333l.isPro(parcelCrashlytics, 2);
                break;
            default:
                C11963l c11963l = (C11963l) obj;
                C13132l c13132l = new C13132l((C2350l) obj2);
                C18096l c18096l = (C18096l) this.f11986l;
                C1041l c1041l = (C1041l) this.f11985l;
                c11963l.getClass();
                BinderC15733l binderC15733l = new BinderC15733l(c18096l);
                c11963l.appmetrica.add(binderC15733l);
                C13452l c13452l = (C13452l) c11963l.metrica();
                BinderC13190l binderC13190l = new BinderC13190l(c13132l);
                Parcel parcelM743l = c13452l.m743l();
                int i2 = AbstractC14866l.yandex;
                parcelM743l.writeInt(1);
                int iTapsense = AbstractC9968l.tapsense(parcelM743l, 20293);
                AbstractC9968l.admob(parcelM743l, 1, binderC13190l);
                AbstractC9968l.vip(parcelM743l, 3, "vkx_cdcm");
                AbstractC9968l.subscription(parcelM743l, 4, 8);
                parcelM743l.writeLong(0L);
                AbstractC9968l.remoteconfig(parcelM743l, 5, c1041l, 0);
                AbstractC9968l.admob(parcelM743l, 6, binderC15733l);
                AbstractC9968l.Signature(parcelM743l, iTapsense);
                c13452l.m742l(parcelM743l, 2003);
                break;
        }
    }

    public void admob(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) AbstractC11356l.purchase(arrayList);
        if (outputStream instanceof C17407l) {
            this.f11985l = (C17407l) outputStream;
            this.f11986l = (OutputStream) arrayList.get(0);
        }
    }

    @Override // defpackage.InterfaceC4930l
    public void amazon(Object obj) {
        C11675l c11675l = (C11675l) this.f11985l;
        c11675l.mo211l();
        C17417l c17417l = (C17417l) c11675l.f833l;
        C16386l c16386l = c17417l.f33944l;
        C17417l.billing(c16386l);
        SparseArray sparseArrayM4181l = c16386l.m4181l();
        C11536l c11536l = (C11536l) this.f11986l;
        sparseArrayM4181l.put(c11536l.f23202l, Long.valueOf(c11536l.f23203l));
        C16386l c16386l2 = c17417l.f33944l;
        C17417l.billing(c16386l2);
        int[] iArr = new int[sparseArrayM4181l.size()];
        long[] jArr = new long[sparseArrayM4181l.size()];
        for (int i = 0; i < sparseArrayM4181l.size(); i++) {
            iArr[i] = sparseArrayM4181l.keyAt(i);
            jArr[i] = ((Long) sparseArrayM4181l.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c16386l2.f32052l.mopub(bundle);
        c11675l.f23414l = false;
        c11675l.f23421l = 1;
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c8118l);
        c8118l.f16918l.loadAd(c11536l.f23204l, "Successfully registered trigger URI");
        c11675l.m3199l();
    }

    @Override // defpackage.InterfaceC5194l
    public void billing(String str, long j, long j2, long j3) {
        InterfaceC5194l interfaceC5194l = (InterfaceC5194l) this.f11986l;
        if (interfaceC5194l != null) {
            interfaceC5194l.billing(str, j, j2, j3);
        }
    }

    @Override // defpackage.InterfaceC17641l
    public C7502l crashlytics(InterfaceC2167l interfaceC2167l) {
        C7502l c7502lIsPro = ((C7502l) this.f11986l).isPro();
        c7502lIsPro.remoteconfig((String) this.f11985l, interfaceC2167l);
        return c7502lIsPro;
    }

    @Override // defpackage.InterfaceC0589l
    public View getRoot() {
        return (AppBarLayout) this.f11986l;
    }

    @Override // defpackage.InterfaceC17215l
    public /* synthetic */ InterfaceC2743l isPro(int i, int i2, byte[] bArr) {
        return AbstractC0653l.billing(this, bArr, i2);
    }

    public void loadAd(C10771l c10771l, int i) {
        C3307l c3307l = (C3307l) this.f11985l;
        c3307l.yandex.execute(new RunnableC7571l((C5648l) this.f11986l, c10771l, false, i));
    }

    @Override // defpackage.InterfaceC4930l
    public void mopub(Throwable th) {
        C11675l c11675l = (C11675l) this.f11985l;
        c11675l.mo211l();
        C17417l c17417l = (C17417l) c11675l.f833l;
        c11675l.f23414l = false;
        c11675l.m3204l().add((C11536l) this.f11986l);
        if (c11675l.f23421l > ((Integer) AbstractC5981l.f12685l.yandex(null)).intValue()) {
            c11675l.f23421l = 1;
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.crashlytics(C8118l.m2260l(c17417l.remoteconfig().m2821l()), C8118l.m2260l(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        C8118l c8118l2 = c17417l.f33950l;
        C17417l.admob(c8118l2);
        c8118l2.f16910l.amazon("registerTriggerAsync failed. App ID, delay in seconds, throwable", C8118l.m2260l(c17417l.remoteconfig().m2821l()), C8118l.m2260l(String.valueOf(c11675l.f23421l)), C8118l.m2260l(th.toString()));
        int i = c11675l.f23421l;
        if (c11675l.f23418l == null) {
            c11675l.f23418l = new C6820l(c11675l, c17417l, 1);
        }
        c11675l.f23418l.loadAd(((long) i) * 1000);
        int i2 = c11675l.f23421l;
        c11675l.f23421l = i2 + i2;
    }

    public void purchase(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.f11986l;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.f11985l;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).crashlytics(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C2350l) entry2.getKey()).crashlytics(new C3890l(status));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x022d  */
    /* JADX WARN: Code duplicated, block: B:130:0x024e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x0262  */
    /* JADX WARN: Code duplicated, block: B:134:0x026c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0274  */
    /* JADX WARN: Code duplicated, block: B:138:0x027c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0280  */
    /* JADX WARN: Code duplicated, block: B:141:0x0288  */
    /* JADX WARN: Code duplicated, block: B:142:0x028f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0297  */
    /* JADX WARN: Code duplicated, block: B:150:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x02af  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02db  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:173:0x0305  */
    /* JADX WARN: Code duplicated, block: B:175:0x0315  */
    /* JADX WARN: Code duplicated, block: B:176:0x032f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0340  */
    /* JADX WARN: Code duplicated, block: B:182:0x0349  */
    /* JADX WARN: Code duplicated, block: B:183:0x034b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0354  */
    /* JADX WARN: Code duplicated, block: B:187:0x0356  */
    /* JADX WARN: Code duplicated, block: B:190:0x035f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0367  */
    /* JADX WARN: Code duplicated, block: B:195:0x036c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0371  */
    /* JADX WARN: Code duplicated, block: B:198:0x0384  */
    /* JADX WARN: Code duplicated, block: B:239:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x0315, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // defpackage.InterfaceC17215l
    public void startapp(byte[] bArr, int i, int i2, C8807l c8807l, InterfaceC18679l interfaceC18679l) {
        C10619l c10619lAmazon;
        String strTrim;
        int i3;
        String string;
        int i4;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        C5633l c5633l = this;
        C13143l c13143l = (C13143l) c5633l.f11986l;
        c13143l.m3565private(i + i2, bArr);
        c13143l.m3562for(i);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC4904l.amazon(c13143l);
            while (!TextUtils.isEmpty(c13143l.vip(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z2 = false;
                int i5 = -1;
                int i6 = 0;
                byte b2 = -1;
                while (true) {
                    int i7 = 1;
                    if (b2 == -1) {
                        i6 = c13143l.loadAd;
                        String strVip = c13143l.vip(StandardCharsets.UTF_8);
                        if (strVip == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strVip)) {
                            b2 = 2;
                        } else {
                            b2 = strVip.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        c13143l.m3562for(i6);
                        if (b2 == 0) {
                            AbstractC0140l.Signature(new C5991l(arrayList2), c8807l, interfaceC18679l);
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(c13143l.vip(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    C8339l.metrica("A style block was found after the first cue.");
                                    return;
                                }
                                c13143l.vip(StandardCharsets.UTF_8);
                                C16540l c16540l = (C16540l) c5633l.f11985l;
                                C13143l c13143l2 = c16540l.yandex;
                                StringBuilder sb = c16540l.loadAd;
                                sb.setLength(0);
                                int i8 = c13143l.loadAd;
                                while (!TextUtils.isEmpty(c13143l.vip(StandardCharsets.UTF_8))) {
                                }
                                c13143l2.m3565private(c13143l.loadAd, c13143l.yandex);
                                c13143l2.m3562for(i8);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    C16540l.crashlytics(c13143l2);
                                    if (c13143l2.yandex() >= 5 && "::cue".equals(c13143l2.advert(5, StandardCharsets.UTF_8))) {
                                        int i9 = c13143l2.loadAd;
                                        String strLoadAd = C16540l.loadAd(c13143l2, sb);
                                        if (strLoadAd == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strLoadAd)) {
                                            c13143l2.m3562for(i9);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strLoadAd)) {
                                                int i10 = c13143l2.loadAd;
                                                int i11 = c13143l2.crashlytics;
                                                int i12 = z2 ? 1 : 0;
                                                while (i10 < i11 && i12 == 0) {
                                                    int i13 = i10 + 1;
                                                    i12 = ((char) c13143l2.yandex[i10]) == ')' ? i7 : z2 ? 1 : 0;
                                                    i10 = i13;
                                                }
                                                strTrim = c13143l2.advert((i10 - 1) - c13143l2.loadAd, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(C16540l.loadAd(c13143l2, sb))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(C16540l.loadAd(c13143l2, sb))) {
                                        C0670l c0670l = new C0670l();
                                        c0670l.yandex = "";
                                        c0670l.loadAd = "";
                                        c0670l.crashlytics = Collections.EMPTY_SET;
                                        c0670l.amazon = "";
                                        c0670l.purchase = str;
                                        c0670l.mopub = z2;
                                        c0670l.subs = z2;
                                        c0670l.isPro = i5;
                                        c0670l.firebase = i5;
                                        c0670l.smaato = i5;
                                        c0670l.remoteconfig = i5;
                                        c0670l.vip = i5;
                                        c0670l.startapp = i5;
                                        c0670l.adcel = z2;
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i5) {
                                                Matcher matcher2 = C16540l.crashlytics.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i7);
                                                    strGroup2.getClass();
                                                    c0670l.amazon = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z2 ? 1 : 0, iIndexOf);
                                            }
                                            String str2 = AbstractC15323l.yandex;
                                            String[] strArrSplit = strTrim.split("\\.", i5);
                                            String str3 = strArrSplit[z2 ? 1 : 0];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i5) {
                                                c0670l.loadAd = str3.substring(z2 ? 1 : 0, iIndexOf2);
                                                c0670l.yandex = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                c0670l.loadAd = str3;
                                            }
                                            if (strArrSplit.length > i7) {
                                                int length = strArrSplit.length;
                                                AbstractC12442l.admob(length <= strArrSplit.length ? i7 : z2 ? 1 : 0);
                                                c0670l.crashlytics = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i7, length)));
                                            }
                                        }
                                        ?? r8 = z2 ? 1 : 0;
                                        String strLoadAd2 = str;
                                        while (r8 == 0) {
                                            int i14 = c13143l2.loadAd;
                                            strLoadAd2 = C16540l.loadAd(c13143l2, sb);
                                            ?? r15 = (strLoadAd2 == null || "}".equals(strLoadAd2)) ? i7 : z2;
                                            if (r15 == 0) {
                                                c13143l2.m3562for(i14);
                                                C16540l.crashlytics(c13143l2);
                                                String strYandex = C16540l.yandex(c13143l2, sb);
                                                if (!strYandex.isEmpty() && ":".equals(C16540l.loadAd(c13143l2, sb))) {
                                                    C16540l.crashlytics(c13143l2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (z3) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i15 = c13143l2.loadAd;
                                                            String strLoadAd3 = C16540l.loadAd(c13143l2, sb);
                                                            if (strLoadAd3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strLoadAd3) || ";".equals(strLoadAd3)) {
                                                                c13143l2.m3562for(i15);
                                                                z3 = true;
                                                            } else {
                                                                sb2.append(strLoadAd3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i3 = 1;
                                                    } else {
                                                        int i16 = c13143l2.loadAd;
                                                        String strLoadAd4 = C16540l.loadAd(c13143l2, sb);
                                                        if (";".equals(strLoadAd4)) {
                                                            if ("color".equals(strYandex)) {
                                                                i4 = 1;
                                                                c0670l.billing = AbstractC11844l.yandex(string, true);
                                                                c0670l.mopub = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strYandex)) {
                                                                    c0670l.admob = AbstractC11844l.yandex(string, true);
                                                                    c0670l.subs = true;
                                                                } else if ("ruby-position".equals(strYandex)) {
                                                                    if ("text-combine-upright".equals(strYandex)) {
                                                                        if ("all".equals(string)) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        c0670l.adcel = z;
                                                                    } else if ("text-decoration".equals(strYandex)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            c0670l.firebase = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strYandex)) {
                                                                        c0670l.purchase = AbstractC11452l.admob(string);
                                                                    } else if ("font-weight".equals(strYandex)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strYandex)) {
                                                                            if ("italic".equals(string)) {
                                                                                c0670l.remoteconfig = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strYandex)) {
                                                                            matcher = C16540l.amazon.matcher(AbstractC11452l.admob(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 1;
                                                                                                break;
                                                                                            default:
                                                                                                C18073l.admob();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i3);
                                                                                        strGroup3.getClass();
                                                                                        c0670l.metrica = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 1;
                                                                                                break;
                                                                                            default:
                                                                                                C18073l.admob();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i3);
                                                                                        strGroup4.getClass();
                                                                                        c0670l.metrica = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 1;
                                                                                                break;
                                                                                            default:
                                                                                                C18073l.admob();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i3);
                                                                                        strGroup5.getClass();
                                                                                        c0670l.metrica = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        c0670l.vip = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        c0670l.vip = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        c0670l.vip = 1;
                                                                                        break;
                                                                                    default:
                                                                                        C18073l.admob();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i3);
                                                                                strGroup6.getClass();
                                                                                c0670l.metrica = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                AbstractC6427l.vip("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        c0670l.smaato = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    c0670l.startapp = 1;
                                                                } else if ("under".equals(string)) {
                                                                    c0670l.startapp = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else if ("}".equals(strLoadAd4)) {
                                                            c13143l2.m3562for(i16);
                                                            if ("color".equals(strYandex)) {
                                                                i4 = 1;
                                                                c0670l.billing = AbstractC11844l.yandex(string, true);
                                                                c0670l.mopub = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strYandex)) {
                                                                    c0670l.admob = AbstractC11844l.yandex(string, true);
                                                                    c0670l.subs = true;
                                                                } else if ("ruby-position".equals(strYandex)) {
                                                                    if ("text-combine-upright".equals(strYandex)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z = true;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        c0670l.adcel = z;
                                                                    } else if ("text-decoration".equals(strYandex)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            c0670l.firebase = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strYandex)) {
                                                                        c0670l.purchase = AbstractC11452l.admob(string);
                                                                    } else if ("font-weight".equals(strYandex)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strYandex)) {
                                                                            if ("italic".equals(string)) {
                                                                                c0670l.remoteconfig = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strYandex)) {
                                                                            matcher = C16540l.amazon.matcher(AbstractC11452l.admob(string));
                                                                            if (matcher.matches()) {
                                                                                AbstractC6427l.vip("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 1;
                                                                                                break;
                                                                                            default:
                                                                                                C18073l.admob();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i3);
                                                                                        strGroup7.getClass();
                                                                                        c0670l.metrica = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 1;
                                                                                                break;
                                                                                            default:
                                                                                                C18073l.admob();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i3);
                                                                                        strGroup8.getClass();
                                                                                        c0670l.metrica = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                c0670l.vip = 1;
                                                                                                break;
                                                                                            default:
                                                                                                C18073l.admob();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i3);
                                                                                        strGroup9.getClass();
                                                                                        c0670l.metrica = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        c0670l.vip = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        c0670l.vip = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        c0670l.vip = 1;
                                                                                        break;
                                                                                    default:
                                                                                        C18073l.admob();
                                                                                        return;
                                                                                }
                                                                                String strGroup10 = matcher.group(i3);
                                                                                strGroup10.getClass();
                                                                                c0670l.metrica = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        c0670l.smaato = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    c0670l.startapp = 1;
                                                                } else if ("under".equals(string)) {
                                                                    c0670l.startapp = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i3 = i7;
                                                }
                                            } else {
                                                i3 = i7;
                                            }
                                            i7 = i3;
                                            r8 = r15;
                                            z2 = false;
                                        }
                                        int i17 = i7;
                                        if ("}".equals(strLoadAd2)) {
                                            arrayList3.add(c0670l);
                                        }
                                        i7 = i17;
                                        z2 = false;
                                        i5 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = AbstractC14398l.yandex;
                                Charset charset = StandardCharsets.UTF_8;
                                String strVip2 = c13143l.vip(charset);
                                if (strVip2 == null) {
                                    c10619lAmazon = null;
                                } else {
                                    Pattern pattern2 = AbstractC14398l.yandex;
                                    Matcher matcher3 = pattern2.matcher(strVip2);
                                    if (matcher3.matches()) {
                                        c10619lAmazon = AbstractC14398l.amazon(null, matcher3, c13143l, arrayList);
                                    } else {
                                        c10619lAmazon = null;
                                        String strVip3 = c13143l.vip(charset);
                                        if (strVip3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strVip3);
                                            if (matcher4.matches()) {
                                                c10619lAmazon = AbstractC14398l.amazon(strVip2.trim(), matcher4, c13143l, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (c10619lAmazon != null) {
                                    arrayList2.add(c10619lAmazon);
                                }
                            }
                            c5633l = this;
                        }
                    }
                }
            }
        } catch (C17655l e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.InterfaceC5194l
    public void subs(String str, long j, int i, Object obj, long j2, long j3) {
        InterfaceC5194l interfaceC5194l = (InterfaceC5194l) this.f11986l;
        if (interfaceC5194l != null) {
            if (i == 2001) {
                C7427l c7427l = (C7427l) this.f11985l;
                Object[] objArr = {Integer.valueOf(c7427l.subs)};
                C0022l c0022l = c7427l.yandex;
                Log.w(c0022l.yandex, c0022l.amazon("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                for (C7801l c7801l : ((C17186l) c7427l.admob.f31100l).admob) {
                    switch (c7801l.yandex) {
                        case 0:
                            ((C13985l) c7801l.loadAd).loadAd();
                            break;
                    }
                }
                i = 2001;
            }
            interfaceC5194l.subs(str, j, i, obj, j2, j3);
        }
    }

    public String toString() {
        switch (this.f11987l) {
            case 0:
                return ((C1693l) this.f11986l) + " = " + ((InterfaceC8396l) this.f11985l) + ';';
            default:
                return super.toString();
        }
    }

    public void yandex(C10771l c10771l, C14529l c14529l) {
        C3307l c3307l = (C3307l) this.f11985l;
        c3307l.yandex.execute(new RunnableC15278l(this, c10771l, c14529l, 12));
    }

    @Override // defpackage.InterfaceC17215l
    public /* synthetic */ void reset() {
    }

    public /* synthetic */ C5633l(Object obj, Object obj2, boolean z, int i) {
        this.f11987l = i;
        this.f11986l = obj2;
        this.f11985l = obj;
    }

    public /* synthetic */ C5633l(C1062l c1062l, C18096l c18096l, C1041l c1041l) {
        this.f11987l = 8;
        this.f11986l = c18096l;
        this.f11985l = c1041l;
    }

    public C5633l(C4259l c4259l) {
        this.f11987l = 11;
        this.f11986l = c4259l == null ? null : c4259l.f8735l;
    }

    public C5633l(Context context) {
        this.f11987l = 14;
        this.f11985l = new AtomicLong(-1L);
        this.f11986l = new C7560l(context, C7560l.smaato, new C11468l("mlkit:vision"), C1308l.crashlytics);
    }

    public C5633l(C7427l c7427l, InterfaceC5194l interfaceC5194l) {
        this.f11987l = 6;
        this.f11986l = interfaceC5194l;
        Objects.requireNonNull(c7427l);
        this.f11985l = c7427l;
    }

    public /* synthetic */ C5633l(Object obj, Object obj2, int i) {
        this.f11987l = i;
        this.f11986l = obj;
        this.f11985l = obj2;
    }
}

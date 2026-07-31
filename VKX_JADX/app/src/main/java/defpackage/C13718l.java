package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: lْ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13718l extends AbstractC10491l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f26768l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f26769l;

    /* JADX INFO: renamed from: lؑۙٙ, reason: contains not printable characters */
    public static Bundle[] m3686l(InterfaceC9971l interfaceC9971l) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC9971l.iterator();
        while (it.hasNext()) {
            C0420l c0420l = (C0420l) it.next();
            if (c0420l != null) {
                Bundle bundle = new Bundle();
                for (C0420l c0420l2 : c0420l.appmetrica()) {
                    if (c0420l2.license()) {
                        bundle.putString(c0420l2.Signature(), c0420l2.pro());
                    } else if (c0420l2.ad()) {
                        bundle.putLong(c0420l2.Signature(), c0420l2.advert());
                    } else if (c0420l2.premium()) {
                        bundle.putDouble(c0420l2.Signature(), c0420l2.applovin());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: lؒۡۦ, reason: contains not printable characters */
    public static final void m3687l(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m3707l(builder, str3, string, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public static final void m3688l(C13135l c13135l, String str, Long l) {
        List listAdmob = c13135l.admob();
        int i = 0;
        while (true) {
            if (i >= listAdmob.size()) {
                i = -1;
                break;
            } else if (str.equals(((C0420l) listAdmob.get(i)).Signature())) {
                break;
            } else {
                i++;
            }
        }
        C1915l c1915lM520throws = C0420l.m520throws();
        c1915lM520throws.admob(str);
        c1915lM520throws.isPro(l.longValue());
        if (i < 0) {
            c13135l.smaato(c1915lM520throws);
        } else {
            c13135l.loadAd();
            ((C1841l) c13135l.f20498l).m1056native(i, (C0420l) c1915lM520throws.amazon());
        }
    }

    /* JADX INFO: renamed from: lؓٞؐ, reason: contains not printable characters */
    public static boolean m3689l(InterfaceC11831l interfaceC11831l, int i) {
        if (i < ((C6514l) interfaceC11831l).f13585l * 64) {
            return ((1 << (i % 64)) & ((Long) ((C6514l) interfaceC11831l).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: lَِؔ, reason: contains not printable characters */
    public static boolean m3690l(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: lؖؓٛ, reason: contains not printable characters */
    public static HashMap m3691l(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m3691l((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m3691l((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m3691l((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public static Bundle m3692l(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(m3692l((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public static C13236l m3693l(C17235l c17235l) {
        Object obj;
        Bundle bundleM3692l = m3692l(c17235l.crashlytics, true);
        String string = (!bundleM3692l.containsKey("_o") || (obj = bundleM3692l.get("_o")) == null) ? "app" : obj.toString();
        String strMetrica = AbstractC2632l.metrica(c17235l.yandex, AbstractC7572l.loadAd, AbstractC7572l.mopub);
        if (strMetrica == null) {
            strMetrica = c17235l.yandex;
        }
        return new C13236l(strMetrica, new C16021l(bundleM3692l), string, c17235l.loadAd, 0L);
    }

    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters */
    public static final void m3694l(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public static final C0420l m3695l(String str, C1841l c1841l) {
        for (C0420l c0420l : c1841l.license()) {
            if (c0420l.Signature().equals(str)) {
                return c0420l;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lؙؚؚ, reason: contains not printable characters */
    public static final void m3696l(StringBuilder sb, String str, C0450l c0450l) {
        if (c0450l == null) {
            return;
        }
        m3694l(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c0450l.pro() != 0) {
            m3694l(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : c0450l.license()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (c0450l.Signature() != 0) {
            m3694l(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : c0450l.tapsense()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (c0450l.advert() != 0) {
            m3694l(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (C16986l c16986l : c0450l.ad()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(c16986l.tapsense() ? Integer.valueOf(c16986l.Signature()) : null);
                sb.append(":");
                sb.append(c16986l.license() ? Long.valueOf(c16986l.pro()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (c0450l.signatures() != 0) {
            m3694l(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (C8888l c8888l : c0450l.isVip()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(c8888l.tapsense() ? Integer.valueOf(c8888l.Signature()) : null);
                sb.append(": [");
                Iterator it = c8888l.license().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m3694l(3, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public static final Serializable m3697l(String str, C1841l c1841l) {
        C0420l c0420lM3695l = m3695l(str, c1841l);
        if (c0420lM3695l == null) {
            return null;
        }
        return m3702l(c0420lM3695l);
    }

    /* JADX INFO: renamed from: lًِۥ, reason: contains not printable characters */
    public static AbstractC10050l m3698l(AbstractC10050l abstractC10050l, byte[] bArr) throws C9893l {
        C11337l c11337lYandex = C11337l.yandex();
        if (c11337lYandex != null) {
            abstractC10050l.getClass();
            abstractC10050l.billing(bArr, bArr.length, c11337lYandex);
            return abstractC10050l;
        }
        abstractC10050l.getClass();
        int length = bArr.length;
        int i = AbstractC5004l.yandex;
        abstractC10050l.billing(bArr, length, C11337l.loadAd);
        return abstractC10050l;
    }

    /* JADX INFO: renamed from: lًٖۘ, reason: contains not printable characters */
    public static final String m3699l(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public static final String m3700l(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public static final Bundle m3701l(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0420l c0420l = (C0420l) it.next();
            String strSignature = c0420l.Signature();
            if (c0420l.premium()) {
                bundle.putDouble(strSignature, c0420l.applovin());
            } else if (c0420l.isVip()) {
                bundle.putFloat(strSignature, c0420l.signatures());
            } else if (c0420l.license()) {
                bundle.putString(strSignature, c0420l.pro());
            } else if (c0420l.ad()) {
                bundle.putLong(strSignature, c0420l.advert());
            }
        }
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    /* JADX INFO: renamed from: lٖٓۧ, reason: contains not printable characters */
    public static final Serializable m3702l(C0420l c0420l) {
        if (c0420l.license()) {
            return c0420l.pro();
        }
        if (c0420l.ad()) {
            return Long.valueOf(c0420l.advert());
        }
        if (c0420l.premium()) {
            return Double.valueOf(c0420l.applovin());
        }
        if (c0420l.inmobi() > 0) {
            return m3686l(c0420l.appmetrica());
        }
        return null;
    }

    /* JADX INFO: renamed from: lٖؐۜ, reason: contains not printable characters */
    public static final void m3703l(StringBuilder sb, int i, String str, C9070l c9070l) {
        String str2;
        if (c9070l == null) {
            return;
        }
        m3694l(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c9070l.tapsense()) {
            int iAppmetrica = c9070l.appmetrica();
            if (iAppmetrica == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iAppmetrica == 2) {
                str2 = "LESS_THAN";
            } else if (iAppmetrica != 3) {
                str2 = iAppmetrica != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            m3704l(sb, i, "comparison_type", str2);
        }
        if (c9070l.Signature()) {
            m3704l(sb, i, "match_as_float", Boolean.valueOf(c9070l.license()));
        }
        if (c9070l.pro()) {
            m3704l(sb, i, "comparison_value", c9070l.ad());
        }
        if (c9070l.advert()) {
            m3704l(sb, i, "min_comparison_value", c9070l.isVip());
        }
        if (c9070l.signatures()) {
            m3704l(sb, i, "max_comparison_value", c9070l.premium());
        }
        m3694l(i, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: l٘ؓۘ, reason: contains not printable characters */
    public static final void m3704l(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m3694l(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: renamed from: lٌ٘ؔ, reason: contains not printable characters */
    public static ArrayList m3705l(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lٕ٘ؑ, reason: contains not printable characters */
    public static int m3706l(String str, C9134l c9134l) {
        for (int i = 0; i < ((C9030l) c9134l.f20498l).m2546l(); i++) {
            if (str.equals(((C9030l) c9134l.f20498l).m2525l(i).license())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters */
    public static final void m3707l(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* JADX INFO: renamed from: lًؑؔ, reason: contains not printable characters */
    public final long m3708l(byte[] bArr) {
        AbstractC1051l.subs(bArr);
        C17417l c17417l = (C17417l) this.f833l;
        C17410l c17410l = c17417l.f33949l;
        C17417l.billing(c17410l);
        c17410l.mo211l();
        MessageDigest messageDigestM4330l = C17410l.m4330l();
        if (messageDigestM4330l != null) {
            return C17410l.m4334l(messageDigestM4330l.digest(bArr));
        }
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c8118l);
        c8118l.f16908l.yandex("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: renamed from: lؙؖٗ, reason: contains not printable characters */
    public final void m3709l(C15985l c15985l, Object obj) {
        AbstractC1051l.subs(obj);
        c15985l.loadAd();
        ((C8252l) c15985l.f20498l).m2286strictfp();
        c15985l.loadAd();
        ((C8252l) c15985l.f20498l).m2283native();
        c15985l.loadAd();
        ((C8252l) c15985l.f20498l).m2282extends();
        if (obj instanceof String) {
            c15985l.loadAd();
            ((C8252l) c15985l.f20498l).m2287synchronized((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            c15985l.loadAd();
            ((C8252l) c15985l.f20498l).m2289volatile(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c15985l.loadAd();
            ((C8252l) c15985l.f20498l).m2285private(dDoubleValue);
        } else {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final void m3710l(Map map) {
        long epochMilli;
        C17417l c17417l = (C17417l) this.f833l;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            String strM3700l = m3700l("Date", map);
            if (TextUtils.isEmpty(strM3700l)) {
                return;
            }
            if (i >= 26) {
                try {
                    epochMilli = ZonedDateTime.parse(strM3700l, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
                } catch (DateTimeParseException unused) {
                    C8118l c8118l = c17417l.f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16910l.loadAd(strM3700l, "Unable to parse header time, time");
                    epochMilli = 0;
                }
            } else {
                epochMilli = 0;
            }
            if (epochMilli > 0) {
                c17417l.f33951l.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                mo211l();
                if (this.f26769l == 0) {
                    this.f26768l = jElapsedRealtime;
                    this.f26769l = epochMilli;
                }
            }
        }
    }

    /* JADX INFO: renamed from: lًٛۧ, reason: contains not printable characters */
    public final byte[] m3711l(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(e, "Failed to gzip content");
            throw e;
        }
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final long m3712l(long j) {
        mo211l();
        long j2 = this.f26769l;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.f26768l) + j;
    }

    /* JADX INFO: renamed from: lَؑ۠, reason: contains not printable characters */
    public final List m3713l(InterfaceC11831l interfaceC11831l, List list) {
        int i;
        C17417l c17417l = (C17417l) this.f833l;
        ArrayList arrayList = new ArrayList(interfaceC11831l);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16910l.loadAd(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    C8118l c8118l2 = c17417l.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16910l.crashlytics(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: lُؙٟ, reason: contains not printable characters */
    public final C11536l m3714l(String str, C9134l c9134l, C13135l c13135l, String str2) {
        int iIndexOf;
        C2156l.yandex();
        C17417l c17417l = (C17417l) this.f833l;
        C5051l c5051l = c17417l.f33945l;
        if (!c5051l.m1682l(str, AbstractC5981l.f12681l)) {
            return null;
        }
        c17417l.f33951l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(c5051l.m1681l(str, AbstractC5981l.f12656l).split(",")));
        C6901l c6901l = this.f13233l;
        C3879l c3879l = c6901l.f14466l;
        C8315l c8315l = c6901l.f14460l;
        C8315l c8315l2 = c3879l.f13233l.f14460l;
        C6901l.m2082case(c8315l2);
        String strM2313l = c8315l2.m2313l(str);
        Uri.Builder builder = new Uri.Builder();
        C5051l c5051l2 = ((C17417l) c3879l.f833l).f33945l;
        builder.scheme(c5051l2.m1681l(str, AbstractC5981l.f12643implements));
        if (TextUtils.isEmpty(strM2313l)) {
            builder.authority(c5051l2.m1681l(str, AbstractC5981l.f12634const));
        } else {
            String strM1681l = c5051l2.m1681l(str, AbstractC5981l.f12634const);
            StringBuilder sb = new StringBuilder(String.valueOf(strM2313l).length() + 1 + String.valueOf(strM1681l).length());
            sb.append(strM2313l);
            sb.append(".");
            sb.append(strM1681l);
            builder.authority(sb.toString());
        }
        builder.path(c5051l2.m1681l(str, AbstractC5981l.f12700return));
        m3707l(builder, "gmp_app_id", ((C9030l) c9134l.f20498l).m2577strictfp(), hashSet);
        c5051l.m1678l();
        m3707l(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strApplovin = ((C9030l) c9134l.f20498l).applovin();
        C3032l c3032l = AbstractC5981l.f12657l;
        if (c5051l.m1682l(str, c3032l)) {
            C6901l.m2082case(c8315l);
            if (c8315l.m2308l(str)) {
                strApplovin = "";
            }
        }
        m3707l(builder, "app_instance_id", strApplovin, hashSet);
        m3707l(builder, "rdid", ((C9030l) c9134l.f20498l).isVip(), hashSet);
        m3707l(builder, "bundle_id", c9134l.metrica(), hashSet);
        String strVip = c13135l.vip();
        String strMetrica = AbstractC2632l.metrica(strVip, AbstractC7572l.mopub, AbstractC7572l.loadAd);
        if (true != TextUtils.isEmpty(strMetrica)) {
            strVip = strMetrica;
        }
        m3707l(builder, "app_event_name", strVip, hashSet);
        m3707l(builder, "app_version", String.valueOf(((C9030l) c9134l.f20498l).m2582throw()), hashSet);
        String strM2509l = ((C9030l) c9134l.f20498l).m2509l();
        if (c5051l.m1682l(str, c3032l)) {
            C6901l.m2082case(c8315l);
            if (c8315l.m2302l(str) && !TextUtils.isEmpty(strM2509l) && (iIndexOf = strM2509l.indexOf(".")) != -1) {
                strM2509l = strM2509l.substring(0, iIndexOf);
            }
        }
        m3707l(builder, "os_version", strM2509l, hashSet);
        m3707l(builder, "timestamp", String.valueOf(c13135l.startapp()), hashSet);
        if (((C9030l) c9134l.f20498l).premium()) {
            m3707l(builder, "lat", "1", hashSet);
        }
        m3707l(builder, "privacy_sandbox_version", String.valueOf(((C9030l) c9134l.f20498l).m2502l()), hashSet);
        m3707l(builder, "trigger_uri_source", "1", hashSet);
        m3707l(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        m3707l(builder, "request_uuid", str2, hashSet);
        List<C0420l> listAdmob = c13135l.admob();
        Bundle bundle = new Bundle();
        for (C0420l c0420l : listAdmob) {
            String strSignature = c0420l.Signature();
            if (c0420l.premium()) {
                bundle.putString(strSignature, String.valueOf(c0420l.applovin()));
            } else if (c0420l.isVip()) {
                bundle.putString(strSignature, String.valueOf(c0420l.signatures()));
            } else if (c0420l.license()) {
                bundle.putString(strSignature, c0420l.pro());
            } else if (c0420l.ad()) {
                bundle.putString(strSignature, String.valueOf(c0420l.advert()));
            }
        }
        m3687l(builder, c5051l.m1681l(str, AbstractC5981l.f12683l).split("\\|"), bundle, hashSet);
        List<C8252l> listUnmodifiableList = DesugarCollections.unmodifiableList(((C9030l) c9134l.f20498l).m2486l());
        Bundle bundle2 = new Bundle();
        for (C8252l c8252l : listUnmodifiableList) {
            String strLicense = c8252l.license();
            if (c8252l.applovin()) {
                bundle2.putString(strLicense, String.valueOf(c8252l.appmetrica()));
            } else if (c8252l.signatures()) {
                bundle2.putString(strLicense, String.valueOf(c8252l.premium()));
            } else if (c8252l.pro()) {
                bundle2.putString(strLicense, c8252l.ad());
            } else if (c8252l.advert()) {
                bundle2.putString(strLicense, String.valueOf(c8252l.isVip()));
            }
        }
        m3687l(builder, c5051l.m1681l(str, AbstractC5981l.f12690l).split("\\|"), bundle2, hashSet);
        m3707l(builder, "dma", true != ((C9030l) c9134l.f20498l).m2537l() ? "0" : "1", hashSet);
        if (!((C9030l) c9134l.f20498l).m2501l().isEmpty()) {
            m3707l(builder, "dma_cps", ((C9030l) c9134l.f20498l).m2501l(), hashSet);
        }
        if (((C9030l) c9134l.f20498l).m2549l()) {
            C16186l c16186lM2511l = ((C9030l) c9134l.f20498l).m2511l();
            if (!c16186lM2511l.m4151synchronized().isEmpty()) {
                m3707l(builder, "dl_gclid", c16186lM2511l.m4151synchronized(), hashSet);
            }
            if (!c16186lM2511l.m4154volatile().isEmpty()) {
                m3707l(builder, "dl_gbraid", c16186lM2511l.m4154volatile(), hashSet);
            }
            if (!c16186lM2511l.m4146private().isEmpty()) {
                m3707l(builder, "dl_gs", c16186lM2511l.m4146private(), hashSet);
            }
            if (c16186lM2511l.m4139for() > 0) {
                m3707l(builder, "dl_ss_ts", String.valueOf(c16186lM2511l.m4139for()), hashSet);
            }
            if (!c16186lM2511l.m4133catch().isEmpty()) {
                m3707l(builder, "mr_gclid", c16186lM2511l.m4133catch(), hashSet);
            }
            if (!c16186lM2511l.m4132case().isEmpty()) {
                m3707l(builder, "mr_gbraid", c16186lM2511l.m4132case(), hashSet);
            }
            if (!c16186lM2511l.m4135continue().isEmpty()) {
                m3707l(builder, "mr_gs", c16186lM2511l.m4135continue(), hashSet);
            }
            if (c16186lM2511l.m4143interface() > 0) {
                m3707l(builder, "mr_click_ts", String.valueOf(c16186lM2511l.m4143interface()), hashSet);
            }
        }
        return new C11536l(jCurrentTimeMillis, 1, builder.build().toString());
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public final void m3715l(StringBuilder sb, int i, InterfaceC9971l interfaceC9971l) {
        if (interfaceC9971l == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = interfaceC9971l.iterator();
        while (it.hasNext()) {
            C0420l c0420l = (C0420l) it.next();
            if (c0420l != null) {
                m3694l(i2, sb);
                sb.append("param {\n");
                m3704l(sb, i2, "name", c0420l.tapsense() ? ((C17417l) this.f833l).f33942l.loadAd(c0420l.Signature()) : null);
                m3704l(sb, i2, "string_value", c0420l.license() ? c0420l.pro() : null);
                m3704l(sb, i2, "int_value", c0420l.ad() ? Long.valueOf(c0420l.advert()) : null);
                m3704l(sb, i2, "double_value", c0420l.premium() ? Double.valueOf(c0420l.applovin()) : null);
                if (c0420l.inmobi() > 0) {
                    m3715l(sb, i2, c0420l.appmetrica());
                }
                m3694l(i2, sb);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters */
    public final void m3716l(StringBuilder sb, int i, C3153l c3153l) {
        String str;
        if (c3153l == null) {
            return;
        }
        m3694l(i, sb);
        sb.append("filter {\n");
        if (c3153l.ad()) {
            m3704l(sb, i, "complement", Boolean.valueOf(c3153l.advert()));
        }
        if (c3153l.isVip()) {
            m3704l(sb, i, "param_name", ((C17417l) this.f833l).f33942l.loadAd(c3153l.signatures()));
        }
        if (c3153l.tapsense()) {
            int i2 = i + 1;
            C17590l c17590lSignature = c3153l.Signature();
            if (c17590lSignature != null) {
                m3694l(i2, sb);
                sb.append("string_filter {\n");
                if (c17590lSignature.tapsense()) {
                    switch (c17590lSignature.premium()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m3704l(sb, i2, "match_type", str);
                }
                if (c17590lSignature.Signature()) {
                    m3704l(sb, i2, "expression", c17590lSignature.license());
                }
                if (c17590lSignature.pro()) {
                    m3704l(sb, i2, "case_sensitive", Boolean.valueOf(c17590lSignature.ad()));
                }
                if (c17590lSignature.isVip() > 0) {
                    m3694l(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : c17590lSignature.advert()) {
                        m3694l(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m3694l(i2, sb);
                sb.append("}\n");
            }
        }
        if (c3153l.license()) {
            m3703l(sb, i + 1, "number_filter", c3153l.pro());
        }
        m3694l(i, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: lْۣۢ, reason: contains not printable characters */
    public final C1841l m3717l(C6911l c6911l) {
        C13135l c13135lM1049volatile = C1841l.m1049volatile();
        long j = c6911l.billing;
        c13135lM1049volatile.loadAd();
        ((C1841l) c13135lM1049volatile.f20498l).m1050case(j);
        long j2 = c6911l.purchase;
        c13135lM1049volatile.loadAd();
        ((C1841l) c13135lM1049volatile.f20498l).tapsense(j2);
        C16021l c16021l = c6911l.mopub;
        Objects.requireNonNull(c16021l);
        Bundle bundle = c16021l.f31403l;
        for (String str : bundle.keySet()) {
            C1915l c1915lM520throws = C0420l.m520throws();
            c1915lM520throws.admob(str);
            Object obj = bundle.get(str);
            AbstractC1051l.subs(obj);
            m3719l(c1915lM520throws, obj);
            c13135lM1049volatile.smaato(c1915lM520throws);
        }
        String str2 = c6911l.crashlytics;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            C1915l c1915lM520throws2 = C0420l.m520throws();
            c1915lM520throws2.admob("_o");
            c1915lM520throws2.subs(str2);
            c13135lM1049volatile.firebase((C0420l) c1915lM520throws2.amazon());
        }
        return (C1841l) c13135lM1049volatile.amazon();
    }

    /* JADX INFO: renamed from: lٓۨۜ, reason: contains not printable characters */
    public final boolean m3718l(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((C17417l) this.f833l).f33951l.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* JADX INFO: renamed from: lٕٖؒ, reason: contains not printable characters */
    public final void m3719l(C1915l c1915l, Object obj) {
        c1915l.loadAd();
        ((C0420l) c1915l.f20498l).m527strictfp();
        c1915l.loadAd();
        ((C0420l) c1915l.f20498l).m524native();
        c1915l.loadAd();
        ((C0420l) c1915l.f20498l).m522extends();
        c1915l.loadAd();
        ((C0420l) c1915l.f20498l).m521catch();
        if (obj instanceof String) {
            c1915l.subs((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c1915l.isPro(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c1915l.loadAd();
            ((C0420l) c1915l.f20498l).m526private(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C1915l c1915lM520throws = C0420l.m520throws();
                for (String str : bundle.keySet()) {
                    C1915l c1915lM520throws2 = C0420l.m520throws();
                    c1915lM520throws2.admob(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c1915lM520throws2.isPro(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c1915lM520throws2.subs((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        c1915lM520throws2.loadAd();
                        ((C0420l) c1915lM520throws2.f20498l).m526private(dDoubleValue2);
                    }
                    c1915lM520throws.loadAd();
                    ((C0420l) c1915lM520throws.f20498l).m523for((C0420l) c1915lM520throws2.amazon());
                }
                if (((C0420l) c1915lM520throws.f20498l).inmobi() > 0) {
                    arrayList.add((C0420l) c1915lM520throws.amazon());
                }
            }
        }
        c1915l.loadAd();
        ((C0420l) c1915l.f20498l).m529throw(arrayList);
    }

    /* JADX INFO: renamed from: lّٖ۠, reason: contains not printable characters */
    public final String m3720l(C6194l c6194l) {
        String str;
        String str2;
        String str3;
        C0299l c0299lM2491l;
        StringBuilder sbAd = AbstractC5020l.ad("\nbatch {\n");
        if (c6194l.advert()) {
            m3704l(sbAd, 0, "upload_subdomain", c6194l.isVip());
        }
        if (c6194l.pro()) {
            m3704l(sbAd, 0, "sgtm_join_id", c6194l.ad());
        }
        for (C9030l c9030l : c6194l.tapsense()) {
            if (c9030l != null) {
                m3694l(1, sbAd);
                sbAd.append("bundle {\n");
                if (c9030l.m2452continue()) {
                    m3704l(sbAd, 1, "protocol_version", Integer.valueOf(c9030l.m2494l()));
                }
                C17417l c17417l = (C17417l) this.f833l;
                C5051l c5051l = c17417l.f33945l;
                C14135l c14135l = c17417l.f33942l;
                if (c5051l.m1682l(c9030l.tapsense(), AbstractC5981l.f12666l) && c9030l.m2469l()) {
                    m3704l(sbAd, 1, "session_stitching_token", c9030l.m2473l());
                }
                m3704l(sbAd, 1, "platform", c9030l.m2512l());
                if (c9030l.license()) {
                    m3704l(sbAd, 1, "gmp_version", Long.valueOf(c9030l.pro()));
                }
                if (c9030l.ad()) {
                    m3704l(sbAd, 1, "uploading_gmp_version", Long.valueOf(c9030l.advert()));
                }
                if (c9030l.m2476l()) {
                    m3704l(sbAd, 1, "dynamite_version", Long.valueOf(c9030l.m2554l()));
                }
                if (c9030l.m2449catch()) {
                    m3704l(sbAd, 1, "config_version", Long.valueOf(c9030l.m2454else()));
                }
                m3704l(sbAd, 1, "gmp_app_id", c9030l.m2577strictfp());
                m3704l(sbAd, 1, "app_id", c9030l.tapsense());
                m3704l(sbAd, 1, "app_version", c9030l.Signature());
                if (c9030l.m2457for()) {
                    m3704l(sbAd, 1, "app_version_major", Integer.valueOf(c9030l.m2582throw()));
                }
                m3704l(sbAd, 1, "firebase_instance_id", c9030l.m2455extends());
                if (c9030l.appmetrica()) {
                    m3704l(sbAd, 1, "dev_cert_hash", Long.valueOf(c9030l.inmobi()));
                }
                m3704l(sbAd, 1, "app_store", c9030l.m2514l());
                if (c9030l.m2536l()) {
                    m3704l(sbAd, 1, "upload_timestamp_millis", Long.valueOf(c9030l.m2555l()));
                }
                if (c9030l.m2563l()) {
                    m3704l(sbAd, 1, "start_timestamp_millis", Long.valueOf(c9030l.m2561l()));
                }
                if (c9030l.m2482l()) {
                    m3704l(sbAd, 1, "end_timestamp_millis", Long.valueOf(c9030l.m2477l()));
                }
                if (c9030l.m2564l()) {
                    m3704l(sbAd, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c9030l.m2522l()));
                }
                if (c9030l.m2539l()) {
                    m3704l(sbAd, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c9030l.m2464l()));
                }
                m3704l(sbAd, 1, "app_instance_id", c9030l.applovin());
                m3704l(sbAd, 1, "resettable_device_id", c9030l.isVip());
                m3704l(sbAd, 1, "ds_id", c9030l.m2579switch());
                if (c9030l.signatures()) {
                    m3704l(sbAd, 1, "limited_ad_tracking", Boolean.valueOf(c9030l.premium()));
                }
                m3704l(sbAd, 1, "os_version", c9030l.m2509l());
                m3704l(sbAd, 1, "device_model", c9030l.m2565l());
                m3704l(sbAd, 1, "user_default_language", c9030l.m2467l());
                if (c9030l.m2485l()) {
                    m3704l(sbAd, 1, "time_zone_offset_minutes", Integer.valueOf(c9030l.m2492l()));
                }
                if (c9030l.m2583throws()) {
                    m3704l(sbAd, 1, "bundle_sequential_index", Integer.valueOf(c9030l.m2571package()));
                }
                if (c9030l.m2506l()) {
                    m3704l(sbAd, 1, "delivery_index", Integer.valueOf(c9030l.m2475l()));
                }
                if (c9030l.m2586volatile()) {
                    m3704l(sbAd, 1, "service_upload", Boolean.valueOf(c9030l.m2570native()));
                }
                m3704l(sbAd, 1, "health_monitor", c9030l.m2580synchronized());
                if (c9030l.m2552l()) {
                    m3704l(sbAd, 1, "retry_counter", Integer.valueOf(c9030l.m2483l()));
                }
                if (c9030l.m2533l()) {
                    m3704l(sbAd, 1, "consent_signals", c9030l.m2535l());
                }
                if (c9030l.m2495l()) {
                    m3704l(sbAd, 1, "is_dma_region", Boolean.valueOf(c9030l.m2537l()));
                }
                if (c9030l.m2543l()) {
                    m3704l(sbAd, 1, "core_platform_services", c9030l.m2501l());
                }
                if (c9030l.m2532l()) {
                    m3704l(sbAd, 1, "consent_diagnostics", c9030l.m2530l());
                }
                if (c9030l.m2545l()) {
                    m3704l(sbAd, 1, "target_os_version", Long.valueOf(c9030l.m2547l()));
                }
                C2156l.yandex();
                if (c5051l.m1682l(c9030l.tapsense(), AbstractC5981l.f12681l)) {
                    m3704l(sbAd, 1, "ad_services_version", Integer.valueOf(c9030l.m2502l()));
                    if (c9030l.m2481l() && (c0299lM2491l = c9030l.m2491l()) != null) {
                        m3694l(2, sbAd);
                        sbAd.append("attribution_eligibility_status {\n");
                        m3704l(sbAd, 2, "eligible", Boolean.valueOf(c0299lM2491l.tapsense()));
                        m3704l(sbAd, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c0299lM2491l.Signature()));
                        m3704l(sbAd, 2, "pre_r", Boolean.valueOf(c0299lM2491l.license()));
                        m3704l(sbAd, 2, "r_extensions_too_old", Boolean.valueOf(c0299lM2491l.pro()));
                        m3704l(sbAd, 2, "adservices_extension_too_old", Boolean.valueOf(c0299lM2491l.ad()));
                        m3704l(sbAd, 2, "ad_storage_not_allowed", Boolean.valueOf(c0299lM2491l.advert()));
                        m3704l(sbAd, 2, "measurement_manager_disabled", Boolean.valueOf(c0299lM2491l.isVip()));
                        m3694l(2, sbAd);
                        sbAd.append("}\n");
                    }
                }
                if (c9030l.m2549l()) {
                    C16186l c16186lM2511l = c9030l.m2511l();
                    m3694l(2, sbAd);
                    sbAd.append("ad_campaign_info {\n");
                    if (c16186lM2511l.m4145package()) {
                        m3704l(sbAd, 2, "deep_link_gclid", c16186lM2511l.m4151synchronized());
                    }
                    if (c16186lM2511l.m4148strictfp()) {
                        m3704l(sbAd, 2, "deep_link_gbraid", c16186lM2511l.m4154volatile());
                    }
                    if (c16186lM2511l.m4144native()) {
                        m3704l(sbAd, 2, "deep_link_gad_source", c16186lM2511l.m4146private());
                    }
                    if (c16186lM2511l.m4147static()) {
                        m3704l(sbAd, 2, "deep_link_url", c16186lM2511l.m4136default());
                    }
                    if (c16186lM2511l.m4138extends()) {
                        m3704l(sbAd, 2, "deep_link_session_millis", Long.valueOf(c16186lM2511l.m4139for()));
                    }
                    if (c16186lM2511l.m4152throw()) {
                        m3704l(sbAd, 2, "market_referrer_gclid", c16186lM2511l.m4133catch());
                    }
                    if (c16186lM2511l.m4137else()) {
                        m3704l(sbAd, 2, "market_referrer_gbraid", c16186lM2511l.m4132case());
                    }
                    if (c16186lM2511l.m4150switch()) {
                        m3704l(sbAd, 2, "market_referrer_gad_source", c16186lM2511l.m4135continue());
                    }
                    if (c16186lM2511l.m4134class()) {
                        m3704l(sbAd, 2, "market_referrer_click_millis", Long.valueOf(c16186lM2511l.m4143interface()));
                    }
                    m3694l(2, sbAd);
                    sbAd.append("}\n");
                }
                if (c9030l.m2450class()) {
                    m3704l(sbAd, 1, "batching_timestamp_millis", Long.valueOf(c9030l.m2462interface()));
                }
                if (c9030l.m2493l()) {
                    C17880l c17880lM2488l = c9030l.m2488l();
                    m3694l(2, sbAd);
                    sbAd.append("sgtm_diagnostics {\n");
                    int iAd = c17880lM2488l.ad();
                    if (iAd == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iAd == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iAd != 3) {
                        str2 = iAd != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    m3704l(sbAd, 2, "upload_type", str2);
                    m3704l(sbAd, 2, "client_upload_eligibility", AbstractC9029l.applovin(c17880lM2488l.tapsense()));
                    int iAdvert = c17880lM2488l.advert();
                    if (iAdvert == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iAdvert == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iAdvert == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iAdvert != 4) {
                        str3 = iAdvert != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    m3704l(sbAd, 2, "service_upload_eligibility", str3);
                    m3694l(2, sbAd);
                    sbAd.append("}\n");
                }
                if (c9030l.m2576static()) {
                    C1487l c1487lM2453default = c9030l.m2453default();
                    m3694l(2, sbAd);
                    sbAd.append("consent_info_extra {\n");
                    for (C3935l c3935l : c1487lM2453default.tapsense()) {
                        m3694l(3, sbAd);
                        sbAd.append("limited_data_modes {\n");
                        int iSignature = c3935l.Signature();
                        if (iSignature == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iSignature == 2) {
                            str = "AD_STORAGE";
                        } else if (iSignature != 3) {
                            str = iSignature != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        m3704l(sbAd, 3, "type", str);
                        int iLicense = c3935l.license();
                        m3704l(sbAd, 3, "mode", iLicense != 1 ? iLicense != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        m3694l(3, sbAd);
                        sbAd.append("}\n");
                    }
                    m3694l(2, sbAd);
                    sbAd.append("}\n");
                }
                InterfaceC9971l<C8252l> interfaceC9971lM2486l = c9030l.m2486l();
                if (interfaceC9971lM2486l != null) {
                    for (C8252l c8252l : interfaceC9971lM2486l) {
                        if (c8252l != null) {
                            m3694l(2, sbAd);
                            sbAd.append("user_property {\n");
                            m3704l(sbAd, 2, "set_timestamp_millis", c8252l.tapsense() ? Long.valueOf(c8252l.Signature()) : null);
                            m3704l(sbAd, 2, "name", c14135l.crashlytics(c8252l.license()));
                            m3704l(sbAd, 2, "string_value", c8252l.ad());
                            m3704l(sbAd, 2, "int_value", c8252l.advert() ? Long.valueOf(c8252l.isVip()) : null);
                            m3704l(sbAd, 2, "double_value", c8252l.applovin() ? Double.valueOf(c8252l.appmetrica()) : null);
                            m3694l(2, sbAd);
                            sbAd.append("}\n");
                        }
                    }
                }
                InterfaceC9971l<C6812l> interfaceC9971lM2572private = c9030l.m2572private();
                if (interfaceC9971lM2572private != null) {
                    for (C6812l c6812l : interfaceC9971lM2572private) {
                        if (c6812l != null) {
                            m3694l(2, sbAd);
                            sbAd.append("audience_membership {\n");
                            if (c6812l.tapsense()) {
                                m3704l(sbAd, 2, "audience_id", Integer.valueOf(c6812l.Signature()));
                            }
                            if (c6812l.advert()) {
                                m3704l(sbAd, 2, "new_audience", Boolean.valueOf(c6812l.isVip()));
                            }
                            m3696l(sbAd, "current_data", c6812l.license());
                            if (c6812l.pro()) {
                                m3696l(sbAd, "previous_data", c6812l.ad());
                            }
                            m3694l(2, sbAd);
                            sbAd.append("}\n");
                        }
                    }
                }
                List<C1841l> listM2513l = c9030l.m2513l();
                if (listM2513l != null) {
                    for (C1841l c1841l : listM2513l) {
                        if (c1841l != null) {
                            m3694l(2, sbAd);
                            sbAd.append("event {\n");
                            m3704l(sbAd, 2, "name", c14135l.yandex(c1841l.advert()));
                            if (c1841l.isVip()) {
                                m3704l(sbAd, 2, "timestamp_millis", Long.valueOf(c1841l.signatures()));
                            }
                            if (c5051l.m1682l(null, AbstractC5981l.f12677l) && c1841l.m1063throws()) {
                                m3704l(sbAd, 2, "corrected_timestamp_millis", Long.valueOf(c1841l.m1057package()));
                            }
                            if (c1841l.premium()) {
                                m3704l(sbAd, 2, "previous_timestamp_millis", Long.valueOf(c1841l.applovin()));
                            }
                            if (c1841l.appmetrica()) {
                                m3704l(sbAd, 2, "count", Integer.valueOf(c1841l.inmobi()));
                            }
                            if (c1841l.pro() != 0) {
                                m3715l(sbAd, 2, (InterfaceC9971l) c1841l.license());
                            }
                            m3694l(2, sbAd);
                            sbAd.append("}\n");
                        }
                    }
                }
                m3694l(1, sbAd);
                sbAd.append("}\n");
            }
        }
        sbAd.append("} // End-of-batch\n");
        return sbAd.toString();
    }

    /* JADX INFO: renamed from: lٗٙٚ, reason: contains not printable characters */
    public final Parcelable m3721l(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (C8325l unused) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    /* JADX INFO: renamed from: l٘ؖۜ, reason: contains not printable characters */
    public final String m3722l(C16493l c16493l) {
        StringBuilder sbAd = AbstractC5020l.ad("\nproperty_filter {\n");
        if (c16493l.tapsense()) {
            m3704l(sbAd, 0, "filter_id", Integer.valueOf(c16493l.Signature()));
        }
        m3704l(sbAd, 0, "property_name", ((C17417l) this.f833l).f33942l.crashlytics(c16493l.license()));
        String strM3699l = m3699l(c16493l.ad(), c16493l.advert(), c16493l.signatures());
        if (!strM3699l.isEmpty()) {
            m3704l(sbAd, 0, "filter_type", strM3699l);
        }
        m3716l(sbAd, 1, c16493l.pro());
        sbAd.append("}\n");
        return sbAd.toString();
    }

    @Override // defpackage.AbstractC10491l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final void mo1780l() {
    }
}

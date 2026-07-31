package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lؔۜٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2922l implements InterfaceC17302l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6363l;

    /* JADX WARN: Code duplicated, block: B:130:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:134:0x040a  */
    @Override // defpackage.InterfaceC17302l
    public final Object apply(Object obj) {
        StringBuilder sb;
        char cCharAt;
        C13708l c13708lMopub;
        int i = 19;
        boolean z = true;
        int i2 = 0;
        switch (this.f6363l) {
            case 0:
                return ((InterfaceC14833l) obj).yandex().getClass().getSimpleName();
            case 1:
                return Integer.valueOf(((C17456l) obj).ads);
            case 2:
                long j = ((C8755l) obj).loadAd;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 3:
                C8750l c8750l = (C8750l) obj;
                c8750l.getClass();
                Bundle bundle = new Bundle();
                String str = C8750l.purchase;
                C13708l c13708l = c8750l.loadAd;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c13708l.f26765l);
                C9258l c9258lListIterator = c13708l.listIterator(0);
                while (c9258lListIterator.hasNext()) {
                    arrayList.add(((C11916l) c9258lListIterator.next()).amazon());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            case 4:
                return new C17505l((C18527l) obj);
            case 5:
                C3857l c3857l = (C3857l) obj;
                return c3857l.yandex + ": " + c3857l.loadAd;
            case 6:
                return (C11436l) obj;
            case 7:
                C8915l c8915l = (C8915l) obj;
                c8915l.pro();
                return AbstractC1186l.Signature(AbstractC7280l.isPro(new C2922l(i), c8915l.f18336l.loadAd));
            case 8:
                C17945l c17945l = (C17945l) obj;
                c17945l.getClass();
                Bundle bundle2 = new Bundle();
                int i3 = c17945l.f34926l;
                if (i3 != 0) {
                    bundle2.putInt(C17945l.f34922l, i3);
                }
                int i4 = c17945l.f34925l;
                if (i4 != 0) {
                    bundle2.putInt(C17945l.f34921l, i4);
                }
                int i5 = c17945l.f34924l;
                if (i5 != 0) {
                    bundle2.putInt(C17945l.f34923l, i5);
                }
                return bundle2;
            case 9:
                C9749l c9749l = (C9749l) obj;
                c9749l.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(C9749l.admob, c9749l.yandex);
                String str2 = c9749l.loadAd;
                if (str2 != null) {
                    bundle3.putString(C9749l.subs, str2);
                }
                String str3 = c9749l.crashlytics;
                if (str3 != null) {
                    bundle3.putString(C9749l.isPro, str3);
                }
                int i6 = c9749l.amazon;
                if (i6 != 0) {
                    bundle3.putInt(C9749l.firebase, i6);
                }
                int i7 = c9749l.purchase;
                if (i7 != 0) {
                    bundle3.putInt(C9749l.smaato, i7);
                }
                String str4 = c9749l.billing;
                if (str4 != null) {
                    bundle3.putString(C9749l.remoteconfig, str4);
                }
                String str5 = c9749l.mopub;
                if (str5 != null) {
                    bundle3.putString(C9749l.vip, str5);
                }
                return bundle3;
            case 10:
                Bundle bundle4 = (Bundle) obj;
                Uri uri = (Uri) bundle4.getParcelable(C9749l.admob);
                uri.getClass();
                String string = bundle4.getString(C9749l.subs);
                String string2 = bundle4.getString(C9749l.isPro);
                int i8 = bundle4.getInt(C9749l.firebase, 0);
                int i9 = bundle4.getInt(C9749l.smaato, 0);
                String string3 = bundle4.getString(C9749l.remoteconfig);
                String string4 = bundle4.getString(C9749l.vip);
                C1652l c1652l = new C1652l();
                c1652l.amazon = uri;
                c1652l.yandex = AbstractC3825l.vip(string);
                c1652l.purchase = string2;
                c1652l.loadAd = i8;
                c1652l.crashlytics = i9;
                c1652l.billing = string3;
                c1652l.mopub = string4;
                return new C9749l(c1652l);
            case 11:
                String str6 = (String) obj;
                C17294l c17294l = C0674l.mopub;
                c17294l.getClass();
                for (int length = str6.length() - 1; length >= 0; length--) {
                    if (!c17294l.crashlytics(str6.charAt(length))) {
                        z = false;
                        if (!z && !str6.isEmpty()) {
                            return str6;
                        }
                        sb = new StringBuilder(str6.length() + 16);
                        sb.append('\"');
                        while (i2 < str6.length()) {
                            cCharAt = str6.charAt(i2);
                            if (cCharAt != '\r' || cCharAt == '\\' || cCharAt == '\"') {
                                sb.append('\\');
                            }
                            sb.append(cCharAt);
                            i2++;
                        }
                        sb.append('\"');
                        return sb.toString();
                    }
                }
                if (!z) {
                }
                sb = new StringBuilder(str6.length() + 16);
                sb.append('\"');
                while (i2 < str6.length()) {
                    cCharAt = str6.charAt(i2);
                    if (cCharAt != '\r') {
                        sb.append('\\');
                    } else {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                    i2++;
                }
                sb.append('\"');
                return sb.toString();
            case 12:
                Collection collection = (Collection) obj;
                int i10 = AbstractC10977l.f22123l;
                if (collection instanceof AbstractC10977l) {
                    return (AbstractC10977l) collection;
                }
                boolean z2 = collection instanceof AbstractC10977l;
                int size = z2 ? ((C7544l) ((C8970l) ((AbstractC10977l) collection)).vip()).size() : 11;
                C3430l c3430l = new C3430l();
                c3430l.loadAd = false;
                C3528l c3528l = new C3528l();
                c3528l.amazon(size);
                c3430l.yandex = c3528l;
                if (z2) {
                    AbstractC10977l abstractC10977l = (AbstractC10977l) collection;
                    C3528l c3528l2 = abstractC10977l instanceof C8970l ? ((C8970l) abstractC10977l).f18504l : null;
                    if (c3528l2 != null) {
                        c3528l.yandex(Math.max(c3528l.crashlytics, c3528l2.crashlytics));
                        i2 = c3528l2.crashlytics == 0 ? -1 : 0;
                        while (i2 >= 0) {
                            AbstractC12442l.smaato(i2, c3528l2.crashlytics);
                            Object obj2 = c3528l2.yandex[i2];
                            AbstractC12442l.smaato(i2, c3528l2.crashlytics);
                            c3430l.crashlytics(c3528l2.loadAd[i2], obj2);
                            i2++;
                            if (i2 >= c3528l2.crashlytics) {
                                i2 = -1;
                            }
                        }
                    } else {
                        AbstractC8481l abstractC8481lMetrica = abstractC10977l.metrica();
                        C3528l c3528l3 = c3430l.yandex;
                        c3528l3.yandex(Math.max(c3528l3.crashlytics, abstractC8481lMetrica.size()));
                        for (C4139l c4139l : abstractC10977l.metrica()) {
                            c3430l.crashlytics(c4139l.yandex(), c4139l.yandex);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        c3430l.yandex(it.next());
                    }
                }
                Objects.requireNonNull(c3430l.yandex);
                if (c3430l.yandex.crashlytics == 0) {
                    return C8970l.f18502l;
                }
                c3430l.loadAd = true;
                return new C8970l(c3430l.yandex);
            case 13:
                return Long.valueOf(((C8755l) obj).loadAd);
            case 14:
                return Long.valueOf(((C8755l) obj).crashlytics);
            case 15:
                return AbstractC1186l.Signature(AbstractC7280l.isPro(new C2922l(i), ((InterfaceC8782l) obj).metrica().loadAd));
            case 16:
                return (C11436l) obj;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C12551l c12551l = (C12551l) obj;
                int i11 = c12551l.yandex;
                int i12 = c12551l.loadAd;
                int i13 = c12551l.amazon;
                return new C12551l(i12 <= 1, i11, i12 > i13 ? i12 - 1 : i13, i13, c12551l.purchase);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Bundle bundle5 = (Bundle) obj;
                C5978l c5978l = C5978l.f12578case;
                C12984l c12984l = new C12984l();
                if (bundle5 != null) {
                    ClassLoader classLoader = AbstractC3483l.class.getClassLoader();
                    String str7 = AbstractC15323l.yandex;
                    bundle5.setClassLoader(classLoader);
                }
                String string5 = bundle5.getString(C5978l.f12609switch);
                String str8 = c5978l.yandex;
                if (string5 == null) {
                    string5 = str8;
                }
                c12984l.yandex = string5;
                String string6 = bundle5.getString(C5978l.f12581continue);
                String str9 = c5978l.loadAd;
                if (string6 == null) {
                    string6 = str9;
                }
                c12984l.loadAd = string6;
                ArrayList parcelableArrayList = bundle5.getParcelableArrayList(C5978l.f12595l);
                if (parcelableArrayList == null) {
                    c13708lMopub = C13708l.f26763l;
                } else {
                    C16971l c16971lMetrica = AbstractC1186l.metrica();
                    for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                        Bundle bundle6 = (Bundle) parcelableArrayList.get(i14);
                        bundle6.getClass();
                        String string7 = bundle6.getString(C3857l.crashlytics);
                        String string8 = bundle6.getString(C3857l.amazon);
                        string8.getClass();
                        c16971lMetrica.crashlytics(new C3857l(string7, string8));
                    }
                    c13708lMopub = c16971lMetrica.mopub();
                }
                c12984l.crashlytics = AbstractC1186l.Signature(c13708lMopub);
                String string9 = bundle5.getString(C5978l.f12579class);
                String str10 = c5978l.amazon;
                if (string9 == null) {
                    string9 = str10;
                }
                c12984l.amazon = string9;
                c12984l.purchase = bundle5.getInt(C5978l.f12589interface, c5978l.purchase);
                c12984l.billing = bundle5.getInt(C5978l.f12607static, c5978l.billing);
                c12984l.mopub = bundle5.getInt(C5978l.f12596l, c5978l.mopub);
                c12984l.admob = bundle5.getInt(C5978l.f12582default, c5978l.admob);
                c12984l.subs = bundle5.getInt(C5978l.f12583final, c5978l.subs);
                String string10 = bundle5.getString(C5978l.f12603new);
                String str11 = c5978l.firebase;
                if (string10 == null) {
                    string10 = str11;
                }
                c12984l.isPro = string10;
                String string11 = bundle5.getString(C5978l.f12598l);
                String str12 = c5978l.remoteconfig;
                if (string11 == null) {
                    string11 = str12;
                }
                c12984l.smaato = string11;
                String string12 = bundle5.getString(C5978l.f12585goto);
                String str13 = c5978l.vip;
                if (string12 == null) {
                    string12 = str13;
                }
                c12984l.remoteconfig = AbstractC3825l.vip(string12);
                String string13 = bundle5.getString(C5978l.f12608super);
                String str14 = c5978l.metrica;
                if (string13 == null) {
                    string13 = str14;
                }
                c12984l.vip = AbstractC3825l.vip(string13);
                c12984l.metrica = bundle5.getInt(C5978l.f12587import, c5978l.startapp);
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle5.getByteArray(C5978l.f12576abstract + "_" + Integer.toString(i2, 36));
                    if (byteArray == null) {
                        c12984l.adcel = arrayList2;
                        c12984l.ads = (C17564l) bundle5.getParcelable(C5978l.f12588instanceof);
                        c12984l.subscription = bundle5.getLong(C5978l.f12605public, c5978l.tapsense);
                        c12984l.Signature = bundle5.getInt(C5978l.f12584finally, c5978l.license);
                        c12984l.license = bundle5.getInt(C5978l.f12610this, c5978l.pro);
                        c12984l.pro = bundle5.getInt(C5978l.f12591l, c5978l.ad);
                        c12984l.ad = bundle5.getInt(C5978l.f12597l, c5978l.advert);
                        c12984l.advert = bundle5.getFloat(C5978l.f12612try, c5978l.isVip);
                        c12984l.isVip = bundle5.getInt(C5978l.f12577break, c5978l.signatures);
                        c12984l.signatures = bundle5.getFloat(C5978l.f12611transient, c5978l.premium);
                        c12984l.premium = bundle5.getByteArray(C5978l.f12604protected);
                        c12984l.applovin = bundle5.getInt(C5978l.f12613while, c5978l.appmetrica);
                        c12984l.inmobi = bundle5.getInt(C5978l.f12590l, c5978l.f12624throws);
                        Bundle bundle7 = bundle5.getBundle(C5978l.f12586implements);
                        if (bundle7 != null) {
                            c12984l.appmetrica = new C1591l(bundle7.getInt(C1591l.subs, -1), bundle7.getInt(C1591l.isPro, -1), bundle7.getInt(C1591l.firebase, -1), bundle7.getByteArray(C1591l.smaato), bundle7.getInt(C1591l.remoteconfig, -1), bundle7.getInt(C1591l.vip, -1));
                        }
                        c12984l.f25447throws = bundle5.getInt(C5978l.f12580const, c5978l.f12619package);
                        c12984l.f25442package = bundle5.getInt(C5978l.f12606return, c5978l.f12622synchronized);
                        c12984l.f25445synchronized = bundle5.getInt(C5978l.f12602l, c5978l.f12621strictfp);
                        c12984l.f25444strictfp = bundle5.getInt(C5978l.f12594l, c5978l.f12625volatile);
                        c12984l.f25448volatile = bundle5.getInt(C5978l.f12601l, c5978l.f12618native);
                        c12984l.f25441native = bundle5.getInt(C5978l.f12599l, c5978l.f12620private);
                        c12984l.f25439extends = bundle5.getInt(C5978l.f12592l, c5978l.f12617for);
                        c12984l.f25440for = bundle5.getInt(C5978l.f12600l, c5978l.f12623throw);
                        c12984l.f25446throw = bundle5.getInt(C5978l.f12593l, c5978l.f12614catch);
                        return new C5978l(c12984l);
                    }
                    arrayList2.add(byteArray);
                    i2++;
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Integer.valueOf(((C11916l) obj).crashlytics);
            case 20:
                C14446l c14446l = (C14446l) obj;
                c14446l.getClass();
                Bundle bundle8 = new Bundle();
                bundle8.putBundle(C14446l.billing, c14446l.loadAd.amazon());
                bundle8.putIntArray(C14446l.mopub, c14446l.amazon);
                bundle8.putBooleanArray(C14446l.admob, c14446l.purchase);
                bundle8.putBoolean(C14446l.subs, c14446l.crashlytics);
                return bundle8;
            default:
                Bundle bundle9 = (Bundle) obj;
                Bundle bundle10 = bundle9.getBundle(C14446l.billing);
                bundle10.getClass();
                C11916l c11916lYandex = C11916l.yandex(bundle10);
                int[] intArray = bundle9.getIntArray(C14446l.mopub);
                int i15 = c11916lYandex.yandex;
                int[] iArr = new int[i15];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle9.getBooleanArray(C14446l.admob);
                boolean[] zArr = new boolean[i15];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new C14446l(c11916lYandex, bundle9.getBoolean(C14446l.subs, false), intArray, booleanArray);
        }
    }

    public /* synthetic */ C2922l(int i) {
        this.f6363l = i;
    }
}

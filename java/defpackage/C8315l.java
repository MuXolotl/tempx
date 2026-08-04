package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lًٟ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8315l extends AbstractC10491l implements InterfaceC8112l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C18675l f17205l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C11154l f17206l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C11154l f17207l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C11154l f17208l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C11154l f17209l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C11154l f17210l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C11154l f17211l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C9689l f17212l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C11154l f17213l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C11154l f17214l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C11154l f17215l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C11154l f17216l;

    public C8315l(C6901l c6901l) {
        super(c6901l);
        this.f17211l = new C11154l(0);
        this.f17214l = new C11154l(0);
        this.f17206l = new C11154l(0);
        this.f17207l = new C11154l(0);
        this.f17213l = new C11154l(0);
        this.f17209l = new C11154l(0);
        this.f17216l = new C11154l(0);
        this.f17210l = new C11154l(0);
        this.f17208l = new C11154l(0);
        this.f17215l = new C11154l(0);
        this.f17212l = new C9689l(this);
        this.f17205l = new C18675l(this);
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public static final C11154l m2300l(C5468l c5468l) {
        C11154l c11154l = new C11154l(0);
        for (C0762l c0762l : c5468l.ad()) {
            c11154l.put(c0762l.tapsense(), c0762l.Signature());
        }
        return c11154l;
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public static final EnumC3170l m2301l(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return EnumC3170l.AD_STORAGE;
        }
        if (i2 == 2) {
            return EnumC3170l.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return EnumC3170l.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return EnumC3170l.AD_PERSONALIZATION;
    }

    @Override // defpackage.InterfaceC8112l
    /* JADX INFO: renamed from: implements */
    public final String mo2259implements(String str, String str2) {
        mo211l();
        m2307l(str);
        Map map = (Map) this.f17211l.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: lؒۡۦ, reason: contains not printable characters */
    public final boolean m2302l(String str) {
        mo211l();
        m2307l(str);
        C11154l c11154l = this.f17214l;
        if (c11154l.get(str) != null) {
            return ((Set) c11154l.get(str)).contains("os_version") || ((Set) c11154l.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final void m2303l(String str, C5468l c5468l) {
        C17417l c17417l = (C17417l) this.f833l;
        int iApplovin = c5468l.applovin();
        C9689l c9689l = this.f17212l;
        if (iApplovin == 0) {
            c9689l.amazon(str);
            return;
        }
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c8118l);
        c8118l.f16911l.loadAd(Integer.valueOf(c5468l.applovin()), "EES programs found");
        int i = 0;
        C9618l c9618l = (C9618l) c5468l.premium().get(0);
        try {
            C15973l c15973l = new C15973l();
            C1381l c1381l = c15973l.yandex;
            ((HashMap) ((C3316l) c1381l.f3514l).f7072l).put("internal.remoteConfig", new CallableC2196l(this, str, 2));
            ((HashMap) ((C3316l) c1381l.f3514l).f7072l).put("internal.appMetadata", new CallableC2196l(this, str, i));
            ((HashMap) ((C3316l) c1381l.f3514l).f7072l).put("internal.logger", new CallableC15551l(3, this));
            c15973l.loadAd(c9618l);
            c9689l.crashlytics(str, c15973l);
            C17417l.admob(c8118l);
            C14906l c14906l = c8118l.f16911l;
            c14906l.crashlytics(str, Integer.valueOf(c9618l.Signature().Signature()), "EES program loaded for appId, activities");
            for (C14994l c14994l : c9618l.Signature().tapsense()) {
                C17417l.admob(c8118l);
                c14906l.loadAd(c14994l.tapsense(), "EES program activity");
            }
        } catch (C17540l unused) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16908l.loadAd(str, "Failed to load EES program. appId");
        }
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final boolean m2304l(String str) {
        mo211l();
        m2307l(str);
        C15651l c15651lM2316l = m2316l(str);
        if (c15651lM2316l == null) {
            return false;
        }
        for (C14452l c14452l : c15651lM2316l.tapsense()) {
            if (c14452l.tapsense() == 3 && c14452l.license() == 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final EnumC17672l m2305l(String str, EnumC3170l enumC3170l) {
        mo211l();
        m2307l(str);
        C15651l c15651lM2316l = m2316l(str);
        if (c15651lM2316l != null) {
            for (C14452l c14452l : c15651lM2316l.advert()) {
                if (m2301l(c14452l.tapsense()) == enumC3170l) {
                    int iSignature = c14452l.Signature() - 1;
                    if (iSignature == 1) {
                        return EnumC17672l.GRANTED;
                    }
                    if (iSignature != 2) {
                        break;
                    }
                    return EnumC17672l.DENIED;
                }
            }
        }
        return EnumC17672l.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters */
    public final boolean m2306l(String str, String str2) {
        Boolean bool;
        mo211l();
        m2307l(str);
        if ("1".equals(mo2259implements(str, "measurement.upload.blacklist_internal")) && C17410l.m4345l(str2)) {
            return true;
        }
        if ("1".equals(mo2259implements(str, "measurement.upload.blacklist_public")) && C17410l.m4333l(str2)) {
            return true;
        }
        Map map = (Map) this.f17206l.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final void m2307l(String str) {
        m2927l();
        mo211l();
        AbstractC1051l.billing(str);
        C11154l c11154l = this.f17209l;
        if (c11154l.get(str) == null) {
            C8648l c8648l = this.f13233l.f14451l;
            C6901l.m2082case(c8648l);
            C4816l c4816lM2378l = c8648l.m2378l(str);
            C11154l c11154l2 = this.f17208l;
            C11154l c11154l3 = this.f17210l;
            C11154l c11154l4 = this.f17216l;
            C11154l c11154l5 = this.f17211l;
            if (c4816lM2378l != null) {
                C12380l c12380l = (C12380l) m2312l(str, (byte[]) c4816lM2378l.f9860l).firebase();
                m2311l(str, c12380l);
                c11154l5.put(str, m2300l((C5468l) c12380l.amazon()));
                c11154l.put(str, (C5468l) c12380l.amazon());
                m2303l(str, (C5468l) c12380l.amazon());
                c11154l4.put(str, ((C5468l) c12380l.f20498l).inmobi());
                c11154l3.put(str, (String) c4816lM2378l.f9859l);
                c11154l2.put(str, (String) c4816lM2378l.f9862l);
                return;
            }
            c11154l5.put(str, null);
            this.f17206l.put(str, null);
            this.f17214l.put(str, null);
            this.f17207l.put(str, null);
            this.f17213l.put(str, null);
            c11154l.put(str, null);
            c11154l4.put(str, null);
            c11154l3.put(str, null);
            c11154l2.put(str, null);
            this.f17215l.put(str, null);
        }
    }

    /* JADX INFO: renamed from: lؙؚؚ, reason: contains not printable characters */
    public final boolean m2308l(String str) {
        mo211l();
        m2307l(str);
        C11154l c11154l = this.f17214l;
        return c11154l.get(str) != null && ((Set) c11154l.get(str)).contains("app_instance_id");
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public final C5468l m2309l(String str) {
        m2927l();
        mo211l();
        AbstractC1051l.billing(str);
        m2307l(str);
        return (C5468l) this.f17209l.get(str);
    }

    /* JADX INFO: renamed from: lًٖۘ, reason: contains not printable characters */
    public final List m2310l(String str) {
        mo211l();
        m2307l(str);
        return (List) this.f17213l.get(str);
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final void m2311l(String str, C12380l c12380l) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        C11154l c11154l = new C11154l(0);
        C11154l c11154l2 = new C11154l(0);
        C11154l c11154l3 = new C11154l(0);
        Iterator it = DesugarCollections.unmodifiableList(((C5468l) c12380l.f20498l).appmetrica()).iterator();
        while (it.hasNext()) {
            hashSet.add(((C2647l) it.next()).tapsense());
        }
        C17417l c17417l = (C17417l) this.f833l;
        C5051l c5051l = c17417l.f33945l;
        C8118l c8118l = c17417l.f33950l;
        C3032l c3032l = AbstractC5981l.f12662l;
        if (c5051l.m1682l(null, c3032l)) {
            arrayList2.addAll(DesugarCollections.unmodifiableList(((C5468l) c12380l.f20498l).m1790volatile()));
        }
        while (i < ((C5468l) c12380l.f20498l).advert()) {
            C17399l c17399l = (C17399l) ((C5468l) c12380l.f20498l).isVip(i).firebase();
            if (c17399l.admob().isEmpty()) {
                C17417l.admob(c8118l);
                c8118l.f16910l.yandex("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strAdmob = c17399l.admob();
                arrayList = arrayList2;
                String strMetrica = AbstractC2632l.metrica(c17399l.admob(), AbstractC7572l.loadAd, AbstractC7572l.mopub);
                if (!TextUtils.isEmpty(strMetrica)) {
                    c17399l.loadAd();
                    ((C6862l) c17399l.f20498l).signatures(strMetrica);
                    c12380l.loadAd();
                    ((C5468l) c12380l.f20498l).m1783extends(i, (C6862l) c17399l.amazon());
                }
                if (((C6862l) c17399l.f20498l).Signature() && ((C6862l) c17399l.f20498l).license()) {
                    c11154l.put(strAdmob, Boolean.TRUE);
                }
                if (((C6862l) c17399l.f20498l).pro() && ((C6862l) c17399l.f20498l).ad()) {
                    c11154l2.put(c17399l.admob(), Boolean.TRUE);
                }
                if (((C6862l) c17399l.f20498l).advert()) {
                    if (((C6862l) c17399l.f20498l).isVip() < 2 || ((C6862l) c17399l.f20498l).isVip() > 65535) {
                        C17417l.admob(c8118l);
                        c8118l.f16910l.crashlytics(c17399l.admob(), Integer.valueOf(((C6862l) c17399l.f20498l).isVip()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c11154l3.put(c17399l.admob(), Integer.valueOf(((C6862l) c17399l.f20498l).isVip()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f17214l.put(str, hashSet);
        if (c17417l.f33945l.m1682l(null, c3032l)) {
            this.f17213l.put(str, arrayList3);
        }
        this.f17206l.put(str, c11154l);
        this.f17207l.put(str, c11154l2);
        this.f17215l.put(str, c11154l3);
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final C5468l m2312l(String str, byte[] bArr) {
        C17417l c17417l = (C17417l) this.f833l;
        if (bArr == null) {
            return C5468l.m1782private();
        }
        try {
            C5468l c5468l = (C5468l) ((C12380l) C13718l.m3698l(C5468l.m1781native(), bArr)).amazon();
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.crashlytics(c5468l.tapsense() ? Long.valueOf(c5468l.Signature()) : null, c5468l.license() ? c5468l.pro() : null, "Parsed config. version, gmp_app_id");
            return c5468l;
        } catch (RuntimeException e) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16910l.crashlytics(C8118l.m2260l(str), e, "Unable to merge remote config. appId");
            return C5468l.m1782private();
        } catch (C9893l e2) {
            C8118l c8118l3 = c17417l.f33950l;
            C17417l.admob(c8118l3);
            c8118l3.f16910l.crashlytics(C8118l.m2260l(str), e2, "Unable to merge remote config. appId");
            return C5468l.m1782private();
        }
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public final String m2313l(String str) {
        mo211l();
        m2307l(str);
        return (String) this.f17216l.get(str);
    }

    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters */
    public final void m2314l(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        C12380l c12380l;
        byte[] bArrYandex;
        Iterator it;
        int i;
        boolean z;
        m2927l();
        mo211l();
        AbstractC1051l.billing(str);
        C12380l c12380l2 = (C12380l) m2312l(str, bArr).firebase();
        m2311l(str, c12380l2);
        m2303l(str, (C5468l) c12380l2.amazon());
        C5468l c5468l = (C5468l) c12380l2.amazon();
        C11154l c11154l = this.f17209l;
        c11154l.put(str, c5468l);
        this.f17216l.put(str, ((C5468l) c12380l2.f20498l).inmobi());
        this.f17210l.put(str, str2);
        this.f17208l.put(str, str3);
        this.f17211l.put(str, m2300l((C5468l) c12380l2.amazon()));
        C6901l c6901l = this.f13233l;
        C8648l c8648l = c6901l.f14451l;
        C6901l.m2082case(c8648l);
        ArrayList<C11330l> arrayList = new ArrayList(DesugarCollections.unmodifiableList(((C5468l) c12380l2.f20498l).signatures()));
        C17417l c17417l = (C17417l) c8648l.f833l;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            C18375l c18375l = (C18375l) ((C11330l) arrayList.get(i2)).firebase();
            C11154l c11154l2 = c11154l;
            if (((C11330l) c18375l.f20498l).isVip() != 0) {
                int i3 = 0;
                while (i3 < ((C11330l) c18375l.f20498l).isVip()) {
                    C6122l c6122l = (C6122l) ((C11330l) c18375l.f20498l).signatures(i3).firebase();
                    C6122l c6122l2 = (C6122l) c6122l.clone();
                    C6901l c6901l2 = c6901l;
                    C12380l c12380l3 = c12380l2;
                    String strMetrica = AbstractC2632l.metrica(((C9540l) c6122l.f20498l).license(), AbstractC7572l.loadAd, AbstractC7572l.mopub);
                    if (strMetrica != null) {
                        c6122l2.loadAd();
                        ((C9540l) c6122l2.f20498l).m2680package(strMetrica);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < ((C9540l) c6122l.f20498l).ad()) {
                        C3153l c3153lAdvert = ((C9540l) c6122l.f20498l).advert(i4);
                        boolean z2 = z;
                        C6122l c6122l3 = c6122l;
                        String strMetrica2 = AbstractC2632l.metrica(c3153lAdvert.signatures(), AbstractC6873l.loadAd, AbstractC6873l.crashlytics);
                        if (strMetrica2 != null) {
                            C13644l c13644l = (C13644l) c3153lAdvert.firebase();
                            c13644l.loadAd();
                            ((C3153l) c13644l.f20498l).applovin(strMetrica2);
                            C3153l c3153l = (C3153l) c13644l.amazon();
                            c6122l2.loadAd();
                            ((C9540l) c6122l2.f20498l).m2681synchronized(i4, c3153l);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i4++;
                        c6122l = c6122l3;
                    }
                    if (z) {
                        c18375l.loadAd();
                        ((C11330l) c18375l.f20498l).applovin(i3, (C9540l) c6122l2.amazon());
                        arrayList.set(i2, (C11330l) c18375l.amazon());
                    }
                    i3++;
                    c6901l = c6901l2;
                    c12380l2 = c12380l3;
                }
            }
            C12380l c12380l4 = c12380l2;
            C6901l c6901l3 = c6901l;
            if (((C11330l) c18375l.f20498l).pro() != 0) {
                for (int i5 = 0; i5 < ((C11330l) c18375l.f20498l).pro(); i5++) {
                    C16493l c16493lAd = ((C11330l) c18375l.f20498l).ad(i5);
                    String strMetrica3 = AbstractC2632l.metrica(c16493lAd.license(), AbstractC8020l.purchase, AbstractC8020l.billing);
                    if (strMetrica3 != null) {
                        C14364l c14364l = (C14364l) c16493lAd.firebase();
                        c14364l.loadAd();
                        ((C16493l) c14364l.f20498l).applovin(strMetrica3);
                        c18375l.loadAd();
                        ((C11330l) c18375l.f20498l).premium(i5, (C16493l) c14364l.amazon());
                        arrayList.set(i2, (C11330l) c18375l.amazon());
                    }
                }
            }
            i2++;
            c11154l = c11154l2;
            c6901l = c6901l3;
            c12380l2 = c12380l4;
        }
        C12380l c12380l5 = c12380l2;
        C11154l c11154l3 = c11154l;
        C6901l c6901l4 = c6901l;
        c8648l.m2927l();
        c8648l.mo211l();
        AbstractC1051l.billing(str);
        SQLiteDatabase sQLiteDatabaseM2395l = c8648l.m2395l();
        sQLiteDatabaseM2395l.beginTransaction();
        try {
            c8648l.m2927l();
            c8648l.mo211l();
            AbstractC1051l.billing(str);
            SQLiteDatabase sQLiteDatabaseM2395l2 = c8648l.m2395l();
            sQLiteDatabaseM2395l2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM2395l2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C11330l c11330l = (C11330l) it2.next();
                c8648l.m2927l();
                c8648l.mo211l();
                AbstractC1051l.billing(str);
                AbstractC1051l.subs(c11330l);
                if (c11330l.tapsense()) {
                    int iSignature = c11330l.Signature();
                    Iterator it3 = c11330l.advert().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((C9540l) it3.next()).tapsense()) {
                                C8118l c8118l = c17417l.f33950l;
                                C17417l.admob(c8118l);
                                c8118l.f16910l.crashlytics(C8118l.m2260l(str), Integer.valueOf(iSignature), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                break;
                            }
                        } else {
                            Iterator it4 = c11330l.license().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = c11330l.advert().iterator();
                                    while (true) {
                                        C11330l c11330l2 = c11330l;
                                        String str4 = "audience_id";
                                        sQLiteDatabase = sQLiteDatabaseM2395l;
                                        String str5 = "app_id";
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            i = iSignature;
                                            for (C16493l c16493l : c11330l2.license()) {
                                                c8648l.m2927l();
                                                c8648l.mo211l();
                                                AbstractC1051l.billing(str);
                                                AbstractC1051l.subs(c16493l);
                                                if (c16493l.license().isEmpty()) {
                                                    C8118l c8118l2 = c17417l.f33950l;
                                                    C17417l.admob(c8118l2);
                                                    c8118l2.f16910l.amazon("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C8118l.m2260l(str), Integer.valueOf(i), String.valueOf(c16493l.tapsense() ? Integer.valueOf(c16493l.Signature()) : null));
                                                } else {
                                                    byte[] bArrYandex2 = c16493l.yandex();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put(str4, Integer.valueOf(i));
                                                    contentValues.put("filter_id", c16493l.tapsense() ? Integer.valueOf(c16493l.Signature()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", c16493l.license());
                                                    contentValues.put("session_scoped", c16493l.isVip() ? Boolean.valueOf(c16493l.signatures()) : null);
                                                    contentValues.put("data", bArrYandex2);
                                                    try {
                                                        if (c8648l.m2395l().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            C8118l c8118l3 = c17417l.f33950l;
                                                            C17417l.admob(c8118l3);
                                                            c8118l3.f16908l.loadAd(C8118l.m2260l(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        C8118l c8118l4 = c17417l.f33950l;
                                                        C17417l.admob(c8118l4);
                                                        c8118l4.f16908l.crashlytics(C8118l.m2260l(str), e, "Error storing property filter. appId");
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            C9540l c9540l = (C9540l) it5.next();
                                            c8648l.m2927l();
                                            c8648l.mo211l();
                                            AbstractC1051l.billing(str);
                                            AbstractC1051l.subs(c9540l);
                                            if (c9540l.license().isEmpty()) {
                                                C8118l c8118l5 = c17417l.f33950l;
                                                C17417l.admob(c8118l5);
                                                c8118l5.f16910l.amazon("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C8118l.m2260l(str), Integer.valueOf(iSignature), String.valueOf(c9540l.tapsense() ? Integer.valueOf(c9540l.Signature()) : null));
                                                it = it2;
                                                i = iSignature;
                                            } else {
                                                it = it2;
                                                byte[] bArrYandex3 = c9540l.yandex();
                                                i = iSignature;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(i));
                                                contentValues2.put("filter_id", c9540l.tapsense() ? Integer.valueOf(c9540l.Signature()) : null);
                                                contentValues2.put("event_name", c9540l.license());
                                                contentValues2.put("session_scoped", c9540l.appmetrica() ? Boolean.valueOf(c9540l.inmobi()) : null);
                                                contentValues2.put("data", bArrYandex3);
                                                try {
                                                    if (c8648l.m2395l().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        C8118l c8118l6 = c17417l.f33950l;
                                                        C17417l.admob(c8118l6);
                                                        c8118l6.f16908l.loadAd(C8118l.m2260l(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    c11330l = c11330l2;
                                                    sQLiteDatabaseM2395l = sQLiteDatabase;
                                                    it2 = it;
                                                    iSignature = i;
                                                } catch (SQLiteException e2) {
                                                    C8118l c8118l7 = c17417l.f33950l;
                                                    C17417l.admob(c8118l7);
                                                    c8118l7.f16908l.crashlytics(C8118l.m2260l(str), e2, "Error storing event filter. appId");
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        c8648l.m2927l();
                                        c8648l.mo211l();
                                        AbstractC1051l.billing(str);
                                        SQLiteDatabase sQLiteDatabaseM2395l3 = c8648l.m2395l();
                                        sQLiteDatabaseM2395l3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        sQLiteDatabaseM2395l3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        break;
                                    }
                                    sQLiteDatabaseM2395l = sQLiteDatabase;
                                    it2 = it;
                                    break;
                                }
                                if (!((C16493l) it4.next()).tapsense()) {
                                    C8118l c8118l8 = c17417l.f33950l;
                                    C17417l.admob(c8118l8);
                                    c8118l8.f16910l.crashlytics(C8118l.m2260l(str), Integer.valueOf(iSignature), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    C8118l c8118l9 = c17417l.f33950l;
                    C17417l.admob(c8118l9);
                    c8118l9.f16910l.loadAd(C8118l.m2260l(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = sQLiteDatabaseM2395l;
            ArrayList arrayList2 = new ArrayList();
            for (C11330l c11330l3 : arrayList) {
                arrayList2.add(c11330l3.tapsense() ? Integer.valueOf(c11330l3.Signature()) : null);
            }
            AbstractC1051l.billing(str);
            c8648l.m2927l();
            c8648l.mo211l();
            SQLiteDatabase sQLiteDatabaseM2395l4 = c8648l.m2395l();
            try {
                long jM2386l = c8648l.m2386l("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, c17417l.f33945l.m1683l(str, AbstractC5981l.f12646interface)));
                if (jM2386l > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseM2395l4.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i6);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i6++;
                    }
                }
            } catch (SQLiteException e3) {
                C8118l c8118l10 = c17417l.f33950l;
                C17417l.admob(c8118l10);
                c8118l10.f16908l.crashlytics(C8118l.m2260l(str), e3, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                c12380l5.loadAd();
                c12380l = c12380l5;
                try {
                    ((C5468l) c12380l.f20498l).m1784for();
                    bArrYandex = ((C5468l) c12380l.amazon()).yandex();
                } catch (RuntimeException e4) {
                    e = e4;
                    C8118l c8118l11 = ((C17417l) this.f833l).f33950l;
                    C17417l.admob(c8118l11);
                    c8118l11.f16910l.crashlytics(C8118l.m2260l(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrYandex = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                c12380l = c12380l5;
            }
            C8648l c8648l2 = c6901l4.f14451l;
            C6901l.m2082case(c8648l2);
            C17417l c17417l2 = (C17417l) c8648l2.f833l;
            AbstractC1051l.billing(str);
            c8648l2.mo211l();
            c8648l2.m2927l();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrYandex);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (c8648l2.m2395l().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    C8118l c8118l12 = c17417l2.f33950l;
                    C17417l.admob(c8118l12);
                    c8118l12.f16908l.loadAd(C8118l.m2260l(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                C8118l c8118l13 = c17417l2.f33950l;
                C17417l.admob(c8118l13);
                c8118l13.f16908l.crashlytics(C8118l.m2260l(str), e6, "Error storing remote config. appId");
            }
            c12380l.loadAd();
            ((C5468l) c12380l.f20498l).m1788throw();
            c11154l3.put(str, (C5468l) c12380l.amazon());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseM2395l;
        }
    }

    /* JADX INFO: renamed from: lٖٓۧ, reason: contains not printable characters */
    public final int m2315l(String str, String str2) {
        Integer num;
        mo211l();
        m2307l(str);
        Map map = (Map) this.f17215l.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: lٖؐۜ, reason: contains not printable characters */
    public final C15651l m2316l(String str) {
        mo211l();
        m2307l(str);
        C5468l c5468lM2309l = m2309l(str);
        if (c5468lM2309l == null || !c5468lM2309l.m1789throws()) {
            return null;
        }
        return c5468lM2309l.m1785package();
    }

    /* JADX INFO: renamed from: l٘ؓۘ, reason: contains not printable characters */
    public final boolean m2317l(String str, EnumC3170l enumC3170l) {
        mo211l();
        m2307l(str);
        C15651l c15651lM2316l = m2316l(str);
        if (c15651lM2316l == null) {
            return false;
        }
        for (C14452l c14452l : c15651lM2316l.tapsense()) {
            if (enumC3170l == m2301l(c14452l.tapsense())) {
                return c14452l.Signature() == 2;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters */
    public final boolean m2318l(String str, String str2) {
        Boolean bool;
        mo211l();
        m2307l(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f17207l.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.AbstractC10491l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final void mo1780l() {
    }
}

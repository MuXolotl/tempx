package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: lًٌٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8648l extends AbstractC10491l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C13978l f17819l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C3253l f17820l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final String[] f17809l = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final String[] f17810l = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final String[] f17816l = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final String[] f17813l = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final String[] f17817l = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final String[] f17815l = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final String[] f17808l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final String[] f17818l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final String[] f17814l = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final String[] f17811l = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final String[] f17812l = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public C8648l(C6901l c6901l) {
        super(c6901l);
        this.f17820l = new C3253l(((C17417l) this.f833l).f33951l);
        ((C17417l) this.f833l).getClass();
        this.f17819l = new C13978l(this, ((C17417l) this.f833l).f33936l);
    }

    /* JADX INFO: renamed from: lؑۙٙ, reason: contains not printable characters */
    public static final void m2338l(ContentValues contentValues, Object obj) {
        AbstractC1051l.billing("value");
        AbstractC1051l.subs(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            C8339l.metrica("Invalid value type");
        }
    }

    /* JADX INFO: renamed from: lؓٞؐ, reason: contains not printable characters */
    public static final String m2339l(List list) {
        return list.isEmpty() ? "" : AbstractC15560l.Signature(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    /* JADX INFO: renamed from: lًؑؔ, reason: contains not printable characters */
    public final C10559l m2340l(String str) {
        AbstractC1051l.subs(str);
        mo211l();
        m2927l();
        return C10559l.crashlytics(100, m2385l("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX INFO: renamed from: lَؑۢ, reason: contains not printable characters */
    public final boolean m2341l(C17509l c17509l) {
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        m2927l();
        String str = c17509l.f34116l;
        AbstractC1051l.subs(str);
        if (m2354l(str, c17509l.f34112l.f14441l) == null) {
            long jM2386l = m2386l("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            c17417l.getClass();
            if (jM2386l >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c17509l.f34115l);
        contentValues.put("name", c17509l.f34112l.f14441l);
        Object objBilling = c17509l.f34112l.billing();
        AbstractC1051l.subs(objBilling);
        m2338l(contentValues, objBilling);
        contentValues.put("active", Boolean.valueOf(c17509l.f34118l));
        contentValues.put("trigger_event_name", c17509l.f34121l);
        contentValues.put("trigger_timeout", Long.valueOf(c17509l.f34114l));
        C13236l c13236l = c17509l.f34113l;
        C17410l c17410l = c17417l.f33949l;
        C8118l c8118l = c17417l.f33950l;
        C17417l.billing(c17410l);
        contentValues.put("timed_out_event", C17410l.m4335l(c13236l));
        contentValues.put("creation_timestamp", Long.valueOf(c17509l.f34119l));
        C17417l.billing(c17410l);
        contentValues.put("triggered_event", C17410l.m4335l(c17509l.f34120l));
        contentValues.put("triggered_timestamp", Long.valueOf(c17509l.f34112l.f14439l));
        contentValues.put("time_to_live", Long.valueOf(c17509l.f34117l));
        contentValues.put("expired_event", C17410l.m4335l(c17509l.f34122l));
        try {
            if (m2395l().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(C8118l.m2260l(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            C17417l.admob(c8118l);
            c8118l.f16908l.crashlytics(C8118l.m2260l(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0407  */
    /* JADX INFO: renamed from: lؑۚۜ, reason: contains not printable characters */
    public final C4729l m2342l(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.billing(str);
        mo211l();
        m2927l();
        Cursor cursor = null;
        try {
            cursorQuery = m2395l().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        C6901l c6901l = this.f13233l;
                        C4729l c4729l = new C4729l(c6901l.f14473l, str);
                        C17417l c17417l2 = c4729l.yandex;
                        C10559l c10559lYandex = c6901l.yandex(str);
                        EnumC3170l enumC3170l = EnumC3170l.ANALYTICS_STORAGE;
                        if (c10559lYandex.subs(enumC3170l)) {
                            c4729l.m1592package(cursorQuery.getString(0));
                        }
                        boolean z = true;
                        c4729l.m1594strictfp(cursorQuery.getString(1));
                        if (c6901l.yandex(str).subs(EnumC3170l.AD_STORAGE)) {
                            c4729l.m1599volatile(cursorQuery.getString(2));
                        }
                        c4729l.purchase(cursorQuery.getLong(3));
                        c4729l.m1589extends(cursorQuery.getLong(4));
                        c4729l.m1590for(cursorQuery.getLong(5));
                        c4729l.m1586catch(cursorQuery.getString(6));
                        c4729l.m1595switch(cursorQuery.getString(7));
                        c4729l.m1587continue(cursorQuery.getLong(8));
                        c4729l.yandex(cursorQuery.getLong(9));
                        c4729l.amazon(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        c4729l.subs(cursorQuery.getLong(11));
                        c4729l.isPro(cursorQuery.getLong(12));
                        c4729l.firebase(cursorQuery.getLong(13));
                        c4729l.smaato(cursorQuery.getLong(14));
                        c4729l.billing(cursorQuery.getLong(15));
                        c4729l.mopub(cursorQuery.getLong(16));
                        c4729l.m1585case(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        c4729l.m1593private(cursorQuery.getString(18));
                        c4729l.vip(cursorQuery.getLong(19));
                        c4729l.remoteconfig(cursorQuery.getLong(20));
                        c4729l.pro(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        C17923l c17923l = c17417l2.f33929l;
                        C17417l.admob(c17923l);
                        c17923l.mo211l();
                        c4729l.f9739case |= c4729l.startapp != z2;
                        c4729l.startapp = z2;
                        c4729l.crashlytics(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            c4729l.advert(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (c6901l.yandex(str).subs(enumC3170l)) {
                            String string2 = cursorQuery.getString(28);
                            C17923l c17923l2 = c17417l2.f33929l;
                            C17417l.admob(c17923l2);
                            c17923l2.mo211l();
                            c4729l.f9739case |= !Objects.equals(c4729l.tapsense, string2);
                            c4729l.tapsense = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        C17923l c17923l3 = c17417l2.f33929l;
                        C17417l.admob(c17923l3);
                        c17923l3.mo211l();
                        c4729l.f9739case |= c4729l.Signature != z3;
                        c4729l.Signature = z3;
                        c4729l.ads(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        C17923l c17923l4 = c17417l2.f33929l;
                        C17417l.admob(c17923l4);
                        c17923l4.mo211l();
                        c4729l.f9739case |= c4729l.applovin != string3;
                        c4729l.applovin = string3;
                        c4729l.signatures(cursorQuery.getLong(30));
                        c4729l.premium(cursorQuery.getLong(31));
                        C2156l.yandex();
                        if (c17417l.f33945l.m1682l(str, AbstractC5981l.f12681l)) {
                            int i = cursorQuery.getInt(32);
                            C17923l c17923l5 = c17417l2.f33929l;
                            C17417l.admob(c17923l5);
                            c17923l5.mo211l();
                            c4729l.f9739case |= c4729l.ad != i;
                            c4729l.ad = i;
                            c4729l.applovin(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        C17923l c17923l6 = c17417l2.f33929l;
                        C17417l.admob(c17923l6);
                        c17923l6.mo211l();
                        c4729l.f9739case |= c4729l.advert != z4;
                        c4729l.advert = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        C17923l c17923l7 = c17417l2.f33929l;
                        C17417l.admob(c17923l7);
                        c17923l7.mo211l();
                        c4729l.f9739case |= !Objects.equals(c4729l.adcel, boolValueOf);
                        c4729l.adcel = boolValueOf;
                        c4729l.startapp(cursorQuery.getInt(37));
                        c4729l.adcel(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            AbstractC1051l.subs(string);
                        }
                        C17923l c17923l8 = c17417l2.f33929l;
                        C17417l.admob(c17923l8);
                        c17923l8.mo211l();
                        c4729l.f9739case |= c4729l.f9746package != string;
                        c4729l.f9746package = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            C17923l c17923l9 = c17417l2.f33929l;
                            C17417l.admob(c17923l9);
                            c17923l9.mo211l();
                            c4729l.f9739case |= !Objects.equals(c4729l.isVip, lValueOf);
                            c4729l.isVip = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            C17923l c17923l10 = c17417l2.f33929l;
                            C17417l.admob(c17923l10);
                            c17923l10.mo211l();
                            c4729l.f9739case |= !Objects.equals(c4729l.signatures, lValueOf2);
                            c4729l.signatures = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        C17923l c17923l11 = c17417l2.f33929l;
                        C17417l.admob(c17923l11);
                        c17923l11.mo211l();
                        c4729l.f9739case |= c4729l.f9750synchronized != blob;
                        c4729l.f9750synchronized = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i2 = cursorQuery.getInt(44);
                            C17923l c17923l12 = c17417l2.f33929l;
                            C17417l.admob(c17923l12);
                            c17923l12.mo211l();
                            boolean z5 = c4729l.f9739case;
                            if (c4729l.f9748strictfp == i2) {
                                z = false;
                            }
                            c4729l.f9739case = z | z5;
                            c4729l.f9748strictfp = i2;
                        }
                        if (c17417l.f33945l.m1682l(str, AbstractC5981l.f12654l) && !cursorQuery.isNull(45)) {
                            c4729l.Signature(cursorQuery.getLong(45));
                        }
                        C17923l c17923l13 = c17417l2.f33929l;
                        C17417l.admob(c17923l13);
                        c17923l13.mo211l();
                        c4729l.f9739case = false;
                        if (cursorQuery.moveToNext()) {
                            C8118l c8118l = c17417l.f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16908l.loadAd(C8118l.m2260l(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return c4729l;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.crashlytics(C8118l.m2260l(str), e, "Error querying app. appId");
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x00fd->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX INFO: renamed from: lؒۡۦ, reason: contains not printable characters */
    public final void m2343l(String str, Long l, String str2, Bundle bundle) throws Throwable {
        C8118l c8118l;
        Bundle bundle2;
        long j;
        String str3;
        ContentValues contentValues;
        C8118l c8118l2;
        C9030l c9030l;
        Iterator it;
        C8648l c8648l = this;
        String str4 = str;
        C17417l c17417l = (C17417l) c8648l.f833l;
        AbstractC1051l.subs(bundle);
        c8648l.mo211l();
        c8648l.m2927l();
        C8043l c8043l = l != null ? new C8043l(c8648l, str4, l.longValue()) : new C8043l(c8648l, str4);
        List<C6700l> listFirebase = c8043l.firebase();
        while (!listFirebase.isEmpty()) {
            for (C6700l c6700l : listFirebase) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        C9030l c9030l2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = c8648l.m2395l().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(c6700l.loadAd)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                c9030l = (C9030l) ((C9134l) C13718l.m3698l(C9030l.m2444final(), cursorQuery.getBlob(0))).amazon();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        C8118l c8118l3 = c17417l.f33950l;
                                                        C17417l.admob(c8118l3);
                                                        c8118l3.f16910l.loadAd(C8118l.m2260l(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor = cursorQuery;
                                                    C8118l c8118l4 = c17417l.f33950l;
                                                    C17417l.admob(c8118l4);
                                                    c8118l4.f16908l.crashlytics(C8118l.m2260l(str4), e, "Data loss. Error selecting raw event. appId");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                c9030l2 = c9030l;
                                            } catch (IOException e2) {
                                                C8118l c8118l5 = c17417l.f33950l;
                                                C17417l.admob(c8118l5);
                                                c8118l5.f16908l.crashlytics(C8118l.m2260l(str4), e2, "Data loss. Failed to merge raw event metadata. appId");
                                                cursorQuery.close();
                                            }
                                            if (c9030l2 != null) {
                                                it = c9030l2.m2486l().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((C8252l) it.next()).license().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            C8118l c8118l6 = c17417l.f33950l;
                                            C17417l.admob(c8118l6);
                                            c8118l6.f16908l.loadAd(C8118l.m2260l(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursorQuery;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    c9030l = null;
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                c9030l = null;
                            }
                            if (c9030l2 != null) {
                                it = c9030l2.m2486l().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((C8252l) it.next()).license().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = m2395l().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        C17417l.admob(c8118l);
                        c8118l2 = c8118l;
                        try {
                            c8118l2.f16908l.crashlytics(C8118l.m2260l(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e5) {
                            e = e5;
                            C17417l.admob(c8118l2);
                            c8118l2.f16908l.crashlytics(C8118l.m2260l(str3), e, "Error updating raw event. appId");
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    c8118l2 = c8118l;
                }
                C6901l c6901l = c8648l.f13233l;
                C13718l c13718l = c6901l.f14452l;
                C6901l.m2082case(c13718l);
                C1841l c1841l = c6700l.amazon;
                Bundle bundle3 = new Bundle();
                for (C0420l c0420l : c1841l.license()) {
                    if (c0420l.premium()) {
                        bundle3.putDouble(c0420l.Signature(), c0420l.applovin());
                    } else if (c0420l.isVip()) {
                        bundle3.putFloat(c0420l.Signature(), c0420l.signatures());
                    } else if (c0420l.ad()) {
                        bundle3.putLong(c0420l.Signature(), c0420l.advert());
                    } else if (c0420l.license()) {
                        bundle3.putString(c0420l.Signature(), c0420l.pro());
                    } else if (c0420l.appmetrica().isEmpty()) {
                        C8118l c8118l7 = ((C17417l) c13718l.f833l).f33950l;
                        C17417l.admob(c8118l7);
                        c8118l7.f16908l.loadAd(c0420l, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(c0420l.Signature(), C13718l.m3686l(c0420l.appmetrica()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strAdvert = c1841l.advert();
                if (string == null) {
                    string = "";
                }
                C17410l c17410l = c17417l.f33949l;
                c8118l = c17417l.f33950l;
                C17417l.billing(c17410l);
                if (strAdvert.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        C6700l c6700l2 = c6700l;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        c6700l = c6700l2;
                    }
                } else {
                    bundle2 = bundle;
                }
                C6700l c6700l3 = c6700l;
                c17410l.m4375l(bundle3, bundle2);
                C6911l c6911l = new C6911l((C17417l) c8648l.f833l, string, str4, c1841l.advert(), c1841l.signatures(), c1841l.m1059strictfp(), c1841l.applovin(), bundle3);
                j = c6700l3.yandex;
                long j2 = c6700l3.loadAd;
                boolean z = c6700l3.crashlytics;
                mo211l();
                m2927l();
                str3 = c6911l.yandex;
                AbstractC1051l.billing(str3);
                C13718l c13718l2 = c6901l.f14452l;
                C6901l.m2082case(c13718l2);
                byte[] bArrYandex = c13718l2.m3717l(c6911l).yandex();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", c6911l.loadAd);
                contentValues.put("timestamp", Long.valueOf(c6911l.amazon));
                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                contentValues.put("data", bArrYandex);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(c6911l.purchase));
                c8648l = this;
                str4 = str;
            }
            listFirebase = c8043l.firebase();
            c8648l = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final String m2344l() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM2395l.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    C8118l c8118l = ((C17417l) this.f833l).f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16908l.loadAd(e, "Database error getting next bundle app id");
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r1 = sQLiteDatabaseM2395l;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: lَِؔ, reason: contains not printable characters */
    public final String m2345l() {
        ((C17417l) this.f833l).f33951l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) AbstractC5981l.f12635continue.yandex(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String strAds = AbstractC15560l.ads(((Long) AbstractC5981l.f12704switch.yandex(null)).longValue(), ")", AbstractC0653l.Signature(jCurrentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "));
        StringBuilder sb = new StringBuilder(AbstractC5020l.applovin(str.length(), 5, strAds.length(), 1));
        AbstractC9361l.appmetrica(sb, "(", str, " OR ", strAds);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    /* JADX INFO: renamed from: lؔٗٔ, reason: contains not printable characters */
    public final void m2346l(String str) throws Throwable {
        boolean z;
        C6491l c6491lM2382l;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        C6491l c6491lM2382l2 = m2382l("events", str, "_f");
        C6491l c6491lM2382l3 = m2382l("events", str, "_v");
        m2391l("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = m2395l().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (c6491lM2382l = m2382l("events_snapshot", str, string)) != null) {
                            m2388l("events", c6491lM2382l);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            C8118l c8118l = ((C17417l) this.f833l).f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16908l.crashlytics(C8118l.m2260l(str), e, "Error querying snapshot. appId");
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && c6491lM2382l2 != null) {
                                m2388l("events", c6491lM2382l2);
                            } else if (!z && c6491lM2382l3 != null) {
                                m2388l("events", c6491lM2382l3);
                            }
                            m2391l("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                m2388l("events", c6491lM2382l3);
                            }
                        } else if (!z) {
                            m2388l("events", c6491lM2382l3);
                        }
                        m2391l("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && c6491lM2382l2 != null) {
                    m2388l("events", c6491lM2382l2);
                } else if (!z && c6491lM2382l3 != null) {
                    m2388l("events", c6491lM2382l3);
                }
            } else {
                cursorQuery.close();
                if (c6491lM2382l2 != null) {
                    m2388l("events", c6491lM2382l2);
                } else if (c6491lM2382l3 != null) {
                    m2388l("events", c6491lM2382l3);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        m2391l("events_snapshot", str);
    }

    /* JADX INFO: renamed from: lؔٚؕ, reason: contains not printable characters */
    public final boolean m2347l(C3477l c3477l) {
        C17417l c17417l = (C17417l) this.f833l;
        String str = c3477l.loadAd;
        mo211l();
        m2927l();
        String str2 = c3477l.yandex;
        String str3 = c3477l.crashlytics;
        if (m2354l(str2, str3) == null) {
            if (C17410l.m4333l(str3)) {
                if (m2386l("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(c17417l.f33945l.m1683l(str2, AbstractC5981l.f12701static), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jM2386l = m2386l("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                c17417l.getClass();
                if (jM2386l >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(c3477l.amazon));
        m2338l(contentValues, c3477l.purchase);
        try {
            if (m2395l().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(C8118l.m2260l(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16908l.crashlytics(C8118l.m2260l(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX INFO: renamed from: lِؕۧ, reason: contains not printable characters */
    public final void m2348l(String str, String str2) {
        AbstractC1051l.billing(str);
        AbstractC1051l.billing(str2);
        mo211l();
        m2927l();
        try {
            m2395l().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            C17417l c17417l = (C17417l) this.f833l;
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.amazon("Error deleting conditional property", C8118l.m2260l(str), c17417l.f33942l.crashlytics(str2), e);
        }
    }

    /* JADX INFO: renamed from: lؖؓٛ, reason: contains not printable characters */
    public final void m2349l() {
        m2927l();
        m2395l().beginTransaction();
    }

    /* JADX INFO: renamed from: lؙؖٗ, reason: contains not printable characters */
    public final long m2350l(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m2395l().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                C8118l c8118l = ((C17417l) this.f833l).f33950l;
                C17417l.admob(c8118l);
                c8118l.f16908l.crashlytics(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final List m2351l(String str, C18032l c18032l, int i) {
        ?? arrayList;
        AbstractC1051l.billing(str);
        mo211l();
        m2927l();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strM2339l = m2339l(c18032l.f35317l);
            String strM2345l = m2345l();
            StringBuilder sb = new StringBuilder(strM2339l.length() + 17 + strM2345l.length());
            sb.append("app_id=?");
            sb.append(strM2339l);
            sb.append(" AND NOT ");
            sb.append(strM2345l);
            cursorQuery = sQLiteDatabaseM2395l.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                C18253l c18253lM2389l = m2389l(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (c18253lM2389l != null) {
                    arrayList.add(c18253lM2389l);
                }
            }
        } catch (SQLiteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.crashlytics(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final long m2352l(String str, C6194l c6194l, String str2, Map map, EnumC5250l enumC5250l, Long l) {
        int iDelete;
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        m2927l();
        AbstractC1051l.subs(c6194l);
        AbstractC1051l.billing(str);
        mo211l();
        m2927l();
        if (m2364l()) {
            C6901l c6901l = this.f13233l;
            long jAmazon = c6901l.f14475l.f11653l.amazon();
            C18450l c18450l = c17417l.f33951l;
            C8118l c8118l = c17417l.f33950l;
            c18450l.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jAmazon) > ((Long) AbstractC5981l.f12641for.yandex(null)).longValue()) {
                c6901l.f14475l.f11653l.purchase(jElapsedRealtime);
                mo211l();
                m2927l();
                if (m2364l() && (iDelete = m2395l().delete("upload_queue", m2345l(), new String[0])) > 0) {
                    C17417l.admob(c8118l);
                    c8118l.f16911l.loadAd(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                AbstractC1051l.billing(str);
                mo211l();
                m2927l();
                try {
                    int iM1683l = c17417l.f33945l.m1683l(str, AbstractC5981l.signatures);
                    if (iM1683l > 0) {
                        m2395l().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM1683l)});
                    }
                } catch (SQLiteException e) {
                    C17417l.admob(c8118l);
                    c8118l.f16908l.crashlytics(C8118l.m2260l(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrYandex = c6194l.yandex();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrYandex);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(enumC5250l.f11334l));
        C18450l c18450l2 = c17417l.f33951l;
        C8118l c8118l2 = c17417l.f33950l;
        c18450l2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = m2395l().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            C17417l.admob(c8118l2);
            c8118l2.f16908l.loadAd(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            C17417l.admob(c8118l2);
            c8118l2.f16908l.crashlytics(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters */
    public final boolean m2353l(String str, String str2) {
        return m2386l("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: lۣؗؖ, reason: contains not printable characters */
    public final C3477l m2354l(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.billing(str);
        AbstractC1051l.billing(str2);
        mo211l();
        m2927l();
        Cursor cursor = null;
        try {
            cursorQuery = m2395l().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objM2374l = m2374l(cursorQuery, 1);
                        if (objM2374l != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                C3477l c3477l = new C3477l(str3, cursorQuery.getString(2), str4, j, objM2374l);
                                if (cursorQuery.moveToNext()) {
                                    C8118l c8118l = c17417l.f33950l;
                                    C17417l.admob(c8118l);
                                    c8118l.f16908l.loadAd(C8118l.m2260l(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return c3477l;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        C8118l c8118l2 = c17417l.f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16908l.amazon("Error querying user property. appId", C8118l.m2260l(str3), c17417l.f33942l.crashlytics(str4), sQLiteException);
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: lُٟؗ, reason: contains not printable characters */
    public final void m2355l() {
        m2927l();
        m2395l().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: lًٍؘ, reason: contains not printable characters */
    public final C10764l m2356l(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.billing(str);
        mo211l();
        m2927l();
        String[] strArr = {str};
        C10764l c10764l = new C10764l();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
                cursorQuery = sQLiteDatabaseM2395l.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        c10764l.loadAd = cursorQuery.getLong(1);
                        c10764l.yandex = cursorQuery.getLong(2);
                        c10764l.crashlytics = cursorQuery.getLong(3);
                        c10764l.amazon = cursorQuery.getLong(4);
                        c10764l.purchase = cursorQuery.getLong(5);
                        c10764l.billing = cursorQuery.getLong(6);
                        c10764l.mopub = cursorQuery.getLong(7);
                    }
                    if (z) {
                        c10764l.loadAd += j2;
                    }
                    if (z2) {
                        c10764l.yandex += j2;
                    }
                    if (z3) {
                        c10764l.crashlytics += j2;
                    }
                    if (z4) {
                        c10764l.amazon += j2;
                    }
                    if (z5) {
                        c10764l.purchase += j2;
                    }
                    if (z6) {
                        c10764l.billing += j2;
                    }
                    if (z7) {
                        c10764l.mopub += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(c10764l.yandex));
                    contentValues.put("daily_events_count", Long.valueOf(c10764l.loadAd));
                    contentValues.put("daily_conversions_count", Long.valueOf(c10764l.crashlytics));
                    contentValues.put("daily_error_events_count", Long.valueOf(c10764l.amazon));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c10764l.purchase));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c10764l.billing));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c10764l.mopub));
                    sQLiteDatabaseM2395l.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    C8118l c8118l = c17417l.f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16910l.loadAd(C8118l.m2260l(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.crashlytics(C8118l.m2260l(str), e, "Error updating daily counts. appId");
            }
            return c10764l;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final boolean m2357l(String str) {
        EnumC5250l[] enumC5250lArr = {EnumC5250l.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC5250lArr[0].f11334l));
        String strM2339l = m2339l(arrayList);
        String strM2345l = m2345l();
        return m2386l(AbstractC9361l.advert(new StringBuilder((strM2339l.length() + 61) + strM2345l.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strM2339l, " AND NOT ", strM2345l), new String[]{str}) != 0;
    }

    /* JADX INFO: renamed from: lؙِّ, reason: contains not printable characters */
    public final List m2358l(String str, String str2, String str3) {
        AbstractC1051l.billing(str);
        mo211l();
        m2927l();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m2381l(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX INFO: renamed from: lؙ۟ٞ, reason: contains not printable characters */
    public final C10764l m2359l(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return m2356l(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final void m2360l() {
        mo211l();
        m2927l();
        if (m2364l()) {
            C6901l c6901l = this.f13233l;
            long jAmazon = c6901l.f14475l.f11658l.amazon();
            C17417l c17417l = (C17417l) this.f833l;
            c17417l.f33951l.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jAmazon) > ((Long) AbstractC5981l.f12641for.yandex(null)).longValue()) {
                c6901l.f14475l.f11658l.purchase(jElapsedRealtime);
                mo211l();
                m2927l();
                if (m2364l()) {
                    SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
                    c17417l.f33951l.getClass();
                    int iDelete = sQLiteDatabaseM2395l.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) AbstractC5981l.f12704switch.yandex(null)).longValue())});
                    if (iDelete > 0) {
                        C8118l c8118l = c17417l.f33950l;
                        C17417l.admob(c8118l);
                        c8118l.f16911l.loadAd(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [goto, lًٌٙ, lٌَۖ] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /* JADX INFO: renamed from: lؙؚؚ, reason: contains not printable characters */
    public final C10559l m2361l(String str) {
        Throwable th;
        SQLiteException e;
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.subs(str);
        mo211l();
        m2927l();
        ?? r2 = 0;
        c10559lCrashlytics = null;
        c10559lCrashlytics = null;
        C10559l c10559lCrashlytics = null;
        try {
            try {
                this = m2395l().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        c10559lCrashlytics = C10559l.crashlytics(this.getInt(1), this.getString(0));
                    } else {
                        C8118l c8118l = c17417l.f33950l;
                        C17417l.admob(c8118l);
                        c8118l.f16911l.yandex("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    C8118l c8118l2 = c17417l.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.loadAd(e, "Error querying database.");
                    if (this != 0) {
                    }
                    if (c10559lCrashlytics == null) {
                        return C10559l.crashlytics;
                    }
                    return c10559lCrashlytics;
                }
            } catch (SQLiteException e3) {
                e = e3;
                this = 0;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
            this.close();
            if (c10559lCrashlytics == null) {
                return C10559l.crashlytics;
            }
            return c10559lCrashlytics;
        } catch (Throwable th3) {
            th = th3;
            r2 = this;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: lؚٕ٘, reason: contains not printable characters */
    public final void m2362l(C9030l c9030l, boolean z) {
        mo211l();
        m2927l();
        AbstractC1051l.billing(c9030l.tapsense());
        AbstractC1051l.smaato(c9030l.m2482l());
        m2360l();
        C17417l c17417l = (C17417l) this.f833l;
        C18450l c18450l = c17417l.f33951l;
        C8118l c8118l = c17417l.f33950l;
        c18450l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM2477l = c9030l.m2477l();
        C3032l c3032l = AbstractC5981l.f12704switch;
        if (jM2477l < jCurrentTimeMillis - ((Long) c3032l.yandex(null)).longValue() || c9030l.m2477l() > ((Long) c3032l.yandex(null)).longValue() + jCurrentTimeMillis) {
            C17417l.admob(c8118l);
            c8118l.f16910l.amazon("Storing bundle outside of the max uploading time span. appId, now, timestamp", C8118l.m2260l(c9030l.tapsense()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c9030l.m2477l()));
        }
        byte[] bArrYandex = c9030l.yandex();
        try {
            C13718l c13718l = this.f13233l.f14452l;
            C6901l.m2082case(c13718l);
            byte[] bArrM3711l = c13718l.m3711l(bArrYandex);
            C17417l.admob(c8118l);
            c8118l.f16911l.loadAd(Integer.valueOf(bArrM3711l.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c9030l.tapsense());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c9030l.m2477l()));
            contentValues.put("data", bArrM3711l);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c9030l.m2552l()) {
                contentValues.put("retry_count", Integer.valueOf(c9030l.m2483l()));
            }
            try {
                if (m2395l().insert("queue", null, contentValues) == -1) {
                    C17417l.admob(c8118l);
                    c8118l.f16908l.loadAd(C8118l.m2260l(c9030l.tapsense()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                C17417l.admob(c8118l);
                c8118l.f16908l.crashlytics(C8118l.m2260l(c9030l.tapsense()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            C17417l.admob(c8118l);
            c8118l.f16908l.crashlytics(C8118l.m2260l(c9030l.tapsense()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public final void m2363l(Long l) {
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        m2927l();
        if (m2364l()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m2386l(sb.toString(), null) > 0) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16910l.yandex("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
                c17417l.f33951l.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseM2395l.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.loadAd(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: lًِۥ, reason: contains not printable characters */
    public final boolean m2364l() {
        return ((C17417l) this.f833l).f33936l.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX INFO: renamed from: lًٛۧ, reason: contains not printable characters */
    public final C6491l m2365l(String str, C1841l c1841l, String str2) {
        C6491l c6491lM2382l = m2382l("events", str, c1841l.advert());
        if (c6491lM2382l != null) {
            long j = c6491lM2382l.purchase + 1;
            long j2 = c6491lM2382l.amazon + 1;
            return new C6491l(c6491lM2382l.yandex, c6491lM2382l.loadAd, c6491lM2382l.crashlytics + 1, j2, j, c6491lM2382l.billing, c6491lM2382l.mopub, c6491lM2382l.admob, c6491lM2382l.subs, c6491lM2382l.isPro, c6491lM2382l.firebase);
        }
        C17417l c17417l = (C17417l) this.f833l;
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c8118l);
        c8118l.f16910l.crashlytics(C8118l.m2260l(str), c17417l.f33942l.yandex(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new C6491l(str, c1841l.advert(), 1L, 1L, 1L, c1841l.signatures(), 0L, null, null, null, null);
    }

    /* JADX INFO: renamed from: lًٖۘ, reason: contains not printable characters */
    public final long m2366l(String str) {
        AbstractC1051l.billing(str);
        return m2350l("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: renamed from: lًۤۨ, reason: contains not printable characters */
    public final void m2367l() {
        m2927l();
        m2395l().endTransaction();
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final void m2368l(Long l) {
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        m2927l();
        try {
            if (m2395l().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16910l.yandex("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16908l.loadAd(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX INFO: renamed from: lٌۜٔ, reason: contains not printable characters */
    public final List m2369l(String str) {
        String str2;
        SQLiteException sQLiteException;
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.billing(str);
        mo211l();
        m2927l();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                c17417l.getClass();
                cursorQuery = m2395l().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j = cursorQuery.getLong(2);
                        Object objM2374l = m2374l(cursorQuery, 3);
                        if (objM2374l == null) {
                            try {
                                C8118l c8118l = c17417l.f33950l;
                                C17417l.admob(c8118l);
                                c8118l.f16908l.loadAd(C8118l.m2260l(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                C8118l c8118l2 = c17417l.f33950l;
                                C17417l.admob(c8118l2);
                                c8118l2.f16908l.crashlytics(C8118l.m2260l(str2), sQLiteException, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new C3477l(str2, str3, string, j, objM2374l));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            C8118l c8118l3 = c17417l.f33950l;
                            C17417l.admob(c8118l3);
                            c8118l3.f16908l.crashlytics(C8118l.m2260l(str2), sQLiteException, "Error querying user properties. appId");
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public final void m2370l(ArrayList arrayList) {
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        m2927l();
        AbstractC1051l.subs(arrayList);
        if (arrayList.size() == 0) {
            C8339l.metrica("Given Integer is zero");
            return;
        }
        if (m2364l()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strAd = AbstractC9361l.ad(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (m2386l(AbstractC9361l.ad(new StringBuilder(strAd.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strAd, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16910l.yandex("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
                StringBuilder sb = new StringBuilder(strAd.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strAd);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM2395l.execSQL(sb.toString());
            } catch (SQLiteException e) {
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.loadAd(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: lَؑ۠, reason: contains not printable characters */
    public final List m2371l(String str) {
        List list;
        String string;
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        m2927l();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
            sQLiteDatabaseM2395l.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseM2395l.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                AbstractC1051l.subs(string);
                            }
                            if (string2 == null) {
                                C8118l c8118l = c17417l.f33950l;
                                C17417l.admob(c8118l);
                                c8118l.f16908l.loadAd(C8118l.m2260l(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursorQuery.getLong(2);
                                C2551l c2551lTapsense = C15549l.tapsense();
                                c2551lTapsense.loadAd();
                                ((C15549l) c2551lTapsense.f20498l).Signature(string2);
                                c2551lTapsense.loadAd();
                                ((C15549l) c2551lTapsense.f20498l).ad(j);
                                c2551lTapsense.loadAd();
                                ((C15549l) c2551lTapsense.f20498l).pro(string);
                                if (zIsEmpty) {
                                    c2551lTapsense.loadAd();
                                    ((C15549l) c2551lTapsense.f20498l).license();
                                }
                                arrayList.add((C15549l) c2551lTapsense.amazon());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseM2395l.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseM2395l.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseM2395l.setTransactionSuccessful();
                    }
                } catch (SQLiteException e) {
                    C8118l c8118l2 = c17417l.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.crashlytics(C8118l.m2260l(str), e, "Error querying or deleting diagnostic signals. appId");
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    list = arrayList;
                    cursorQuery.close();
                }
                list = arrayList;
                sQLiteDatabaseM2395l.endTransaction();
                return list;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseM2395l.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            C8118l c8118l3 = c17417l.f33950l;
            C17417l.admob(c8118l3);
            c8118l3.f16908l.crashlytics(C8118l.m2260l(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final void m2372l(long j) {
        mo211l();
        m2927l();
        try {
            if (m2395l().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    @Override // defpackage.AbstractC10491l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final void mo1780l() {
        C17417l c17417l = (C17417l) this.f833l;
        if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12677l)) {
            C17923l c17923l = c17417l.f33929l;
            C17417l.admob(c17923l);
            c17923l.m4449l(new RunnableC10799l(4, this));
        }
    }

    /* JADX INFO: renamed from: lُؙٟ, reason: contains not printable characters */
    public final void m2373l(ContentValues contentValues) {
        C17417l c17417l = (C17417l) this.f833l;
        try {
            SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16915l.loadAd(C8118l.m2260l("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseM2395l.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseM2395l.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.crashlytics(C8118l.m2260l("consent_settings"), C8118l.m2260l("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            C8118l c8118l3 = c17417l.f33950l;
            C17417l.admob(c8118l3);
            c8118l3.f16908l.amazon("Error storing into table. key", C8118l.m2260l("consent_settings"), C8118l.m2260l("app_id"), e);
        }
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public final Object m2374l(Cursor cursor, int i) {
        C17417l c17417l = (C17417l) this.f833l;
        int type = cursor.getType(i);
        if (type == 0) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16908l.loadAd(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        C8118l c8118l3 = c17417l.f33950l;
        C17417l.admob(c8118l3);
        c8118l3.f16908l.yandex("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters */
    public final long m2375l(String str) {
        long j;
        ContentValues contentValues;
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.billing(str);
        AbstractC1051l.billing("first_open_count");
        mo211l();
        m2927l();
        SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
        sQLiteDatabaseM2395l.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jM2350l = m2350l(sb.toString(), new String[]{str}, -1L);
                if (jM2350l == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM2395l.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        C8118l c8118l = c17417l.f33950l;
                        C17417l.admob(c8118l);
                        c8118l.f16908l.crashlytics(C8118l.m2260l(str), "first_open_count", "Failed to insert column (got -1). appId");
                    } else {
                        jM2350l = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jM2350l));
                            if (sQLiteDatabaseM2395l.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                C8118l c8118l2 = c17417l.f33950l;
                                C17417l.admob(c8118l2);
                                c8118l2.f16908l.crashlytics(C8118l.m2260l(str), "first_open_count", "Failed to update column (got 0). appId");
                            } else {
                                sQLiteDatabaseM2395l.setTransactionSuccessful();
                                j = jM2350l;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j2 = jM2350l;
                            C8118l c8118l3 = c17417l.f33950l;
                            C17417l.admob(c8118l3);
                            c8118l3.f16908l.amazon("Error inserting column. appId", C8118l.m2260l(str), "first_open_count", e);
                            j = j2;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jM2350l));
                    if (sQLiteDatabaseM2395l.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        C8118l c8118l4 = c17417l.f33950l;
                        C17417l.admob(c8118l4);
                        c8118l4.f16908l.crashlytics(C8118l.m2260l(str), "first_open_count", "Failed to update column (got 0). appId");
                    } else {
                        sQLiteDatabaseM2395l.setTransactionSuccessful();
                        j = jM2350l;
                    }
                }
            } finally {
                sQLiteDatabaseM2395l.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        return j;
    }

    /* JADX INFO: renamed from: lُ۟ؐ, reason: contains not printable characters */
    public final void m2376l(String str) {
        C6491l c6491lM2382l;
        m2391l("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m2395l().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (c6491lM2382l = m2382l("events", str, string)) != null) {
                            m2388l("events_snapshot", c6491lM2382l);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                C8118l c8118l = ((C17417l) this.f833l).f33950l;
                C17417l.admob(c8118l);
                c8118l.f16908l.crashlytics(C8118l.m2260l(str), e, "Error creating snapshot. appId");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:29:0x00f0 */
    /* JADX INFO: renamed from: lُۧٓ, reason: contains not printable characters */
    public final C17509l m2377l(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.billing(str);
        AbstractC1051l.billing(str2);
        mo211l();
        m2927l();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m2395l().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objM2374l = m2374l(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    C13718l c13718l = this.f13233l.f14452l;
                    C6901l.m2082case(c13718l);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<C13236l> creator = C13236l.CREATOR;
                    C13236l c13236l = (C13236l) c13718l.m3721l(blob, creator);
                    long j2 = cursorQuery.getLong(6);
                    C6901l.m2082case(c13718l);
                    C13236l c13236l2 = (C13236l) c13718l.m3721l(cursorQuery.getBlob(7), creator);
                    long j3 = cursorQuery.getLong(8);
                    long j4 = cursorQuery.getLong(9);
                    C6901l.m2082case(c13718l);
                    str3 = str2;
                    try {
                        C17509l c17509l = new C17509l(str, str4, new C6899l(j3, objM2374l, str3, str4), j2, z, string2, c13236l, j, c13236l2, j4, (C13236l) c13718l.m3721l(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            C8118l c8118l = c17417l.f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16908l.crashlytics(C8118l.m2260l(str), c17417l.f33942l.crashlytics(str3), "Got multiple records for conditional property, expected one");
                        }
                        cursorQuery.close();
                        return c17509l;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str3 = str2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        C8118l c8118l2 = c17417l.f33950l;
        C17417l.admob(c8118l2);
        c8118l2.f16908l.amazon("Error querying conditional property", C8118l.m2260l(str), c17417l.f33942l.crashlytics(str3), e);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: lُۨٓ, reason: contains not printable characters */
    public final C4816l m2378l(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.billing(str);
        mo211l();
        m2927l();
        ?? r2 = 0;
        try {
            try {
                cursorQuery = m2395l().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            C8118l c8118l = c17417l.f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16908l.loadAd(C8118l.m2260l(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            C4816l c4816l = new C4816l(blob, string, string2, 12);
                            cursorQuery.close();
                            return c4816l;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    C8118l c8118l2 = c17417l.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.crashlytics(C8118l.m2260l(str), e, "Error querying remote config. appId");
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r2 = this;
            if (r2 != 0) {
                throw th;
            }
            r2.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: lِۗۗ, reason: contains not printable characters */
    public final void m2379l(String str, String str2) {
        AbstractC1051l.billing(str);
        AbstractC1051l.billing(str2);
        mo211l();
        m2927l();
        try {
            m2395l().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            C17417l c17417l = (C17417l) this.f833l;
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.amazon("Error deleting user property. appId", C8118l.m2260l(str), c17417l.f33942l.crashlytics(str2), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX INFO: renamed from: lْؔۦ, reason: contains not printable characters */
    public final List m2380l(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        String str5;
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.billing(str);
        mo211l();
        m2927l();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            c17417l.getClass();
            C8118l c8118l = c17417l.f33950l;
            Cursor cursorQuery = m2395l().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    C17417l.admob(c8118l);
                                    c8118l.f16908l.loadAd(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                Object objM2374l = m2374l(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objM2374l == null) {
                                    try {
                                        C17417l.admob(c8118l);
                                        c8118l.f16908l.amazon("(2)Read invalid user property value, ignoring it", C8118l.m2260l(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            C8118l c8118l2 = c17417l.f33950l;
                                            C17417l.admob(c8118l2);
                                            c8118l2.f16908l.amazon("(2)Error querying user properties", C8118l.m2260l(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new C3477l(str, str5, string2, j, objM2374l));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    C8118l c8118l3 = c17417l.f33950l;
                                    C17417l.admob(c8118l3);
                                    c8118l3.f16908l.amazon("(2)Error querying user properties", C8118l.m2260l(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                C8118l c8118l4 = c17417l.f33950l;
                                C17417l.admob(c8118l4);
                                c8118l4.f16908l.amazon("(2)Error querying user properties", C8118l.m2260l(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX INFO: renamed from: lٌْۧ, reason: contains not printable characters */
    public final List m2381l(String str, String[] strArr) {
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        m2927l();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                c17417l.getClass();
                cursorQuery = m2395l().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            C8118l c8118l = c17417l.f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16908l.loadAd(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objM2374l = m2374l(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        C13718l c13718l = this.f13233l.f14452l;
                        C6901l.m2082case(c13718l);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<C13236l> creator = C13236l.CREATOR;
                        C13236l c13236l = (C13236l) c13718l.m3721l(blob, creator);
                        long j2 = cursorQuery.getLong(8);
                        C6901l.m2082case(c13718l);
                        C13236l c13236l2 = (C13236l) c13718l.m3721l(cursorQuery.getBlob(9), creator);
                        long j3 = cursorQuery.getLong(10);
                        long j4 = cursorQuery.getLong(11);
                        C6901l.m2082case(c13718l);
                        arrayList.add(new C17509l(string, string2, new C6899l(j3, objM2374l, string3, string2), j2, z, string4, c13236l, j, c13236l2, j4, (C13236l) c13718l.m3721l(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.loadAd(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX INFO: renamed from: lْۣۢ, reason: contains not printable characters */
    public final C6491l m2382l(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.billing(str2);
        AbstractC1051l.billing(str3);
        mo211l();
        m2927l();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = m2395l().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = 0;
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j4 = cursorQuery.getLong(8);
                        }
                        C6491l c6491l = new C6491l(str2, str3, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            C8118l c8118l = c17417l.f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16908l.loadAd(C8118l.m2260l(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return c6491l;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    C8118l c8118l2 = c17417l.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.amazon("Error querying events. appId", C8118l.m2260l(str2), c17417l.f33942l.yandex(str3), e);
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r3 = arrayList;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: lٖٓۧ, reason: contains not printable characters */
    public final void m2383l(String str, Long l, long j, C1841l c1841l) {
        mo211l();
        m2927l();
        AbstractC1051l.subs(c1841l);
        AbstractC1051l.billing(str);
        C17417l c17417l = (C17417l) this.f833l;
        byte[] bArrYandex = c1841l.yandex();
        C8118l c8118l = c17417l.f33950l;
        C8118l c8118l2 = c17417l.f33950l;
        C17417l.admob(c8118l);
        c8118l.f16911l.crashlytics(c17417l.f33942l.yandex(str), Integer.valueOf(bArrYandex.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrYandex);
        try {
            if (m2395l().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                C17417l.admob(c8118l2);
                c8118l2.f16908l.loadAd(C8118l.m2260l(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            C17417l.admob(c8118l2);
            c8118l2.f16908l.crashlytics(C8118l.m2260l(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX INFO: renamed from: lٓۨۜ, reason: contains not printable characters */
    public final void m2384l(String str, C10559l c10559l) {
        AbstractC1051l.subs(str);
        mo211l();
        m2927l();
        m2392l(str, m2361l(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c10559l.mopub());
        m2373l(contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX INFO: renamed from: lٕٖؒ, reason: contains not printable characters */
    public final String m2385l(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m2395l().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                C8118l c8118l = ((C17417l) this.f833l).f33950l;
                C17417l.admob(c8118l);
                c8118l.f16908l.crashlytics(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: lٖؐۜ, reason: contains not printable characters */
    public final long m2386l(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m2395l().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                C8118l c8118l = ((C17417l) this.f833l).f33950l;
                C17417l.admob(c8118l);
                c8118l.f16908l.crashlytics(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: lْٖۜ, reason: contains not printable characters */
    public final void m2387l(C4729l c4729l, boolean z) {
        C17417l c17417l = (C17417l) this.f833l;
        C17417l c17417l2 = c4729l.yandex;
        mo211l();
        m2927l();
        String strInmobi = c4729l.inmobi();
        AbstractC1051l.subs(strInmobi);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strInmobi);
        EnumC3170l enumC3170l = EnumC3170l.ANALYTICS_STORAGE;
        C6901l c6901l = this.f13233l;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (c6901l.yandex(strInmobi).subs(enumC3170l)) {
            contentValues.put("app_instance_id", c4729l.m1598throws());
        }
        contentValues.put("gmp_app_id", c4729l.m1596synchronized());
        if (c6901l.yandex(strInmobi).subs(EnumC3170l.AD_STORAGE)) {
            C17923l c17923l = c17417l2.f33929l;
            C17417l.admob(c17923l);
            c17923l.mo211l();
            contentValues.put("resettable_device_id_hash", c4729l.purchase);
        }
        C17923l c17923l2 = c17417l2.f33929l;
        C17417l.admob(c17923l2);
        c17923l2.mo211l();
        contentValues.put("last_bundle_index", Long.valueOf(c4729l.mopub));
        C17923l c17923l3 = c17417l2.f33929l;
        C17417l.admob(c17923l3);
        c17923l3.mo211l();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c4729l.admob));
        C17923l c17923l4 = c17417l2.f33929l;
        C17417l.admob(c17923l4);
        c17923l4.mo211l();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c4729l.subs));
        contentValues.put("app_version", c4729l.m1597throw());
        C17923l c17923l5 = c17417l2.f33929l;
        C17417l.admob(c17923l5);
        c17923l5.mo211l();
        contentValues.put("app_store", c4729l.smaato);
        C17923l c17923l6 = c17417l2.f33929l;
        C17417l.admob(c17923l6);
        c17923l6.mo211l();
        contentValues.put("gmp_version", Long.valueOf(c4729l.remoteconfig));
        C17923l c17923l7 = c17417l2.f33929l;
        C17417l.admob(c17923l7);
        c17923l7.mo211l();
        contentValues.put("dev_cert_hash", Long.valueOf(c4729l.vip));
        C17923l c17923l8 = c17417l2.f33929l;
        C17417l.admob(c17923l8);
        c17923l8.mo211l();
        contentValues.put("measurement_enabled", Boolean.valueOf(c4729l.metrica));
        C17923l c17923l9 = c17417l2.f33929l;
        C17923l c17923l10 = c17417l2.f33929l;
        C17417l.admob(c17923l9);
        c17923l9.mo211l();
        contentValues.put("day", Long.valueOf(c4729l.f9745native));
        C17417l.admob(c17923l10);
        c17923l10.mo211l();
        contentValues.put("daily_public_events_count", Long.valueOf(c4729l.f9747private));
        C17417l.admob(c17923l10);
        c17923l10.mo211l();
        contentValues.put("daily_events_count", Long.valueOf(c4729l.f9743extends));
        C17417l.admob(c17923l10);
        c17923l10.mo211l();
        contentValues.put("daily_conversions_count", Long.valueOf(c4729l.f9744for));
        C17923l c17923l11 = c17417l2.f33929l;
        C17417l.admob(c17923l11);
        c17923l11.mo211l();
        contentValues.put("config_fetched_time", Long.valueOf(c4729l.f9749switch));
        C17923l c17923l12 = c17417l2.f33929l;
        C17417l.admob(c17923l12);
        c17923l12.mo211l();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c4729l.f9741continue));
        contentValues.put("app_version_int", Long.valueOf(c4729l.m1588else()));
        contentValues.put("firebase_instance_id", c4729l.m1591native());
        C17417l.admob(c17923l10);
        c17923l10.mo211l();
        contentValues.put("daily_error_events_count", Long.valueOf(c4729l.f9751throw));
        C17417l.admob(c17923l10);
        c17923l10.mo211l();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c4729l.f9740catch));
        C17417l.admob(c17923l10);
        c17923l10.mo211l();
        contentValues.put("health_monitor_sample", c4729l.f9742else);
        contentValues.put("android_id", (Long) 0L);
        C17923l c17923l13 = c17417l2.f33929l;
        C17417l.admob(c17923l13);
        c17923l13.mo211l();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c4729l.startapp));
        contentValues.put("dynamite_version", Long.valueOf(c4729l.loadAd()));
        if (c6901l.yandex(strInmobi).subs(enumC3170l)) {
            C17923l c17923l14 = c17417l2.f33929l;
            C17417l.admob(c17923l14);
            c17923l14.mo211l();
            contentValues.put("session_stitching_token", c4729l.tapsense);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c4729l.isVip()));
        C17923l c17923l15 = c17417l2.f33929l;
        C17417l.admob(c17923l15);
        c17923l15.mo211l();
        contentValues.put("target_os_version", Long.valueOf(c4729l.license));
        C17923l c17923l16 = c17417l2.f33929l;
        C17417l.admob(c17923l16);
        c17923l16.mo211l();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c4729l.pro));
        C2156l.yandex();
        C5051l c5051l = c17417l.f33945l;
        C8118l c8118l = c17417l.f33950l;
        if (c5051l.m1682l(strInmobi, AbstractC5981l.f12681l)) {
            C17923l c17923l17 = c17417l2.f33929l;
            C17417l.admob(c17923l17);
            c17923l17.mo211l();
            contentValues.put("ad_services_version", Integer.valueOf(c4729l.ad));
            C17923l c17923l18 = c17417l2.f33929l;
            C17417l.admob(c17923l18);
            c17923l18.mo211l();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c4729l.premium));
        }
        C17923l c17923l19 = c17417l2.f33929l;
        C17417l.admob(c17923l19);
        c17923l19.mo211l();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c4729l.advert));
        contentValues.put("npa_metadata_value", c4729l.ad());
        C17923l c17923l20 = c17417l2.f33929l;
        C17417l.admob(c17923l20);
        c17923l20.mo211l();
        contentValues.put("bundle_delivery_index", Long.valueOf(c4729l.f9752throws));
        contentValues.put("sgtm_preview_key", c4729l.appmetrica());
        C17417l.admob(c17923l10);
        c17923l10.mo211l();
        contentValues.put("dma_consent_state", Integer.valueOf(c4729l.appmetrica));
        C17417l.admob(c17923l10);
        c17923l10.mo211l();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c4729l.inmobi));
        contentValues.put("serialized_npa_metadata", c4729l.subscription());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c4729l.tapsense()));
        C17923l c17923l21 = c17417l2.f33929l;
        C17417l.admob(c17923l21);
        c17923l21.mo211l();
        ArrayList arrayList = c4729l.subscription;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                C17417l.admob(c8118l);
                c8118l.f16910l.loadAd(strInmobi, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (c5051l.m1682l(null, AbstractC5981l.f12655l) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C17923l c17923l22 = c17417l2.f33929l;
        C17417l.admob(c17923l22);
        c17923l22.mo211l();
        contentValues.put("unmatched_pfo", c4729l.isVip);
        C17923l c17923l23 = c17417l2.f33929l;
        C17417l.admob(c17923l23);
        c17923l23.mo211l();
        contentValues.put("unmatched_uwa", c4729l.signatures);
        C17923l c17923l24 = c17417l2.f33929l;
        C17417l.admob(c17923l24);
        c17923l24.mo211l();
        contentValues.put("ad_campaign_info", c4729l.f9750synchronized);
        if (c5051l.m1682l(strInmobi, AbstractC5981l.f12654l)) {
            C17923l c17923l25 = c17417l2.f33929l;
            C17417l.admob(c17923l25);
            c17923l25.mo211l();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(c4729l.f9753volatile));
        }
        try {
            SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
            if (sQLiteDatabaseM2395l.update("apps", contentValues, "app_id = ?", new String[]{strInmobi}) == 0 && sQLiteDatabaseM2395l.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                C17417l.admob(c8118l);
                c8118l.f16908l.loadAd(C8118l.m2260l(strInmobi), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            C17417l.admob(c8118l);
            c8118l.f16908l.crashlytics(C8118l.m2260l(strInmobi), e, "Error storing app. appId");
        }
    }

    /* JADX INFO: renamed from: lّٖ۠, reason: contains not printable characters */
    public final void m2388l(String str, C6491l c6491l) {
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.subs(c6491l);
        mo211l();
        m2927l();
        ContentValues contentValues = new ContentValues();
        String str2 = c6491l.yandex;
        contentValues.put("app_id", str2);
        contentValues.put("name", c6491l.loadAd);
        contentValues.put("lifetime_count", Long.valueOf(c6491l.crashlytics));
        contentValues.put("current_bundle_count", Long.valueOf(c6491l.amazon));
        contentValues.put("last_fire_timestamp", Long.valueOf(c6491l.billing));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c6491l.mopub));
        contentValues.put("last_bundled_day", c6491l.admob);
        contentValues.put("last_sampled_complex_event_id", c6491l.subs);
        contentValues.put("last_sampling_rate", c6491l.isPro);
        contentValues.put("current_session_count", Long.valueOf(c6491l.purchase));
        Boolean bool = c6491l.firebase;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m2395l().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16908l.loadAd(C8118l.m2260l(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16908l.crashlytics(C8118l.m2260l(str2), e, "Error storing event aggregates. appId");
        }
    }

    /* JADX INFO: renamed from: lٗٙٚ, reason: contains not printable characters */
    public final C18253l m2389l(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        EnumC5250l enumC5250l;
        C17417l c17417l = (C17417l) this.f833l;
        if (TextUtils.isEmpty(str2)) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16918l.yandex("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            C8208l c8208l = (C8208l) C13718l.m3698l(C6194l.signatures(), bArr);
            EnumC5250l[] enumC5250lArrValues = EnumC5250l.values();
            int length = enumC5250lArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    enumC5250l = EnumC5250l.UNKNOWN;
                    break;
                }
                enumC5250l = enumC5250lArrValues[i3];
                if (enumC5250l.f11334l == i) {
                    break;
                }
                i3++;
            }
            if (enumC5250l != EnumC5250l.GOOGLE_SIGNAL && enumC5250l != EnumC5250l.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = DesugarCollections.unmodifiableList(((C6194l) c8208l.f20498l).tapsense()).iterator();
                while (it.hasNext()) {
                    C9134l c9134l = (C9134l) ((C9030l) it.next()).firebase();
                    c9134l.loadAd();
                    ((C9030l) c9134l.f20498l).m2558l(i2);
                    arrayList.add((C9030l) c9134l.amazon());
                }
                c8208l.loadAd();
                ((C6194l) c8208l.f20498l).m1967throws();
                c8208l.loadAd();
                ((C6194l) c8208l.f20498l).inmobi(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        C8118l c8118l2 = c17417l.f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16908l.loadAd(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new C18253l(j, (C6194l) c8208l.amazon(), str2, map, enumC5250l, j2, j3, j4, i2);
        } catch (IOException e) {
            C8118l c8118l3 = c17417l.f33950l;
            C17417l.admob(c8118l3);
            c8118l3.f16908l.crashlytics(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    /* JADX INFO: renamed from: l٘ؓۘ, reason: contains not printable characters */
    public final void m2390l(String str, C11536l c11536l) {
        mo211l();
        m2927l();
        AbstractC1051l.billing(str);
        C17417l c17417l = (C17417l) this.f833l;
        C18450l c18450l = c17417l.f33951l;
        C8118l c8118l = c17417l.f33950l;
        c18450l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C3032l c3032l = AbstractC5981l.f12653l;
        long jLongValue = jCurrentTimeMillis - ((Long) c3032l.yandex(null)).longValue();
        long j = c11536l.f23203l;
        if (j < jLongValue || j > ((Long) c3032l.yandex(null)).longValue() + jCurrentTimeMillis) {
            C17417l.admob(c8118l);
            c8118l.f16910l.amazon("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C8118l.m2260l(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        C17417l.admob(c8118l);
        c8118l.f16911l.yandex("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c11536l.f23204l);
        contentValues.put("source", Integer.valueOf(c11536l.f23202l));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (m2395l().insert("trigger_uris", null, contentValues) == -1) {
                C17417l.admob(c8118l);
                c8118l.f16908l.loadAd(C8118l.m2260l(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            C17417l.admob(c8118l);
            c8118l.f16908l.crashlytics(C8118l.m2260l(str), e, "Error storing trigger URI. appId");
        }
    }

    /* JADX INFO: renamed from: l٘ؖۜ, reason: contains not printable characters */
    public final void m2391l(String str, String str2) {
        AbstractC1051l.billing(str2);
        mo211l();
        m2927l();
        try {
            m2395l().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.crashlytics(C8118l.m2260l(str2), e, "Error deleting snapshot. appId");
        }
    }

    /* JADX INFO: renamed from: lٌ٘ؔ, reason: contains not printable characters */
    public final void m2392l(String str, C10559l c10559l) {
        AbstractC1051l.subs(str);
        AbstractC1051l.subs(c10559l);
        mo211l();
        m2927l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c10559l.mopub());
        contentValues.put("consent_source", Integer.valueOf(c10559l.loadAd));
        m2373l(contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ef A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011b A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:66:0x018c->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: lٕ٘ؑ, reason: contains not printable characters */
    public final void m2393l(String str, long j, long j2, C18338l c18338l) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r3;
        long jM2350l;
        long j3;
        String[] strArr2;
        String str3;
        long j4;
        C13135l c13135l;
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        m2927l();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM2395l = m2395l();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                if (IsEmpty != 0) {
                    String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                    str4 = j2 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(str4.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str4);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseM2395l.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r3 = string;
                                cursorRawQuery = sQLiteDatabaseM2395l.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        C9030l c9030l = (C9030l) ((C9134l) C13718l.m3698l(C9030l.m2444final(), cursorRawQuery.getBlob(0))).amazon();
                                        if (cursorRawQuery.moveToNext()) {
                                            C8118l c8118l = c17417l.f33950l;
                                            C17417l.admob(c8118l);
                                            c8118l.f16910l.loadAd(C8118l.m2260l(r3), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        c18338l.f35847l = c9030l;
                                        jM2350l = m2350l("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                        if (j2 == -1) {
                                            if (jM2350l != -1) {
                                                j3 = -1;
                                            } else {
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                                strArr2 = new String[]{r3, string2};
                                            }
                                            cursorRawQuery = sQLiteDatabaseM2395l.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j4 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j5 = cursorRawQuery.getLong(4);
                                                    try {
                                                        c13135l = (C13135l) C13718l.m3698l(C1841l.m1049volatile(), blob);
                                                        c13135l.metrica(cursorRawQuery.getString(1));
                                                        long j6 = cursorRawQuery.getLong(2);
                                                        c13135l.loadAd();
                                                        ((C1841l) c13135l.f20498l).m1053else(j6);
                                                        c13135l.loadAd();
                                                        ((C1841l) c13135l.f20498l).tapsense(j5);
                                                        if (!c18338l.inmobi(j4, (C1841l) c13135l.amazon())) {
                                                            break;
                                                        }
                                                    } catch (IOException e) {
                                                        C8118l c8118l2 = c17417l.f33950l;
                                                        C17417l.admob(c8118l2);
                                                        c8118l2.f16908l.crashlytics(C8118l.m2260l(r3), e, "Data loss. Failed to merge raw event. appId");
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                C8118l c8118l3 = c17417l.f33950l;
                                                C17417l.admob(c8118l3);
                                                c8118l3.f16910l.loadAd(C8118l.m2260l(r3), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j3 = j2;
                                        }
                                        if (j3 == -1 && jM2350l != -1) {
                                            jM2350l = Math.min(j3, jM2350l);
                                        } else if (j3 != -1) {
                                            jM2350l = j3;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(jM2350l)};
                                        cursorRawQuery = sQLiteDatabaseM2395l.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j4 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j7 = cursorRawQuery.getLong(4);
                                                c13135l = (C13135l) C13718l.m3698l(C1841l.m1049volatile(), blob2);
                                                c13135l.metrica(cursorRawQuery.getString(1));
                                                long j8 = cursorRawQuery.getLong(2);
                                                c13135l.loadAd();
                                                ((C1841l) c13135l.f20498l).m1053else(j8);
                                                c13135l.loadAd();
                                                ((C1841l) c13135l.f20498l).tapsense(j7);
                                                if (!c18338l.inmobi(j4, (C1841l) c13135l.amazon())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            C8118l c8118l4 = c17417l.f33950l;
                                            C17417l.admob(c8118l4);
                                            c8118l4.f16910l.loadAd(C8118l.m2260l(r3), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e2) {
                                        C8118l c8118l5 = c17417l.f33950l;
                                        C17417l.admob(c8118l5);
                                        c8118l5.f16908l.crashlytics(C8118l.m2260l(r3), e2, "Data loss. Failed to merge raw event metadata. appId");
                                    }
                                } else {
                                    C8118l c8118l6 = c17417l.f33950l;
                                    C17417l.admob(c8118l6);
                                    c8118l6.f16908l.loadAd(C8118l.m2260l(r3), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                C8118l c8118l7 = c17417l.f33950l;
                                C17417l.admob(c8118l7);
                                c8118l7.f16908l.crashlytics(C8118l.m2260l(string), e, "Data loss. Error selecting raw event. appId");
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j2 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j2)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j2 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str4);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseM2395l.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r3 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseM2395l.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                C8118l c8118l8 = c17417l.f33950l;
                                C17417l.admob(c8118l8);
                                c8118l8.f16908l.loadAd(C8118l.m2260l(r3), "Raw event metadata record is missing. appId");
                            } else {
                                C9030l c9030l2 = (C9030l) ((C9134l) C13718l.m3698l(C9030l.m2444final(), cursorRawQuery.getBlob(0))).amazon();
                                if (cursorRawQuery.moveToNext()) {
                                    C8118l c8118l9 = c17417l.f33950l;
                                    C17417l.admob(c8118l9);
                                    c8118l9.f16910l.loadAd(C8118l.m2260l(r3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                c18338l.f35847l = c9030l2;
                                jM2350l = m2350l("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                if (j2 == -1) {
                                    if (jM2350l != -1) {
                                        j3 = -1;
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{r3, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseM2395l.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j4 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j9 = cursorRawQuery.getLong(4);
                                            c13135l = (C13135l) C13718l.m3698l(C1841l.m1049volatile(), blob3);
                                            c13135l.metrica(cursorRawQuery.getString(1));
                                            long j10 = cursorRawQuery.getLong(2);
                                            c13135l.loadAd();
                                            ((C1841l) c13135l.f20498l).m1053else(j10);
                                            c13135l.loadAd();
                                            ((C1841l) c13135l.f20498l).tapsense(j9);
                                            if (!c18338l.inmobi(j4, (C1841l) c13135l.amazon())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        C8118l c8118l10 = c17417l.f33950l;
                                        C17417l.admob(c8118l10);
                                        c8118l10.f16910l.loadAd(C8118l.m2260l(r3), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j3 = j2;
                                }
                                if (j3 == -1) {
                                    if (j3 != -1) {
                                        jM2350l = j3;
                                    }
                                } else if (j3 != -1) {
                                    jM2350l = j3;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r3, string2, String.valueOf(jM2350l)};
                                cursorRawQuery = sQLiteDatabaseM2395l.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j4 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j11 = cursorRawQuery.getLong(4);
                                        c13135l = (C13135l) C13718l.m3698l(C1841l.m1049volatile(), blob4);
                                        c13135l.metrica(cursorRawQuery.getString(1));
                                        long j12 = cursorRawQuery.getLong(2);
                                        c13135l.loadAd();
                                        ((C1841l) c13135l.f20498l).m1053else(j12);
                                        c13135l.loadAd();
                                        ((C1841l) c13135l.f20498l).tapsense(j11);
                                        if (!c18338l.inmobi(j4, (C1841l) c13135l.amazon())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    C8118l c8118l11 = c17417l.f33950l;
                                    C17417l.admob(c8118l11);
                                    c8118l11.f16910l.loadAd(C8118l.m2260l(r3), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = IsEmpty;
                        C8118l c8118l12 = c17417l.f33950l;
                        C17417l.admob(c8118l12);
                        c8118l12.f16908l.crashlytics(C8118l.m2260l(string), e, "Data loss. Error selecting raw event. appId");
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
            }
        } catch (SQLiteException e6) {
            e = e6;
            IsEmpty = str;
        }
    }

    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters */
    public final void m2394l(List list) {
        AbstractC1051l.subs(list);
        mo211l();
        m2927l();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int iDelete = m2395l().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.crashlytics(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    /* JADX INFO: renamed from: lٜٚ, reason: contains not printable characters */
    public final SQLiteDatabase m2395l() {
        mo211l();
        try {
            return this.f17819l.getWritableDatabase();
        } catch (SQLiteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(e, "Error opening database");
            throw e;
        }
    }
}

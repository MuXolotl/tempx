package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* JADX INFO: renamed from: lؘۣٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13978l extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Cgoto f27272l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27273l;

    public C13978l(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.f27273l;
        Cgoto cgoto = this.f27272l;
        switch (i) {
            case 0:
                C8648l c8648l = (C8648l) cgoto;
                C17417l c17417l = (C17417l) c8648l.f833l;
                C17417l c17417l2 = (C17417l) c8648l.f833l;
                c17417l.getClass();
                C3253l c3253l = c8648l.f17820l;
                if (c3253l.f6948l != 0) {
                    ((C18450l) c3253l.f6947l).getClass();
                    if (SystemClock.elapsedRealtime() - c3253l.f6948l < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((C18450l) c3253l.f6947l).getClass();
                    c3253l.f6948l = SystemClock.elapsedRealtime();
                    C8118l c8118l = c17417l2.f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16908l.yandex("Opening the database failed, dropping and recreating it");
                    if (!c17417l2.f33936l.getDatabasePath("google_app_measurement.db").delete()) {
                        C8118l c8118l2 = c17417l2.f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16908l.loadAd("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        c3253l.f6948l = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        C8118l c8118l3 = c17417l2.f33950l;
                        C17417l.admob(c8118l3);
                        c8118l3.f16908l.loadAd(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                C11694l c11694l = (C11694l) cgoto;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    C17417l c17417l3 = (C17417l) c11694l.f833l;
                    C8118l c8118l4 = c17417l3.f33950l;
                    C17417l.admob(c8118l4);
                    c8118l4.f16908l.yandex("Opening the local database failed, dropping and recreating it");
                    if (!c17417l3.f33936l.getDatabasePath("google_app_measurement_local.db").delete()) {
                        C8118l c8118l5 = c17417l3.f33950l;
                        C17417l.admob(c8118l5);
                        c8118l5.f16908l.loadAd("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        C8118l c8118l6 = ((C17417l) c11694l.f833l).f33950l;
                        C17417l.admob(c8118l6);
                        c8118l6.f16908l.loadAd(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f27273l;
        Cgoto cgoto = this.f27272l;
        switch (i) {
            case 0:
                C8118l c8118l = ((C17417l) ((C8648l) cgoto).f833l).f33950l;
                C17417l.admob(c8118l);
                AbstractC14879l.vip(c8118l, sQLiteDatabase);
                break;
            default:
                C8118l c8118l2 = ((C17417l) ((C11694l) cgoto).f833l).f33950l;
                C17417l.admob(c8118l2);
                AbstractC14879l.vip(c8118l2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f27273l;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        int i = this.f27273l;
        Cgoto cgoto = this.f27272l;
        switch (i) {
            case 0:
                C17417l c17417l = (C17417l) ((C8648l) cgoto).f833l;
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                AbstractC14879l.remoteconfig(c8118l, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C8648l.f17809l);
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C8648l.f17816l);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C8648l.f17813l);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C8648l.f17815l);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C8648l.f17817l);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C8648l.f17808l);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C8648l.f17818l);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C8648l.f17814l);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C8648l.f17811l);
                C2156l.yandex();
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C8648l.f17812l);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C8648l.f17810l);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                C17417l.admob(c8118l2);
                AbstractC14879l.remoteconfig(c8118l2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                C8118l c8118l3 = ((C17417l) ((C11694l) cgoto).f833l).f33950l;
                C17417l.admob(c8118l3);
                AbstractC14879l.remoteconfig(c8118l3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", C11694l.f23442l);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f27273l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13978l(C11694l c11694l, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f27273l = 1;
        this.f27272l = c11694l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13978l(C8648l c8648l, Context context) {
        this(context, "google_app_measurement.db");
        this.f27273l = 0;
        this.f27272l = c8648l;
    }

    private final void billing(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void mopub(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void vip(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void yandex(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

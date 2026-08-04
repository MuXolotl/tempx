package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: renamed from: lٖٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16386l extends AbstractC18512l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final Pair f32039l = new Pair("", 0L);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C3071l f32040l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C0851l f32041l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C3071l f32042l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C0851l f32043l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C0851l f32044l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C11919l f32045l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C0851l f32046l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C11919l f32047l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f32048l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C3071l f32049l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C3071l f32050l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f32051l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C1381l f32052l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public SharedPreferences f32053l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public SharedPreferences f32054l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C1381l f32055l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C3071l f32056l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public String f32057l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C18338l f32058l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public long f32059l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C11919l f32060l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C3071l f32061l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C11919l f32062l;

    public C16386l(C17417l c17417l) {
        super(c17417l);
        this.f32056l = new C3071l(this, "session_timeout", 1800000L);
        this.f32041l = new C0851l(this, "start_new_session", true);
        this.f32049l = new C3071l(this, "last_pause_time", 0L);
        this.f32061l = new C3071l(this, "session_id", 0L);
        this.f32060l = new C11919l(this, "non_personalized_ads");
        this.f32052l = new C1381l(this, "last_received_uri_timestamps_by_source");
        this.f32046l = new C0851l(this, "allow_remote_dynamite", false);
        this.f32042l = new C3071l(this, "first_open_time", 0L);
        AbstractC1051l.billing("app_install_time");
        this.f32045l = new C11919l(this, "app_instance_id");
        this.f32044l = new C0851l(this, "app_backgrounded", false);
        this.f32043l = new C0851l(this, "deep_link_retrieval_complete", false);
        this.f32040l = new C3071l(this, "deep_link_retrieval_attempts", 0L);
        this.f32062l = new C11919l(this, "firebase_feature_rollouts");
        this.f32047l = new C11919l(this, "deferred_attribution_cache");
        this.f32050l = new C3071l(this, "deferred_attribution_cache_timestamp", 0L);
        this.f32055l = new C1381l(this, "default_event_parameters");
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final void m4178l(boolean z) {
        mo211l();
        C8118l c8118l = ((C17417l) this.f833l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16911l.loadAd(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = m4180l().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final SharedPreferences m4179l() {
        mo211l();
        m4564l();
        if (this.f32053l == null) {
            C17417l c17417l = (C17417l) this.f833l;
            String strValueOf = String.valueOf(c17417l.f33936l.getPackageName());
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            C14906l c14906l = c8118l.f16911l;
            String strConcat = strValueOf.concat("_preferences");
            c14906l.loadAd(strConcat, "Default prefs file");
            this.f32053l = c17417l.f33936l.getSharedPreferences(strConcat, 0);
        }
        return this.f32053l;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final SharedPreferences m4180l() {
        mo211l();
        m4564l();
        AbstractC1051l.subs(this.f32054l);
        return this.f32054l;
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final SparseArray m4181l() {
        Bundle bundleAmazon = this.f32052l.amazon();
        int[] intArray = bundleAmazon.getIntArray("uriSources");
        long[] longArray = bundleAmazon.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final C10559l m4182l() {
        mo211l();
        return C10559l.crashlytics(m4180l().getInt("consent_source", 100), m4180l().getString("consent_settings", "G1"));
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final boolean m4183l(long j) {
        return j - this.f32056l.amazon() > this.f32049l.amazon();
    }

    @Override // defpackage.AbstractC18512l
    /* JADX INFO: renamed from: lٕؖؔ */
    public final boolean mo699l() {
        return true;
    }
}

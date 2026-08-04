package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Objects;

/* JADX INFO: renamed from: lُۗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11262l implements InterfaceC12202l, InterfaceC14623l, InterfaceC12925l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f22693l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22694l;

    public C11262l(C5008l c5008l, C15714l c15714l) {
        this.f22694l = 0;
        this.f22693l = c15714l;
        Objects.requireNonNull(c5008l);
    }

    @Override // defpackage.InterfaceC14623l
    public void admob(AbstractC11229l abstractC11229l) {
        C0022l c0022l = C9670l.subs;
        c0022l.loadAd("onSessionStarting", new Object[0]);
        C9670l c9670l = (C9670l) this.f22693l;
        c9670l.admob = (C0189l) abstractC11229l;
        if (c9670l.mopub != null) {
            Log.w(c0022l.yandex, c0022l.amazon("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        c9670l.amazon();
        C14514l c14514l = c9670l.mopub;
        C8292l c8292l = c9670l.crashlytics;
        C4039l c4039l = c9670l.yandex;
        C15010l c15010lLoadAd = c8292l.loadAd(c14514l);
        if (c14514l.startapp == 1) {
            C18277l c18277lRemoteconfig = C0216l.remoteconfig(c15010lLoadAd.crashlytics());
            c18277lRemoteconfig.yandex();
            ((C0216l) c18277lRemoteconfig.f3757l).ads(17);
            c15010lLoadAd.amazon((C0216l) c18277lRemoteconfig.loadAd());
        }
        c4039l.yandex((C18278l) c15010lLoadAd.loadAd(), 221);
    }

    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
        int i = this.f22694l;
        Object obj2 = this.f22693l;
        switch (i) {
            case 0:
                ((C2350l) ((C15714l) obj2).f30857l).yandex.adcel();
                break;
            default:
                C0502l c0502l = (C0502l) obj;
                C0022l c0022l = C8930l.amazon;
                boolean z = false;
                if (c0502l != null) {
                    C16903l c16903l = c0502l.yandex.f11999l;
                    AbstractC1051l.subs(c16903l);
                    if (c16903l.f32958l == 1) {
                        z = true;
                    }
                }
                ((C2350l) obj2).amazon(Boolean.valueOf(z));
                break;
        }
    }

    @Override // defpackage.InterfaceC14623l
    public /* synthetic */ void billing(AbstractC11229l abstractC11229l, int i) {
        C9670l c9670l = (C9670l) this.f22693l;
        c9670l.admob = (C0189l) abstractC11229l;
        c9670l.loadAd(i);
    }

    @Override // defpackage.InterfaceC12925l
    public C4687l crashlytics(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC12925l interfaceC12925l = ((InterfaceC12925l[]) this.f22693l)[i];
            if (interfaceC12925l.loadAd(cls)) {
                return interfaceC12925l.crashlytics(cls);
            }
        }
        C10754l.ads("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.InterfaceC14623l
    public void firebase(AbstractC11229l abstractC11229l, String str) {
        C9670l.subs.loadAd("onSessionStarted with sessionId = %s", str);
        C9670l c9670l = (C9670l) this.f22693l;
        c9670l.admob = (C0189l) abstractC11229l;
        c9670l.purchase();
        C14514l c14514l = c9670l.mopub;
        c14514l.billing = str;
        c9670l.yandex.yandex((C18278l) c9670l.crashlytics.loadAd(c14514l).loadAd(), 222);
        c9670l.yandex();
        c9670l.crashlytics();
    }

    @Override // defpackage.InterfaceC14623l
    public void isPro(AbstractC11229l abstractC11229l, int i) {
        C0022l c0022l = C9670l.subs;
        C9670l.subs.loadAd("onSessionSuspended with reason = %d", Integer.valueOf(i));
        C9670l c9670l = (C9670l) this.f22693l;
        c9670l.admob = (C0189l) abstractC11229l;
        c9670l.purchase();
        AbstractC1051l.subs(c9670l.mopub);
        c9670l.yandex.yandex(c9670l.crashlytics.yandex(c9670l.mopub, i), 225);
        c9670l.yandex();
        c9670l.purchase.removeCallbacks(c9670l.amazon);
    }

    @Override // defpackage.InterfaceC12925l
    public boolean loadAd(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC12925l[]) this.f22693l)[i].loadAd(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean purchase() {
        C17417l c17417l = (C17417l) this.f22693l;
        try {
            C3865l c3865lYandex = C16797l.yandex(c17417l.f33936l);
            if (c3865lYandex != null) {
                return c3865lYandex.loadAd(128, "com.android.vending").versionCode >= 80837300;
            }
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.yandex("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16911l.loadAd(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    @Override // defpackage.InterfaceC14623l
    public /* synthetic */ void remoteconfig(AbstractC11229l abstractC11229l) {
        ((C9670l) this.f22693l).admob = (C0189l) abstractC11229l;
    }

    @Override // defpackage.InterfaceC14623l
    public /* synthetic */ void smaato(AbstractC11229l abstractC11229l, int i) {
        C9670l c9670l = (C9670l) this.f22693l;
        c9670l.admob = (C0189l) abstractC11229l;
        c9670l.loadAd(i);
    }

    @Override // defpackage.InterfaceC14623l
    public void startapp(AbstractC11229l abstractC11229l, boolean z) {
        C0022l c0022l = C9670l.subs;
        C9670l.subs.loadAd("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        C9670l c9670l = (C9670l) this.f22693l;
        c9670l.admob = (C0189l) abstractC11229l;
        c9670l.purchase();
        AbstractC1051l.subs(c9670l.mopub);
        C8292l c8292l = c9670l.crashlytics;
        C14514l c14514l = c9670l.mopub;
        C4039l c4039l = c9670l.yandex;
        C15010l c15010lLoadAd = c8292l.loadAd(c14514l);
        C18277l c18277lRemoteconfig = C0216l.remoteconfig(c15010lLoadAd.crashlytics());
        c18277lRemoteconfig.yandex();
        ((C0216l) c18277lRemoteconfig.f3757l).startapp(z);
        c15010lLoadAd.yandex();
        ((C18278l) c15010lLoadAd.f3757l).license((C0216l) c18277lRemoteconfig.loadAd());
        c4039l.yandex((C18278l) c15010lLoadAd.loadAd(), 227);
        c9670l.yandex();
        c9670l.crashlytics();
    }

    @Override // defpackage.InterfaceC14623l
    public /* synthetic */ void vip(AbstractC11229l abstractC11229l, int i) {
        C9670l c9670l = (C9670l) this.f22693l;
        c9670l.admob = (C0189l) abstractC11229l;
        c9670l.loadAd(i);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00de  */
    /* JADX WARN: Code duplicated, block: B:23:0x00f2  */
    @Override // defpackage.InterfaceC14623l
    public void yandex(AbstractC11229l abstractC11229l, String str) {
        C14514l c14514l;
        C0189l c0189l;
        boolean z = false;
        C0022l c0022l = C9670l.subs;
        c0022l.loadAd("onSessionResuming with sessionId = %s", str);
        C9670l c9670l = (C9670l) this.f22693l;
        c9670l.admob = (C0189l) abstractC11229l;
        SharedPreferences sharedPreferences = c9670l.billing;
        if (c9670l.admob(str)) {
            c0022l.loadAd("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            AbstractC1051l.subs(c9670l.mopub);
        } else {
            BinderC11031l binderC11031l = c9670l.loadAd;
            if (sharedPreferences == null) {
                C0022l c0022l2 = C14514l.adcel;
            } else {
                c14514l = new C14514l(binderC11031l);
                c14514l.metrica = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    c14514l.loadAd = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        c14514l.crashlytics = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            c14514l.amazon = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                c14514l.purchase = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    c14514l.billing = sharedPreferences.getString("receiver_session_id", "");
                                    c14514l.mopub = sharedPreferences.getInt("device_capabilities", 0);
                                    c14514l.admob = sharedPreferences.getString("device_model_name", "");
                                    c14514l.subs = sharedPreferences.getString("manufacturer", "");
                                    c14514l.isPro = sharedPreferences.getString("product_name", "");
                                    c14514l.firebase = sharedPreferences.getString("build_type", "");
                                    c14514l.smaato = sharedPreferences.getString("cast_build_version", "");
                                    c14514l.remoteconfig = sharedPreferences.getString("system_build_number", "");
                                    c14514l.vip = sharedPreferences.getInt("device_category", 0);
                                    c14514l.startapp = sharedPreferences.getInt("analytics_session_start_type", 0);
                                }
                            }
                        }
                    }
                }
                c9670l.mopub = c14514l;
                if (c9670l.admob(str)) {
                    c0022l.loadAd("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                    AbstractC1051l.subs(c9670l.mopub);
                    C14514l.ads = c9670l.mopub.amazon + 1;
                } else {
                    c0022l.loadAd("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                    C14514l c14514l2 = new C14514l(binderC11031l);
                    C14514l.ads++;
                    c9670l.mopub = c14514l2;
                    c0189l = c9670l.admob;
                    if (c0189l != null && c0189l.mopub.m1241l()) {
                        z = true;
                    }
                    c14514l2.metrica = z;
                    C14514l c14514l3 = c9670l.mopub;
                    AbstractC1051l.subs(c14514l3);
                    C0022l c0022l3 = C15504l.isPro;
                    AbstractC1051l.purchase("Must be called from the main thread.");
                    C15504l c15504l = C15504l.smaato;
                    AbstractC1051l.subs(c15504l);
                    AbstractC1051l.purchase("Must be called from the main thread.");
                    c14514l3.loadAd = c15504l.amazon.f24036l;
                    C14514l c14514l4 = c9670l.mopub;
                    AbstractC1051l.subs(c14514l4);
                    c14514l4.billing = str;
                }
            }
            c14514l = null;
            c9670l.mopub = c14514l;
            if (c9670l.admob(str)) {
                c0022l.loadAd("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                AbstractC1051l.subs(c9670l.mopub);
                C14514l.ads = c9670l.mopub.amazon + 1;
            } else {
                c0022l.loadAd("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                C14514l c14514l5 = new C14514l(binderC11031l);
                C14514l.ads++;
                c9670l.mopub = c14514l5;
                c0189l = c9670l.admob;
                if (c0189l != null) {
                    z = true;
                }
                c14514l5.metrica = z;
                C14514l c14514l6 = c9670l.mopub;
                AbstractC1051l.subs(c14514l6);
                C0022l c0022l4 = C15504l.isPro;
                AbstractC1051l.purchase("Must be called from the main thread.");
                C15504l c15504l2 = C15504l.smaato;
                AbstractC1051l.subs(c15504l2);
                AbstractC1051l.purchase("Must be called from the main thread.");
                c14514l6.loadAd = c15504l2.amazon.f24036l;
                C14514l c14514l7 = c9670l.mopub;
                AbstractC1051l.subs(c14514l7);
                c14514l7.billing = str;
            }
        }
        AbstractC1051l.subs(c9670l.mopub);
        C8292l c8292l = c9670l.crashlytics;
        C14514l c14514l8 = c9670l.mopub;
        C4039l c4039l = c9670l.yandex;
        C15010l c15010lLoadAd = c8292l.loadAd(c14514l8);
        C18277l c18277lRemoteconfig = C0216l.remoteconfig(c15010lLoadAd.crashlytics());
        c18277lRemoteconfig.yandex();
        ((C0216l) c18277lRemoteconfig.f3757l).ads(10);
        c15010lLoadAd.amazon((C0216l) c18277lRemoteconfig.loadAd());
        C18277l c18277lRemoteconfig2 = C0216l.remoteconfig(c15010lLoadAd.crashlytics());
        c18277lRemoteconfig2.yandex();
        ((C0216l) c18277lRemoteconfig2.f3757l).startapp(true);
        c15010lLoadAd.yandex();
        ((C18278l) c15010lLoadAd.f3757l).license((C0216l) c18277lRemoteconfig2.loadAd());
        c4039l.yandex((C18278l) c15010lLoadAd.loadAd(), 226);
    }

    public C11262l(C6901l c6901l) {
        this.f22694l = 2;
        this.f22693l = c6901l.f14473l;
    }

    public /* synthetic */ C11262l(int i, Object obj) {
        this.f22694l = i;
        this.f22693l = obj;
    }
}

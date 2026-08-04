package defpackage;

import android.os.Bundle;
import java.util.TreeSet;

/* JADX INFO: renamed from: lؕۥؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3760l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11675l f7841l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f7842l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7843l;

    public /* synthetic */ RunnableC3760l(C11675l c11675l, Bundle bundle, int i) {
        this.f7843l = i;
        this.f7842l = bundle;
        this.f7841l = c11675l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7843l;
        Bundle bundle = this.f7842l;
        C11675l c11675l = this.f7841l;
        switch (i) {
            case 0:
                c11675l.mo211l();
                c11675l.m2935l();
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                AbstractC1051l.billing(string);
                AbstractC1051l.billing(string2);
                AbstractC1051l.subs(bundle.get("value"));
                C17417l c17417l = (C17417l) c11675l.f833l;
                if (!c17417l.yandex()) {
                    C8118l c8118l = c17417l.f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16911l.yandex("Conditional property not set since app measurement is disabled");
                } else {
                    C6899l c6899l = new C6899l(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                    try {
                        C17410l c17410l = c17417l.f33949l;
                        C17417l.billing(c17410l);
                        bundle.getString("app_id");
                        C13236l c13236lM4346l = c17410l.m4346l(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        C17417l.billing(c17410l);
                        bundle.getString("app_id");
                        C13236l c13236lM4346l2 = c17410l.m4346l(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString("app_id");
                        c17417l.firebase().m3254l(new C17509l(bundle.getString("app_id"), string2, c6899l, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c13236lM4346l2, bundle.getLong("trigger_timeout"), c13236lM4346l, bundle.getLong("time_to_live"), c17410l.m4346l(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                c11675l.mo211l();
                c11675l.m2935l();
                String string3 = bundle.getString("name");
                AbstractC1051l.billing(string3);
                C17417l c17417l2 = (C17417l) c11675l.f833l;
                if (!c17417l2.yandex()) {
                    C8118l c8118l2 = c17417l2.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16911l.yandex("Conditional property not cleared since app measurement is disabled");
                } else {
                    C6899l c6899l2 = new C6899l(0L, null, string3, "");
                    try {
                        C17410l c17410l2 = c17417l2.f33949l;
                        C17417l.billing(c17410l2);
                        bundle.getString("app_id");
                        c17417l2.firebase().m3254l(new C17509l(bundle.getString("app_id"), "", c6899l2, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c17410l2.m4346l(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), 0L, true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                C10866l c10866l = c11675l.f23424l;
                C17417l c17417l3 = (C17417l) c11675l.f833l;
                if (!bundle.isEmpty()) {
                    C16386l c16386l = c17417l3.f33944l;
                    C17410l c17410l3 = c17417l3.f33949l;
                    C5051l c5051l = c17417l3.f33945l;
                    C8118l c8118l3 = c17417l3.f33950l;
                    C17417l.billing(c16386l);
                    Bundle bundle2 = new Bundle(c16386l.f32055l.amazon());
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            C17417l.billing(c17410l3);
                            if (C17410l.m4329l(obj)) {
                                C17410l.m4340l(c10866l, null, 27, null, null, 0);
                            }
                            C17417l.admob(c8118l3);
                            c8118l3.f16914l.crashlytics(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (C17410l.m4345l(str)) {
                            C17417l.admob(c8118l3);
                            c8118l3.f16914l.loadAd(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle2.remove(str);
                        } else {
                            C17417l.billing(c17410l3);
                            c5051l.getClass();
                            if (c17410l3.m4358l("param", str, 500, obj)) {
                                c17410l3.m4368l(bundle2, str, obj);
                            }
                        }
                    }
                    C17417l.billing(c17410l3);
                    C17410l c17410l4 = ((C17417l) c5051l.f833l).f33949l;
                    C17417l.billing(c17410l4);
                    int i2 = c17410l4.m4388l(201500000) ? 100 : 25;
                    if (bundle2.size() > i2) {
                        int i3 = 0;
                        for (String str2 : new TreeSet(bundle2.keySet())) {
                            i3++;
                            if (i3 > i2) {
                                bundle2.remove(str2);
                            }
                        }
                        C17417l.billing(c17410l3);
                        C17410l.m4340l(c10866l, null, 26, null, null, 0);
                        C17417l.admob(c8118l3);
                        c8118l3.f16914l.yandex("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                C16386l c16386l2 = c17417l3.f33944l;
                C17417l.billing(c16386l2);
                c16386l2.f32055l.mopub(bundle);
                c17417l3.firebase().m3256l(bundle);
                break;
        }
    }
}

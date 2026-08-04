package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٕٝٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15824l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ BinderC15526l f31070l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10462l f31071l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31072l;

    public /* synthetic */ RunnableC15824l(BinderC15526l binderC15526l, C10462l c10462l, int i) {
        this.f31072l = i;
        this.f31071l = c10462l;
        this.f31070l = binderC15526l;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f31072l;
        C10462l c10462l = this.f31071l;
        BinderC15526l binderC15526l = this.f31070l;
        switch (i) {
            case 0:
                binderC15526l.purchase.m2089continue();
                binderC15526l.purchase.m2106static(c10462l);
                break;
            case 1:
                binderC15526l.purchase.m2089continue();
                C6901l c6901l = binderC15526l.purchase;
                c6901l.mo224l().mo211l();
                c6901l.m2112transient();
                AbstractC1051l.subs(c10462l);
                String str = c10462l.f21296l;
                AbstractC1051l.billing(str);
                int i2 = 0;
                if (c6901l.m2097import().m1682l(null, AbstractC5981l.f12649l)) {
                    c6901l.mo198abstract().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iM1683l = c6901l.m2097import().m1683l(null, AbstractC5981l.f12710try);
                    c6901l.m2097import();
                    long jLongValue = jCurrentTimeMillis - ((Long) AbstractC5981l.purchase.yandex(null)).longValue();
                    while (i2 < iM1683l && c6901l.appmetrica(jLongValue, null)) {
                        i2++;
                    }
                } else {
                    c6901l.m2097import();
                    long jIntValue = ((Integer) AbstractC5981l.smaato.yandex(null)).intValue();
                    while (i2 < jIntValue && c6901l.appmetrica(0L, str)) {
                        i2++;
                    }
                }
                if (c6901l.m2097import().m1682l(null, AbstractC5981l.f12651l)) {
                    c6901l.mo224l().mo211l();
                    c6901l.applovin();
                }
                C3879l c3879l = c6901l.f14466l;
                int iAmazon = AbstractC9029l.amazon(c10462l.f21299l);
                c3879l.mo211l();
                if (iAmazon == 2 && !C3879l.m1444l(str)) {
                    C8315l c8315l = c3879l.f13233l.f14460l;
                    C6901l.m2082case(c8315l);
                    C5468l c5468lM2309l = c8315l.m2309l(str);
                    if (c5468lM2309l != null && c5468lM2309l.m1787synchronized() && !c5468lM2309l.m1786strictfp().Signature().isEmpty()) {
                        c6901l.mo200else().f16911l.loadAd(str, "[sgtm] Going background, trigger client side upload. appId");
                        c6901l.mo198abstract().getClass();
                        c6901l.remoteconfig(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                binderC15526l.purchase.m2089continue();
                C6901l c6901l2 = binderC15526l.purchase;
                c6901l2.mo224l().mo211l();
                c6901l2.m2112transient();
                AbstractC1051l.billing(c10462l.f21296l);
                c6901l2.m2095goto(c10462l);
                break;
            case 3:
                binderC15526l.purchase.m2089continue();
                C6901l c6901l3 = binderC15526l.purchase;
                if (c6901l3.f14465l != null) {
                    ArrayList arrayList = new ArrayList();
                    c6901l3.f14472l = arrayList;
                    arrayList.addAll(c6901l3.f14465l);
                }
                C8648l c8648l = c6901l3.f14451l;
                C6901l.m2082case(c8648l);
                C17417l c17417l = (C17417l) c8648l.f833l;
                String str2 = c10462l.f21296l;
                AbstractC1051l.subs(str2);
                AbstractC1051l.billing(str2);
                c8648l.mo211l();
                c8648l.m2927l();
                try {
                    SQLiteDatabase sQLiteDatabaseM2395l = c8648l.m2395l();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseM2395l.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("events", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseM2395l.delete("upload_queue", "app_id=?", strArr);
                    if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12686l)) {
                        iDelete += sQLiteDatabaseM2395l.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseM2395l.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        C8118l c8118l = c17417l.f33950l;
                        C17417l.admob(c8118l);
                        c8118l.f16911l.crashlytics(str2, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    C8118l c8118l2 = c17417l.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.crashlytics(C8118l.m2260l(str2), e, "Error resetting analytics data. appId, error");
                }
                if (c10462l.f21292l) {
                    c6901l3.m2106static(c10462l);
                }
                break;
            case 4:
                binderC15526l.purchase.m2089continue();
                C6901l c6901l4 = binderC15526l.purchase;
                c6901l4.mo224l().mo211l();
                c6901l4.m2112transient();
                AbstractC1051l.billing(c10462l.f21296l);
                c6901l4.m2103protected(c10462l);
                c6901l4.m2115while(c10462l);
                break;
            case 5:
                C6901l c6901l5 = binderC15526l.purchase;
                c6901l5.m2089continue();
                c6901l5.m2115while(c10462l);
                break;
            default:
                C6901l c6901l6 = binderC15526l.purchase;
                c6901l6.m2089continue();
                c6901l6.m2103protected(c10462l);
                break;
        }
    }
}

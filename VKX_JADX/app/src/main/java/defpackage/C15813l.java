package defpackage;

import android.content.Intent;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: renamed from: lٕٝؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15813l {
    public Intent admob;
    public final LinkedHashMap amazon;
    public final C8241l billing;
    public final C17274l crashlytics;
    public final Object isPro;
    public final String[] loadAd;
    public final C1990l mopub;
    public final ReentrantLock purchase;
    public C12158l subs;
    public final WorkDatabase_Impl yandex;

    public C15813l(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.yandex = workDatabase_Impl;
        this.loadAd = strArr;
        C17274l c17274l = new C17274l(workDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, workDatabase_Impl.isPro, new C17847l(1, this, C15813l.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 17));
        this.crashlytics = c17274l;
        this.amazon = new LinkedHashMap();
        this.purchase = new ReentrantLock();
        this.billing = new C8241l(this);
        this.mopub = new C1990l(this);
        Collections.newSetFromMap(new IdentityHashMap());
        this.isPro = new Object();
        c17274l.firebase = new C7730l(14, this);
    }

    public final Object yandex(AbstractC5563l abstractC5563l) {
        WorkDatabase_Impl workDatabase_Impl = this.yandex;
        if (workDatabase_Impl.subs() && !workDatabase_Impl.smaato()) {
            return Unit.INSTANCE;
        }
        Object objAdmob = this.crashlytics.admob(abstractC5563l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }
}

package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lُٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC11031l extends AbstractBinderC5395l {
    public static final C0022l admob = new C0022l("AppVisibilityProxy", null);
    public static final int subs = 1;
    public final Set billing;
    public int mopub;

    public BinderC11031l() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", 2);
        this.billing = DesugarCollections.synchronizedSet(new HashSet());
        this.mopub = subs;
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lٕؓۡ */
    public final boolean mo1129l(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 1;
        if (i == 1) {
            BinderC14844l binderC14844l = new BinderC14844l(this);
            parcel2.writeNoException();
            AbstractC14627l.crashlytics(parcel2, binderC14844l);
            return true;
        }
        Set set = this.billing;
        C0022l c0022l = admob;
        if (i == 2) {
            Log.i(c0022l.yandex, c0022l.amazon("onAppEnteredForeground", new Object[0]));
            this.mopub = 1;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C17800l) it.next()).yandex.subs();
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        Log.i(c0022l.yandex, c0022l.amazon("onAppEnteredBackground", new Object[0]));
        this.mopub = 2;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            C10844l c10844l = ((C17800l) it2.next()).yandex;
            c10844l.getClass();
            C10844l.billing.loadAd("Stopping RouteDiscovery.", new Object[0]);
            c10844l.crashlytics.clear();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C7847l c7847l = c10844l.purchase;
                if (((C9961l) c7847l.f16369l) == null) {
                    c7847l.f16369l = C9961l.amazon((Context) c7847l.f16370l);
                }
                C9961l c9961l = (C9961l) c7847l.f16369l;
                if (c9961l != null) {
                    c9961l.purchase(c10844l);
                }
            } else {
                new HandlerC4052l(Looper.getMainLooper(), 6).post(new RunnableC10926l(c10844l, i2));
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

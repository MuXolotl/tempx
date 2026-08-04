package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: lٔؐۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14600l {
    public final long admob;
    public final boolean amazon;
    public final C18527l billing;
    public final SparseArray crashlytics;
    public C14500l firebase;
    public C11522l isPro = new C11522l();
    public final C16174l loadAd;
    public long metrica;
    public final CopyOnWriteArraySet mopub;
    public final C14000l purchase;
    public int remoteconfig;
    public Pair smaato;
    public int startapp;
    public final C8887l subs;
    public int vip;
    public final Context yandex;

    public C14600l(C9904l c9904l) {
        this.yandex = c9904l.yandex;
        C16174l c16174l = c9904l.crashlytics;
        c16174l.getClass();
        this.loadAd = c16174l;
        this.crashlytics = new SparseArray();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        this.amazon = c9904l.amazon;
        C18527l c18527l = c9904l.purchase;
        this.billing = c18527l;
        long j = c9904l.mopub;
        this.admob = j != -9223372036854775807L ? -j : -9223372036854775807L;
        C8887l c8887l = c9904l.admob;
        this.subs = c8887l;
        this.purchase = new C14000l(c9904l.loadAd, c8887l, c18527l);
        this.mopub = new CopyOnWriteArraySet();
        new C5978l(new C12984l());
        this.metrica = -9223372036854775807L;
        this.startapp = -1;
        this.vip = 0;
    }
}

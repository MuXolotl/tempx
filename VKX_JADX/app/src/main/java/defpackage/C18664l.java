package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lۣۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18664l {
    public boolean adcel;
    public C6012l admob;
    public Executor billing;
    public final String crashlytics;
    public final Context loadAd;
    public Executor mopub;
    public boolean startapp;
    public boolean subs;
    public final ArrayList amazon = new ArrayList();
    public final ArrayList purchase = new ArrayList();
    public final int subscription = 1;
    public final long isPro = -1;
    public final C0099l firebase = new C0099l(0);
    public final LinkedHashSet smaato = new LinkedHashSet();
    public final LinkedHashSet remoteconfig = new LinkedHashSet();
    public final ArrayList vip = new ArrayList();
    public boolean metrica = true;
    public final boolean ads = true;
    public final InterfaceC1388l yandex = AbstractC18202l.yandex.loadAd(WorkDatabase.class);

    public C18664l(Context context, String str) {
        this.loadAd = context;
        this.crashlytics = str;
    }

    public final void yandex(AbstractC8590l... abstractC8590lArr) {
        for (AbstractC8590l abstractC8590l : abstractC8590lArr) {
            Integer numValueOf = Integer.valueOf(abstractC8590l.yandex);
            LinkedHashSet linkedHashSet = this.remoteconfig;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(abstractC8590l.loadAd));
        }
        AbstractC8590l[] abstractC8590lArr2 = (AbstractC8590l[]) Arrays.copyOf(abstractC8590lArr, abstractC8590lArr.length);
        C0099l c0099l = this.firebase;
        c0099l.getClass();
        for (AbstractC8590l abstractC8590l2 : abstractC8590lArr2) {
            c0099l.yandex(abstractC8590l2);
        }
    }
}

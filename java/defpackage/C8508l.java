package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٌؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8508l {
    public final InterfaceC6228l adcel;
    public final Executor admob;
    public boolean ads = true;
    public final C0099l amazon;
    public final boolean billing;
    public final InterfaceC17619l crashlytics;
    public final boolean firebase;
    public final Intent isPro;
    public final String loadAd;
    public final List metrica;
    public final int mopub;
    public final List purchase;
    public final Set remoteconfig;
    public final boolean smaato;
    public final boolean startapp;
    public final Executor subs;
    public final List vip;
    public final Context yandex;

    public C8508l(Context context, String str, InterfaceC17619l interfaceC17619l, C0099l c0099l, List list, boolean z, int i, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z4, InterfaceC6228l interfaceC6228l, InterfaceC12932l interfaceC12932l) {
        this.yandex = context;
        this.loadAd = str;
        this.crashlytics = interfaceC17619l;
        this.amazon = c0099l;
        this.purchase = list;
        this.billing = z;
        this.mopub = i;
        this.admob = executor;
        this.subs = executor2;
        this.isPro = intent;
        this.firebase = z2;
        this.smaato = z3;
        this.remoteconfig = set;
        this.vip = list2;
        this.metrica = list3;
        this.startapp = z4;
        this.adcel = interfaceC6228l;
    }
}

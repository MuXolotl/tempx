package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.car.app.model.Alert;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* JADX INFO: renamed from: lٕٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15670l {

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static final boolean f30634strictfp;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final int f30635synchronized;
    public final C4705l Signature;
    public final int ad;
    public final C13829l adcel;
    public final Looper admob;
    public long ads;
    public final int advert;
    public final C0759l amazon;
    public boolean applovin;
    public boolean appmetrica;
    public InterfaceC11766l billing;
    public final C0759l crashlytics;
    public boolean firebase;
    public final String inmobi;
    public C13736l isPro;
    public final int isVip;
    public final long license;
    public final C18527l loadAd;
    public boolean metrica;
    public final C17636l mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final boolean f30636package;
    public boolean premium;
    public final long pro;
    public final C17636l purchase;
    public boolean remoteconfig;
    public final int signatures;
    public boolean smaato;
    public final C17654l startapp;
    public final int subs;
    public long subscription;
    public final long tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C10685l f30637throws;
    public final int vip;
    public final Context yandex;

    static {
        String str = AbstractC15323l.yandex;
        String strAdmob = AbstractC11452l.admob(Build.DEVICE);
        f30635synchronized = (strAdmob.contains("emulator") || strAdmob.contains("emu64a") || strAdmob.contains("emu64x") || strAdmob.contains("generic")) ? 30000 : ModuleDescriptor.MODULE_VERSION;
        f30634strictfp = true;
    }

    public C15670l(Context context, C1298l c1298l, C15291l c15291l) {
        C0759l c0759l = new C0759l(2, c1298l);
        C0759l c0759l2 = new C0759l(3, c15291l);
        C17636l c17636l = new C17636l(context, 1);
        C0120l c0120l = new C0120l(3);
        C17636l c17636l2 = new C17636l(context, 2);
        this.yandex = context;
        this.crashlytics = c0759l;
        this.amazon = c0759l2;
        this.purchase = c17636l;
        this.billing = c0120l;
        this.mopub = c17636l2;
        this.admob = AbstractC15323l.isVip();
        this.isPro = C13736l.subs;
        this.vip = 1;
        this.metrica = true;
        this.startapp = C17654l.amazon;
        this.ads = 5000L;
        this.subscription = 15000L;
        this.tapsense = 3000L;
        this.adcel = C13829l.loadAd;
        this.Signature = new C4705l(AbstractC15323l.m3962continue(20L), AbstractC15323l.m3962continue(500L));
        this.loadAd = C18527l.yandex;
        this.license = 500L;
        this.pro = 2000L;
        this.ad = 600000;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        boolean z = f30634strictfp;
        this.advert = z ? f30635synchronized : Integer.MAX_VALUE;
        this.isVip = z ? 60000 : i;
        this.signatures = 600000;
        this.premium = true;
        this.inmobi = "";
        this.subs = -1000;
        this.f30637throws = new C10685l(7);
        this.f30636package = true;
    }
}

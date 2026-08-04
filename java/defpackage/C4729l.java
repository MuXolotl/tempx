package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lَؚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4729l {
    public boolean Signature;
    public int ad;
    public Boolean adcel;
    public long admob;
    public long ads;
    public boolean advert;
    public String amazon;
    public String applovin;
    public int appmetrica;
    public String billing;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public boolean f9739case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public long f9740catch;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public long f9741continue;
    public String crashlytics;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public String f9742else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public long f9743extends;
    public long firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public long f9744for;
    public int inmobi;
    public String isPro;
    public Long isVip;
    public long license;
    public final String loadAd;
    public boolean metrica;
    public long mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public long f9745native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public String f9746package;
    public long premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public long f9747private;
    public long pro;
    public String purchase;
    public long remoteconfig;
    public Long signatures;
    public String smaato;
    public boolean startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public int f9748strictfp;
    public long subs;
    public ArrayList subscription;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public long f9749switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public byte[] f9750synchronized;
    public String tapsense;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public long f9751throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public long f9752throws;
    public long vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public long f9753volatile;
    public final C17417l yandex;

    public C4729l(C17417l c17417l, String str) {
        AbstractC1051l.subs(c17417l);
        AbstractC1051l.billing(str);
        this.yandex = c17417l;
        this.loadAd = str;
        C17923l c17923l = c17417l.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
    }

    public final void Signature(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.f9753volatile != j;
        this.f9753volatile = j;
    }

    public final Boolean ad() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.adcel;
    }

    public final void adcel(int i) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.inmobi != i;
        this.inmobi = i;
    }

    public final void admob(long j) {
        C17417l c17417l = this.yandex;
        C17923l c17923l = c17417l.f33929l;
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        long j2 = this.mopub + j;
        String str = this.loadAd;
        if (j2 > 2147483647L) {
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(C8118l.m2260l(str), "Bundle index overflow. appId");
            j2 = (-1) + j;
        }
        long j3 = this.f9752throws + 1;
        if (j3 > 2147483647L) {
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(C8118l.m2260l(str), "Delivery index overflow. appId");
            j3 = 0;
        }
        this.f9739case = true;
        this.mopub = j2;
        this.f9752throws = j3;
    }

    public final void ads(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.f9752throws != j;
        this.f9752throws = j;
    }

    public final void advert(List list) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        if (Objects.equals(this.subscription, list)) {
            return;
        }
        this.f9739case = true;
        this.subscription = list != null ? new ArrayList(list) : null;
    }

    public final void amazon(boolean z) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.metrica != z;
        this.metrica = z;
    }

    public final void applovin(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.premium != j;
        this.premium = j;
    }

    public final String appmetrica() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.applovin;
    }

    public final void billing(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.f9749switch != j;
        this.f9749switch = j;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m1585case(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.firebase != j;
        this.firebase = j;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m1586catch(String str) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= !Objects.equals(this.isPro, str);
        this.isPro = str;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m1587continue(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.remoteconfig != j;
        this.remoteconfig = j;
    }

    public final void crashlytics(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.ads != j;
        this.ads = j;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final long m1588else() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.firebase;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m1589extends(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.admob != j;
        this.admob = j;
    }

    public final void firebase(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.f9743extends != j;
        this.f9743extends = j;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m1590for(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.subs != j;
        this.subs = j;
    }

    public final String inmobi() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.loadAd;
    }

    public final void isPro(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.f9747private != j;
        this.f9747private = j;
    }

    public final boolean isVip() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.Signature;
    }

    public final String license() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        String str = this.f9742else;
        pro(null);
        return str;
    }

    public final long loadAd() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.ads;
    }

    public final boolean metrica() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.f9739case;
    }

    public final void mopub(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.f9741continue != j;
        this.f9741continue = j;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final String m1591native() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.billing;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m1592package(String str) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= !Objects.equals(this.crashlytics, str);
        this.crashlytics = str;
    }

    public final void premium(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.pro != j;
        this.pro = j;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m1593private(String str) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= !Objects.equals(this.billing, str);
        this.billing = str;
    }

    public final void pro(String str) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= !Objects.equals(this.f9742else, str);
        this.f9742else = str;
    }

    public final void purchase(long j) {
        AbstractC1051l.loadAd(j >= 0);
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.mopub != j;
        this.mopub = j;
    }

    public final void remoteconfig(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.f9740catch != j;
        this.f9740catch = j;
    }

    public final void signatures(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.license != j;
        this.license = j;
    }

    public final void smaato(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.f9744for != j;
        this.f9744for = j;
    }

    public final void startapp(int i) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.appmetrica != i;
        this.appmetrica = i;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m1594strictfp(String str) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f9739case |= true ^ Objects.equals(this.amazon, str);
        this.amazon = str;
    }

    public final void subs(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.f9745native != j;
        this.f9745native = j;
    }

    public final String subscription() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.f9746package;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m1595switch(String str) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= !Objects.equals(this.smaato, str);
        this.smaato = str;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final String m1596synchronized() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.amazon;
    }

    public final int tapsense() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.f9748strictfp;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final String m1597throw() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.isPro;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final String m1598throws() {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        return this.crashlytics;
    }

    public final void vip(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.f9751throw != j;
        this.f9751throw = j;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m1599volatile(String str) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= !Objects.equals(this.purchase, str);
        this.purchase = str;
    }

    public final void yandex(long j) {
        C17923l c17923l = this.yandex.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        this.f9739case |= this.vip != j;
        this.vip = j;
    }
}

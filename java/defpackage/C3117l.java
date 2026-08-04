package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lؕؑۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3117l {
    public Integer Signature;
    public Integer ad;
    public Integer adcel;
    public Long admob;
    public Boolean ads;
    public Integer advert;
    public CharSequence amazon;
    public Integer applovin;
    public Integer appmetrica;
    public CharSequence billing;
    public CharSequence crashlytics;
    public byte[] firebase;
    public CharSequence inmobi;
    public AbstractC7778l isPro;
    public CharSequence isVip;
    public Integer license;
    public CharSequence loadAd;
    public Integer metrica;
    public CharSequence mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public CharSequence f6660package;
    public CharSequence premium;
    public Integer pro;
    public CharSequence purchase;
    public Integer remoteconfig;
    public CharSequence signatures;
    public C16523l smaato;
    public Integer startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public Bundle f6661strictfp;
    public AbstractC7778l subs;
    public Boolean subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public Integer f6662synchronized;
    public Integer tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public CharSequence f6663throws;
    public Uri vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public AbstractC1186l f6664volatile;
    public CharSequence yandex;

    public C3117l() {
        C9258l c9258l = AbstractC1186l.f3181l;
        this.f6664volatile = C13708l.f26763l;
    }

    public final void crashlytics(Long l) {
        AbstractC12442l.admob(l == null || l.longValue() >= 0);
        this.admob = l;
    }

    public final void loadAd(byte[] bArr, Integer num) {
        this.firebase = bArr == null ? null : (byte[]) bArr.clone();
        this.smaato = null;
        this.remoteconfig = num;
    }

    public final void yandex(int i, byte[] bArr) {
        if (this.firebase == null || i == 3 || !Objects.equals(this.remoteconfig, 3)) {
            this.firebase = (byte[]) bArr.clone();
            this.smaato = null;
            this.remoteconfig = Integer.valueOf(i);
        }
    }
}

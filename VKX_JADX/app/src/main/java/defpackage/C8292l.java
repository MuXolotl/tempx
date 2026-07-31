package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.math.BigInteger;
import java.util.Map;

/* JADX INFO: renamed from: lً۟ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8292l {
    public static final C0022l amazon = new C0022l("ApplicationAnalyticsUtils", null);
    public static final String purchase = "22.2.0";
    public final Map crashlytics;
    public final Map loadAd;
    public final String yandex;

    public C8292l(String str, Bundle bundle) {
        this.yandex = str;
        this.loadAd = AbstractC9831l.vip("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.crashlytics = AbstractC9831l.vip("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    public final C15010l loadAd(C14514l c14514l) {
        int i;
        long jLongValue;
        C15010l c15010lRemoteconfig = C18278l.remoteconfig();
        long j = c14514l.amazon;
        c15010lRemoteconfig.yandex();
        ((C18278l) c15010lRemoteconfig.f3757l).metrica(j);
        int i2 = c14514l.purchase;
        c14514l.purchase = i2 + 1;
        c15010lRemoteconfig.yandex();
        ((C18278l) c15010lRemoteconfig.f3757l).Signature(i2);
        String str = c14514l.crashlytics;
        if (str != null) {
            c15010lRemoteconfig.yandex();
            ((C18278l) c15010lRemoteconfig.f3757l).tapsense(str);
        }
        C10222l c10222lSmaato = C3057l.smaato();
        if (!TextUtils.isEmpty(c14514l.admob)) {
            String str2 = c14514l.admob;
            c15010lRemoteconfig.yandex();
            ((C18278l) c15010lRemoteconfig.f3757l).startapp(str2);
            String str3 = c14514l.admob;
            c10222lSmaato.yandex();
            ((C3057l) c10222lSmaato.f3757l).remoteconfig(str3);
        }
        if (!TextUtils.isEmpty(c14514l.subs)) {
            String str4 = c14514l.subs;
            c10222lSmaato.yandex();
            ((C3057l) c10222lSmaato.f3757l).vip(str4);
        }
        if (!TextUtils.isEmpty(c14514l.isPro)) {
            String str5 = c14514l.isPro;
            c10222lSmaato.yandex();
            ((C3057l) c10222lSmaato.f3757l).metrica(str5);
        }
        if (!TextUtils.isEmpty(c14514l.firebase)) {
            String str6 = c14514l.firebase;
            c10222lSmaato.yandex();
            ((C3057l) c10222lSmaato.f3757l).startapp(str6);
        }
        if (!TextUtils.isEmpty(c14514l.smaato)) {
            String str7 = c14514l.smaato;
            c10222lSmaato.yandex();
            ((C3057l) c10222lSmaato.f3757l).adcel(str7);
        }
        if (!TextUtils.isEmpty(c14514l.remoteconfig)) {
            String str8 = c14514l.remoteconfig;
            c10222lSmaato.yandex();
            ((C3057l) c10222lSmaato.f3757l).ads(str8);
        }
        int i3 = c14514l.vip;
        if (i3 != 1) {
            i = 3;
            if (i3 != 2) {
                if (i3 != 3) {
                    i = 5;
                    if (i3 != 4) {
                        i = i3 != 5 ? 1 : 6;
                    }
                } else {
                    i = 4;
                }
            }
        } else {
            i = 2;
        }
        c10222lSmaato.yandex();
        ((C3057l) c10222lSmaato.f3757l).subscription(i);
        C3057l c3057l = (C3057l) c10222lSmaato.loadAd();
        c15010lRemoteconfig.yandex();
        ((C18278l) c15010lRemoteconfig.f3757l).isVip(c3057l);
        C11314l c11314lSmaato = C15809l.smaato();
        c11314lSmaato.yandex();
        ((C15809l) c11314lSmaato.f3757l).vip(purchase);
        c11314lSmaato.yandex();
        ((C15809l) c11314lSmaato.f3757l).remoteconfig(this.yandex);
        C15809l c15809l = (C15809l) c11314lSmaato.loadAd();
        c15010lRemoteconfig.yandex();
        ((C18278l) c15010lRemoteconfig.f3757l).ad(c15809l);
        C18277l c18277lSmaato = C0216l.smaato();
        if (c14514l.loadAd != null) {
            C10695l c10695lSmaato = C18300l.smaato();
            String str9 = c14514l.loadAd;
            c10695lSmaato.yandex();
            ((C18300l) c10695lSmaato.f3757l).remoteconfig(str9);
            C18300l c18300l = (C18300l) c10695lSmaato.loadAd();
            c18277lSmaato.yandex();
            ((C0216l) c18277lSmaato.f3757l).metrica(c18300l);
        }
        c18277lSmaato.yandex();
        ((C0216l) c18277lSmaato.f3757l).startapp(false);
        String str10 = c14514l.billing;
        if (str10 != null) {
            try {
                String strReplace = str10.replace("-", "");
                jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                Object[] objArr = {str10};
                C0022l c0022l = amazon;
                Log.w(c0022l.yandex, c0022l.amazon("receiverSessionId %s is not valid for hash", objArr), e);
                jLongValue = 0;
            }
            c18277lSmaato.yandex();
            ((C0216l) c18277lSmaato.f3757l).adcel(jLongValue);
        }
        int i4 = c14514l.mopub;
        c18277lSmaato.yandex();
        ((C0216l) c18277lSmaato.f3757l).tapsense(i4);
        boolean z = c14514l.yandex.mopub == 2;
        c18277lSmaato.yandex();
        ((C0216l) c18277lSmaato.f3757l).Signature(z);
        boolean z2 = c14514l.metrica;
        c18277lSmaato.yandex();
        ((C0216l) c18277lSmaato.f3757l).ad(z2);
        c15010lRemoteconfig.yandex();
        ((C18278l) c15010lRemoteconfig.f3757l).license((C0216l) c18277lSmaato.loadAd());
        return c15010lRemoteconfig;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    public final C18278l yandex(C14514l c14514l, int i) {
        int iIntValue;
        int iIntValue2;
        C15010l c15010lLoadAd = loadAd(c14514l);
        C18277l c18277lRemoteconfig = C0216l.remoteconfig(c15010lLoadAd.crashlytics());
        Map map = this.crashlytics;
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            if (map.containsKey(numValueOf)) {
                Integer num = (Integer) map.get(numValueOf);
                AbstractC1051l.subs(num);
                iIntValue = num.intValue();
            } else {
                iIntValue = i + ModuleDescriptor.MODULE_VERSION;
            }
        } else {
            iIntValue = i + ModuleDescriptor.MODULE_VERSION;
        }
        c18277lRemoteconfig.yandex();
        ((C0216l) c18277lRemoteconfig.f3757l).ads(iIntValue);
        Map map2 = this.loadAd;
        if (map2 != null) {
            Integer numValueOf2 = Integer.valueOf(i);
            if (map2.containsKey(numValueOf2)) {
                Integer num2 = (Integer) map2.get(numValueOf2);
                AbstractC1051l.subs(num2);
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = i + ModuleDescriptor.MODULE_VERSION;
            }
        } else {
            iIntValue2 = i + ModuleDescriptor.MODULE_VERSION;
        }
        c18277lRemoteconfig.yandex();
        ((C0216l) c18277lRemoteconfig.f3757l).subscription(iIntValue2);
        c15010lLoadAd.amazon((C0216l) c18277lRemoteconfig.loadAd());
        return (C18278l) c15010lLoadAd.loadAd();
    }
}

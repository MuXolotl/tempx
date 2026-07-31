package defpackage;

import defpackage.AbstractC5392l;
import kotlin.Metadata;

/* JADX INFO: renamed from: lٕٞؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Llٕٞؗ;", "Llؘؒۨ;", "N", "Llَّؓ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
abstract class AbstractC15835l<N extends AbstractC5392l> extends AbstractC12338l {
    public final void adcel(AbstractC5392l abstractC5392l) {
        long jIsPro = isPro();
        if (!C9735l.crashlytics(abstractC5392l.f11557l, jIsPro)) {
            abstractC5392l.f11557l = jIsPro;
            abstractC5392l.mo1238l();
        }
        long jRemoteconfig = remoteconfig();
        if (!C9735l.crashlytics(abstractC5392l.f11561l, jRemoteconfig)) {
            abstractC5392l.f11561l = jRemoteconfig;
            abstractC5392l.mo1238l();
        }
        C0404l c0404lSmaato = smaato();
        if (!AbstractC8576l.yandex(abstractC5392l.f11556l, c0404lSmaato)) {
            abstractC5392l.f11556l = c0404lSmaato;
            abstractC5392l.mo1236l();
        }
        C0404l c0404lVip = vip();
        if (!AbstractC8576l.yandex(abstractC5392l.f11554l, c0404lVip)) {
            abstractC5392l.f11554l = c0404lVip;
            abstractC5392l.mo1236l();
        }
        float fFirebase = firebase();
        if (!C14467l.loadAd(abstractC5392l.f11553l, fFirebase)) {
            abstractC5392l.f11553l = fFirebase;
            abstractC5392l.mo1236l();
        }
        float fStartapp = startapp();
        if (!C14467l.loadAd(abstractC5392l.f11552l, fStartapp)) {
            abstractC5392l.f11552l = fStartapp;
            abstractC5392l.m1772l();
            abstractC5392l.mo1236l();
        }
        float fMetrica = metrica();
        if (C14467l.loadAd(abstractC5392l.f11562l, fMetrica)) {
            return;
        }
        abstractC5392l.f11562l = fMetrica;
        abstractC5392l.m1772l();
        abstractC5392l.mo1236l();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC15835l)) {
            return false;
        }
        AbstractC15835l abstractC15835l = (AbstractC15835l) obj;
        return C9735l.crashlytics(isPro(), abstractC15835l.isPro()) && C9735l.crashlytics(remoteconfig(), abstractC15835l.remoteconfig()) && AbstractC8576l.yandex(smaato(), abstractC15835l.smaato()) && AbstractC8576l.yandex(vip(), abstractC15835l.vip()) && C14467l.loadAd(firebase(), abstractC15835l.firebase()) && C14467l.loadAd(startapp(), abstractC15835l.startapp()) && C14467l.loadAd(metrica(), abstractC15835l.metrica());
    }

    public abstract float firebase();

    public int hashCode() {
        long jIsPro = isPro();
        int i = C9735l.smaato;
        return Float.floatToIntBits(metrica()) + AbstractC9029l.mopub(AbstractC9029l.mopub((vip().hashCode() + ((smaato().hashCode() + AbstractC1757l.m1038strictfp(C10882l.yandex(jIsPro) * 31, remoteconfig(), 31)) * 31)) * 31, firebase(), 31), startapp(), 31);
    }

    public abstract long isPro();

    public abstract float metrica();

    public abstract long remoteconfig();

    public abstract C0404l smaato();

    public abstract float startapp();

    public abstract C0404l vip();
}

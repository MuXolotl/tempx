package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍؖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4372l {
    public final C5697l admob;
    public final C6045l amazon;
    public final boolean billing;
    public final boolean crashlytics;
    public final int firebase;
    public final long isPro;
    public final int loadAd;
    public final C0458l metrica;
    public final AtomicInteger mopub;
    public final int purchase;
    public final Integer remoteconfig;
    public final boolean smaato;
    public final AtomicBoolean subs;
    public final ComponentName vip;
    public final Context yandex;

    public C4372l(Context context, int i, boolean z, C6045l c6045l, int i2, boolean z2, AtomicInteger atomicInteger, C5697l c5697l, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName, C0458l c0458l) {
        this.yandex = context;
        this.loadAd = i;
        this.crashlytics = z;
        this.amazon = c6045l;
        this.purchase = i2;
        this.billing = z2;
        this.mopub = atomicInteger;
        this.admob = c5697l;
        this.subs = atomicBoolean;
        this.isPro = j;
        this.firebase = i3;
        this.smaato = z3;
        this.remoteconfig = num;
        this.vip = componentName;
        this.metrica = c0458l;
    }

    public static C4372l yandex(C4372l c4372l, int i, AtomicInteger atomicInteger, C5697l c5697l, AtomicBoolean atomicBoolean, long j, Integer num, int i2) {
        return new C4372l(c4372l.yandex, c4372l.loadAd, c4372l.crashlytics, c4372l.amazon, (i2 & 16) != 0 ? c4372l.purchase : i, (i2 & 32) != 0 ? c4372l.billing : true, (i2 & 64) != 0 ? c4372l.mopub : atomicInteger, (i2 & 128) != 0 ? c4372l.admob : c5697l, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c4372l.subs : atomicBoolean, (i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c4372l.isPro : j, (i2 & 1024) != 0 ? c4372l.firebase : 0, (i2 & 4096) != 0 ? c4372l.smaato : true, (i2 & 8192) != 0 ? c4372l.remoteconfig : num, c4372l.vip, c4372l.metrica);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4372l) {
            C4372l c4372l = (C4372l) obj;
            return this.yandex.equals(c4372l.yandex) && this.loadAd == c4372l.loadAd && this.crashlytics == c4372l.crashlytics && this.amazon == c4372l.amazon && this.purchase == c4372l.purchase && this.billing == c4372l.billing && AbstractC8576l.yandex(this.mopub, c4372l.mopub) && AbstractC8576l.yandex(this.admob, c4372l.admob) && AbstractC8576l.yandex(this.subs, c4372l.subs) && this.isPro == c4372l.isPro && this.firebase == c4372l.firebase && this.smaato == c4372l.smaato && AbstractC8576l.yandex(this.remoteconfig, c4372l.remoteconfig) && AbstractC8576l.yandex(this.vip, c4372l.vip) && this.metrica == c4372l.metrica;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.subs.hashCode() + ((this.admob.hashCode() + ((this.mopub.hashCode() + ((((((this.amazon.hashCode() + (((((this.yandex.hashCode() * 31) + this.loadAd) * 31) + (this.crashlytics ? 1231 : 1237)) * 31)) * 31) + this.purchase) * 31) + (this.billing ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31;
        long j = this.isPro;
        int i = (((((((((int) (j ^ (j >>> 32))) + iHashCode) * 31) + this.firebase) * 31) - 1) * 31) + (this.smaato ? 1231 : 1237)) * 31;
        Integer num = this.remoteconfig;
        int iHashCode2 = (i + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.vip;
        return this.metrica.hashCode() + ((iHashCode2 + (componentName != null ? componentName.hashCode() : 0)) * 31);
    }

    public final C4372l loadAd(C5697l c5697l, int i) {
        return yandex(this, i, null, c5697l, null, 0L, null, 65391);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.yandex + ", appWidgetId=" + this.loadAd + ", isRtl=" + this.crashlytics + ", layoutConfiguration=" + this.amazon + ", itemPosition=" + this.purchase + ", isLazyCollectionDescendant=" + this.billing + ", lastViewId=" + this.mopub + ", parentContext=" + this.admob + ", isBackgroundSpecified=" + this.subs + ", layoutSize=" + ((Object) C2261l.crashlytics(this.isPro)) + ", layoutCollectionViewId=" + this.firebase + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.smaato + ", actionTargetId=" + this.remoteconfig + ", actionBroadcastReceiver=" + this.vip + ", glanceComponents=" + this.metrica + ')';
    }
}

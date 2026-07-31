package defpackage;

import android.graphics.PointF;

/* JADX INFO: renamed from: lًٟۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8253l {
    public int admob;
    public int amazon;
    public float billing;
    public float crashlytics;
    public boolean firebase;
    public float isPro;
    public String loadAd;
    public float mopub;
    public int purchase;
    public PointF remoteconfig;
    public PointF smaato;
    public int subs;
    public String yandex;

    public final int hashCode() {
        int iFirebase = AbstractC0653l.firebase(this.amazon, ((int) (AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd) + this.crashlytics)) * 31, 31) + this.purchase;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.billing);
        return (((iFirebase * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.admob;
    }
}

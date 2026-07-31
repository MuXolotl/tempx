package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: lٓٙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14227l {
    public static final String firebase;
    public static final String isPro;
    public static final String metrica;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String startapp;
    public static final String subs;
    public static final String vip;
    public final byte[] admob;
    public final boolean amazon;
    public final boolean billing;
    public final AbstractC13675l crashlytics;
    public final Uri loadAd;
    public final AbstractC1186l mopub;
    public final boolean purchase;
    public final UUID yandex;

    static {
        String str = AbstractC15323l.yandex;
        subs = Integer.toString(0, 36);
        isPro = Integer.toString(1, 36);
        firebase = Integer.toString(2, 36);
        smaato = Integer.toString(3, 36);
        remoteconfig = Integer.toString(4, 36);
        vip = Integer.toString(5, 36);
        metrica = Integer.toString(6, 36);
        startapp = Integer.toString(7, 36);
    }

    public C14227l(C17464l c17464l) {
        AbstractC12442l.subscription((c17464l.crashlytics && ((Uri) c17464l.purchase) == null) ? false : true);
        UUID uuid = (UUID) c17464l.amazon;
        uuid.getClass();
        this.yandex = uuid;
        this.loadAd = (Uri) c17464l.purchase;
        this.crashlytics = (AbstractC13675l) c17464l.billing;
        this.amazon = c17464l.yandex;
        this.billing = c17464l.crashlytics;
        this.purchase = c17464l.loadAd;
        this.mopub = (AbstractC1186l) c17464l.mopub;
        byte[] bArr = (byte[]) c17464l.admob;
        this.admob = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14227l)) {
            return false;
        }
        C14227l c14227l = (C14227l) obj;
        return this.yandex.equals(c14227l.yandex) && Objects.equals(this.loadAd, c14227l.loadAd) && Objects.equals(this.crashlytics, c14227l.crashlytics) && this.amazon == c14227l.amazon && this.billing == c14227l.billing && this.purchase == c14227l.purchase && this.mopub.equals(c14227l.mopub) && Arrays.equals(this.admob, c14227l.admob);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        Uri uri = this.loadAd;
        return Arrays.hashCode(this.admob) + ((this.mopub.hashCode() + ((((((((this.crashlytics.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.amazon ? 1 : 0)) * 31) + (this.billing ? 1 : 0)) * 31) + (this.purchase ? 1 : 0)) * 31)) * 31);
    }
}

package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC10999l;
import defpackage.AbstractC11463l;
import defpackage.AbstractC18643l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.C10019l;
import defpackage.C1478l;
import defpackage.C16552l;
import defpackage.C8197l;
import defpackage.ExecutorC6708l;
import defpackage.InterfaceC10594l;
import defpackage.InterfaceC14029l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC16858l;
import defpackage.InterfaceC6019l;
import defpackage.InterfaceC9764l;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaTrack;", "Llۡۨ;", "Llٗؓٓ;", "Llؘۡؐ;", "Llٍۗ۠;", "Llَؚ۟;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class UmaTrack extends AbstractC18643l implements InterfaceC16858l, InterfaceC6019l, InterfaceC9764l, InterfaceC10594l {
    public final int adcel;
    public final List admob;
    public final long ads;
    public final UmaCover amazon;
    public final UmaAlbum billing;
    public final String crashlytics;
    public final boolean firebase;
    public final boolean isPro;
    public final String loadAd;
    public final boolean metrica;
    public final UmaArtist mopub;
    public final String purchase;
    public boolean remoteconfig;
    public boolean smaato;
    public final String startapp;
    public final boolean subs;
    public final UmaPermissions subscription;
    public final String tapsense;
    public final boolean vip;
    public final String yandex;

    public UmaTrack(String str, String str2, String str3, UmaCover umaCover, String str4, UmaAlbum umaAlbum, UmaArtist umaArtist, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str5, int i, long j, UmaPermissions umaPermissions, String str6) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = umaCover;
        this.purchase = str4;
        this.billing = umaAlbum;
        this.mopub = umaArtist;
        this.admob = list;
        this.subs = z;
        this.isPro = z2;
        this.firebase = z3;
        this.smaato = z4;
        this.remoteconfig = z5;
        this.vip = z6;
        this.metrica = z7;
        this.startapp = str5;
        this.adcel = i;
        this.ads = j;
        this.subscription = umaPermissions;
        this.tapsense = str6;
    }

    @Override // defpackage.AbstractC18643l
    public final C10019l adcel() {
        return new C10019l("uma", this.yandex, this.purchase);
    }

    @Override // defpackage.InterfaceC16858l
    /* JADX INFO: renamed from: admob, reason: from getter */
    public final boolean getMopub() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: ads, reason: from getter */
    public final String getLoadAd() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC9764l
    public final void crashlytics(boolean z) {
        this.smaato = z;
        int i = 1;
        C1478l c1478l = new C1478l(this.yandex, z, 1);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        InterfaceC14029l interfaceC14029l = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        C16552l c16552l = AbstractC11463l.yandex;
        AbstractC10999l.mopub(vKXApplication, ExecutorC6708l.f14063l, 0, new C8197l(c1478l, interfaceC14029l, i), 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return UmaTrack.class.equals(obj != null ? obj.getClass() : null) && AbstractC8576l.yandex(this.yandex, ((UmaTrack) obj).yandex);
    }

    @Override // defpackage.AbstractC18643l
    public final String firebase() {
        String str;
        UmaAlbum umaAlbum = this.billing;
        return (umaAlbum == null || (str = umaAlbum.yandex) == null) ? "" : str;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC9764l
    /* JADX INFO: renamed from: isPro, reason: from getter */
    public final boolean getBilling() {
        return this.smaato;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: metrica, reason: from getter */
    public final String getYandex() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC10594l
    /* JADX INFO: renamed from: mopub, reason: from getter */
    public final boolean getAd() {
        return this.remoteconfig;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: remoteconfig */
    public final String getAmazon() {
        return this.amazon.crashlytics;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: smaato, reason: from getter */
    public final String getYandex() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC10594l
    public final void subs(boolean z) {
        this.remoteconfig = z;
        C1478l c1478l = new C1478l(this.yandex, z, 0);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        InterfaceC14029l interfaceC14029l = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        C16552l c16552l = AbstractC11463l.yandex;
        AbstractC10999l.mopub(vKXApplication, ExecutorC6708l.f14063l, 0, new C8197l(c1478l, interfaceC14029l, 1), 2);
    }

    @Override // defpackage.AbstractC18643l
    public final String subscription() {
        return "uma";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UmaTrack(apiId=");
        sb.append(this.yandex);
        sb.append(", name=");
        sb.append(this.loadAd);
        sb.append(", artistDisplayName=");
        sb.append(this.crashlytics);
        sb.append(", cover=");
        sb.append(this.amazon);
        sb.append(", file=");
        sb.append(this.purchase);
        sb.append(", album=");
        sb.append(this.billing);
        sb.append(", artist=");
        sb.append(this.mopub);
        sb.append(", artists=");
        sb.append(this.admob);
        sb.append(", isLegal=");
        sb.append(this.subs);
        sb.append(", isRadioCapable=");
        sb.append(this.isPro);
        sb.append(", isAdded=");
        sb.append(this.firebase);
        sb.append(", isLiked=");
        sb.append(this.smaato);
        sb.append(", isDisliked=");
        sb.append(this.remoteconfig);
        sb.append(", isRestricted=");
        sb.append(this.vip);
        sb.append(", isExplicit=");
        sb.append(this.metrica);
        sb.append(", shareHash=");
        sb.append(this.startapp);
        sb.append(", duration=");
        sb.append(this.adcel);
        sb.append(", size=");
        sb.append(this.ads);
        sb.append(", permissions=");
        sb.append(this.subscription);
        sb.append(", vkAudioId=");
        return AbstractC2812l.tapsense(sb, this.tapsense, ')');
    }

    @Override // defpackage.AbstractC18643l
    public final int vip() {
        return this.adcel * 1000;
    }

    @Override // defpackage.InterfaceC6019l
    public final boolean yandex() {
        return this.vip || !this.subscription.yandex;
    }
}

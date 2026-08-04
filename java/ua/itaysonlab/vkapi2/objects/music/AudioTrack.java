package ua.itaysonlab.vkapi2.objects.music;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC0653l;
import defpackage.AbstractC10999l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC16676l;
import defpackage.AbstractC18643l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC9968l;
import defpackage.C10019l;
import defpackage.C10291l;
import defpackage.C11704l;
import defpackage.C16287l;
import defpackage.C18539l;
import defpackage.C7268l;
import defpackage.C8631l;
import defpackage.C8688l;
import defpackage.C9597l;
import defpackage.C9678l;
import defpackage.InterfaceC0042l;
import defpackage.InterfaceC10594l;
import defpackage.InterfaceC1220l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC14029l;
import defpackage.InterfaceC15706l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC16858l;
import defpackage.InterfaceC6019l;
import defpackage.InterfaceC8296l;
import defpackage.InterfaceC9347l;
import defpackage.InterfaceC9764l;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 \u00172\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00042\u00020\t:\u0003\u0018\u0019\u001aR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000f¨\u0006\u001b"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioTrack;", "Llۡۨ;", "Llؑؒٝ;", "Llُّؔ;", "", "Llٗؓٓ;", "Llٍۗ۠;", "Llَؚ۟;", "Llؘۡؐ;", "Llٕٕۣ;", "", "value", "isPro", "()Z", "crashlytics", "(Z)V", "getLiked$annotations", "()V", "liked", "mopub", "subs", "getDisliked$annotations", "disliked", "Companion", "lٍٖٝ", "lٌؙٙ", "lٍْٛ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC8296l
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioTrack extends AbstractC18643l implements InterfaceC0042l, InterfaceC12360l, InterfaceC16858l, InterfaceC9764l, InterfaceC10594l, InterfaceC6019l, InterfaceC15706l {
    public static final C9678l Companion = new C9678l();

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static final InterfaceC1220l[] f36603extends = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C8631l(14)), AbstractC9968l.crashlytics(2, new C8631l(15)), null, null, null, null, null, null, null, null, null, null, null, null};
    public final boolean Signature;
    public boolean ad;
    public final List adcel;
    public final boolean admob;
    public final String ads;
    public final PodcastInfo advert;
    public final String amazon;
    public Boolean applovin;
    public transient boolean appmetrica;
    public final String billing;
    public final long crashlytics;
    public final long firebase;
    public final transient boolean inmobi;
    public final String isPro;
    public final AudioChartInfo isVip;
    public final boolean license;
    public final int loadAd;
    public final Integer metrica;
    public final boolean mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final C8688l f36604native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final transient boolean f36605package;
    public final String premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final C8688l f36606private;
    public final boolean pro;
    public final int purchase;
    public final int remoteconfig;
    public final int signatures;
    public final Integer smaato;
    public final List startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final transient boolean f36607strictfp;
    public final String subs;
    public final Integer subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final transient boolean f36608synchronized;
    public final Integer tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final transient boolean f36609throws;
    public final AudioAlbum vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final transient C9597l f36610volatile;
    public final String yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AudioTrack(String str, int i, long j, String str2, int i2, String str3, boolean z, boolean z2, String str4, String str5, long j2, Integer num, int i3, AudioAlbum audioAlbum, Integer num2, List list, List list2, String str6, Integer num3, Integer num4, boolean z3, boolean z4, boolean z5, boolean z6, PodcastInfo podcastInfo, AudioChartInfo audioChartInfo, int i4, String str7, Boolean bool, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i5, int i6) {
        String str8 = (i5 & 1) != 0 ? "" : str;
        int i7 = (i5 & 2) != 0 ? 0 : i;
        long j3 = (i5 & 4) != 0 ? 0L : j;
        String str9 = (i5 & 8) != 0 ? "" : str2;
        int i8 = (i5 & 16) != 0 ? 0 : i2;
        String str10 = (i5 & 32) != 0 ? null : str3;
        boolean z12 = (i5 & 64) != 0 ? false : z;
        boolean z13 = (i5 & 128) != 0 ? false : z2;
        String str11 = (i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? "" : str4;
        String str12 = (i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? str5 : "";
        this(str8, i7, j3, str9, i8, str10, z12, z13, str11, str12, (i5 & 1024) == 0 ? j2 : 0L, (i5 & 2048) != 0 ? null : num, (i5 & 4096) != 0 ? 0 : i3, (i5 & 8192) != 0 ? null : audioAlbum, (i5 & 16384) != 0 ? null : num2, (i5 & 32768) != 0 ? null : list, (i5 & 65536) != 0 ? null : list2, (i5 & 131072) != 0 ? null : str6, (i5 & 262144) != 0 ? null : num3, (i5 & 524288) != 0 ? null : num4, (i5 & 1048576) != 0 ? false : z3, (i5 & 2097152) != 0 ? false : z4, (i5 & 4194304) != 0 ? false : z5, (i5 & 8388608) != 0 ? false : z6, (i5 & 16777216) != 0 ? null : podcastInfo, (i5 & 33554432) != 0 ? null : audioChartInfo, (i5 & 67108864) != 0 ? 0 : i4, (i5 & 134217728) != 0 ? null : str7, (i5 & 268435456) != 0 ? null : bool, (i5 & 536870912) != 0 ? false : z7, (i5 & 1073741824) != 0 ? false : z8, (i5 & RecyclerView.UNDEFINED_DURATION) != 0 ? false : z9, (i6 & 1) != 0 ? false : z10, (i6 & 2) != 0 ? false : z11, false);
    }

    public static AudioTrack Signature(AudioTrack audioTrack, String str, AudioAlbum audioAlbum, List list, List list2, int i, int i2, int i3) {
        String str2 = audioTrack.yandex;
        int i4 = audioTrack.loadAd;
        long j = audioTrack.crashlytics;
        String str3 = audioTrack.amazon;
        int i5 = audioTrack.purchase;
        String str4 = audioTrack.billing;
        boolean z = audioTrack.mopub;
        boolean z2 = audioTrack.admob;
        String str5 = audioTrack.subs;
        String str6 = (i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? audioTrack.isPro : str;
        long j2 = audioTrack.firebase;
        String str7 = str6;
        Integer num = audioTrack.smaato;
        int i6 = audioTrack.remoteconfig;
        AudioAlbum audioAlbum2 = (i2 & 8192) != 0 ? audioTrack.vip : audioAlbum;
        Integer num2 = audioTrack.metrica;
        List list3 = (i2 & 32768) != 0 ? audioTrack.startapp : list;
        List list4 = (i2 & 65536) != 0 ? audioTrack.adcel : list2;
        String str8 = audioTrack.ads;
        Integer num3 = audioTrack.subscription;
        Integer num4 = audioTrack.tapsense;
        boolean z3 = audioTrack.Signature;
        boolean z4 = audioTrack.license;
        boolean z5 = audioTrack.pro;
        boolean z6 = audioTrack.ad;
        PodcastInfo podcastInfo = audioTrack.advert;
        AudioChartInfo audioChartInfo = audioTrack.isVip;
        int i7 = (i2 & 67108864) != 0 ? audioTrack.signatures : i;
        String str9 = audioTrack.premium;
        Boolean bool = audioTrack.applovin;
        boolean z7 = audioTrack.appmetrica;
        boolean z8 = audioTrack.inmobi;
        boolean z9 = audioTrack.f36609throws;
        boolean z10 = audioTrack.f36605package;
        boolean z11 = audioTrack.f36608synchronized;
        boolean z12 = (i3 & 4) != 0 ? audioTrack.f36607strictfp : true;
        audioTrack.getClass();
        return new AudioTrack(str2, i4, j, str3, i5, str4, z, z2, str5, str7, j2, num, i6, audioAlbum2, num2, list3, list4, str8, num3, num4, z3, z4, z5, z6, podcastInfo, audioChartInfo, i7, str9, bool, z7, z8, z9, z10, z11, z12);
    }

    @Override // defpackage.AbstractC18643l
    public final C10019l adcel() {
        return new C10019l("vk", AbstractC16676l.billing(this), !this.f36607strictfp ? this.isPro : null);
    }

    @Override // defpackage.InterfaceC16858l
    /* JADX INFO: renamed from: admob, reason: from getter */
    public final boolean getMetrica() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: ads, reason: from getter */
    public final String getLoadAd() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC15706l
    public final boolean amazon() {
        return pro();
    }

    @Override // defpackage.InterfaceC0042l
    public final boolean billing() {
        return purchase() == 3;
    }

    @Override // defpackage.InterfaceC9764l
    public final void crashlytics(boolean z) {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        InterfaceC14029l interfaceC14029l = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, null, 0, new C10291l(this, z, interfaceC14029l, 2), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AudioTrack.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AudioTrack audioTrack = (AudioTrack) obj;
        return this.loadAd == audioTrack.loadAd && this.crashlytics == audioTrack.crashlytics;
    }

    @Override // defpackage.AbstractC18643l
    public final String firebase() {
        AudioAlbum audioAlbum = this.vip;
        if (audioAlbum != null) {
            return audioAlbum.amazon;
        }
        return null;
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getLoadAd() {
        return AbstractC16676l.mopub(this);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.loadAd), Long.valueOf(this.crashlytics));
    }

    @Override // defpackage.InterfaceC9764l
    /* JADX INFO: renamed from: isPro */
    public final boolean getSmaato() {
        if (AbstractC8576l.yandex(this.applovin, Boolean.TRUE)) {
            return true;
        }
        long j = this.f36610volatile.loadAd;
        C16287l.yandex.getClass();
        return j == C16287l.crashlytics();
    }

    public final String license() {
        String str = this.ads;
        return str == null ? "" : str;
    }

    @Override // defpackage.InterfaceC0042l
    public final boolean loadAd() {
        return AbstractC0653l.purchase(this);
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: metrica */
    public final String getYandex() {
        return AbstractC16676l.billing(this);
    }

    @Override // defpackage.InterfaceC10594l
    /* JADX INFO: renamed from: mopub, reason: from getter */
    public final boolean getRemoteconfig() {
        return this.ad;
    }

    public final boolean pro() {
        return ((Boolean) this.f36604native.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC0042l
    public final int purchase() {
        return this.advert != null ? 2 : 1;
    }

    @Override // defpackage.AbstractC18643l
    public final String remoteconfig() {
        Uri uriAdmob;
        C7268l.f15111l.getClass();
        if (pro()) {
            uriAdmob = C7268l.admob(this);
        } else {
            String strYandex = AbstractC16676l.yandex(this);
            uriAdmob = strYandex == null ? null : Uri.parse(strYandex);
        }
        String string = uriAdmob != null ? uriAdmob.toString() : null;
        if (string == null || string.length() == 0 || string.equals("null")) {
            return null;
        }
        return string;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: smaato, reason: from getter */
    public final String getCrashlytics() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC18643l
    public final String startapp() {
        return AbstractC16676l.mopub(this);
    }

    @Override // defpackage.InterfaceC10594l
    public final void subs(boolean z) {
        this.ad = z;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, null, 0, new C18539l(z, this, (InterfaceC14029l) null), 3);
    }

    @Override // defpackage.AbstractC18643l
    public final String subscription() {
        return "vk";
    }

    @Override // defpackage.AbstractC18643l
    public final String tapsense() {
        return (String) this.f36606private.getValue();
    }

    public final String toString() {
        return "VKAudioTrack(title=" + this.amazon + ", artist=" + this.yandex + ", id=" + AbstractC16676l.billing(this) + ')';
    }

    @Override // defpackage.AbstractC18643l
    public final int vip() {
        return this.purchase * 1000;
    }

    @Override // defpackage.InterfaceC6019l
    public final boolean yandex() {
        return AbstractC16676l.purchase(this);
    }

    public AudioTrack(String str, int i, long j, String str2, int i2, String str3, boolean z, boolean z2, String str4, String str5, long j2, Integer num, int i3, AudioAlbum audioAlbum, Integer num2, List list, List list2, String str6, Integer num3, Integer num4, boolean z3, boolean z4, boolean z5, boolean z6, PodcastInfo podcastInfo, AudioChartInfo audioChartInfo, int i4, String str7, Boolean bool, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = j;
        this.amazon = str2;
        this.purchase = i2;
        this.billing = str3;
        this.mopub = z;
        this.admob = z2;
        this.subs = str4;
        this.isPro = str5;
        this.firebase = j2;
        this.smaato = num;
        this.remoteconfig = i3;
        this.vip = audioAlbum;
        this.metrica = num2;
        this.startapp = list;
        this.adcel = list2;
        this.ads = str6;
        this.subscription = num3;
        this.tapsense = num4;
        this.Signature = z3;
        this.license = z4;
        this.pro = z5;
        this.ad = z6;
        this.advert = podcastInfo;
        this.isVip = audioChartInfo;
        this.signatures = i4;
        this.premium = str7;
        this.applovin = bool;
        this.appmetrica = z7;
        this.inmobi = z8;
        this.f36609throws = z9;
        this.f36605package = z10;
        this.f36608synchronized = z11;
        this.f36607strictfp = z12;
        C16287l.yandex.getClass();
        int i5 = 0;
        int i6 = 1;
        this.f36610volatile = new C9597l(i, j, j == C16287l.crashlytics());
        this.f36604native = new C8688l(new C11704l(this, i5));
        this.f36606private = new C8688l(new C11704l(this, i6));
    }

    @InterfaceC9347l(ignore = true)
    public static /* synthetic */ void getDisliked$annotations() {
    }

    @InterfaceC9347l(ignore = true)
    public static /* synthetic */ void getLiked$annotations() {
    }

    public AudioTrack(int i, String str, int i2, long j, String str2, int i3, String str3, boolean z, boolean z2, String str4, String str5, long j2, Integer num, int i4, AudioAlbum audioAlbum, Integer num2, List list, List list2, String str6, Integer num3, Integer num4, boolean z3, boolean z4, boolean z5, boolean z6, PodcastInfo podcastInfo, AudioChartInfo audioChartInfo, int i5, String str7, Boolean bool) {
        if ((i & 1) == 0) {
            this.yandex = "";
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = 0;
        } else {
            this.loadAd = i2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = 0L;
        } else {
            this.crashlytics = j;
        }
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str2;
        }
        if ((i & 16) == 0) {
            this.purchase = 0;
        } else {
            this.purchase = i3;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str3;
        }
        if ((i & 64) == 0) {
            this.mopub = false;
        } else {
            this.mopub = z;
        }
        if ((i & 128) == 0) {
            this.admob = false;
        } else {
            this.admob = z2;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = "";
        } else {
            this.subs = str4;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.isPro = "";
        } else {
            this.isPro = str5;
        }
        if ((i & 1024) == 0) {
            this.firebase = 0L;
        } else {
            this.firebase = j2;
        }
        if ((i & 2048) == 0) {
            this.smaato = null;
        } else {
            this.smaato = num;
        }
        if ((i & 4096) == 0) {
            this.remoteconfig = 0;
        } else {
            this.remoteconfig = i4;
        }
        if ((i & 8192) == 0) {
            this.vip = null;
        } else {
            this.vip = audioAlbum;
        }
        if ((i & 16384) == 0) {
            this.metrica = null;
        } else {
            this.metrica = num2;
        }
        if ((32768 & i) == 0) {
            this.startapp = null;
        } else {
            this.startapp = list;
        }
        if ((65536 & i) == 0) {
            this.adcel = null;
        } else {
            this.adcel = list2;
        }
        if ((131072 & i) == 0) {
            this.ads = null;
        } else {
            this.ads = str6;
        }
        if ((262144 & i) == 0) {
            this.subscription = null;
        } else {
            this.subscription = num3;
        }
        if ((524288 & i) == 0) {
            this.tapsense = null;
        } else {
            this.tapsense = num4;
        }
        if ((1048576 & i) == 0) {
            this.Signature = false;
        } else {
            this.Signature = z3;
        }
        if ((2097152 & i) == 0) {
            this.license = false;
        } else {
            this.license = z4;
        }
        if ((4194304 & i) == 0) {
            this.pro = false;
        } else {
            this.pro = z5;
        }
        if ((8388608 & i) == 0) {
            this.ad = false;
        } else {
            this.ad = z6;
        }
        if ((16777216 & i) == 0) {
            this.advert = null;
        } else {
            this.advert = podcastInfo;
        }
        if ((33554432 & i) == 0) {
            this.isVip = null;
        } else {
            this.isVip = audioChartInfo;
        }
        if ((67108864 & i) == 0) {
            this.signatures = 0;
        } else {
            this.signatures = i5;
        }
        if ((134217728 & i) == 0) {
            this.premium = null;
        } else {
            this.premium = str7;
        }
        if ((i & 268435456) == 0) {
            this.applovin = null;
        } else {
            this.applovin = bool;
        }
        this.appmetrica = false;
        this.inmobi = false;
        this.f36609throws = false;
        this.f36605package = false;
        this.f36608synchronized = false;
        this.f36607strictfp = false;
        int i6 = this.loadAd;
        long j3 = this.crashlytics;
        C16287l.yandex.getClass();
        this.f36610volatile = new C9597l(i6, j3, j3 == C16287l.crashlytics());
        this.f36604native = new C8688l(new C11704l(this, 2));
        this.f36606private = new C8688l(new C11704l(this, 3));
    }
}

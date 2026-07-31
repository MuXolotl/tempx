package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* JADX INFO: renamed from: lًِٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11704l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f23450l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23451l;

    public /* synthetic */ C11704l(AudioTrack audioTrack, int i) {
        this.f23451l = i;
        this.f23450l = audioTrack;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer num;
        int i = this.f23451l;
        int iIntValue = 0;
        AudioTrack audioTrack = this.f23450l;
        switch (i) {
            case 0:
                return Boolean.valueOf(audioTrack.inmobi ? true : C6168l.pro(audioTrack));
            case 1:
                return AbstractC12024l.appmetrica((CharSequence) AbstractC16901l.m4214continue(AbstractC10433l.yandex(audioTrack.isPro).f5526l), ".mp3", false) ? "audio/mpeg" : "application/x-mpegURL";
            case 2:
                return Boolean.valueOf(audioTrack.inmobi ? true : C6168l.pro(audioTrack));
            case 3:
                return AbstractC12024l.appmetrica((CharSequence) AbstractC16901l.m4214continue(AbstractC10433l.yandex(audioTrack.isPro).f5526l), ".mp3", false) ? "audio/mpeg" : "application/x-mpegURL";
            case 4:
                C10244l c10244l = C10244l.purchase;
                c10244l.getClass();
                c10244l.loadAd(new C9808l(audioTrack));
                return Unit.INSTANCE;
            default:
                PodcastInfo podcastInfo = audioTrack.advert;
                if (podcastInfo != null && (num = podcastInfo.purchase) != null) {
                    iIntValue = num.intValue();
                }
                return Float.valueOf(iIntValue / audioTrack.purchase);
        }
    }
}

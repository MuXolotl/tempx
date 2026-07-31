package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lًؕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7782l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC18643l f16302l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f16303l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16304l;

    public /* synthetic */ C7782l(String str, AbstractC18643l abstractC18643l, int i) {
        this.f16304l = i;
        this.f16303l = str;
        this.f16302l = abstractC18643l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String yandex;
        UmaArtist umaArtist;
        MainArtist mainArtist;
        int i = this.f16304l;
        AbstractC18643l abstractC18643l = this.f16302l;
        String str = this.f16303l;
        switch (i) {
            case 0:
                C13056l c13056l = (C13056l) obj;
                c13056l.isPro.mo214l("app_id", "web-desktop-app-v1.0");
                c13056l.isPro.mo214l("format", "json");
                c13056l.isPro.mo214l("namespace", "lyrics_richsynched");
                c13056l.isPro.mo214l("subtitle_format", "mxm");
                c13056l.isPro.mo214l("usertoken", str);
                c13056l.isPro.mo214l("q_track", abstractC18643l.getLoadAd());
                c13056l.isPro.mo214l("q_duration", String.valueOf(abstractC18643l.vip() / 1000));
                C6921l c6921l = c13056l.isPro;
                if (abstractC18643l instanceof AudioTrack) {
                    AudioTrack audioTrack = (AudioTrack) abstractC18643l;
                    List list = audioTrack.startapp;
                    if (list == null || (mainArtist = (MainArtist) AbstractC16901l.m4217extends(list)) == null || (yandex = mainArtist.crashlytics) == null) {
                        yandex = audioTrack.yandex;
                    }
                } else if (abstractC18643l instanceof UmaTrack) {
                    UmaTrack umaTrack = (UmaTrack) abstractC18643l;
                    UmaArtist umaArtist2 = umaTrack.mopub;
                    if (umaArtist2 == null || (yandex = umaArtist2.loadAd) == null) {
                        List list2 = umaTrack.admob;
                        yandex = (list2 == null || (umaArtist = (UmaArtist) AbstractC16901l.m4217extends(list2)) == null) ? umaTrack.crashlytics : umaArtist.loadAd;
                    }
                } else {
                    yandex = abstractC18643l.getCrashlytics();
                }
                c6921l.mo214l("q_artist", yandex);
                String strFirebase = abstractC18643l.firebase();
                if (strFirebase != null) {
                    c13056l.isPro.mo214l("q_album", strFirebase);
                }
                break;
            default:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBilling = c6956l.billing(str);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == C1867l.yandex) {
                        DecimalFormat decimalFormat = C15638l.yandex;
                        objM2132native = AbstractC14205l.amazon(abstractC18643l.vip(), true);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13010l.loadAd((String) objM2132native, null, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

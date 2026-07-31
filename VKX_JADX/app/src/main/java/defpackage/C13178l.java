package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* JADX INFO: renamed from: lؙْؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13178l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f25785l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25786l;

    public /* synthetic */ C13178l(AudioTrack audioTrack, int i) {
        this.f25786l = i;
        this.f25785l = audioTrack;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f25786l;
        AudioTrack audioTrack = this.f25785l;
        int i2 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC15451l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(-1951534486, new C16712l(audioTrack, z ? 1 : 0), c6956l), AbstractC14566l.amazon(-2087561783, new C16712l(audioTrack, i2), c6956l), c6956l, (iIntValue & 14) | 432);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC5889l.crashlytics(audioTrack.purchase, false, 0L, c6956l2, 0, 6);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    PodcastInfo podcastInfo = audioTrack.advert;
                    String str = podcastInfo != null ? podcastInfo.amazon : null;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC13010l.loadAd(str, AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2), ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 48, 0, 262136);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

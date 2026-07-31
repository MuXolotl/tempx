package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lُٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16712l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f32728l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32729l;

    public /* synthetic */ C16712l(AudioTrack audioTrack, int i) {
        this.f32729l = i;
        this.f32728l = audioTrack;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f32729l;
        AudioTrack audioTrack = this.f32728l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0133l.purchase(audioTrack.amazon, audioTrack.ads, 0L, 0L, null, c6956l, 0, 28);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (audioTrack.mopub) {
                        c6956l2.m2123default(573419817);
                        AbstractC5889l.amazon(null, 0L, c6956l2, 0, 3);
                    } else {
                        c6956l2.m2123default(545721689);
                    }
                    c6956l2.startapp(false);
                    AbstractC13010l.loadAd(audioTrack.yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l2, 0, 24960, 241662);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC17307l.billing(this.f32728l, 0, 0L, 0L, 0, 0.0f, false, null, null, null, c6956l3, 0, 1022);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
